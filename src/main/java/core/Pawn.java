/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author yumi
 */
public class Pawn extends Piece
{
    
    boolean firstMove;
    
    private Game game;
    
    public Pawn(PieceType type, Color color, Game game) 
    {
        
        super(type, color);
        
        this.firstMove = true;
        
        this.game = game;
        
    }
    
    @Override
    public void validateMove(Move move) throws InvalidMoveException
    {
        
        super.validateMove(move);
        
        boolean validMoveDetected;
        
        validMoveDetected = tryDoubleAdvanceMove(move);
        
        if(validMoveDetected)
        {
            
            if(this.firstMove) this.firstMove = !this.firstMove;
            
            return;
            
        }
        
        validMoveDetected = trySingleAdvanceMove(move);
        
        if(validMoveDetected)
        {
            
            if(this.firstMove) this.firstMove = !this.firstMove;
            
            return;

        }
        
        validMoveDetected = tryDiagonalMove();
        
        if(validMoveDetected)
        {
            
            if(this.firstMove) this.firstMove = !this.firstMove;
            
            return;
            
        }
        
        throw new InvalidMoveException("Invalid Move Detected");
        
    }
    
    private boolean tryForwardMove(Move move, int offset)
    {
        
        if(move.getPiece(move.targetRow, move.targetColumn) != null) return false;
        
        if(move.sourceColumn != move.targetColumn) return false;
        
        if(this.getColor() == Color.BLACK && move.targetRow != move.sourceRow + offset) return false;
        
        return !(this.getColor() == Color.WHITE && move.targetRow != move.sourceRow - offset);
        
    }
    
    private boolean trySingleAdvanceMove(Move move)
    {
        
        return tryForwardMove(move, 1);
        
    }
    
    private boolean tryDoubleAdvanceMove(Move move)
    {
        
        if(!this.firstMove) return false;
        
        if(move.checkObstacles()) return false;
        
        return tryForwardMove(move, 2);
        
    }
    
    @Override
    public boolean validateCapture(Move move) 
    {
        
        
        
        return true;
        
    }
    
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author yugon
 */
public class Bishop extends Piece
{
    
    boolean onWhite;
    
    public Bishop(PieceType type, Color color, Tile tile) 
    {
        
        super(type, color);
        
        onWhite = tile.getColor() == Color.WHITE;
        
    }
    
    @Override
    public void validateMove(Move move) throws InvalidMoveException
    {
        
        super.validateMove(move);
        
        if((move.board.GetTile(move.targetRow, move.targetRow).getColor() != ))
        
        boolean validMoveDetected = false;
        
        if(!validMoveDetected)
        {
            
            throw new InvalidMoveException("Invalid Move Detected");
            
        }
        
    }
    
    
    
}

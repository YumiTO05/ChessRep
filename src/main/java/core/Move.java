/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author yumi
 */
public class Move 
{
    
    protected int sourceRow;
    
    protected int sourceColumn;
    
    protected int targetRow;
    
    protected int targetColumn;
    
    Board board;
    
    public Move(int sourceRow, int sourceColumn, int targetRow, int targetColumn)
    {
        
        this.sourceRow = sourceRow;
        
        this.sourceColumn = sourceColumn;
        
        this.targetRow = targetRow;
        
        this.targetColumn = targetColumn;
        
        board = new Board();
        
    }
    
    public Piece getPiece(int sourceRow, int sourceColumn)
    {
        
        Tile tile = board.GetTile(sourceRow, sourceColumn);
        
        return tile.getPiece();
        
    }
    
    public void setPiece(int targetRow, int targetColumn, Piece piece)
    {
        
        board.GetTile(targetRow, targetColumn).setPiece(piece);
        
    }
    
}

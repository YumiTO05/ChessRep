/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author yumi
 */
public class Piece 
{
    
    protected PieceType type;
    
    protected Color color;
    
    public Piece(PieceType type, Color color)
    {
        
        this.type = type;
        
        this.color = color;
        
    }
    
    public PieceType getType()
    {
        
        return this.type;
        
    }
    
    public Color getColor()
    {
        
        return this.color;
        
    }
    
    @Override
    public String toString()
    {
        
        return "PieceType: " + this.type + "\nPiece color: " + this.color;
        
    }
    
    /**
     *
     * @param object
     * @return
     */
    @Override
    public boolean equals(Object object)
    {
        
        Piece piece = (Piece) object;
        
        return getClass() == object.getClass() && this.type == piece.getType() && this.color == piece.getColor();
        
    }
    
}

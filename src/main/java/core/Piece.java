/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.type);
        hash = 47 * hash + Objects.hashCode(this.color);
        return hash;
    }
    
    public void validateMove(Move move)
    {
        
        if(move.sourceRow == move.targetRow && move.sourceColumn == move.targetColumn)
        
    }
    
    public void executeMove(Move move)
    {
        
        
        
    }
    
    public boolean validateCapture(Move move)
    {
        
        return true;
        
    }
    
}

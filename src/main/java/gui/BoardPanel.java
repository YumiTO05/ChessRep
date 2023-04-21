/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import core.Color;
import core.Game;
import core.PieceType;
import java.awt.BorderLayout;
import java.net.URL;
import javax.swing.JPanel;

/**
 *
 * @author yumi
 */
public class BoardPanel extends JPanel
{
    
    protected final int TILE_DIMENSION = 100;
    
    JPanel main;
    
    JPanel[] tiles;
    
    Game game;
    
    GameDynamicsListener listener;
    
    int sourceRow, sourceColumn;
    
    boolean moveIsOnGoing;
    
    public BoardPanel(Game game)
    {
        
        super(new BorderLayout());
        
        this.game = game;
        
        moveIsOnGoing = false;
        
        InitializeLayout();
        
        InitializeGame();
        
    }
    
    public java.awt.Color determineTileColor(int row, int column)
    {
        
        Color tileColor = game.getBoard().GetTile(row, column).getColor();
        
        if(tileColor == Color.BLACK) return java.awt.Color.DARK_GRAY;
        
        return java.awt.Color.WHITE;
        
    }
    
    public void highlightSourceTile(int row, int column, java.awt.Color color)
    {
        
        tiles[row][column].setBackground(color);
        
    }
    
    public void clearPiece(int row, int column)
    {
        
        tiles[row][column].removeAll();
        
        tiles[row][column].updateUI();
        
    }
    
    public void drawPiece(int row, int column, PieceType pieceType, Color color)
    {
        
        String iconName;
        
        URL url = getClass().getClassLoader().getResource(iconName);
        
    }
    
    
    
    
    
    
}

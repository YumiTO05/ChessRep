/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author yumi
 */
public class Game 
{
    
    protected Color turn;
    
    protected ArrayList<Piece> blackArmy; 
    
    protected ArrayList<Piece> whiteArmy;
    
    protected Board board;
    
    public Game()
    {
        
        this.turn = Color.WHITE;
        
        this.blackArmy = new ArrayList<>();
        
        this.whiteArmy = new ArrayList<>();
        
        this.board = new Board();
        
    }
    
    public void setup()
    {
        
        int iMaxValue = board.tiles.length - 1;
        
        for(int i = 0; i < board.tiles.length; i++)
        {
            
            int jMaxValue = board.tiles[i].length - 1;
            
            boolean iEqualsZero = i == 0;
            
            boolean iEqualsOne = i == 1;
            
            boolean iEqualsSix = i == iMaxValue - 1;
            
            boolean iEqualsSeven = i == iMaxValue;
            
            for(int j = 0; j < board.tiles[i].length; j++)
            {
                
                if((iEqualsZero && j == 0) || (iEqualsZero && j == jMaxValue))
                {
                    
                    Rook blackRook = new Rook(PieceType.ROOK, Color.BLACK);
                    
                    board.tiles[i][j].setPiece(blackRook);
                    
                    this.blackArmy.add(blackRook);
                    
                }
                
                if((iEqualsZero && j == 1) || (iEqualsZero && j == jMaxValue - 1))
                {
                    
                    Knight blackKnight = new Knight(PieceType.KNIGHT, Color.BLACK);
                    
                    board.tiles[i][j].setPiece(blackKnight);
                    
                    this.blackArmy.add(blackKnight);
                    
                }
                
                if((iEqualsZero && j == 2) || (iEqualsZero && j == jMaxValue - 2))
                {
                    
                    Bishop blackBishop = new Bishop(PieceType.BISHOP, Color.BLACK);
                    
                    board.tiles[i][j].setPiece(blackBishop);
                    
                    this.blackArmy.add(blackBishop);
                }
                
                if(iEqualsZero && j == 3)
                {
                    
                    Queen blackQueen = new Queen(PieceType.QUEEN, Color.BLACK);
                    
                    board.tiles[i][j].setPiece(blackQueen);
                    
                    this.blackArmy.add(blackQueen);
                    
                }
                
                if(iEqualsZero && j == 4)
                {
                    
                    King blackKing = new King(PieceType.KING, Color.BLACK);
                    
                    board.tiles[i][j].setPiece(blackKing);
                    
                    this.blackArmy.add(blackKing);
                    
                }
                
                if(iEqualsOne)
                {
                    
                    Pawn blackPawn = new Pawn(PieceType.PAWN, Color.BLACK);
                    
                    board.tiles[i][j].setPiece(blackPawn);
                    
                    this.blackArmy.add(blackPawn);
                    
                }
                
                
                if((iEqualsSix && j == 0) || (iEqualsSix && j == jMaxValue))
                {
                    
                    Rook whiteRook = new Rook(PieceType.ROOK, Color.WHITE);
                    
                    board.tiles[i][j].setPiece(whiteRook);
                    
                    this.whiteArmy.add(whiteRook);
                    
                }
                
                if((iEqualsSix && j == 1) || (iEqualsSix && j == jMaxValue - 1))
                {
                    
                    Knight whiteKnight = new Knight(PieceType.KNIGHT, Color.WHITE);
                    
                    board.tiles[i][j].setPiece(whiteKnight);
                    
                    this.whiteArmy.add(whiteKnight);
                    
                }
                
                if((iEqualsSix && j == 2) || (iEqualsSix && j == jMaxValue - 2))
                {
                    
                    Bishop whiteBishop = new Bishop(PieceType.BISHOP, Color.WHITE);
                    
                    board.tiles[i][j].setPiece(whiteBishop);
                    
                    this.whiteArmy.add(whiteBishop);
                }
                
                if(iEqualsSix && j == 3)
                {
                    
                    Queen whiteQueen = new Queen(PieceType.QUEEN, Color.WHITE);
                    
                    board.tiles[i][j].setPiece(whiteQueen);
                    
                    this.whiteArmy.add(whiteQueen);
                    
                }
                
                if(iEqualsSix && j == 4)
                {
                    
                    King whiteKing = new King(PieceType.KING, Color.WHITE);
                    
                    board.tiles[i][j].setPiece(whiteKing);
                    
                    this.whiteArmy.add(whiteKing);
                    
                }
                
                if(iEqualsSeven)
                {
                    
                    Pawn whitePawn = new Pawn(PieceType.PAWN, Color.WHITE);
                    
                    board.tiles[i][j].setPiece(whitePawn);
                    
                    this.blackArmy.add(whitePawn);
                    
                }
                
            }
            
        }
        
    }
    
}

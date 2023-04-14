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
                
                
                if((iEqualsSeven && j == 0) || (iEqualsSeven && j == jMaxValue))
                {
                    
                    Rook whiteRook = new Rook(PieceType.ROOK, Color.WHITE);
                    
                    board.tiles[i][j].setPiece(whiteRook);
                    
                    this.whiteArmy.add(whiteRook);
                    
                }
                
                if((iEqualsSeven && j == 1) || (iEqualsSeven && j == jMaxValue - 1))
                {
                    
                    Knight whiteKnight = new Knight(PieceType.KNIGHT, Color.WHITE);
                    
                    board.tiles[i][j].setPiece(whiteKnight);
                    
                    this.whiteArmy.add(whiteKnight);
                    
                }
                
                if((iEqualsSeven && j == 2) || (iEqualsSeven && j == jMaxValue - 2))
                {
                    
                    Bishop whiteBishop = new Bishop(PieceType.BISHOP, Color.WHITE);
                    
                    board.tiles[i][j].setPiece(whiteBishop);
                    
                    this.whiteArmy.add(whiteBishop);
                }
                
                if(iEqualsSeven && j == 3)
                {
                    
                    Queen whiteQueen = new Queen(PieceType.QUEEN, Color.WHITE);
                    
                    board.tiles[i][j].setPiece(whiteQueen);
                    
                    this.whiteArmy.add(whiteQueen);
                    
                }
                
                if(iEqualsSeven && j == 4)
                {
                    
                    King whiteKing = new King(PieceType.KING, Color.WHITE);
                    
                    board.tiles[i][j].setPiece(whiteKing);
                    
                    this.whiteArmy.add(whiteKing);
                    
                }
                
                if(iEqualsSix)
                {
                    
                    Pawn whitePawn = new Pawn(PieceType.PAWN, Color.WHITE);
                    
                    board.tiles[i][j].setPiece(whitePawn);
                    
                    this.blackArmy.add(whitePawn);
                    
                }
                
            }
            
        }
        
    }
    
    public void clear()
    {
        
        for(int i = 0; i < board.tiles.length; i++)
        {
            
            for(int j = 0; j < board.tiles[i].length; j++)
            {
                
                this.board.tiles[i][j].setPiece(null);
                
            }
            
        }
                    
        
    }
    
    public Board getBoard()
    {
        
        return this.board;
        
    }
    
    public Color getTurn()
    {
        
        return this.turn;
        
    }
    
    public void removePieceFromArmy(Piece piece, Color color)
    {
        
        if(color == Color.BLACK)
        {
            
            blackArmy.remove(piece);
            
            return;
            
        }
        
        if(color == Color.WHITE)
        {
            
            whiteArmy.remove(piece);
            
        }
        
    }
    
    public void addPieceToArmy(Piece piece, Color color)
    {
        
        if(color == Color.BLACK)
        {
            
            blackArmy.add(piece);
            
        }
        
        if(color == Color.WHITE)
        {
            
            whiteArmy.add(piece);
            
        }
        
    }
    
    public boolean isMovedSourceValid(int row, int column)
    {
        
        if(this.board.tiles[row][column].getPiece() == null) return false;
        
        return this.board.tiles[row][column].getPiece().getColor() == this.turn;
        
    }
    
    public boolean processMove(int sourceRow, int sourceColumn, int targetRow, int targetColumn)
    {
        
        Move move = new Move(sourceRow, sourceColumn, targetRow, targetColumn);
        
        try
        {
            
            board.GetTile(sourceRow, sourceColumn).getPiece().validateMove(move);
            
            move.wouldEndInKingCheck();
            
            
            
            
            
        }
        catch(InvalidMoveException ime)
        {
            
            
            
        }
        
        return true;
        
    }
    
}

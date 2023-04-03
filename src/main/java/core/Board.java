/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author yumi
 */
public class Board 
{
    
    static final int Rows = 8;
    
    static final int Columns = 8;
    
    static final int LastRow = Rows - 1;
    
    static final int LastColumn = Columns - 1;
    
    public Board()
    {
        
        Tile[][] tiles = new Tile[Rows][Columns];
        
        for(int i = 0; i < Rows; i++)
        {
            boolean check = false;
            
            if(i % 2 == 0) check = true;
            
            for(int j = 0; j < Columns; j++)
            {
                
                if(check)
                {
                    
                    if(j % 2 == 0) tiles[i][j] = new Tile(i, j, Color.WHITE);
                    else tiles[i][j] = new Tile(i, j, Color.BLACK);
                    
                }
                else
                {
                    
                    if(j % 2 != 0) tiles[i][j] = new Tile(i, j, Color.WHITE);
                    else tiles[i][j] = new Tile(i, j, Color.BLACK);
                    
                }
                
            }
            
        }
        
    }
    
}

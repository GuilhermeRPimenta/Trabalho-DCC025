/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.gamePanel.board;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author guilh
 */
public class Board extends JPanel{
    
    private final int SIZE = 8;
    private final int SQUARE_HEIGHT = 80;
    
    public Board(){
        setLayout(new GridLayout(SIZE, SIZE));
        //setPreferredSize(new Dimension(SIZE * SQUARE_HEIGHT, SIZE * SQUARE_HEIGHT));
        int x = 0;
        int y = 0;
        boolean brown = true;
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                Square square = new Square(x,y,brown, SQUARE_HEIGHT);
                x+=1;
                brown = !brown;
                this.add(square);
            }
            brown = !brown;
            y+=1;
        }
        
        
    }
}

//Victor Wingert de Almeida         - 202335036
//Guilherme Roldão dos Reis Pimenta - 202365085A
//Bruno Nascimento Rodrigues        - 202065114A
//Pablo Novaes Costa                - 202335031

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.gamePanel.board;

/**
 *
 * @author guilh
 */
public class Position {
    public final int X;
    public final int Y;
    
    public Position(int x, int y){
        X=x;
        Y=y;
    }
    
    public boolean equals(Position pos){
        if(pos.X == this.X && pos.Y == this.Y){
            return true;
        }
        return false;
    }
}

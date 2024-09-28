/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.replaysPanel;

import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Position;

/**
 *
 * @author guilh
 */
public class SquareSaveData {
    private Position position;
    private String type;
    private boolean white;
    
    public SquareSaveData(Position position, String type, boolean white){
        this.position = position;
        this.type = type;
        this.white = white;
    }

    public Position getPosition() {
        return position;
    }

    public String getType() {
        return type;
    }

    public boolean isWhite() {
        return white;
    }
    
    
}

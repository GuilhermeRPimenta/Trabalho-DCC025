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
public class ReplayPiece {
    private Position position;
    private String type;
    
    public ReplayPiece(Position position, String type){
        this.position = position;
        this.type = type;
    }
}

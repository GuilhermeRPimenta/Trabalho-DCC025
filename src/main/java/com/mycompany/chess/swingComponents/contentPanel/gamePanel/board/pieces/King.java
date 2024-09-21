/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.pieces;

import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Position;

/**
 *
 * @author guilh
 */
public class King extends Piece{
    public King(int x, int y, boolean white){
        super(x, y, white);
    }
    
    @Override
    protected void assignImage(){
        image = new javax.swing.ImageIcon(getClass().getResource(white? "/images/pieces/white-bishop.png":"/images/pieces/black-bishop.png"));
        scaleImage();
    }
    
    @Override
    public Position[] calculateLegalMoves(){
        return null;
    }
}

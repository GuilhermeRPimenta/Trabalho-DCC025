/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.pieces;

import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Board;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Position;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Square;
import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public class Queen extends Piece{
    public Queen(int x, int y, boolean white){
        super(x, y, white);
    }
    
    @Override
    protected void assignImage(){
        image = new javax.swing.ImageIcon(getClass().getResource(white? "/images/pieces/white-queen.png":"/images/pieces/black-queen.png"));
        scaleImage();
    }
    
    @Override
    public ArrayList<Square> calculateLegalMoves(Board board){
        return null;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.pieces;

import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Board;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Position;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Square;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guilh
 */
public class Rook extends Piece{
    public Rook(int x, int y, boolean white){
        super(x, y, white);
    }
    
    @Override
    protected void assignImage(){
        image = new javax.swing.ImageIcon(getClass().getResource(white? "/images/pieces/white-rook.png":"/images/pieces/black-rook.png"));
        scaleImage();
    }
    
    @Override
    public ArrayList<Square> calculateLegalMoves(Board board){
        List<Position> legalMovesList = new ArrayList<Position>();
        for(int i = 0; i <8; i++){
            if(i == position.Y){
                continue;
            }
            legalMovesList.add(new Position(position.X,i));
        }
        return null;
    }
}

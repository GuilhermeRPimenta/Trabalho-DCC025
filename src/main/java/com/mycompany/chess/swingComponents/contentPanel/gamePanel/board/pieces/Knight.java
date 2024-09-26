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
public class Knight extends Piece{
    public Knight(int x, int y, boolean white){
        super(x, y, white);
    }
    
    @Override
    protected void assignImage(){
        image = new javax.swing.ImageIcon(getClass().getResource(white? "/images/pieces/white-knight.png":"/images/pieces/black-knight.png"));
        scaleImage();
    }
    
    @Override
    public ArrayList<Square> calculateLegalMoves(Board board){
        ArrayList<Square> legalMoves = new ArrayList<Square>();
        ArrayList<Position> positionsToTest = new ArrayList<Position>();
        positionsToTest.add(new Position(position.X +2, position.Y+1));
        positionsToTest.add(new Position(position.X +2, position.Y-1));
        positionsToTest.add(new Position(position.X -2, position.Y+1));
        positionsToTest.add(new Position(position.X -2, position.Y-1));
        
        positionsToTest.add(new Position(position.X+1, position.Y+2));
        positionsToTest.add(new Position(position.X+1, position.Y-2));
        positionsToTest.add(new Position(position.X-1, position.Y+2));
        positionsToTest.add(new Position(position.X-1, position.Y-2));
        for(Position pos : positionsToTest){
            if(isValidMove(board, pos.X, pos.Y)){
                legalMoves.add(board.getSquare(pos.X, pos.Y));
            }
        }
        return legalMoves;
    }
    
}

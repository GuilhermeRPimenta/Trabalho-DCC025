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
        ArrayList<Square> legalMoves = new ArrayList<>();
        int analisedX = position.X + 1;
        int analisedY = position.Y;
        while(isValidMove(board, analisedX, analisedY)){
            legalMoves.add(board.getSquare(analisedX, analisedY));
            
            if(board.getSquare(analisedX, analisedY).getPiece() != null){
                break;
            }
            analisedX +=1;
        }
        analisedX = position.X - 1;
        while(isValidMove(board, analisedX, analisedY)){
            legalMoves.add(board.getSquare(analisedX, analisedY));
            
            if(board.getSquare(analisedX, analisedY).getPiece() != null){
                break;
            }
            analisedX -=1;
        }
        analisedX = position.X;
        analisedY = position.Y + 1;
        while(isValidMove(board, analisedX, analisedY)){
            legalMoves.add(board.getSquare(analisedX, analisedY));
            
            if(board.getSquare(analisedX, analisedY).getPiece() != null){
                break;
            }
            analisedY +=1;
        }
        analisedY = position.Y - 1;
        while(isValidMove(board, analisedX, analisedY)){
            legalMoves.add(board.getSquare(analisedX, analisedY));
            
            if(board.getSquare(analisedX, analisedY).getPiece() != null){
                break;
            }
            analisedY -=1;
        }
        
        return legalMoves;
    }
    
}

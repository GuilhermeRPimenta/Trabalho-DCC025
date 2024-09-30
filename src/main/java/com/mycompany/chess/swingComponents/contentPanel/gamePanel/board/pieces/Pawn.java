//Victor Wingert de Almeida         - 202335036
//Guilherme Roldão dos Reis Pimenta - 202365085A
//Bruno Nascimento Rodrigues        - 202065114A
//Pablo Novaes Costa                - 202335031

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
public class Pawn extends Piece {
    private boolean firstMove = true;
    public Pawn(int x, int y, boolean white) {
        super(x, y, white);
    }

    @Override
    protected void assignImage() {
        image = new javax.swing.ImageIcon(getClass().getResource(white ? "/images/pieces/white-pawn.png" : "/images/pieces/black-pawn.png"));
        scaleImage();
    }

    @Override
    public ArrayList<Square> calculateLegalMoves(Board board) {
        ArrayList<Square> legalMoves = new ArrayList<>();

        int nextX = position.X + 1 * yMovementMultiplier;
        if (isValidMove(board, nextX, position.Y)) {
            if (board.getSquare(nextX, position.Y).getPiece() == null) {
                legalMoves.add(board.getSquare(nextX, position.Y));
                if(firstMove){
                    int nextX2 = position.X + 2 * yMovementMultiplier;
                    if(isValidMove(board, nextX2, position.Y)){
                        if(board.getSquare(nextX2, position.Y).getPiece() == null){
                            legalMoves.add(board.getSquare(nextX2, position.Y));
                        }
                    }
                }
            }
        }
        Position upRight = new Position(position.X + 1 * yMovementMultiplier, position.Y + 1);
        Position upLeft = new Position(position.X + 1 * yMovementMultiplier, position.Y - 1);
        if (isValidMove(board, upRight.X, upRight.Y)) {
            if (board.getSquare(upRight.X, upRight.Y).getPiece() != null && board.getSquare(upRight.X, upRight.Y).getPiece().getIsWhite() != this.white) {
                legalMoves.add(board.getSquare(upRight.X, upRight.Y));
            }
        }
        if (isValidMove(board, upLeft.X, upLeft.Y)) {
            if (board.getSquare(upLeft.X, upLeft.Y).getPiece() != null && board.getSquare(upLeft.X, upLeft.Y).getPiece().getIsWhite() != this.white) {
                legalMoves.add(board.getSquare(upLeft.X, upLeft.Y));
            }
        }
        return legalMoves;
    }
    
    public void setFirstMoveToFalse(){
        firstMove = false;
    }

}

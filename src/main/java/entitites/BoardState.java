//Victor Wingert de Almeida         - 202335036
//Guilherme Roldão dos Reis Pimenta - 202365085A
//Bruno Nascimento Rodrigues        - 202065114A
//Pablo Novaes Costa                - 202335031

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitites;

import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Position;
import entitites.Piece;

/**
 *
 * @author guilh
 */
public class BoardState {
    private SquareSaveData[][] boardPiecesesMatrix = new SquareSaveData[8][8];
    private Position initialPositionOfPieceThatMoves;
    private int turnNumber;
    public BoardState(int turnNumber, Position initialPositionOfPieceThatMoves , SquareSaveData[][] boardPiecesesMatrix){
        this.turnNumber = turnNumber;
        this.initialPositionOfPieceThatMoves = initialPositionOfPieceThatMoves;
        this.boardPiecesesMatrix = boardPiecesesMatrix;
    }

    public Position getInitialPositionOfPieceThatMoves() {
        return initialPositionOfPieceThatMoves;
    }

    public int getTurnNumber() {
        return turnNumber;
    }
    
    public SquareSaveData[][] getBoardPiecesesMatrix(){
        return boardPiecesesMatrix;
    }
}

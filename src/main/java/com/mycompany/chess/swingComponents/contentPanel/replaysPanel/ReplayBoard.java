/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.replaysPanel;

import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Position;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author guilh
 */
public class ReplayBoard extends JPanel{
    private ReplaySquare[][] tiles = new ReplaySquare[8][8];
    private ArrayList<BoardState> statesList;
    private Position initialPositionOfPieceThatMoves;
    public ReplayBoard(ArrayList<BoardState> statesList){
        setLayout(new GridLayout(8, 8));
        boolean brown = true;
        this.statesList = statesList;
        BoardState firstBoardState = statesList.getFirst();
        this.initialPositionOfPieceThatMoves = firstBoardState.getInitialPositionOfPieceThatMoves();
        SquareSaveData[][] firstBoardPiecesesMatrix = firstBoardState.getBoardPiecesesMatrix();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ReplaySquare replaySquare = new ReplaySquare(brown, firstBoardPiecesesMatrix[i][j], 80);
                tiles[i][j] = replaySquare;

                brown = !brown;
                this.add(replaySquare);
            }
            brown = !brown;
        }
        
        tiles[initialPositionOfPieceThatMoves.X][initialPositionOfPieceThatMoves.Y].highlight();
    }
    
    public void updateBoard(int index){
        BoardState currentState = statesList.get(index);
        SquareSaveData[][] currentBoardPiecesMatrix = currentState.getBoardPiecesesMatrix();
        boolean brown = true;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tiles[i][j].updateSquare(currentBoardPiecesMatrix[i][j]);  
            }
        }
        
        Position initialPositionOfPieceThatMoves = currentState.getInitialPositionOfPieceThatMoves();
        if(initialPositionOfPieceThatMoves != null){
            tiles[initialPositionOfPieceThatMoves.X][initialPositionOfPieceThatMoves.Y].highlight();
        }
        repaint();
        revalidate();
    }
    
}

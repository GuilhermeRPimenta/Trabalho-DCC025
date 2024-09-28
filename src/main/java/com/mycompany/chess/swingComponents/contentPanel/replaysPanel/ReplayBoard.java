/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.replaysPanel;

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
    public ReplayBoard(ArrayList<BoardState> statesList){
        setLayout(new GridLayout(8, 8));
        boolean brown = true;
        this.statesList = statesList;
        BoardState firtsBoardState = statesList.getFirst();
        ReplayPiece[][] firstBoardPiecesesMatrix = firtsBoardState.getBoardPiecesesMatrix();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ReplaySquare replaySquare = new ReplaySquare(brown, firstBoardPiecesesMatrix[i][j], 80);
                tiles[i][j] = replaySquare;

                brown = !brown;
                this.add(replaySquare);
            }
            brown = !brown;
        }
    }
    
    public void updateBoard(int index){
        removeAll();
        BoardState currentState = statesList.get(index);
        ReplayPiece[][] currentBoardPiecesMatrix = currentState.getBoardPiecesesMatrix();
        boolean brown = true;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ReplaySquare replaySquare = new ReplaySquare(brown, currentBoardPiecesMatrix[i][j], 80);
                tiles[i][j] = replaySquare;

                brown = !brown;
                this.add(replaySquare);
            }
            brown = !brown;
        }
        repaint();
        revalidate();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.replaysPanel;

import com.google.gson.Gson;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Position;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.pieces.Piece;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public class Replay {
    private String player1Name;
    private String player2Name;
    private ArrayList<BoardState> statesList = new ArrayList<>();
    int turnNumber;
    
    public Replay(String player1Name, String player2Name){
        turnNumber = 1;
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }
    
    public void addBoardState(Position initialPositionOfPieceThatMoves, ReplayPiece[][] boardPiecesesMatrix){
        statesList.add(new BoardState(turnNumber,initialPositionOfPieceThatMoves,boardPiecesesMatrix));
        turnNumber++;
    }
    
    public void saveReplay(String fileName){
        Gson gson = new Gson();
        
        try(FileWriter fileWriter = new FileWriter("src/main/resources/replays/" + fileName)){
            gson.toJson(this, fileWriter);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

//Victor Wingert de Almeida         - 202335036
//Guilherme Roldão dos Reis Pimenta - 202365085A
//Bruno Nascimento Rodrigues        - 202065114A
//Pablo Novaes Costa                - 202335031

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitites;

import com.google.gson.Gson;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Position;
import entitites.Piece;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public class Replay {
    private String startDateTime;
    private String endDateTime;
    private String player1Name;
    private String player2Name;
    private ArrayList<BoardState> statesList = new ArrayList<>();
    int turnNumber;
    
    
    public Replay(String player1Name, String player2Name){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
        this.startDateTime = formatter.format(LocalDateTime.now());
        turnNumber = 1;
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }
    
    public void addBoardState(Position initialPositionOfPieceThatMoves, SquareSaveData[][] boardPiecesesMatrix){
        statesList.add(new BoardState(turnNumber,initialPositionOfPieceThatMoves,boardPiecesesMatrix));
        turnNumber++;
    }
    
    public void saveReplay(String fileName){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
        endDateTime = formatter.format(LocalDateTime.now());
        Gson gson = new Gson();
        
        try(FileWriter fileWriter = new FileWriter("src/main/resources/replays/" + fileName +".json")){
            gson.toJson(this, fileWriter);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public ArrayList<BoardState> getStatesList() {
        return statesList;
    }

    public int getTurnNumber() {
        return turnNumber;
    }
    
}

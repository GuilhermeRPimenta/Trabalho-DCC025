//Victor Wingert de Almeida         - 202335036
//Guilherme Roldão dos Reis Pimenta - 202365085A
//Bruno Nascimento Rodrigues        - 202065114A
//Pablo Novaes Costa                - 202335031

package entitites;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Tournament {

    private String name;
    private List<Player> playerList;
    private List<TournamentRound> tournamentRounds = new ArrayList<>();
    private int numberOfPlayers  = 0;
    private int currentRoundIndex = -1;
    private String formattedStartDateTime;
    private Player winner = null;

    public Tournament(String name, List<Player> playerList) throws TournamentException {
        
        if(name.length() <= 0)
            throw new TournamentException("Dê um nome ao torneio");
            
        this.name = name;

        if (playerList == null || playerList.isEmpty()) {
            throw new TournamentException("A lista de jogadores não pode estar vazia.");
        }

        if (!isPowerOfTwo(playerList.size()) || playerList.size() == 1) {
            throw new TournamentException("Quantidade de jogadodes inválida (Potência de 2)");
        }
        
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
         
        this.playerList = playerList;
        LocalDateTime startDatetime = LocalDateTime.now();
        formattedStartDateTime =  formatter.format(startDatetime);
        numberOfPlayers = playerList.size();
        startRound(playerList);
    }

    public Tournament() {
    }
    
    private boolean isPowerOfTwo(int number) {
        if (number <= 0) {
            return false;
        }

        while (number % 2 == 0) {
            number /= 2;
        }

        return number == 1;
    }
    
    
    public void adicionarTorneio() {

        Gson gson = new Gson();

        try (FileWriter fileWriter = new FileWriter("src/main/resources/tournaments/" + name + ".json")) {
            gson.toJson(this, fileWriter);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void startRound(List<Player> roundPlayers){
        currentRoundIndex++;
        tournamentRounds.add(new TournamentRound(roundPlayers, currentRoundIndex));
    }
    
    public void checkIfShouldStartNextRound(){
        List<TournamentMatch> currentRoundMatches = getCurrentRoundMatches();
        for(TournamentMatch match : currentRoundMatches){
            if(match.getWinner() == null){
                return;
            }
        }
        
        List<Player> winners = new ArrayList<>();
        for (TournamentMatch match : currentRoundMatches) {
            winners.add(match.getWinner());
        }
        
        if(winners.size() != 1){
            startRound(winners);
        }
        else{
            winner = winners.get(0);
        }
        
    }
    
    public List<TournamentMatch> getAllMatches(){
        List<TournamentMatch> allMatches = new ArrayList<>();
        
        for(TournamentRound round : tournamentRounds){
            allMatches.addAll(round.getMatches());
        }
        
        return allMatches;
    }
    
    public List<TournamentMatch> getCurrentRoundMatches(){
        return tournamentRounds.get(currentRoundIndex).getMatches();
    }
    
    public String getName(){
        return name;
    }
    
    public int getNumberOfPlayers(){
        return numberOfPlayers;
    }
    
    public String getFormattedStarDate(){
        return formattedStartDateTime;
    }
}

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
        tournamentRounds.add(new TournamentRound(roundPlayers));
        currentRoundIndex++;
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

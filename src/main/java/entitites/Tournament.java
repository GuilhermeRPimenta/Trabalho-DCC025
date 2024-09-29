package entitites;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;

public class Tournament {

    private String nomeDoTorneio;
    private List<Player> listaPlayers;

    public Tournament(String nomeDoTorneio, List<Player> listaPlayers) throws TournamentException {
        
        if(nomeDoTorneio.length() <= 0)
            throw new TournamentException("Dê um nome ao torneio");
            
        this.nomeDoTorneio = nomeDoTorneio;

        if (listaPlayers == null || listaPlayers.isEmpty()) {
            throw new TournamentException("A lista de jogadores não pode estar vazia.");
        }

        if (!isPowerOfTwo(listaPlayers.size()) || listaPlayers.size() == 1) {
            throw new TournamentException("Quantidade de jogadodes inválida (Potência de 2)");
        }

        this.listaPlayers = listaPlayers;
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

        try (FileWriter fileWriter = new FileWriter("src/main/resources/tournaments/" + nomeDoTorneio + ".json")) {
            gson.toJson(this, fileWriter);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}

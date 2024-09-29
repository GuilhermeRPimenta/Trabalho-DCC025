package entitites;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Player extends User{
    private int mmr;
    
    public Player() {        
    }
    
    public Player(String nome, String email, String senha) {
        super(nome, email, senha);
        this.mmr = 1000;
    }
    
    public Player(String nome, String email, int mmr){
        this.nome = nome;
        this.email = email;
        this.mmr = mmr;      
    }
    
    public void updateMmr(Player oponente, double resultado){
        double expectedScore = calculateExpectedScore(this.mmr, oponente.getMmr());
        double opponentExpectedScore = calculateExpectedScore(oponente.getMmr(), this.mmr);

        this.mmr = calculateNewRating(this.mmr, expectedScore, resultado);
        oponente.setMmr(calculateNewRating(oponente.getMmr(), opponentExpectedScore, 1 - resultado));
    
         saveMmrToCsv(this, oponente);
    }
    
    private double calculateExpectedScore(int playerMmr, int opponentMmr) {
        return 1.0 / (1.0 + Math.pow(10, (opponentMmr - playerMmr) / 400.0));
    }

    private int calculateNewRating(int atualMmr, double expectedScore, double actualScore) {
        return (int) (atualMmr + 32 * (actualScore - expectedScore));
    }
    
    private void saveMmrToCsv(Player player1, Player player2) {
        List<String[]> data = new ArrayList<>();
        String line;
        boolean player1Updated = false;
        boolean player2Updated = false;
        String path = "";
        
        String os = System.getProperty("os.name").toLowerCase();
        
        if (os.contains("win")) {
            path = "src\\main\\resources\\userData\\playerData.csv";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            path = "src/main/resources/userData/playerData.csv";
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            // Lê o arquivo CSV
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                // Verifica se a linha corresponde ao jogador 1 ou 2 pelo email
                if (values[1].equals(player1.email)) {
                    values[3] = String.valueOf(player1.getMmr()); // Atualiza o MMR do player1
                    player1Updated = true;
                } else if (values[1].equals(player2.email)) {
                    values[3] = String.valueOf(player2.getMmr()); // Atualiza o MMR do player2
                    player2Updated = true;
                }
                data.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Se os jogadores foram encontrados e atualizados, salva o arquivo
        if (player1Updated && player2Updated) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
                for (String[] row : data) {
                    bw.write(String.join(",", row));
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public int getMmr() {
        return mmr;
    }

    public void setMmr(int mmr) {
        this.mmr = mmr;
    }
    
    public String getName(){
        return nome;
    }
}

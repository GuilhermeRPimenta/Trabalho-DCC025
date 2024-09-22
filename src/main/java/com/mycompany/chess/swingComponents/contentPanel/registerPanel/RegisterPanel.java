package com.mycompany.chess.swingComponents.contentPanel.registerPanel;

import com.mycompany.chess.MainFrame;
import entitites.Player;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.swing.JPanel;

public class RegisterPanel extends JPanel {

    private MainFrame mainFrame;
    
    public RegisterPanel() {
    }

    public RegisterPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public void savePlayer(String name, String email, String password, String confirmPassword) {        
        Player player = new Player(name, email, password, confirmPassword);
        
        if (saveCSV(player)) {
            mainFrame.updateButton("Jogador adicionado !", mainFrame.getConfirmRegisterButton());
        }
    }

    public boolean saveCSV(Player player) {

        String path = "";

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            path = "src\\main\\resources\\userData\\userData.csv";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            path = "src/main/resources/userData/userData.csv";
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            String line = player.getName() + "," + player.getEmail() + "," + player.getPassword() + "," + player.getIsAdmin();
            bw.write(line);
            bw.newLine();
            return true;
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean validarEmail(String email) {
        String regexEmail = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return Pattern.matches(regexEmail, email);
    }

    public boolean validarSenha(String senha) {
        String regexSenha = "^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])(?=.*[a-z]).{8,}$";
        return Pattern.matches(regexSenha, senha);
    }
}

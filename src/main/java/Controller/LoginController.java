package Controller;

import com.mycompany.chess.swingComponents.contentPanel.gamePanel.loginScreen.SessionManager;
import entitites.NullPlayerException;
import entitites.Player;
import entitites.camposInvalidosException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class LoginController<T extends LoginScreenInterface> {

    private T loginScreen;
    private Player player = null;

    public LoginController(T loginScreen) {
        this.loginScreen = loginScreen;
    }

    public void updateButton(String txt, JButton botao) {
        botao.setEnabled(false);
        botao.setText(txt);

        Timer timer = new Timer(1000, e -> {
            botao.setText("Entrar");
            botao.setEnabled(true);
        });
        timer.setRepeats(false);
        timer.start();
    }

    public boolean login(String n, String p) throws camposInvalidosException {
        String path = System.getProperty("os.name").toLowerCase().contains("win")
                ? "src\\main\\resources\\userData\\playerData.csv"
                : "src/main/resources/userData/playerData.csv";

        boolean userFound = false;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String fileName = fields[0];
                String filePassword = fields[2];

                if (fileName.equals(n) && filePassword.equals(p)) {
                    userFound = true;
                    player = new Player(fields[0], fields[1], Integer.parseInt(fields[3]));
                    break;
                }
            }

            if (!userFound) {
                throw new camposInvalidosException("Usuário não encontrado !");
            }

            return true;
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return false;
    }

    public boolean confirmLogin() {
        String name = loginScreen.getNameFieldText();
        String password = loginScreen.getPasswordFieldText();

        try {
            if (name.isEmpty() || password.isEmpty()) {
                throw new camposInvalidosException("Preencha todos os campos !");
            }

            if (SessionManager.isUserLoggedIn(name)) {
                throw new camposInvalidosException("Usuário já está logado !");
            }

            if (login(name, password)) {
                SessionManager.loginUser(name);
                return true;
            }

        } catch (camposInvalidosException ex) {
            updateButton(ex.getMessage(), loginScreen.getLoginButton());
        }
        return false;
    }

    public void logout() {
        if (player != null) {
            SessionManager.logoutUser(player.getName());
        }
    }

    public Player getPlayer() {
        return player;
    }

    public void showError(NullPlayerException e) {
        JOptionPane.showMessageDialog((java.awt.Component) loginScreen, e.getMessage());
    }
}

package Controller;

import entitites.Player;
import javax.swing.JButton;

public interface LoginScreenInterface {
    String getNameFieldText();
    String getPasswordFieldText();
    JButton getLoginButton();
    Player getPlayer();
}

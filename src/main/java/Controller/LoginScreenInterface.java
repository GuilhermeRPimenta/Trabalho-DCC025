//Victor Wingert de Almeida         - 202335036
//Guilherme Roldão dos Reis Pimenta - 202365085A
//Bruno Nascimento Rodrigues        - 202065114A
//Pablo Novaes Costa                - 202335031

package Controller;

import entitites.Player;
import javax.swing.JButton;

public interface LoginScreenInterface {
    String getNameFieldText();
    String getPasswordFieldText();
    JButton getLoginButton();
    Player getPlayer();
}

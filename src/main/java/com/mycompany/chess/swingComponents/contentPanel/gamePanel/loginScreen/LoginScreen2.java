//Victor Wingert de Almeida         - 202335036
//Guilherme Roldão dos Reis Pimenta - 202365085A
//Bruno Nascimento Rodrigues        - 202065114A
//Pablo Novaes Costa                - 202335031

package com.mycompany.chess.swingComponents.contentPanel.gamePanel.loginScreen;

import Controller.LoginController;
import Controller.LoginScreenInterface;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.GamePanel;
import entitites.NullPlayerException;
import entitites.Player;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class LoginScreen2 extends javax.swing.JPanel implements LoginScreenInterface {

    private LoginController<LoginScreen2> controller;

    public LoginScreen2() {
        initComponents();
        controller = new LoginController<>(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        loginField = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new java.awt.GridBagLayout());

        Login.setBackground(new java.awt.Color(51, 51, 51));
        Login.setPreferredSize(new java.awt.Dimension(500, 240));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 70)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("LOGIN 2");
        Login.add(title);

        loginField.setPreferredSize(new java.awt.Dimension(424, 138));

        name.setText("Nome:");

        password.setText("Senha:");

        loginButton.setText("Entrar");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginFieldLayout = new javax.swing.GroupLayout(loginField);
        loginField.setLayout(loginFieldLayout);
        loginFieldLayout.setHorizontalGroup(
            loginFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addGroup(loginFieldLayout.createSequentialGroup()
                        .addGroup(loginFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addComponent(password))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField)
                            .addComponent(passwordField))))
                .addContainerGap())
        );
        loginFieldLayout.setVerticalGroup(
            loginFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name))
                .addGap(18, 18, 18)
                .addGroup(loginFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password))
                .addGap(21, 21, 21)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Login.add(loginField);

        add(Login, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        if (controller.confirmLogin()) {
            GamePanel gamePanel = (GamePanel) this.getParent();
            
            gamePanel.getLoginScreen1().getController().logout(); // LOGOUT TELA 2
            controller.logout();                                  // LOGOUT LOGIN 2
            
            gamePanel.startGame();           
            nameField.setText("");
            passwordField.setText("");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    public void showError(NullPlayerException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton loginButton;
    private javax.swing.JPanel loginField;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    @Override
    public String getNameFieldText() {
        return nameField.getText();
    }

    @Override
    public String getPasswordFieldText() {
        return passwordField.getText();
    }

    @Override
    public JButton getLoginButton() {
        return loginButton;
    }

    @Override
    public Player getPlayer() {
        return controller.getPlayer();
    }
}

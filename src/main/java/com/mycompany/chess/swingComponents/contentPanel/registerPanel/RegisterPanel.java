package com.mycompany.chess.swingComponents.contentPanel.registerPanel;

import entitites.camposInvalidosException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.Timer;

public class RegisterPanel extends javax.swing.JPanel {

    public RegisterPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        register = new javax.swing.JPanel();
        registerTitle = new javax.swing.JLabel();
        registerField = new com.mycompany.chess.swingComponents.contentPanel.registerPanel.RegisterField();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        emailName = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        confirmRegisterButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(1135, 800));
        setPreferredSize(new java.awt.Dimension(1135, 800));
        setLayout(new java.awt.GridBagLayout());

        register.setBackground(new java.awt.Color(51, 51, 51));
        register.setPreferredSize(new java.awt.Dimension(500, 320));

        registerTitle.setBackground(new java.awt.Color(255, 255, 255));
        registerTitle.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 70)); // NOI18N
        registerTitle.setForeground(new java.awt.Color(255, 255, 255));
        registerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerTitle.setText("CADASTRO");
        register.add(registerTitle);

        registerField.setPreferredSize(new java.awt.Dimension(424, 218));

        nameLabel.setText("Nome:");

        emailName.setText("Email:");

        passwordLabel.setText("Senha:");

        confirmPasswordLabel.setText("Confirmar senha:");

        confirmRegisterButton.setText("Cadastrar");
        confirmRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmRegisterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerFieldLayout = new javax.swing.GroupLayout(registerField);
        registerField.setLayout(registerFieldLayout);
        registerFieldLayout.setHorizontalGroup(
            registerFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirmRegisterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(registerFieldLayout.createSequentialGroup()
                        .addGroup(registerFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(registerFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(nameField)
                            .addComponent(passwordField)
                            .addComponent(confirmPasswordField))))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        registerFieldLayout.setVerticalGroup(
            registerFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailName)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(registerFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPasswordLabel)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(confirmRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        register.add(registerField);

        add(register, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    public void updateRegisterButton(String txt, JButton botao) {
        botao.setEnabled(false);
        botao.setText(txt);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botao.setText("Cadastrar");
                botao.setEnabled(true);
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    private void confirmRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmRegisterButtonActionPerformed
        String name = nameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        try {
            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                throw new camposInvalidosException("Preencha todos os campos!");
            }

            if (!password.equals(confirmPassword)) {
                throw new camposInvalidosException("Senhas diferentes!");
            }

            if (!registerField.validarEmail(email)) {
                throw new camposInvalidosException("Email inválido!");
            }

            if (!registerField.validarSenha(password)) {
                throw new camposInvalidosException("Senha não atende aos critérios!");
            }

            if (registerField.savePlayer(name, email, password)) {
                updateRegisterButton("Jogador adicionado !", confirmRegisterButton);
            }

        } catch (camposInvalidosException ex) {
            updateRegisterButton(ex.getMessage(), confirmRegisterButton);
        }
    }//GEN-LAST:event_confirmRegisterButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLabel;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton confirmRegisterButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailName;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel register;
    private com.mycompany.chess.swingComponents.contentPanel.registerPanel.RegisterField registerField;
    private javax.swing.JLabel registerTitle;
    // End of variables declaration//GEN-END:variables
}

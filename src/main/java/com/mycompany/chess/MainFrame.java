package com.mycompany.chess;

import com.mycompany.chess.swingComponents.contentPanel.registerPanel.RegisterField;
import com.mycompany.chess.swingComponents.sidebar.SidebarButton;
import customPalette.customTable;
import entitites.camposInvalidosException;
import fields.AdminField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.Timer;

public class MainFrame extends javax.swing.JFrame {

    private javax.swing.JButton currentClickedSidebarButton = null;
    private RegisterField registro;
    private AdminField admin;

    public MainFrame() {
        initComponents();
        registro = new RegisterField(this);
        admin = new AdminField();
        this.setVisible(true);
        currentClickedSidebarButton = playButton;
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        sidebar = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        playButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
        registerButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
        rankingButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
        replaysButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
        adminButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
        contentPanel = new javax.swing.JPanel();
        gamePanel = new javax.swing.JPanel();
        gameScreen = new javax.swing.JPanel();
        board1 = new com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Board();
        registerPanel = new javax.swing.JPanel();
        register = new javax.swing.JPanel();
        registerTitle = new javax.swing.JLabel();
        registerField = new com.mycompany.chess.swingComponents.contentPanel.registerPanel.RegisterField();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        emailName = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JTextField();
        confirmRegisterButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
        rankingPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        replaysPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        adminPanel = new javax.swing.JPanel();
        adminLogin = new javax.swing.JPanel();
        adminTitle = new javax.swing.JLabel();
        adminField = new fields.AdminField();
        adminNameLabel = new javax.swing.JLabel();
        adminNameField = new javax.swing.JTextField();
        adminPasswordLabel = new javax.swing.JLabel();
        adminPasswordField = new javax.swing.JTextField();
        adminConfirmLoginButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
        adminConfigPanel = new fields.AdminConfigPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customTable = new customPalette.customTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chess");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png")).getImage());

        sidebar.setBackground(new java.awt.Color(0, 0, 0));

        Title.setFont(new java.awt.Font("Impact", 1, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resizedLogo.png"))); // NOI18N
        Title.setText("CHESS");

        playButton.setBackground(new java.awt.Color(255, 255, 255));
        playButton.setForeground(new java.awt.Color(0, 0, 0));
        playButton.setText("JOGAR");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        registerButton.setText("CADASTRO");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        rankingButton.setText("RANKING");
        rankingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingButtonActionPerformed(evt);
            }
        });

        replaysButton.setText("REPLAYS");
        replaysButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaysButtonActionPerformed(evt);
            }
        });

        adminButton.setText("ADMIN");
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Title))
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rankingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(replaysButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rankingButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(replaysButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contentPanel.setBackground(new java.awt.Color(204, 255, 255));
        contentPanel.setLayout(new java.awt.CardLayout());

        gamePanel.setBackground(new java.awt.Color(51, 51, 51));
        gamePanel.setLayout(new java.awt.CardLayout());

        gameScreen.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout gameScreenLayout = new javax.swing.GroupLayout(gameScreen);
        gameScreen.setLayout(gameScreenLayout);
        gameScreenLayout.setHorizontalGroup(
            gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1135, Short.MAX_VALUE)
            .addGroup(gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gameScreenLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(board1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        gameScreenLayout.setVerticalGroup(
            gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
            .addGroup(gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gameScreenLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(board1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        gamePanel.add(gameScreen, "card3");

        contentPanel.add(gamePanel, "card2");

        registerPanel.setBackground(new java.awt.Color(51, 51, 51));
        registerPanel.setLayout(new java.awt.GridBagLayout());

        register.setBackground(new java.awt.Color(51, 51, 51));

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
                    .addComponent(confirmRegisterButton, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addGroup(registerFieldLayout.createSequentialGroup()
                        .addGroup(registerFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(registerFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(nameField)))
                    .addGroup(registerFieldLayout.createSequentialGroup()
                        .addGroup(registerFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(registerFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
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
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(18, 18, 18)
                .addGroup(registerFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPasswordLabel)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(confirmRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        register.add(registerField);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -61;
        gridBagConstraints.ipady = 212;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(124, 184, 124, 171);
        registerPanel.add(register, gridBagConstraints);

        contentPanel.add(registerPanel, "card3");

        rankingPanel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tela de ranking");

        javax.swing.GroupLayout rankingPanelLayout = new javax.swing.GroupLayout(rankingPanel);
        rankingPanel.setLayout(rankingPanelLayout);
        rankingPanelLayout.setHorizontalGroup(
            rankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rankingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(1049, Short.MAX_VALUE))
        );
        rankingPanelLayout.setVerticalGroup(
            rankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rankingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(666, Short.MAX_VALUE))
        );

        contentPanel.add(rankingPanel, "card4");

        replaysPanel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tela de replays");

        javax.swing.GroupLayout replaysPanelLayout = new javax.swing.GroupLayout(replaysPanel);
        replaysPanel.setLayout(replaysPanelLayout);
        replaysPanelLayout.setHorizontalGroup(
            replaysPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(replaysPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(1052, Short.MAX_VALUE))
        );
        replaysPanelLayout.setVerticalGroup(
            replaysPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(replaysPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(666, Short.MAX_VALUE))
        );

        contentPanel.add(replaysPanel, "card5");

        adminPanel.setBackground(new java.awt.Color(51, 51, 51));
        adminPanel.setLayout(new java.awt.GridBagLayout());

        adminLogin.setBackground(new java.awt.Color(51, 51, 51));
        adminLogin.setPreferredSize(new java.awt.Dimension(600, 250));

        adminTitle.setBackground(new java.awt.Color(255, 255, 255));
        adminTitle.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 70)); // NOI18N
        adminTitle.setForeground(new java.awt.Color(255, 255, 255));
        adminTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminTitle.setText("ADMIN");
        adminLogin.add(adminTitle);

        adminField.setPreferredSize(new java.awt.Dimension(424, 145));

        adminNameLabel.setText("Nome:");

        adminPasswordLabel.setText("Senha:");

        adminConfirmLoginButton.setText("Entrar");
        adminConfirmLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminConfirmLoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminFieldLayout = new javax.swing.GroupLayout(adminField);
        adminField.setLayout(adminFieldLayout);
        adminFieldLayout.setHorizontalGroup(
            adminFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminConfirmLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addGroup(adminFieldLayout.createSequentialGroup()
                        .addComponent(adminNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(adminNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                    .addGroup(adminFieldLayout.createSequentialGroup()
                        .addComponent(adminPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        adminFieldLayout.setVerticalGroup(
            adminFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminNameLabel)
                    .addComponent(adminNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(adminFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminPasswordLabel)
                    .addComponent(adminPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(adminConfirmLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        adminLogin.add(adminField);

        adminPanel.add(adminLogin, new java.awt.GridBagConstraints());

        adminConfigPanel.setBackground(new java.awt.Color(0, 0, 0));
        adminConfigPanel.setPreferredSize(new java.awt.Dimension(640, 640));

        jScrollPane2.setViewportView(customTable);

        javax.swing.GroupLayout adminConfigPanelLayout = new javax.swing.GroupLayout(adminConfigPanel);
        adminConfigPanel.setLayout(adminConfigPanelLayout);
        adminConfigPanelLayout.setHorizontalGroup(
            adminConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminConfigPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        adminConfigPanelLayout.setVerticalGroup(
            adminConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminConfigPanelLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        adminPanel.add(adminConfigPanel, new java.awt.GridBagConstraints());

        contentPanel.add(adminPanel, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public SidebarButton getConfirmRegisterButton() {
        return confirmRegisterButton;
    }

    public customTable getCustomTable() {
        return customTable;
    }

    public void updateButton(String txt, JButton botao) {
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

    private void updateSidebarButtonAndContentPanel(java.awt.event.ActionEvent evt, JPanel contentCardPanel) {
        if (currentClickedSidebarButton == null) {
            return;
        }
        JButton clickedButton = (JButton) evt.getSource();
        currentClickedSidebarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        currentClickedSidebarButton.setBackground(new Color(60, 63, 65));
        currentClickedSidebarButton.setForeground(Color.white);
        clickedButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clickedButton.setBackground(Color.white);
        clickedButton.setForeground(Color.black);
        currentClickedSidebarButton = clickedButton;

        contentPanel.removeAll();
        contentPanel.add(contentCardPanel);
        contentPanel.repaint();
        contentPanel.revalidate();

    }

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        updateSidebarButtonAndContentPanel(evt, gamePanel);
    }//GEN-LAST:event_playButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        updateSidebarButtonAndContentPanel(evt, registerPanel);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void rankingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingButtonActionPerformed
        updateSidebarButtonAndContentPanel(evt, rankingPanel);
    }//GEN-LAST:event_rankingButtonActionPerformed

    private void replaysButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaysButtonActionPerformed
        updateSidebarButtonAndContentPanel(evt, replaysPanel);
    }//GEN-LAST:event_replaysButtonActionPerformed

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        updateSidebarButtonAndContentPanel(evt, adminPanel);
    }//GEN-LAST:event_adminButtonActionPerformed

    private void adminConfirmLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminConfirmLoginButtonActionPerformed
        String name = adminNameField.getText();
        String password = adminPasswordField.getText();

        try {
            if (name.isEmpty() || password.isEmpty()) {
                throw new camposInvalidosException("Preencha todos os campos !");
            }

            if (admin.loginAdmin(name, password)) {
                //throw new camposInvalidosException("Login bem-sucedido !");
                adminLogin.setVisible(false);
                adminConfigPanel.setVisible(true);

            }

        } catch (camposInvalidosException ex) {
            updateButton(ex.getMessage(), adminConfirmLoginButton);
        }
    }//GEN-LAST:event_adminConfirmLoginButtonActionPerformed

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

            if (!registro.validarEmail(email)) {
                throw new camposInvalidosException("Email inválido!");
            }

            if (!registro.validarSenha(password)) {
                throw new camposInvalidosException("Senha não atende aos critérios!");
            }

            registro.savePlayer(name, email, password, confirmPassword);

        } catch (camposInvalidosException ex) {
            updateButton(ex.getMessage(), confirmRegisterButton);
        }
    }//GEN-LAST:event_confirmRegisterButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton adminButton;
    private fields.AdminConfigPanel adminConfigPanel;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton adminConfirmLoginButton;
    private fields.AdminField adminField;
    private javax.swing.JPanel adminLogin;
    private javax.swing.JTextField adminNameField;
    private javax.swing.JLabel adminNameLabel;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JTextField adminPasswordField;
    private javax.swing.JLabel adminPasswordLabel;
    private javax.swing.JLabel adminTitle;
    private com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Board board1;
    private javax.swing.JTextField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLabel;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton confirmRegisterButton;
    private javax.swing.JPanel contentPanel;
    private customPalette.customTable customTable;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailName;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JPanel gameScreen;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton playButton;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton rankingButton;
    private javax.swing.JPanel rankingPanel;
    private javax.swing.JPanel register;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton registerButton;
    private com.mycompany.chess.swingComponents.contentPanel.registerPanel.RegisterField registerField;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JLabel registerTitle;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton replaysButton;
    private javax.swing.JPanel replaysPanel;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}

package com.mycompany.chess.swingComponents.contentPanel.adminPanel;

import com.mycompany.chess.swingComponents.contentPanel.registerPanel.RegisterField;
import entitites.camposInvalidosException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.Timer;
import javax.swing.event.ListSelectionEvent;

public class AdminPanel extends javax.swing.JPanel {

    public AdminPanel() {
        initComponents();
        admin.setVisible(true);
        config.setVisible(false);
        initTableListenersPlayers();
        ButtonsBottom.removeAll();
        ButtonsBottom.repaint();
        ButtonsBottom.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        loginPanel = new javax.swing.JPanel();
        admin = new javax.swing.JPanel();
        adminTitle = new javax.swing.JLabel();
        adminField = new com.mycompany.chess.swingComponents.contentPanel.adminPanel.AdminField();
        adminNameLabel = new javax.swing.JLabel();
        adminNameField = new javax.swing.JTextField();
        adminPasswordLabel = new javax.swing.JLabel();
        adminPasswordField = new javax.swing.JPasswordField();
        adminConfirmLoginButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
        configPanel = new javax.swing.JPanel();
        config = new com.mycompany.chess.swingComponents.contentPanel.adminPanel.AdminConfigPanel();
        ButtonsTop = new javax.swing.JPanel();
        playerButton = new javax.swing.JButton();
        adminButton = new javax.swing.JButton();
        Components = new javax.swing.JPanel();
        adminScrollPane = new javax.swing.JScrollPane();
        adminTable = new customPalette.AdminTable();
        playerScrollPane = new javax.swing.JScrollPane();
        playerTable = new customPalette.PlayerTable();
        playerEditPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        senhaLabel = new javax.swing.JLabel();
        senhaField = new javax.swing.JTextField();
        MMRLabel = new javax.swing.JLabel();
        MMRField = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        ButtonsBottom = new javax.swing.JPanel();
        ButtonsBottomPlayer = new javax.swing.JPanel();
        editarButtonPlayer = new javax.swing.JButton();
        apagarButtonPlayer = new javax.swing.JButton();
        ButtonsBottomAdmin = new javax.swing.JPanel();
        editarButtonAdmin = new javax.swing.JButton();
        apagarButtonAdmin = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(1135, 800));
        setPreferredSize(new java.awt.Dimension(1135, 800));
        setLayout(new java.awt.GridBagLayout());

        loginPanel.setBackground(new java.awt.Color(51, 51, 51));
        loginPanel.setLayout(new java.awt.GridBagLayout());

        admin.setBackground(new java.awt.Color(51, 51, 51));
        admin.setPreferredSize(new java.awt.Dimension(450, 250));

        adminTitle.setBackground(new java.awt.Color(255, 255, 255));
        adminTitle.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 70)); // NOI18N
        adminTitle.setForeground(new java.awt.Color(255, 255, 255));
        adminTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminTitle.setText("ADMIN");
        admin.add(adminTitle);

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
                        .addGroup(adminFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(adminFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(adminPasswordField))))
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
                .addContainerGap(19, Short.MAX_VALUE))
        );

        admin.add(adminField);

        loginPanel.add(admin, new java.awt.GridBagConstraints());

        add(loginPanel, new java.awt.GridBagConstraints());

        configPanel.setLayout(new java.awt.GridBagLayout());

        config.setBackground(new java.awt.Color(51, 51, 51));
        config.setMinimumSize(new java.awt.Dimension(600, 600));
        config.setPreferredSize(new java.awt.Dimension(80, 400));

        ButtonsTop.setBackground(new java.awt.Color(51, 51, 51));
        ButtonsTop.setMinimumSize(new java.awt.Dimension(285, 100));

        playerButton.setText("Player");
        playerButton.setPreferredSize(new java.awt.Dimension(250, 25));
        playerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerButtonActionPerformed(evt);
            }
        });
        ButtonsTop.add(playerButton);

        adminButton.setText("Admin");
        adminButton.setPreferredSize(new java.awt.Dimension(250, 25));
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });
        ButtonsTop.add(adminButton);

        config.add(ButtonsTop);

        Components.setBackground(new java.awt.Color(0, 255, 255));
        Components.setPreferredSize(new java.awt.Dimension(505, 480));
        Components.setLayout(new java.awt.CardLayout());

        adminScrollPane.setViewportView(adminTable);

        Components.add(adminScrollPane, "card2");

        playerScrollPane.setViewportView(playerTable);

        Components.add(playerScrollPane, "card3");

        nameLabel.setText("Nome:");

        emailLabel.setText("Email:");

        senhaLabel.setText("Senha:");

        MMRLabel.setText("MMR");

        confirmButton.setText("Confirmar");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout playerEditPanelLayout = new javax.swing.GroupLayout(playerEditPanel);
        playerEditPanel.setLayout(playerEditPanelLayout);
        playerEditPanelLayout.setHorizontalGroup(
            playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerEditPanelLayout.createSequentialGroup()
                .addGroup(playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerEditPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerEditPanelLayout.createSequentialGroup()
                                .addGroup(playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MMRLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(senhaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MMRField, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(senhaField)))
                            .addGroup(playerEditPanelLayout.createSequentialGroup()
                                .addGroup(playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(emailField)))))
                    .addGroup(playerEditPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        playerEditPanelLayout.setVerticalGroup(
            playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerEditPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLabel)
                    .addComponent(senhaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MMRLabel)
                    .addComponent(MMRField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmButton)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        Components.add(playerEditPanel, "card4");

        config.add(Components);

        ButtonsBottom.setBackground(new java.awt.Color(51, 51, 51));
        ButtonsBottom.setMinimumSize(new java.awt.Dimension(285, 100));
        ButtonsBottom.setPreferredSize(new java.awt.Dimension(515, 35));
        ButtonsBottom.setLayout(new java.awt.CardLayout());

        ButtonsBottomPlayer.setBackground(new java.awt.Color(51, 51, 51));

        editarButtonPlayer.setText("Editar");
        editarButtonPlayer.setPreferredSize(new java.awt.Dimension(250, 25));
        editarButtonPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonPlayerActionPerformed(evt);
            }
        });

        apagarButtonPlayer.setText("Apagar");
        apagarButtonPlayer.setPreferredSize(new java.awt.Dimension(250, 25));
        apagarButtonPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarButtonPlayerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsBottomPlayerLayout = new javax.swing.GroupLayout(ButtonsBottomPlayer);
        ButtonsBottomPlayer.setLayout(ButtonsBottomPlayerLayout);
        ButtonsBottomPlayerLayout.setHorizontalGroup(
            ButtonsBottomPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsBottomPlayerLayout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addComponent(editarButtonPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apagarButtonPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ButtonsBottomPlayerLayout.setVerticalGroup(
            ButtonsBottomPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsBottomPlayerLayout.createSequentialGroup()
                .addGroup(ButtonsBottomPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarButtonPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apagarButtonPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        ButtonsBottom.add(ButtonsBottomPlayer, "card2");

        ButtonsBottomAdmin.setBackground(new java.awt.Color(51, 51, 51));

        editarButtonAdmin.setText("Editar");
        editarButtonAdmin.setPreferredSize(new java.awt.Dimension(250, 25));
        editarButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonAdminActionPerformed(evt);
            }
        });

        apagarButtonAdmin.setText("Apagar");
        apagarButtonAdmin.setPreferredSize(new java.awt.Dimension(250, 25));
        apagarButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarButtonAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsBottomAdminLayout = new javax.swing.GroupLayout(ButtonsBottomAdmin);
        ButtonsBottomAdmin.setLayout(ButtonsBottomAdminLayout);
        ButtonsBottomAdminLayout.setHorizontalGroup(
            ButtonsBottomAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsBottomAdminLayout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addComponent(editarButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apagarButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ButtonsBottomAdminLayout.setVerticalGroup(
            ButtonsBottomAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsBottomAdminLayout.createSequentialGroup()
                .addGroup(ButtonsBottomAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apagarButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        ButtonsBottom.add(ButtonsBottomAdmin, "card2");

        config.add(ButtonsBottom);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 535;
        gridBagConstraints.ipady = 205;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        configPanel.add(config, gridBagConstraints);

        add(configPanel, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    public void editButtom(javax.swing.JPanel editPanel) {
        ButtonsBottom.removeAll();
        ButtonsBottom.repaint();
        ButtonsBottom.revalidate();
        Components.removeAll();
        Components.add(editPanel);
        Components.repaint();
        Components.revalidate();
    }

    public void editCSV(String emailToEdit, String[] newData) {
        String path = "";
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            path = "src\\main\\resources\\userData\\playerData.csv";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            path = "src/main/resources/userData/playerData.csv";
        }

        List<String[]> csvData = new ArrayList<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                String[] rowData = line.split(",");

                if (rowData[1].equals(emailToEdit)) {
                    csvData.add(newData);
                } else {
                    csvData.add(rowData);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String[] row : csvData) {
                bw.write(String.join(",", row));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateConfirmButton(String txt, JButton botao) {
        botao.setText(txt);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botao.setText("Confirmar");
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    public boolean editTableComponents() {

        RegisterField validacao = new RegisterField();

        String nome = nameField.getText();
        String email = emailField.getText();
        String senha = senhaField.getText();
        String mmr = MMRField.getText();

        try { 
            if (nome.isEmpty() || email.isEmpty() || senha.isEmpty() || mmr.isEmpty()) {
                throw new camposInvalidosException("Preencha todos os campos !");
            }

            if (!validacao.validarEmail(email)) {
                throw new camposInvalidosException("Email inválido !");
            }

            if (!validacao.validarSenha(senha)) {
                throw new camposInvalidosException("Senha não atende aos critérios !");
            }
            
            String[] newData = {nome, email, senha, mmr};

            String oldEmail = playerTable.getValueAt(playerTable.getSelectedRow(), 1).toString();

            editCSV(oldEmail, newData);
        } catch (camposInvalidosException ex) {          
            updateConfirmButton(ex.getMessage(), confirmButton);
            return false;
        }
        return true;
    }

    private void initTableListenersPlayers() {
        playerTable.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            if (!event.getValueIsAdjusting()) {
                int selectedRow = playerTable.getSelectedRow();
                if (selectedRow >= 0) {
                    ButtonsBottom.removeAll();
                    ButtonsBottom.add(ButtonsBottomPlayer);
                    ButtonsBottom.repaint();
                    ButtonsBottom.revalidate();
                    nameField.setText(playerTable.getValueAt(selectedRow, 0).toString());
                    emailField.setText(playerTable.getValueAt(selectedRow, 1).toString());
                    senhaField.setText(playerTable.getValueAt(selectedRow, 2).toString());
                    MMRField.setText(playerTable.getValueAt(selectedRow, 3).toString());
                }
            }
        });
    }

    public void deslogar() {
        admin.setVisible(true);
        config.setVisible(false);
        playerTable.refreshTable();
        adminPasswordField.setText("");
        adminNameField.setText("");
    }

    public void updateAdminButton(String txt, JButton botao) {
        botao.setEnabled(false);
        botao.setText(txt);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botao.setText("Entrar");
                botao.setEnabled(true);
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    private void adminConfirmLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminConfirmLoginButtonActionPerformed
        String name = adminNameField.getText();
        String password = adminPasswordField.getText();

        try {
            if (name.isEmpty() || password.isEmpty()) {
                throw new camposInvalidosException("Preencha todos os campos !");
            }

            if (adminField.loginAdmin(name, password)) {
                admin.setVisible(false);
                config.setVisible(true);
                ButtonsBottom.removeAll();
                ButtonsBottom.repaint();
                ButtonsBottom.revalidate();
                Components.removeAll();
                Components.add(playerScrollPane);
                Components.repaint();
                Components.revalidate();
                playerTable.refreshTable();
            }

        } catch (camposInvalidosException ex) {
            updateAdminButton(ex.getMessage(), adminConfirmLoginButton);
        }
    }//GEN-LAST:event_adminConfirmLoginButtonActionPerformed

    private void playerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerButtonActionPerformed
        ButtonsBottom.removeAll();
        ButtonsBottom.repaint();
        ButtonsBottom.revalidate();
        Components.removeAll();
        Components.add(playerScrollPane);
        Components.repaint();
        Components.revalidate();
        playerTable.refreshTable();
    }//GEN-LAST:event_playerButtonActionPerformed

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        ButtonsBottom.removeAll();
        ButtonsBottom.repaint();
        ButtonsBottom.revalidate();
        Components.removeAll();
        Components.add(adminScrollPane);
        Components.repaint();
        Components.revalidate();
        adminTable.refreshTable();
    }//GEN-LAST:event_adminButtonActionPerformed

    private void editarButtonPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonPlayerActionPerformed
        editButtom(playerEditPanel);
    }//GEN-LAST:event_editarButtonPlayerActionPerformed

    private void apagarButtonPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarButtonPlayerActionPerformed
        ButtonsBottom.removeAll();
        ButtonsBottom.repaint();
        ButtonsBottom.revalidate();
        playerTable.deleteSelectedRow();
        Components.removeAll();
        Components.add(playerScrollPane);
        Components.repaint();
        Components.revalidate();
        playerTable.refreshTable();
    }//GEN-LAST:event_apagarButtonPlayerActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        if (editTableComponents()) {
            ButtonsBottom.removeAll();
            ButtonsBottom.repaint();
            ButtonsBottom.revalidate();
            Components.removeAll();
            Components.add(playerScrollPane);
            Components.repaint();
            Components.revalidate();
            playerTable.refreshTable();
        }      
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void editarButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonAdminActionPerformed
        //
    }//GEN-LAST:event_editarButtonAdminActionPerformed

    private void apagarButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarButtonAdminActionPerformed
        //
    }//GEN-LAST:event_apagarButtonAdminActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsBottom;
    private javax.swing.JPanel ButtonsBottomAdmin;
    private javax.swing.JPanel ButtonsBottomPlayer;
    private javax.swing.JPanel ButtonsTop;
    private javax.swing.JPanel Components;
    private javax.swing.JTextField MMRField;
    private javax.swing.JLabel MMRLabel;
    private javax.swing.JPanel admin;
    private javax.swing.JButton adminButton;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton adminConfirmLoginButton;
    private com.mycompany.chess.swingComponents.contentPanel.adminPanel.AdminField adminField;
    private javax.swing.JTextField adminNameField;
    private javax.swing.JLabel adminNameLabel;
    private javax.swing.JPasswordField adminPasswordField;
    private javax.swing.JLabel adminPasswordLabel;
    private javax.swing.JScrollPane adminScrollPane;
    private customPalette.AdminTable adminTable;
    private javax.swing.JLabel adminTitle;
    private javax.swing.JButton apagarButtonAdmin;
    private javax.swing.JButton apagarButtonPlayer;
    private com.mycompany.chess.swingComponents.contentPanel.adminPanel.AdminConfigPanel config;
    private javax.swing.JPanel configPanel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton editarButtonAdmin;
    private javax.swing.JButton editarButtonPlayer;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton playerButton;
    private javax.swing.JPanel playerEditPanel;
    private javax.swing.JScrollPane playerScrollPane;
    private customPalette.PlayerTable playerTable;
    private javax.swing.JTextField senhaField;
    private javax.swing.JLabel senhaLabel;
    // End of variables declaration//GEN-END:variables
}

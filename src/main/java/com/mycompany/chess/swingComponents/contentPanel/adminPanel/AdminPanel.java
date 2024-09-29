package com.mycompany.chess.swingComponents.contentPanel.adminPanel;

import Controller.AdminPanelController;
import com.mycompany.chess.swingComponents.contentPanel.registerPanel.RegisterField;
import entitites.Admin;
import entitites.Player;
import entitites.Tournament;
import entitites.TournamentException;
import entitites.camposInvalidosException;
import java.awt.PopupMenu;
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
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.event.ListSelectionEvent;

public class AdminPanel extends javax.swing.JPanel {

    private String email = "";
    private AdminPanelController controller;


    public AdminPanel() {
        initComponents();
        admin.setVisible(true);
        config.setVisible(false);
        initTableListenersPlayers();
        initTableListenersAdmins();
        ButtonsBottom.removeAll();
        ButtonsBottom.repaint();
        ButtonsBottom.revalidate();
        this.controller = new AdminPanelController(this);
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
        tournamentButton = new javax.swing.JButton();
        Components = new javax.swing.JPanel();
        adminScrollPane = new javax.swing.JScrollPane();
        adminTable = new customPalette.AdminTable();
        playerScrollPane = new javax.swing.JScrollPane();
        playerTable = new customPalette.PlayerTable();
        playerEditPanel = new javax.swing.JPanel();
        nameLabelPlayer = new javax.swing.JLabel();
        nameFieldPlayer = new javax.swing.JTextField();
        emailLabelPlayer = new javax.swing.JLabel();
        emailFieldPlayer = new javax.swing.JTextField();
        senhaLabelPlayer = new javax.swing.JLabel();
        senhaFieldPlayer = new javax.swing.JTextField();
        MMRLabelPlayer = new javax.swing.JLabel();
        MMRFieldPlayer = new javax.swing.JTextField();
        confirmButtonPlayer = new javax.swing.JButton();
        adminEditPanel = new javax.swing.JPanel();
        nameLabelAdmin = new javax.swing.JLabel();
        nameFieldAdmin = new javax.swing.JTextField();
        emailLabelnameFieldAdmin = new javax.swing.JLabel();
        emailFieldAdmin = new javax.swing.JTextField();
        senhaLabelAdmin = new javax.swing.JLabel();
        senhaFieldAdmin = new javax.swing.JTextField();
        confirmButtonAdmin = new javax.swing.JButton();
        adminRegisterPanel = new javax.swing.JPanel();
        nameLabelAdminRegister = new javax.swing.JLabel();
        nameFieldAdminRegister = new javax.swing.JTextField();
        emailLabelnameFieldAdminRegister = new javax.swing.JLabel();
        emailFieldAdminRegister = new javax.swing.JTextField();
        senhaLabelAdminRegister = new javax.swing.JLabel();
        senhaFieldAdminRegister = new javax.swing.JTextField();
        confirmCadastrarButtonAdmin = new javax.swing.JButton();
        tournamentPanel = new javax.swing.JPanel();
        tournamentScrollPane = new javax.swing.JScrollPane();
        tournamentTableTournaments = new customPalette.TournamentPlayerTable();
        tituloLabelTournament1 = new javax.swing.JLabel();
        showCreateTournamentPanelButton = new javax.swing.JButton();
        tournamentCreatePanel = new javax.swing.JPanel();
        tituloLabelTournament = new javax.swing.JLabel();
        nomeLabelTournament = new javax.swing.JLabel();
        nomeFieldTournament = new javax.swing.JTextField();
        listaLabelTournament = new javax.swing.JLabel();
        confirmCreateTournament = new javax.swing.JButton();
        playersScrollPaneTournament = new javax.swing.JScrollPane();
        tournamentTablePlayers = new customPalette.TournamentPlayerTable();
        observacaoLabel = new javax.swing.JLabel();
        ButtonsBottom = new javax.swing.JPanel();
        ButtonsBottomPlayer = new javax.swing.JPanel();
        editarButtonPlayer = new javax.swing.JButton();
        apagarButtonPlayer = new javax.swing.JButton();
        ButtonsBottomAdmin = new javax.swing.JPanel();
        apagarButtonAdmin = new javax.swing.JButton();
        editarButtonAdmin = new javax.swing.JButton();
        cadastrarButtonAdmin = new javax.swing.JButton();

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
        playerButton.setPreferredSize(new java.awt.Dimension(160, 25));
        playerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerButtonActionPerformed(evt);
            }
        });
        ButtonsTop.add(playerButton);

        adminButton.setText("Admin");
        adminButton.setPreferredSize(new java.awt.Dimension(160, 25));
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });
        ButtonsTop.add(adminButton);

        tournamentButton.setText("Tournament");
        tournamentButton.setMaximumSize(new java.awt.Dimension(72, 23));
        tournamentButton.setMinimumSize(new java.awt.Dimension(72, 23));
        tournamentButton.setPreferredSize(new java.awt.Dimension(160, 25));
        tournamentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tournamentButtonActionPerformed(evt);
            }
        });
        ButtonsTop.add(tournamentButton);

        config.add(ButtonsTop);

        Components.setBackground(new java.awt.Color(0, 255, 255));
        Components.setPreferredSize(new java.awt.Dimension(505, 480));
        Components.setLayout(new java.awt.CardLayout());

        adminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        adminScrollPane.setViewportView(adminTable);

        Components.add(adminScrollPane, "card2");

        playerScrollPane.setViewportView(playerTable);

        Components.add(playerScrollPane, "card3");

        nameLabelPlayer.setText("Nome:");

        emailLabelPlayer.setText("Email:");

        senhaLabelPlayer.setText("Senha:");

        MMRLabelPlayer.setText("MMR");

        confirmButtonPlayer.setText("Confirmar");
        confirmButtonPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonPlayerActionPerformed(evt);
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
                                    .addComponent(MMRLabelPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(senhaLabelPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MMRFieldPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(senhaFieldPlayer)))
                            .addGroup(playerEditPanelLayout.createSequentialGroup()
                                .addGroup(playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailLabelPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameLabelPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameFieldPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(emailFieldPlayer)))))
                    .addGroup(playerEditPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(confirmButtonPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        playerEditPanelLayout.setVerticalGroup(
            playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerEditPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabelPlayer)
                    .addComponent(nameFieldPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabelPlayer)
                    .addComponent(emailFieldPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLabelPlayer)
                    .addComponent(senhaFieldPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(playerEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MMRLabelPlayer)
                    .addComponent(MMRFieldPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmButtonPlayer)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        Components.add(playerEditPanel, "card4");

        nameLabelAdmin.setText("Nome:");

        emailLabelnameFieldAdmin.setText("Email:");

        senhaLabelAdmin.setText("Senha:");

        confirmButtonAdmin.setText("Confirmar");
        confirmButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminEditPanelLayout = new javax.swing.GroupLayout(adminEditPanel);
        adminEditPanel.setLayout(adminEditPanelLayout);
        adminEditPanelLayout.setHorizontalGroup(
            adminEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminEditPanelLayout.createSequentialGroup()
                .addGroup(adminEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminEditPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(adminEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminEditPanelLayout.createSequentialGroup()
                                .addComponent(senhaLabelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(senhaFieldAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(adminEditPanelLayout.createSequentialGroup()
                                .addGroup(adminEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailLabelnameFieldAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameLabelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(adminEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameFieldAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(emailFieldAdmin)))))
                    .addGroup(adminEditPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(confirmButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        adminEditPanelLayout.setVerticalGroup(
            adminEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminEditPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabelAdmin)
                    .addComponent(nameFieldAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(adminEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabelnameFieldAdmin)
                    .addComponent(emailFieldAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(adminEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLabelAdmin)
                    .addComponent(senhaFieldAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmButtonAdmin)
                .addContainerGap(337, Short.MAX_VALUE))
        );

        Components.add(adminEditPanel, "card5");

        nameLabelAdminRegister.setText("Nome:");

        emailLabelnameFieldAdminRegister.setText("Email:");

        senhaLabelAdminRegister.setText("Senha:");

        confirmCadastrarButtonAdmin.setText("Cadastrar");
        confirmCadastrarButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmCadastrarButtonAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminRegisterPanelLayout = new javax.swing.GroupLayout(adminRegisterPanel);
        adminRegisterPanel.setLayout(adminRegisterPanelLayout);
        adminRegisterPanelLayout.setHorizontalGroup(
            adminRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminRegisterPanelLayout.createSequentialGroup()
                .addGroup(adminRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminRegisterPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(adminRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminRegisterPanelLayout.createSequentialGroup()
                                .addComponent(senhaLabelAdminRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(senhaFieldAdminRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(adminRegisterPanelLayout.createSequentialGroup()
                                .addGroup(adminRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailLabelnameFieldAdminRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameLabelAdminRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(adminRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameFieldAdminRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(emailFieldAdminRegister)))))
                    .addGroup(adminRegisterPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(confirmCadastrarButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        adminRegisterPanelLayout.setVerticalGroup(
            adminRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminRegisterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabelAdminRegister)
                    .addComponent(nameFieldAdminRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(adminRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabelnameFieldAdminRegister)
                    .addComponent(emailFieldAdminRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(adminRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLabelAdminRegister)
                    .addComponent(senhaFieldAdminRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmCadastrarButtonAdmin)
                .addContainerGap(337, Short.MAX_VALUE))
        );

        Components.add(adminRegisterPanel, "card6");

        tournamentTableTournaments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome do Torneio", "Número de Jogadores", "Data de Criação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tournamentScrollPane.setViewportView(tournamentTableTournaments);

        tituloLabelTournament1.setText("Lista de Torneios");

        showCreateTournamentPanelButton.setText("Criar um torneio");
        showCreateTournamentPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCreateTournamentPanelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tournamentPanelLayout = new javax.swing.GroupLayout(tournamentPanel);
        tournamentPanel.setLayout(tournamentPanelLayout);
        tournamentPanelLayout.setHorizontalGroup(
            tournamentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tournamentPanelLayout.createSequentialGroup()
                .addGroup(tournamentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tournamentPanelLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(tituloLabelTournament1))
                    .addGroup(tournamentPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tournamentScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tournamentPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(showCreateTournamentPanelButton)
                .addGap(187, 187, 187))
        );
        tournamentPanelLayout.setVerticalGroup(
            tournamentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tournamentPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tituloLabelTournament1)
                .addGap(18, 18, 18)
                .addComponent(tournamentScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showCreateTournamentPanelButton)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        Components.add(tournamentPanel, "card9");

        tituloLabelTournament.setText("Criação de Torneios");

        nomeLabelTournament.setText("Nome do torneio:");

        listaLabelTournament.setText("Lista de Jogadores:");

        confirmCreateTournament.setText("Criar Torneio");
        confirmCreateTournament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmCreateTournamentActionPerformed(evt);
            }
        });

        playersScrollPaneTournament.setViewportView(tournamentTablePlayers);

        observacaoLabel.setText("OBS: Utilize o CTRL para selecionar os jogadores, ou clique e arraste.");

        javax.swing.GroupLayout tournamentCreatePanelLayout = new javax.swing.GroupLayout(tournamentCreatePanel);
        tournamentCreatePanel.setLayout(tournamentCreatePanelLayout);
        tournamentCreatePanelLayout.setHorizontalGroup(
            tournamentCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tournamentCreatePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloLabelTournament)
                .addGap(190, 190, 190))
            .addGroup(tournamentCreatePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(tournamentCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tournamentCreatePanelLayout.createSequentialGroup()
                        .addComponent(nomeLabelTournament)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeFieldTournament, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tournamentCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(confirmCreateTournament)
                        .addGroup(tournamentCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listaLabelTournament)
                            .addComponent(playersScrollPaneTournament, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(observacaoLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tournamentCreatePanelLayout.setVerticalGroup(
            tournamentCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tournamentCreatePanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloLabelTournament)
                .addGap(18, 18, 18)
                .addGroup(tournamentCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabelTournament)
                    .addComponent(nomeFieldTournament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(listaLabelTournament)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(playersScrollPaneTournament, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(observacaoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmCreateTournament)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        Components.add(tournamentCreatePanel, "card8");

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

        apagarButtonAdmin.setText("Apagar");
        apagarButtonAdmin.setPreferredSize(new java.awt.Dimension(250, 25));
        apagarButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarButtonAdminActionPerformed(evt);
            }
        });

        editarButtonAdmin.setText("Editar");
        editarButtonAdmin.setPreferredSize(new java.awt.Dimension(250, 25));
        editarButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsBottomAdminLayout = new javax.swing.GroupLayout(ButtonsBottomAdmin);
        ButtonsBottomAdmin.setLayout(ButtonsBottomAdminLayout);
        ButtonsBottomAdminLayout.setHorizontalGroup(
            ButtonsBottomAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsBottomAdminLayout.createSequentialGroup()
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
                .addContainerGap(10, Short.MAX_VALUE))
        );

        ButtonsBottom.add(ButtonsBottomAdmin, "card2");

        cadastrarButtonAdmin.setText("Cadastrar");
        cadastrarButtonAdmin.setPreferredSize(new java.awt.Dimension(80, 25));
        cadastrarButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonAdminActionPerformed(evt);
            }
        });
        ButtonsBottom.add(cadastrarButtonAdmin, "card4");

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

    public boolean saveAdmin(String name, String email, String password) {
        Admin admin = new Admin(name, email, password);
        return saveCSVAdmin(admin);
    }

    private boolean saveCSVAdmin(Admin admin) {
        String path = "";

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            path = "src\\main\\resources\\userData\\adminData.csv";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            path = "src/main/resources/userData/adminData.csv";
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            String line = admin.getNome() + "," + admin.getEmail() + "," + admin.getSenha();
            bw.write(line);
            bw.newLine();
            return true;
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public void editButtom(javax.swing.JPanel editPanel) {
        ButtonsBottom.removeAll();
        ButtonsBottom.repaint();
        ButtonsBottom.revalidate();
        Components.removeAll();
        Components.add(editPanel);
        Components.repaint();
        Components.revalidate();
    }
    
     public void createTournamentButton(javax.swing.JPanel editPanel) {
        ButtonsBottom.removeAll();
        ButtonsBottom.repaint();
        ButtonsBottom.revalidate();
        Components.removeAll();
        Components.add(tournamentCreatePanel);
        Components.repaint();
        Components.revalidate();
    }


    public void editCSVPlayer(String emailToEdit, String[] newData) {
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

    public void editCSVAdmin(String emailToEdit, String[] newData) {
        String path = "";
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            path = "src\\main\\resources\\userData\\adminData.csv";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            path = "src/main/resources/userData/adminData.csv";
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

    public void updateCadastroButton(String txt, JButton botao) {
        botao.setText(txt);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botao.setText("Cadastrar");
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    public boolean editTableComponentsPlayer() {

        RegisterField validacao = new RegisterField();

        String nome = nameFieldPlayer.getText();
        String email = emailFieldPlayer.getText();
        String senha = senhaFieldPlayer.getText();
        String mmr = MMRFieldPlayer.getText();

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

            String oldEmail = playerTable.getValueAt(playerTable.getSelectedRow(), 1).toString();

            if (isNameOrEmailTakenPlayer(nome, email, oldEmail)) {
                throw new camposInvalidosException("Nome ou email já estão em uso !");
            }

            String[] newData = {nome, email, senha, mmr};

            editCSVPlayer(oldEmail, newData);
        } catch (camposInvalidosException ex) {
            updateConfirmButton(ex.getMessage(), confirmButtonPlayer);
            return false;
        }
        return true;
    }

    public boolean editTableComponentsAdmin() {

        RegisterField validacao = new RegisterField();

        String nome = nameFieldAdmin.getText();
        String email = emailFieldAdmin.getText();
        String senha = senhaFieldAdmin.getText();

        try {
            if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
                throw new camposInvalidosException("Preencha todos os campos !");
            }

            if (!validacao.validarEmail(email)) {
                throw new camposInvalidosException("Email inválido !");
            }

            if (!validacao.validarSenha(senha)) {
                throw new camposInvalidosException("Senha não atende aos critérios !");
            }

            String oldEmail = adminTable.getValueAt(adminTable.getSelectedRow(), 1).toString();

            if (isNameOrEmailTakenAdmin(nome, email, oldEmail)) {
                throw new camposInvalidosException("Nome ou email já estão em uso !");
            }

            String[] newData = {nome, email, senha};

            editCSVAdmin(oldEmail, newData);
        } catch (camposInvalidosException ex) {
            updateConfirmButton(ex.getMessage(), confirmButtonAdmin);
            return false;
        }
        return true;
    }

    public boolean isNameOrEmailTakenPlayer(String name, String email, String currentEmail) {
        String path = "";
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            path = "src\\main\\resources\\userData\\playerData.csv";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            path = "src/main/resources/userData/playerData.csv";
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] rowData = line.split(",");
                if (!rowData[1].equals(currentEmail)) {
                    if (rowData[0].equals(name) || rowData[1].equals(email)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean isNameOrEmailTakenAdmin(String name, String email, String currentEmail) {
        String path = "";
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            path = "src\\main\\resources\\userData\\adminData.csv";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            path = "src/main/resources/userData/adminData.csv";
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] rowData = line.split(",");
                if (!rowData[1].equals(currentEmail)) {
                    if (rowData[0].equals(name) || rowData[1].equals(email)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean isNameOrEmailTakenAdminRegister(String name, String email) {
        String path = "";
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            path = "src\\main\\resources\\userData\\adminData.csv";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            path = "src/main/resources/userData/adminData.csv";
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] rowData = line.split(",");
                if (rowData[0].equals(name) || rowData[1].equals(email)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
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
                    nameFieldPlayer.setText(playerTable.getValueAt(selectedRow, 0).toString());
                    emailFieldPlayer.setText(playerTable.getValueAt(selectedRow, 1).toString());
                    senhaFieldPlayer.setText(playerTable.getValueAt(selectedRow, 2).toString());
                    MMRFieldPlayer.setText(playerTable.getValueAt(selectedRow, 3).toString());
                }
            }
        });
    }

    private void initTableListenersAdmins() {
        adminTable.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            if (!event.getValueIsAdjusting()) {
                int selectedRow = adminTable.getSelectedRow();
                if (selectedRow >= 0) {
                    ButtonsBottom.removeAll();
                    ButtonsBottom.add(ButtonsBottomAdmin);
                    ButtonsBottom.repaint();
                    ButtonsBottom.revalidate();
                    nameFieldAdmin.setText(adminTable.getValueAt(selectedRow, 0).toString());
                    emailFieldAdmin.setText(adminTable.getValueAt(selectedRow, 1).toString());
                    senhaFieldAdmin.setText(adminTable.getValueAt(selectedRow, 2).toString());
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
                email = adminField.getAdminEmail();
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
        ButtonsBottom.add(cadastrarButtonAdmin);
        ButtonsBottom.repaint();
        ButtonsBottom.revalidate();
        Components.removeAll();
        Components.add(adminScrollPane);
        Components.repaint();
        Components.revalidate();
        controller.populateTableFromCSV(adminTable);
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

    private void confirmButtonPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonPlayerActionPerformed
        if (editTableComponentsPlayer()) {
            ButtonsBottom.removeAll();
            ButtonsBottom.repaint();
            ButtonsBottom.revalidate();
            Components.removeAll();
            Components.add(playerScrollPane);
            Components.repaint();
            Components.revalidate();
            playerTable.refreshTable();
        }
    }//GEN-LAST:event_confirmButtonPlayerActionPerformed

    private void editarButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonAdminActionPerformed
        editButtom(adminEditPanel);
    }//GEN-LAST:event_editarButtonAdminActionPerformed

    private void apagarButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarButtonAdminActionPerformed
        ButtonsBottom.removeAll();
        ButtonsBottom.add(cadastrarButtonAdmin);
        ButtonsBottom.repaint();
        ButtonsBottom.revalidate();
        adminTable.deleteSelectedRow();
        Components.removeAll();
        Components.add(adminScrollPane);
        Components.repaint();
        Components.revalidate();
        controller.populateTableFromCSV(adminTable);
    }//GEN-LAST:event_apagarButtonAdminActionPerformed

    private void confirmButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonAdminActionPerformed
        if (editTableComponentsAdmin()) {
            ButtonsBottom.removeAll();
            ButtonsBottom.repaint();
            ButtonsBottom.revalidate();
            Components.removeAll();
            Components.add(adminScrollPane);
            Components.repaint();
            Components.revalidate();
            controller.populateTableFromCSV(adminTable);
        }
    }//GEN-LAST:event_confirmButtonAdminActionPerformed

    private void confirmCadastrarButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmCadastrarButtonAdminActionPerformed
        RegisterField validacao = new RegisterField();

        String name = nameFieldAdminRegister.getText();
        String email = emailFieldAdminRegister.getText();
        String password = senhaFieldAdminRegister.getText();

        try {
            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                throw new camposInvalidosException("Preencha todos os campos !");
            }

            if (!validacao.validarEmail(email)) {
                throw new camposInvalidosException("Email inválido !");
            }

            if (!validacao.validarSenha(password)) {
                throw new camposInvalidosException("Senha não atende aos critérios !");
            }

            if (isNameOrEmailTakenAdminRegister(name, email)) {
                throw new camposInvalidosException("Nome ou email já estão em uso !");
            }

            if (saveAdmin(name, email, password)) {
                ButtonsBottom.removeAll();
                ButtonsBottom.add(cadastrarButtonAdmin);
                ButtonsBottom.repaint();
                ButtonsBottom.revalidate();
                Components.removeAll();
                Components.add(adminScrollPane);
                Components.repaint();
                Components.revalidate();
                controller.populateTableFromCSV(adminTable);
            }

        } catch (camposInvalidosException ex) {
            updateCadastroButton(ex.getMessage(), confirmCadastrarButtonAdmin);
        }
    }//GEN-LAST:event_confirmCadastrarButtonAdminActionPerformed

    private void cadastrarButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonAdminActionPerformed
        ButtonsBottom.removeAll();
        ButtonsBottom.repaint();
        ButtonsBottom.revalidate();
        Components.removeAll();
        nameFieldAdminRegister.setText("");
        emailFieldAdminRegister.setText("");
        senhaFieldAdminRegister.setText("");
        Components.add(adminRegisterPanel);
        Components.repaint();
        Components.revalidate();
    }//GEN-LAST:event_cadastrarButtonAdminActionPerformed

    private void tournamentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tournamentButtonActionPerformed
        ButtonsBottom.removeAll();
        ButtonsBottom.repaint();
        ButtonsBottom.revalidate();
        Components.removeAll();
        Components.add(tournamentPanel);
        Components.repaint();
        Components.revalidate();
    }//GEN-LAST:event_tournamentButtonActionPerformed

    private void showCreateTournamentPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCreateTournamentPanelButtonActionPerformed
        ButtonsBottom.removeAll();
        ButtonsBottom.repaint();
        ButtonsBottom.revalidate();
        Components.removeAll();
        Components.add(tournamentCreatePanel);
        Components.repaint();
        Components.revalidate();
    }//GEN-LAST:event_showCreateTournamentPanelButtonActionPerformed

    private void confirmCreateTournamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmCreateTournamentActionPerformed
        
        List<Player> selectedPlayers = new ArrayList<>();

        int[] selectedRows = tournamentTablePlayers.getSelectedRows();

        for (int rowIndex : selectedRows) {
            String playerName = tournamentTablePlayers.getValueAt(rowIndex, 0).toString();
            String playerEmail = tournamentTablePlayers.getValueAt(rowIndex, 1).toString();
            int playerMmr = Integer.parseInt(tournamentTablePlayers.getValueAt(rowIndex, 2).toString());
            
            selectedPlayers.add(new Player(playerName, playerEmail, playerMmr));
            
        }
        
        Tournament torneio = null;
                
        try{
            torneio = new Tournament(nomeFieldTournament.getText(), selectedPlayers);
        }
        catch(TournamentException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        if(torneio != null)
            torneio.adicionarTorneio();
        
        ButtonsBottom.removeAll();
        ButtonsBottom.repaint();
        ButtonsBottom.revalidate();
        Components.removeAll();
        Components.add(tournamentPanel);
        Components.repaint();
        Components.revalidate();
        
    }//GEN-LAST:event_confirmCreateTournamentActionPerformed
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsBottom;
    private javax.swing.JPanel ButtonsBottomAdmin;
    private javax.swing.JPanel ButtonsBottomPlayer;
    private javax.swing.JPanel ButtonsTop;
    private javax.swing.JPanel Components;
    private javax.swing.JTextField MMRFieldPlayer;
    private javax.swing.JLabel MMRLabelPlayer;
    private javax.swing.JPanel admin;
    private javax.swing.JButton adminButton;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton adminConfirmLoginButton;
    private javax.swing.JPanel adminEditPanel;
    private com.mycompany.chess.swingComponents.contentPanel.adminPanel.AdminField adminField;
    private javax.swing.JTextField adminNameField;
    private javax.swing.JLabel adminNameLabel;
    private javax.swing.JPasswordField adminPasswordField;
    private javax.swing.JLabel adminPasswordLabel;
    private javax.swing.JPanel adminRegisterPanel;
    private javax.swing.JScrollPane adminScrollPane;
    private customPalette.AdminTable adminTable;
    private javax.swing.JLabel adminTitle;
    private javax.swing.JButton apagarButtonAdmin;
    private javax.swing.JButton apagarButtonPlayer;
    private javax.swing.JButton cadastrarButtonAdmin;
    private com.mycompany.chess.swingComponents.contentPanel.adminPanel.AdminConfigPanel config;
    private javax.swing.JPanel configPanel;
    private javax.swing.JButton confirmButtonAdmin;
    private javax.swing.JButton confirmButtonPlayer;
    private javax.swing.JButton confirmCadastrarButtonAdmin;
    private javax.swing.JButton confirmCreateTournament;
    private javax.swing.JButton editarButtonAdmin;
    private javax.swing.JButton editarButtonPlayer;
    private javax.swing.JTextField emailFieldAdmin;
    private javax.swing.JTextField emailFieldAdminRegister;
    private javax.swing.JTextField emailFieldPlayer;
    private javax.swing.JLabel emailLabelPlayer;
    private javax.swing.JLabel emailLabelnameFieldAdmin;
    private javax.swing.JLabel emailLabelnameFieldAdminRegister;
    private javax.swing.JLabel listaLabelTournament;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JTextField nameFieldAdmin;
    private javax.swing.JTextField nameFieldAdminRegister;
    private javax.swing.JTextField nameFieldPlayer;
    private javax.swing.JLabel nameLabelAdmin;
    private javax.swing.JLabel nameLabelAdminRegister;
    private javax.swing.JLabel nameLabelPlayer;
    private javax.swing.JTextField nomeFieldTournament;
    private javax.swing.JLabel nomeLabelTournament;
    private javax.swing.JLabel observacaoLabel;
    private javax.swing.JButton playerButton;
    private javax.swing.JPanel playerEditPanel;
    private javax.swing.JScrollPane playerScrollPane;
    private customPalette.PlayerTable playerTable;
    private javax.swing.JScrollPane playersScrollPaneTournament;
    private javax.swing.JTextField senhaFieldAdmin;
    private javax.swing.JTextField senhaFieldAdminRegister;
    private javax.swing.JTextField senhaFieldPlayer;
    private javax.swing.JLabel senhaLabelAdmin;
    private javax.swing.JLabel senhaLabelAdminRegister;
    private javax.swing.JLabel senhaLabelPlayer;
    private javax.swing.JButton showCreateTournamentPanelButton;
    private javax.swing.JLabel tituloLabelTournament;
    private javax.swing.JLabel tituloLabelTournament1;
    private javax.swing.JButton tournamentButton;
    private javax.swing.JPanel tournamentCreatePanel;
    private javax.swing.JPanel tournamentPanel;
    private javax.swing.JScrollPane tournamentScrollPane;
    private customPalette.TournamentPlayerTable tournamentTablePlayers;
    private customPalette.TournamentPlayerTable tournamentTableTournaments;
    // End of variables declaration//GEN-END:variables
}

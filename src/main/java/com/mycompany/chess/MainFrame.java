package com.mycompany.chess;

import entitites.Player;
import entitites.camposInvalidosException;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.Timer;

public class MainFrame extends javax.swing.JFrame {

    private javax.swing.JButton currentClickedSidebarButton = null;

    public MainFrame() {
        initComponents();
        this.setVisible(true);
        currentClickedSidebarButton = playButton;
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        adminLogin = new javax.swing.JPanel();
        adminTitle = new javax.swing.JLabel();
        adminField = new javax.swing.JPanel();
        adminNameLabel = new javax.swing.JLabel();
        adminNameField = new javax.swing.JTextField();
        adminPasswordLabel = new javax.swing.JLabel();
        adminPasswordField = new javax.swing.JTextField();
        adminConfirmLoginButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
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
        Fields = new javax.swing.JPanel();
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
        rankingPanel2 = new com.mycompany.chess.swingComponents.contentPanel.rankingPanel.RankingPanel();
        replaysPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        adminPanel = new javax.swing.JPanel();
        adminConfigPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        adminLogin.setBackground(new java.awt.Color(51, 51, 51));

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
            .addGap(0, 995, Short.MAX_VALUE)
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

        javax.swing.GroupLayout FieldsLayout = new javax.swing.GroupLayout(Fields);
        Fields.setLayout(FieldsLayout);
        FieldsLayout.setHorizontalGroup(
            FieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FieldsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirmRegisterButton, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addGroup(FieldsLayout.createSequentialGroup()
                        .addGroup(FieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(FieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(nameField)))
                    .addGroup(FieldsLayout.createSequentialGroup()
                        .addGroup(FieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(FieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(confirmPasswordField))))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        FieldsLayout.setVerticalGroup(
            FieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FieldsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailName)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(FieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(18, 18, 18)
                .addGroup(FieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPasswordLabel)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(confirmRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nameLabel.getAccessibleContext().setAccessibleName("");

        register.add(Fields);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -61;
        gridBagConstraints.ipady = 212;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(124, 184, 124, 185);
        registerPanel.add(register, gridBagConstraints);

        contentPanel.add(registerPanel, "card3");

        rankingPanel.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout rankingPanelLayout = new javax.swing.GroupLayout(rankingPanel);
        rankingPanel.setLayout(rankingPanelLayout);
        rankingPanelLayout.setHorizontalGroup(
            rankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
            .addGroup(rankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rankingPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(rankingPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        rankingPanelLayout.setVerticalGroup(
            rankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
            .addGroup(rankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rankingPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(rankingPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
                .addContainerGap(912, Short.MAX_VALUE))
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

        adminConfigPanel.setBackground(new java.awt.Color(0, 255, 255));
        adminConfigPanel.setPreferredSize(new java.awt.Dimension(640, 640));
        adminConfigPanel.setLayout(new java.awt.GridBagLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        adminConfigPanel.add(jScrollPane1, new java.awt.GridBagConstraints());

        jButton1.setText("jButton1");
        jButton1.setPreferredSize(new java.awt.Dimension(220, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 11, 0);
        adminConfigPanel.add(jButton1, gridBagConstraints);

        jButton2.setText("jButton2");
        jButton2.setPreferredSize(new java.awt.Dimension(220, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        adminConfigPanel.add(jButton2, gridBagConstraints);

        adminPanel.add(adminConfigPanel, new java.awt.GridBagConstraints());

        contentPanel.add(adminPanel, "card6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        contentPanel.add(jPanel1, "card7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savePlayer(String name, String email, String password, String confirmPassword) {
        Player player = new Player(name, email, password, confirmPassword);

        if (saveCSV(player)) {
            updateButton("Jogador adicionado !", confirmRegisterButton);
        }
    }

    private void updateButton(String txt, JButton botao) {
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

    private boolean saveCSV(Player player) {

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

    private boolean veririficaArquivo(String n, String p) throws camposInvalidosException {
        String path = "";

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            path = "src\\main\\resources\\userData\\userData.csv";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            path = "src/main/resources/userData/userData.csv";
        }

        boolean userFound = false;
        boolean isAdmin = false;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");

                String fileName = fields[0];
                String filePassword = fields[2];
                isAdmin = Boolean.parseBoolean(fields[3]);

                if (fileName.equals(n) && filePassword.equals(p)) {
                    userFound = true;
                    break;
                }
                
                line = br.readLine();
            }

            if (!userFound) {
                throw new camposInvalidosException("Nome ou senha inválidos !");
            }

            if (!isAdmin) {
                throw new camposInvalidosException("Usuário não é um administrador !");
            }

            return true;
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return false;
    }

    public boolean validarEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[a-z]{2,}$";
        return email.matches(emailRegex);
    }

    public boolean validarSenha(String senha) {
        String senhaRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,}$";
        return senha.matches(senhaRegex);
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

            if (!validarEmail(email)) {
                throw new camposInvalidosException("Email inválido!");
            }

            if (!validarSenha(password)) {
                throw new camposInvalidosException("Senha não atende aos critérios!");
            }

            savePlayer(name, email, password, confirmPassword);

        } catch (camposInvalidosException ex) {
            updateButton(ex.getMessage(), confirmRegisterButton);
        }
    }//GEN-LAST:event_confirmRegisterButtonActionPerformed

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

            if (veririficaArquivo(name, password)) {
                //throw new camposInvalidosException("Login bem-sucedido !");
                adminLogin.setVisible(false);
                adminConfigPanel.setVisible(true);
                
            }

        } catch (camposInvalidosException ex) {
            updateButton(ex.getMessage(), adminConfirmLoginButton);
        }
    }//GEN-LAST:event_adminConfirmLoginButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JPanel Fields;
    private javax.swing.JLabel Title;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton adminButton;
    private javax.swing.JPanel adminConfigPanel;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton adminConfirmLoginButton;
    private javax.swing.JPanel adminField;
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
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailName;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JPanel gameScreen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton playButton;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton rankingButton;
    private javax.swing.JPanel rankingPanel;
    private com.mycompany.chess.swingComponents.contentPanel.rankingPanel.RankingPanel rankingPanel2;
    private javax.swing.JPanel register;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton registerButton;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JLabel registerTitle;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton replaysButton;
    private javax.swing.JPanel replaysPanel;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}

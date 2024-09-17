/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.chess;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;

/**
 *
 * @author guilh
 */
public class MainFrame extends javax.swing.JFrame {
    private javax.swing.JButton currentClickedSidebarButton = null;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.setVisible(true);
        currentClickedSidebarButton = playButton;
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        sidebar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        playButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
        registerButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
        rankingButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
        replaysButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
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
        jLabel4 = new javax.swing.JLabel();
        replaysPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chess");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png")).getImage());

        sidebar.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Impact", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resizedLogo.png"))); // NOI18N
        jLabel1.setText("CHESS");

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

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rankingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(replaysButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rankingButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(replaysButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGap(0, 1009, Short.MAX_VALUE)
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

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tela de ranking");

        javax.swing.GroupLayout rankingPanelLayout = new javax.swing.GroupLayout(rankingPanel);
        rankingPanel.setLayout(rankingPanelLayout);
        rankingPanelLayout.setHorizontalGroup(
            rankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rankingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(923, Short.MAX_VALUE))
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
                .addContainerGap(926, Short.MAX_VALUE))
        );
        replaysPanelLayout.setVerticalGroup(
            replaysPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(replaysPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(666, Short.MAX_VALUE))
        );

        contentPanel.add(replaysPanel, "card5");

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

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        // TODO add your handling code here:
        updateSidebarButtonAndContentPanel(evt, gamePanel);
    }//GEN-LAST:event_playButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        updateSidebarButtonAndContentPanel(evt, registerPanel);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void rankingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingButtonActionPerformed
        // TODO add your handling code here:
        updateSidebarButtonAndContentPanel(evt, rankingPanel);
    }//GEN-LAST:event_rankingButtonActionPerformed

    private void replaysButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaysButtonActionPerformed
        // TODO add your handling code here:
        updateSidebarButtonAndContentPanel(evt, replaysPanel);
    }//GEN-LAST:event_replaysButtonActionPerformed
    private void updateSidebarButtonAndContentPanel(java.awt.event.ActionEvent evt, JPanel contentCardPanel){
        if(currentClickedSidebarButton == null) return;
        JButton clickedButton =(JButton) evt.getSource();
        currentClickedSidebarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        currentClickedSidebarButton.setBackground(new Color(60,63,65));
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
    /**
     * @param args the command line arguments
     */
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fields;
    private com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Board board1;
    private javax.swing.JTextField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLabel;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton confirmRegisterButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailName;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JPanel gameScreen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton playButton;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton rankingButton;
    private javax.swing.JPanel rankingPanel;
    private javax.swing.JPanel register;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton registerButton;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JLabel registerTitle;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton replaysButton;
    private javax.swing.JPanel replaysPanel;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}

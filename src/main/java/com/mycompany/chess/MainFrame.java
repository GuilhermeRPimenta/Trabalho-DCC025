//Victor Wingert de Almeida         - 202335036
//Guilherme Roldão dos Reis Pimenta - 202365085A
//Bruno Nascimento Rodrigues        - 202065114A
//Pablo Novaes Costa                - 202335031

package com.mycompany.chess;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MainFrame extends javax.swing.JFrame {

    private javax.swing.JButton currentClickedSidebarButton = null;
    
    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);     
        currentClickedSidebarButton = playButton;
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebar = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        playButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
        registerButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
        rankingButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
        replaysButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
        adminButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
        tournamentButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
        contentPanel = new javax.swing.JPanel();
        gamePanel = new com.mycompany.chess.swingComponents.contentPanel.gamePanel.GamePanel();
        registerPanel = new com.mycompany.chess.swingComponents.contentPanel.registerPanel.RegisterPanel();
        adminPanel = new com.mycompany.chess.swingComponents.contentPanel.adminPanel.AdminPanel();
        rankingPanel = new javax.swing.JPanel();
        rankingPanel2 = new com.mycompany.chess.swingComponents.contentPanel.rankingPanel.RankingPanel();
        replaysPanel = new com.mycompany.chess.swingComponents.contentPanel.replaysPanel.ReplaysPanel();
        tournamentPanel = new com.mycompany.chess.swingComponents.contentPanel.TournamentPanel.TournamentPanel();

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

        tournamentButton.setText("TORNEIO");
        tournamentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tournamentButtonActionPerformed(evt);
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
                            .addComponent(adminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tournamentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(18, 18, 18)
                .addComponent(tournamentButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contentPanel.setBackground(new java.awt.Color(204, 255, 255));
        contentPanel.setLayout(new java.awt.CardLayout());
        contentPanel.add(gamePanel, "card6");
        contentPanel.add(registerPanel, "card6");
        contentPanel.add(adminPanel, "card6");

        rankingPanel.setBackground(new java.awt.Color(51, 51, 51));
        rankingPanel.setLayout(new java.awt.GridBagLayout());
        rankingPanel.add(rankingPanel2, new java.awt.GridBagConstraints());

        contentPanel.add(rankingPanel, "card4");
        contentPanel.add(replaysPanel, "card6");
        contentPanel.add(tournamentPanel, "card7");

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
        adminPanel.deslogar();
    }//GEN-LAST:event_playButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        updateSidebarButtonAndContentPanel(evt, registerPanel);
        adminPanel.deslogar();
    }//GEN-LAST:event_registerButtonActionPerformed

    private void rankingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingButtonActionPerformed
        updateSidebarButtonAndContentPanel(evt, rankingPanel);
        rankingPanel2.updateTable();
        adminPanel.deslogar();
    }//GEN-LAST:event_rankingButtonActionPerformed

    private void replaysButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaysButtonActionPerformed
        updateSidebarButtonAndContentPanel(evt, replaysPanel);
        adminPanel.deslogar();
        replaysPanel.refreshReplaysTable();
    }//GEN-LAST:event_replaysButtonActionPerformed

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        updateSidebarButtonAndContentPanel(evt, adminPanel);
        adminPanel.deslogar();
    }//GEN-LAST:event_adminButtonActionPerformed

    private void tournamentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tournamentButtonActionPerformed
        // TODO add your handling code here:
        updateSidebarButtonAndContentPanel(evt, tournamentPanel);
        tournamentPanel.resetPanel();
        tournamentPanel.updateTournamentTable();
        adminPanel.deslogar();
    }//GEN-LAST:event_tournamentButtonActionPerformed

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
    private com.mycompany.chess.swingComponents.contentPanel.adminPanel.AdminPanel adminPanel;
    private javax.swing.JPanel contentPanel;
    private com.mycompany.chess.swingComponents.contentPanel.gamePanel.GamePanel gamePanel;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton playButton;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton rankingButton;
    private javax.swing.JPanel rankingPanel;
    private com.mycompany.chess.swingComponents.contentPanel.rankingPanel.RankingPanel rankingPanel2;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton registerButton;
    private com.mycompany.chess.swingComponents.contentPanel.registerPanel.RegisterPanel registerPanel;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton replaysButton;
    private com.mycompany.chess.swingComponents.contentPanel.replaysPanel.ReplaysPanel replaysPanel;
    private javax.swing.JPanel sidebar;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton tournamentButton;
    private com.mycompany.chess.swingComponents.contentPanel.TournamentPanel.TournamentPanel tournamentPanel;
    // End of variables declaration//GEN-END:variables
}

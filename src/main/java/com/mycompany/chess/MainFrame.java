package com.mycompany.chess;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MainFrame extends javax.swing.JFrame {

    private javax.swing.JButton currentClickedSidebarButton = null;
//    private customPalette.customPlayerTable playerTable;
//    private customPalette.customAdminTable adminTable;
    
    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);     
        currentClickedSidebarButton = playButton;
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
//        playerTable = adminPanel.getPlayerTable();
//        adminTable = adminPanel.getAdminTable();
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
        contentPanel = new javax.swing.JPanel();
        gamePanel = new com.mycompany.chess.swingComponents.contentPanel.gamePanel.GamePanel();
        registerPanel = new com.mycompany.chess.swingComponents.contentPanel.registerPanel.RegisterPanel();
        adminPanel = new com.mycompany.chess.swingComponents.contentPanel.adminPanel.AdminPanel();
        rankingPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        replaysPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

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
        contentPanel.add(gamePanel, "card6");
        contentPanel.add(registerPanel, "card6");
        contentPanel.add(adminPanel, "card6");

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
                .addContainerGap(778, Short.MAX_VALUE))
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
                .addContainerGap(778, Short.MAX_VALUE))
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
        adminPanel.deslogar();
    }//GEN-LAST:event_rankingButtonActionPerformed

    private void replaysButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaysButtonActionPerformed
        updateSidebarButtonAndContentPanel(evt, replaysPanel);
        adminPanel.deslogar();
    }//GEN-LAST:event_replaysButtonActionPerformed

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        updateSidebarButtonAndContentPanel(evt, adminPanel);
//        playerTable.refreshTable();
//        adminTable.refreshTable();
        adminPanel.deslogar();
    }//GEN-LAST:event_adminButtonActionPerformed

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton playButton;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton rankingButton;
    private javax.swing.JPanel rankingPanel;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton registerButton;
    private com.mycompany.chess.swingComponents.contentPanel.registerPanel.RegisterPanel registerPanel;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton replaysButton;
    private javax.swing.JPanel replaysPanel;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}

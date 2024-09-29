/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.TournamentPanel;

import com.mycompany.chess.swingComponents.contentPanel.gamePanel.gameScreen.GameScreen;
import entitites.NullPlayerException;
import entitites.Player;
import entitites.Tournament;
import entitites.TournamentMatch;
import java.awt.CardLayout;

/**
 *
 * @author guilh
 */
public class TournamentGamePanel extends javax.swing.JPanel {
    
    private Player player1;
    private Player player2;
    private Player player1ToCheck;
    private Player player2ToCheck;
    private Tournament tournament;
    private TournamentMatch match;
    /**
     * Creates new form TournamentGamePanel
     */
    public TournamentGamePanel(Player player1ToCheck, Player player2ToCheck, Tournament tournament, TournamentMatch match) {
        this.player1ToCheck = player1ToCheck;
        this.player2ToCheck = player2ToCheck;
        initComponents();
    }
    
    public void startGame(){
        //player1 = loginScreen1.getPlayer();
        //player2 = loginScreen2.getPlayer();   
        
        try{
            GameScreen gameScreen = new GameScreen(player1, player2, tournament, match);
            add(gameScreen, "card3");
            CardLayout cardLayout = (CardLayout) this.getLayout();
            cardLayout.show(this, "card3");
        }catch(NullPlayerException e){
            //loginScreen1.showError(e);
        }
    }
    
    public void resetPanel(){
        removeAll();
        //loginScreen1 = new com.mycompany.chess.swingComponents.contentPanel.gamePanel.loginScreen.LoginScreen1();
        //add(loginScreen1, "card2");
        revalidate();
        repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

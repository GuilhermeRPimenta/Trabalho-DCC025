/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.gamePanel.gameScreen;

import com.mycompany.chess.swingComponents.contentPanel.TournamentPanel.TournamentGamePanel;
import com.mycompany.chess.swingComponents.contentPanel.TournamentPanel.TournamentPanel;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.GamePanel;
import entitites.NullPlayerException;
import entitites.Player;
import entitites.Tournament;
import entitites.TournamentMatch;
import java.awt.Color;
import javax.swing.JOptionPane;


/**
 *
 * @author guilh
 */
public class GameScreen extends javax.swing.JPanel {

    private Player player1;
    private Player player2;
    private boolean player1Turn;
    private Tournament tournament;
    private TournamentMatch tournamentMatch;

    /**
     * Creates new form GameScreen
     */
    public GameScreen(Player player1, Player player2) throws NullPlayerException {
        if (player1 == null) {
            throw new NullPlayerException("Player 1 invalido!");
        }
        if (player2 == null) {
            throw new NullPlayerException("Player 2 invalido!");
        }
        this.player1 = player1;
        this.player2 = player2;
        player1Turn = true;
        initComponents();
        board1.setGameScreen(this);
        player1Info.setText(player1.getNome());
        player2Info.setText(player2.getNome());
    }
    
    public GameScreen(Player player1, Player player2, Tournament tounament, TournamentMatch tournamentMatch) throws NullPlayerException{
        if (player1 == null) {
            throw new NullPlayerException("Player 1 invalido!");
        }
        if (player2 == null) {
            throw new NullPlayerException("Player 2 invalido!");
        }
        this.player1 = player1;
        this.player2 = player2;
        player1Turn = true;
        initComponents();
        board1.setGameScreen(this);
        player1Info.setText(player1.getNome());
        player2Info.setText(player2.getNome());
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

        stalemateButton = new com.mycompany.chess.swingComponents.sidebar.SidebarButton();
        board1 = new com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Board();
        player1Info = new javax.swing.JLabel();
        player2Info = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(1009, 688));
        setPreferredSize(new java.awt.Dimension(1009, 688));
        setLayout(new java.awt.GridBagLayout());

        stalemateButton.setBackground(new java.awt.Color(255, 255, 255));
        stalemateButton.setForeground(new java.awt.Color(51, 51, 51));
        stalemateButton.setText("Declarar empate");
        stalemateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stalemateButtonActionPerformed(evt);
            }
        });
        add(stalemateButton, new java.awt.GridBagConstraints());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 18, 25, 0);
        add(board1, gridBagConstraints);

        player1Info.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        player1Info.setForeground(new java.awt.Color(255, 255, 255));
        player1Info.setText("[Nome jogador 1]");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(450, 6, 0, 0);
        add(player1Info, gridBagConstraints);

        player2Info.setBackground(new java.awt.Color(255, 255, 255));
        player2Info.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        player2Info.setForeground(new java.awt.Color(153, 153, 153));
        player2Info.setText("[Nome jogador 2]");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(91, 18, 0, 43);
        add(player2Info, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void stalemateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stalemateButtonActionPerformed
        // TODO add your handling code here:
        stalemate();
        player1.updateMmr(player2, 0.5);
    }//GEN-LAST:event_stalemateButtonActionPerformed
    public void nextTurn(boolean end) {
        if (end) {
            board1.getReplay().addBoardState(null, board1.getboardPiecesesMatrix());
            board1.getReplay().saveReplay(player1.getNome() + " vs. "  + player2.getNome() + "-" + System.currentTimeMillis());
            if (player1Turn) {
                
                player1.updateMmr(player2, 1.0);
                JOptionPane.showMessageDialog(this, player1.getNome() + " ganhou!\n MMRs atualizados:\n" + player1.getNome() + " - " + player1.getMmr() + "\n" + player2.getNome() + " - " + player2.getMmr());
                if(tournament != null && tournamentMatch != null){
                    tournamentMatch.setWinner(player1);
                    tournament.checkIfShouldStartNextRound();
                }
            } else {
                
                player1.updateMmr(player2, 0.0);
                JOptionPane.showMessageDialog(this, player2.getNome() + " ganhou!\n MMRs atualizados:\n" + player1.getNome() + " - " + player1.getMmr() + "\n" + player2.getNome() + " - " + player2.getMmr());
                if(tournament != null && tournamentMatch != null){
                    tournamentMatch.setWinner(player2);
                    tournament.checkIfShouldStartNextRound();
                }
            }
            if(tournament == null || tournamentMatch == null){
                GamePanel gamePanel = (GamePanel) getParent();
                gamePanel.resetPanel();
            }else{
                TournamentGamePanel tournamentGamePanel = (TournamentGamePanel) getParent();
                tournamentGamePanel.resetPanel();
                TournamentPanel tournamentPanel = (TournamentPanel) tournamentGamePanel.getParent();
                tournamentPanel.resetPanel();
            }
            
        }
        player1Turn = !player1Turn;
        if (player1Turn) {
            player1Info.setForeground(new Color(255, 255, 255));
            player2Info.setForeground(new Color(153, 153, 153));
        } else {
            player1Info.setForeground(new Color(153, 153, 153));
            player2Info.setForeground(new Color(255, 255, 255));
        }
    }
    
    private void stalemate(){
            board1.getReplay().addBoardState(null, board1.getboardPiecesesMatrix());
            board1.getReplay().saveReplay(player1.getNome() + " vs. "  + player2.getNome() + "-" + System.currentTimeMillis());
            JOptionPane.showMessageDialog(this,"Declarado empate!\n Novos MMRs:\n" + player1.getNome() + " - " + player1.getMmr() + "\n" + player2.getNome() + " - " + player2.getMmr());
            if(tournament == null || tournamentMatch == null){
                GamePanel gamePanel = (GamePanel) getParent();
                gamePanel.resetPanel();
            }else{
                TournamentGamePanel tournamentGamePanel = (TournamentGamePanel) getParent();
                tournamentGamePanel.resetPanel();
                TournamentPanel tournamentPanel = (TournamentPanel) tournamentGamePanel.getParent();
                tournamentPanel.resetPanel();
            }
    }
    
    public boolean isPlayer1Turn() {
        return player1Turn;
    }
    
    public Player getPlayer1(){
        return player1;
    }
    
    public Player getPlayer2(){
        return player2;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Board board1;
    private javax.swing.JLabel player1Info;
    private javax.swing.JLabel player2Info;
    private com.mycompany.chess.swingComponents.sidebar.SidebarButton stalemateButton;
    // End of variables declaration//GEN-END:variables
}

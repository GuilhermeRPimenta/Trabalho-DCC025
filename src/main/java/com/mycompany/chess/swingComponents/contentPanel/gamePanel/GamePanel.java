package com.mycompany.chess.swingComponents.contentPanel.gamePanel;

import com.mycompany.chess.swingComponents.contentPanel.gamePanel.gameScreen.GameScreen;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.loginScreen.LoginScreen2;
import entitites.NullPlayerException;
import entitites.Player;
import java.awt.CardLayout;

public class GamePanel extends javax.swing.JPanel {
    
    private Player player1;
    private Player player2;
    
    public GamePanel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginScreen1 = new com.mycompany.chess.swingComponents.contentPanel.gamePanel.loginScreen.LoginScreen1();
        loginScreen2 = new com.mycompany.chess.swingComponents.contentPanel.gamePanel.loginScreen.LoginScreen2();

        setMinimumSize(new java.awt.Dimension(1009, 688));
        setPreferredSize(new java.awt.Dimension(1009, 688));
        setLayout(new java.awt.CardLayout());
        add(loginScreen1, "card2");
        add(loginScreen2, "card3");
    }// </editor-fold>//GEN-END:initComponents

    public LoginScreen2 getLoginScreen2() {
        return loginScreen2;
    }
    
    public void startGame(){
        player1 = loginScreen1.getPlayer();
        player2 = loginScreen2.getPlayer();   
        
        try{
            GameScreen gameScreen = new GameScreen(player1, player2);
            add(gameScreen, "card3");
            CardLayout cardLayout = (CardLayout) this.getLayout();
            cardLayout.show(this, "card3");
        }catch(NullPlayerException e){
            loginScreen1.showError(e);
        }
    }
    
    public void resetPanel(){
        removeAll();
        loginScreen1 = new com.mycompany.chess.swingComponents.contentPanel.gamePanel.loginScreen.LoginScreen1();
        add(loginScreen1, "card2");
        revalidate();
        repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.chess.swingComponents.contentPanel.gamePanel.loginScreen.LoginScreen1 loginScreen1;
    private com.mycompany.chess.swingComponents.contentPanel.gamePanel.loginScreen.LoginScreen2 loginScreen2;
    // End of variables declaration//GEN-END:variables
}

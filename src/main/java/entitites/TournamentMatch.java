/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitites;

/**
 *
 * @author guilh
 */
public class TournamentMatch {
    private Player player1;
    private Player player2;
    private int round;
    private Player winner = null;
    
    public TournamentMatch(Player player1, Player player2, int round){
        this.player1 = player1;
        this.player2 = player2;
        this.round = round;
    }
    
    public void endMatch(Player winner, boolean stalemate){
        if(stalemate){
            return;
        }
        
        this.winner = winner;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Player getWinner() {
        return winner;
    }
    
    public void setWinner(Player winner){
        this.winner = winner;
    }
    
    public int getRound(){
        return round;
    }
    
    
}

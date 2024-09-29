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
    private Player winner;
    
    public TournamentMatch(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void endMatch(Player winner, boolean stalemate){
        if(stalemate){
            return;
        }
        
        this.winner = winner;
    }
}

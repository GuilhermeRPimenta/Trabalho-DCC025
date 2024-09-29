/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitites;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author guilh
 */
public class TournamentRound {
    private int roundNumber;
    private ArrayList<TournamentMatch> matches = new ArrayList<>();
    
    public TournamentRound(List<Player> playersList, int roundNumber){
        this.roundNumber = roundNumber;
        Collections.sort(playersList, Comparator.comparingInt(Player::getMmr));
        for(int i = 0; i < playersList.size(); i+=2){
            Player player1 = playersList.get(i);
            Player player2 = playersList.get(i+1);
            matches.add(new TournamentMatch(player1, player2, roundNumber));
        }
    }

    public ArrayList<TournamentMatch> getMatches() {
        return matches;
    }
}

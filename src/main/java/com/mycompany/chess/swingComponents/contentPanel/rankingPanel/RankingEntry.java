/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.rankingPanel;

/**
 *
 * @author pablu
 */
import java.util.List;
import java.util.*;

public class RankingEntry implements Comparable<RankingEntry> {

    private String nome;
    private String mmr;

    public RankingEntry(String x, String mmr) {
        this.mmr = mmr;
        this.nome = x;
    }

    public String getNome() {
        return nome;
    }

    public String getMmr() {
        return mmr;
    }

    @Override
    public int compareTo(RankingEntry o) {
        int aux1 = Integer.parseInt(mmr);
        int aux2 = Integer.parseInt(o.getMmr());
        return Integer.compare(aux2, aux1);
    }

    @Override
    public String toString() {
        return getNome() + " " + getMmr();
    }
}

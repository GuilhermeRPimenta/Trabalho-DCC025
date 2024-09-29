/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.TournamentPanel;

import entitites.Tournament;
import entitites.TournamentMatch;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author guilh
 */
public class MatchesListPanel extends JPanel {

    private Tournament tournament;
    private List<TournamentMatch> matches;
    private JTable matchesTable;
    private DefaultTableModel tableModel;
    private TournamentPanel tournamentPanel;
    private JButton returnToTournamentsListButton;

    public MatchesListPanel(Tournament tournament) {
        this.tournament = tournament;
        this.matches = tournament.getAllMatches();
        setLayout(new BorderLayout());
        returnToTournamentsListButton = new JButton("Voltar");
        add(returnToTournamentsListButton, BorderLayout.NORTH);
        returnToTournamentsListButton.addActionListener(e -> {
            if (tournamentPanel != null) {
                tournamentPanel.goToTournamentsTable();
            }
        });
         String[] columnNames = {"Jogador 1", "Jogador 2", "Round", "Ganhador"};
        tableModel = new DefaultTableModel(columnNames, 0);
        matchesTable = new JTable(tableModel);
        
        // Configurações de estilo
        matchesTable.setBackground(new Color(51, 51, 51));
        matchesTable.setForeground(Color.white);
        JTableHeader tableHeader = matchesTable.getTableHeader();
        tableHeader.setBackground(new Color(51, 51, 51));
        tableHeader.setForeground(Color.WHITE);
        
        // Adicionando a tabela a um JScrollPane
        JScrollPane scrollPane = new JScrollPane(matchesTable);
        scrollPane.getViewport().setBackground(new Color(51, 51, 51));
        scrollPane.setForeground(Color.white);
        add(scrollPane, BorderLayout.CENTER);
        
        // Preencher a tabela com os dados dos matches
        populateMatchesTable();
    }

    public void setTournamentPanel(TournamentPanel tournamentPanel) {
        this.tournamentPanel = tournamentPanel;
    }
    
    
    private void populateMatchesTable() {
        // Limpa a tabela atual
        tableModel.setRowCount(0);
        
        // Percorre todas as partidas e adiciona à tabela
        for (TournamentMatch match : matches) {
            String player1 = match.getPlayer1().getName();  // Obtenha o nome do Jogador 1
            String player2 = match.getPlayer2().getName();  // Obtenha o nome do Jogador 2
            String round = String.valueOf(match.getRound()); // Round do match
            String winner = (match.getWinner() != null) ? match.getWinner().getName() : ""; // Verifica se há ganhador
            
            // Adiciona a linha na tabela
            tableModel.addRow(new Object[]{player1, player2, round, winner});
        }
    }

}

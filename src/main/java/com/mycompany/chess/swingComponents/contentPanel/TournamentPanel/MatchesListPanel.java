//Victor Wingert de Almeida         - 202335036
//Guilherme Roldão dos Reis Pimenta - 202365085A
//Bruno Nascimento Rodrigues        - 202065114A
//Pablo Novaes Costa                - 202335031

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.TournamentPanel;

import entitites.Player;
import entitites.Tournament;
import entitites.TournamentMatch;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.MouseInputAdapter;
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
        
        matchesTable.setBackground(new Color(51, 51, 51));
        matchesTable.setForeground(Color.white);
        JTableHeader tableHeader = matchesTable.getTableHeader();
        tableHeader.setBackground(new Color(51, 51, 51));
        tableHeader.setForeground(Color.WHITE);
        
        JScrollPane scrollPane = new JScrollPane(matchesTable);
        scrollPane.getViewport().setBackground(new Color(51, 51, 51));
        scrollPane.setForeground(Color.white);
        add(scrollPane, BorderLayout.CENTER);
        
        matchesTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = matchesTable.getSelectedRow();
                if (selectedRow != -1) {
                    TournamentMatch selectedMatch = matches.get(selectedRow);

                    Player player1ToCheck = selectedMatch.getPlayer1();
                    Player player2ToCheck = selectedMatch.getPlayer2();

                    if (tournamentPanel != null) {
                        tournamentPanel.goToTournamentGamePanel(player1ToCheck, player2ToCheck, tournament, selectedMatch);
                    }
                }
            }
        });
        matchesTable.addMouseMotionListener(new MouseInputAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                Point point = e.getPoint();
                int row = matchesTable.rowAtPoint(point);
                if (row != -1) {
                    matchesTable.setCursor(Cursor.getDefaultCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                } else {
                    matchesTable.setCursor(Cursor.getDefaultCursor());
                }
            }
        });
        
        populateMatchesTable();
    }

    public void setTournamentPanel(TournamentPanel tournamentPanel) {
        this.tournamentPanel = tournamentPanel;
    }
    
    
    private void populateMatchesTable() {
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

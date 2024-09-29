/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.TournamentPanel;

import entitites.TournamentMatch;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author guilh
 */
public class MatchesListPanel extends JPanel{
    private List<TournamentMatch> matches;
    private JTable matchesTable;
    private DefaultTableModel tableModel;
    public MatchesListPanel(List<TournamentMatch> matches){
        this.matches = matches;
        setLayout(new BorderLayout());
        String[] columnNames = {"Jogadores","Round","Ganhador"};
        tableModel = new DefaultTableModel(columnNames, 0);
        matchesTable = new JTable(tableModel);
        matchesTable.setBackground(new Color(51,51,51));
        matchesTable.setForeground(Color.white);
        
        JTableHeader tableHeader = matchesTable.getTableHeader();
        tableHeader.setBackground(new Color(51, 51, 51));
        tableHeader.setForeground(Color.WHITE);
        JScrollPane scrollPane = new JScrollPane(matchesTable);
        scrollPane.getViewport().setBackground(new Color(51,51,51));
        scrollPane.setForeground(Color.white);
        add(scrollPane, BorderLayout.CENTER);
    }
}

//Victor Wingert de Almeida         - 202335036
//Guilherme Roldão dos Reis Pimenta - 202365085A
//Bruno Nascimento Rodrigues        - 202065114A
//Pablo Novaes Costa                - 202335031

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.TournamentPanel;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import entitites.Replay;
import com.mycompany.chess.swingComponents.contentPanel.replaysPanel.ReplaysPanel;
import entitites.Tournament;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
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

public class TournamentPanelTournamentsTable extends JPanel{
    private JTable tournamentTable;
    private DefaultTableModel tableModel;
    private TournamentPanel tournamentPanel;
    private Gson gson = new Gson();
    public TournamentPanelTournamentsTable(){
        setLayout(new BorderLayout());
        String[] columnNames = {"Nome","Número de jogadores","Data de criação"};
        tableModel = new DefaultTableModel(columnNames, 0);
        tournamentTable = new JTable(tableModel);
        tournamentTable.setBackground(new Color(51,51,51));
        tournamentTable.setForeground(Color.white);
        
        JTableHeader tableHeader = tournamentTable.getTableHeader();
        tableHeader.setBackground(new Color(51, 51, 51));
        tableHeader.setForeground(Color.WHITE);
        JScrollPane scrollPane = new JScrollPane(tournamentTable);
        scrollPane.getViewport().setBackground(new Color(51,51,51));
        scrollPane.setForeground(Color.white);
        add(scrollPane, BorderLayout.CENTER);
        
        tournamentTable.addMouseListener(new MouseInputAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int selectedRow = tournamentTable.getSelectedRow();
                if(selectedRow != -1){
                    String fileName = (String) tableModel.getValueAt(selectedRow ,0);
                    tournamentPanel.goToMatchesListPanel(loadTournamentFromFile(fileName));
                }
            }
            
        });
        tournamentTable.addMouseMotionListener(new MouseInputAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                Point point = e.getPoint();
                int row = tournamentTable.rowAtPoint(point);
                if (row != -1) {
                    tournamentTable.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                } else {
                    tournamentTable.setCursor(Cursor.getDefaultCursor());
                }
            }
        });
    }
    
    private Tournament loadTournamentFromFile(String fileName){
        Tournament tournament = null;
        try (FileReader reader = new FileReader("src/main/resources/tournaments/" + fileName)) {
            tournament = gson.fromJson(reader, Tournament.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tournament;
    }
    
    public void setTournamentPanel(TournamentPanel tournamentPanel){
        this.tournamentPanel = tournamentPanel;
    }
    
    private void loadTournaments() {
        tableModel.setRowCount(0);
        String directoryPath = "src/main/resources/tournaments";
        File directory = new File(directoryPath);
        Gson gson = new Gson();

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles((dir, name) -> name.endsWith(".json"));

            if (files != null) {
                for (File file : files) {
                    try(FileReader reader = new FileReader(file)){
                        String fileName = file.getName();
                        JsonObject fileContent = gson.fromJson(reader, JsonObject.class);
                        if(fileContent != null){
                            String starDateTime = fileContent.has("formattedStartDateTime") ? fileContent.get("formattedStartDateTime").getAsString() : "N/A";
                            String numberOfPlayers = fileContent.has("numberOfPlayers") ? fileContent.get("numberOfPlayers").getAsString() : "N/A";
                            tableModel.addRow(new Object[]{fileName, numberOfPlayers, starDateTime});
                        }
                        
                        
                    }catch(IOException e){
                        JOptionPane.showMessageDialog(this, "Erro ao ler um arquivo!");
                    }
                    
                }
            } else {
                JOptionPane.showMessageDialog(this,"Nenhum arquivo de replay encontrado!");
            }
        } else {
            JOptionPane.showMessageDialog(this,"Diretorio " + directoryPath + "não encontrado!");
        }
    }
    
    public void refreshTable(){
        loadTournaments();
    }
}

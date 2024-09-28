/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.replaysPanel;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
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

public class ReplaysTable extends JPanel{
    private JTable replayTable;
    private DefaultTableModel tableModel;
    private ReplaysPanel replaysPanel;
    private Gson gson = new Gson();
    public ReplaysTable(){
        setLayout(new BorderLayout());
        String[] columnNames = {"Jogadores","Início","Fim"};
        tableModel = new DefaultTableModel(columnNames, 0);
        replayTable = new JTable(tableModel);
        replayTable.setBackground(new Color(51,51,51));
        replayTable.setForeground(Color.white);
        
        JTableHeader tableHeader = replayTable.getTableHeader();
        tableHeader.setBackground(new Color(51, 51, 51));
        tableHeader.setForeground(Color.WHITE);
        JScrollPane scrollPane = new JScrollPane(replayTable);
        scrollPane.getViewport().setBackground(new Color(51,51,51));
        scrollPane.setForeground(Color.white);
        add(scrollPane, BorderLayout.CENTER);
        
        replayTable.addMouseListener(new MouseInputAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int selectedRow = replayTable.getSelectedRow();
                if(selectedRow != -1){
                    String fileName = (String) tableModel.getValueAt(selectedRow ,0);
                    System.out.println(fileName);
                    Replay replay = loadReplayFromFile(fileName);
                    if(replay != null){
                        replaysPanel.goToReplayGameScreen(replay);
                    }
                }
            }
            
        });
        replayTable.addMouseMotionListener(new MouseInputAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                Point point = e.getPoint();
                int row = replayTable.rowAtPoint(point);
                if (row != -1) {
                    replayTable.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                } else {
                    replayTable.setCursor(Cursor.getDefaultCursor());
                }
            }
        });
    }
    
    public void setReplaysPanel(ReplaysPanel replaysPanel){
        this.replaysPanel = replaysPanel;
    }
    
    private void loadReplays() {
        tableModel.setRowCount(0);
        String directoryPath = "src/main/resources/replays";
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
                            String starDateTime = fileContent.has("startDateTime") ? fileContent.get("startDateTime").getAsString() : "N/A";
                            String endDateTime = fileContent.has("endDateTime") ? fileContent.get("endDateTime").getAsString() : "N/A";
                        tableModel.addRow(new Object[]{fileName, starDateTime, endDateTime});
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
    
    private Replay loadReplayFromFile(String fileName){
        Replay replay = null;
        try (FileReader reader = new FileReader("src/main/resources/replays/" + fileName)) {
            replay = gson.fromJson(reader, Replay.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return replay;
    }
    
    public void refreshReplayTable(){
        loadReplays();
    }
}

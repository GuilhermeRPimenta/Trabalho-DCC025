/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.rankingPanel;

/**
 *
 * @author pablu
 */
import entitites.Player;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import entitites.camposInvalidosException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.TableModel;
import java.util.Collections;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableCellRenderer;

public class RankingPanel extends javax.swing.JPanel {

    /**
     * Creates new form RankingPanel
     */
    private List<RankingEntry> jogadores;

    public RankingPanel() {
        initComponents();
        jScrollPane2.getViewport().setBackground(new Color(51,51,51));
        jogadores = new ArrayList<RankingEntry>();
        try {
            preencheLista();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(255, 0, 0));

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setForeground(new java.awt.Color(204, 0, 0));

        jTable2.setBackground(new java.awt.Color(0, 0, 0));
        jTable2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "MMR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAlignmentX(2.0F);
        jTable2.setAlignmentY(2.0F);
        jTable2.setName("Tabela De Ranking"); // NOI18N
        jTable2.setRowHeight(30);
        jTable2.setRowMargin(10);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(5);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ranking");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ordenaMMR() {
        Collections.sort(jogadores);
    }

    private void preencheLista() throws camposInvalidosException {
        jogadores = new ArrayList<RankingEntry>();
        DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
        tableModel.setRowCount(0);
        String path = "";

        path = "src/main/resources/userData/playerData.csv";
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            System.out.println(line);
            while (line != null) {
                String[] fields = line.split(",");
                if (fields.length >= 4) {
                   String name = fields[0];
                    String mmr = fields[3];
                    RankingEntry aux = new RankingEntry(name, mmr);
                    System.out.println(aux);
                    jogadores.add(aux);
                }
                line = br.readLine();
            }
            preencheTabela();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao carregar o arquivo: " + e.getMessage());
        }
    }

    private void preencheTabela() {
        DefaultTableModel tabela = (DefaultTableModel) jTable2.getModel();
        ordenaMMR();
        for (RankingEntry aux : jogadores) {
            tabela.addRow(new Object[]{aux.getNome(), aux.getMmr()});
        }
         jTable2.setDefaultRenderer(Object.class, new CorPodio());
    }
    
    public void updateTable(){
        try {
            preencheLista();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.rankingPanel;

/**
 *
 * @author pablu
 */
import java.awt.Component;
import javax.swing.JTable;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

public class CorPodio extends DefaultTableCellRenderer {
public CorPodio(){}
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
         Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
         switch (row) {
                case 0:
                    cellComponent.setBackground(new Color(255, 215, 0)); 
                    break;
                case 1:
                    cellComponent.setBackground(new Color(192, 192, 192)); 
                    break;
                case 2:
                    cellComponent.setBackground(new Color(205, 127, 50)); 
                    break;
                default:
                    cellComponent.setBackground(Color.WHITE); 
                    break;
            }

            if (isSelected) {
                cellComponent.setBackground(Color.CYAN); 
                cellComponent.setForeground(Color.BLACK); 
            }

            return cellComponent;
        }
    }
    
    

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
                     cellComponent.setForeground(Color.BLACK);
                    break;
                case 1:
                    cellComponent.setBackground(new Color(192, 192, 192)); 
                     cellComponent.setForeground(Color.BLACK);
                    break;
                case 2:
                    cellComponent.setBackground(new Color(205, 127, 50)); 
                    cellComponent.setForeground(Color.BLACK);
                    break;
                default:
                cellComponent.setBackground(new Color(51, 51, 51)) ;
                cellComponent.setForeground(Color.white);
                    break;
            }

            if (isSelected) {
                cellComponent.setBackground(Color.cyan); 
            }

            return cellComponent;
        }
    }
    
    

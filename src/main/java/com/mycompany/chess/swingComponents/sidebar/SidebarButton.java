/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.sidebar;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

/**
 *
 * @author guilh
 */
public class SidebarButton extends JButton {

    public SidebarButton() {
        setBackground(new java.awt.Color(51, 51, 51));
        setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30));
        setForeground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFocusable(false);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setBorderPainted(false); 
    }
    
    @Override
    protected void paintComponent(Graphics graphics){
        Graphics2D graphics2D = (Graphics2D) graphics.create();
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setColor(getBackground());
        graphics2D.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paintComponent(graphics2D);
        graphics2D.dispose();
    }
        
}

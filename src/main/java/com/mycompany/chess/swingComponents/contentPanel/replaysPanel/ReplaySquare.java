/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.replaysPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author guilh
 */
public class ReplaySquare extends JPanel {
    private JLabel pieceLabel;
    public ReplaySquare(boolean brown, SquareSaveData replayPiece, int height){
        if (brown) {
            setBackground(new Color(177, 110, 65));
        } else {
            setBackground(new Color(251, 209, 151));
        }
        setPreferredSize(new Dimension(height, height));
        String pieceType = replayPiece.getType();
        boolean white = replayPiece.isWhite();
        if(pieceType == "none"){
            return;
        }
        
        switch (pieceType){
            case "bishop":
                pieceLabel = new JLabel(scaleImage(new ImageIcon(getClass().getResource(white? "/images/pieces/white-bishop.png":"/images/pieces/black-bishop.png"))));
                break;
            case "king":
                pieceLabel = new JLabel(scaleImage(new ImageIcon(getClass().getResource(white? "/images/pieces/white-king.png":"/images/pieces/black-king.png"))) );
                break;
            case "knight":
                pieceLabel = new JLabel(scaleImage(new ImageIcon(getClass().getResource(white? "/images/pieces/white-knight.png":"/images/pieces/black-knight.png"))));
                break;
            case "pawn":
                pieceLabel = new JLabel(scaleImage(new ImageIcon(getClass().getResource(white ? "/images/pieces/white-pawn.png" : "/images/pieces/black-pawn.png"))));
                break;
            case "queen":
                pieceLabel = new JLabel(scaleImage(new ImageIcon(getClass().getResource(white? "/images/pieces/white-queen.png":"/images/pieces/black-queen.png"))));
                break;
            case "rook":
                pieceLabel = new JLabel(scaleImage(new ImageIcon(getClass().getResource(white? "/images/pieces/white-rook.png":"/images/pieces/black-rook.png"))));
                break;
        }
        setLayout(new java.awt.BorderLayout());
        if(pieceLabel != null){
            add(pieceLabel);
        }
    }
    
    private ImageIcon scaleImage(ImageIcon image){
        Image scaledImage = image.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        image = new ImageIcon(scaledImage);
        return image;
    }
    
    public void highlight(){
        setBackground(new Color(100,100, 255));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.pieces;

import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Board;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Position;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Square;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author guilh
 */
public abstract class Piece{
    protected Position position;
    protected boolean white;
    protected ImageIcon image;
    protected int yMovementMultiplier;
    
    public Piece(int x, int y, boolean white){
        this.position = new Position(x, y);
        this.white = white;
        assignImage();
        if(white){
            yMovementMultiplier = -1;
        }
        else{
            yMovementMultiplier = 1;
        }
    }
    
    public Icon getIcon(){
        return image;
    }
    
    public boolean getIsWhite(){
        return white;
    }
    
    protected void scaleImage(){
        Image scaledImage = image.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        image = new ImageIcon(scaledImage);
    }
    
    protected abstract void assignImage();
    public abstract ArrayList<Square> calculateLegalMoves(Board board);
    
}

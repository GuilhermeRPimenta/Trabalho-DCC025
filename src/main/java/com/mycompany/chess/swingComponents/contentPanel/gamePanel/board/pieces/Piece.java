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
    
    public void setPosition(Position position){
        this.position = position;
    }
    
    protected abstract void assignImage();
    public abstract ArrayList<Square> calculateLegalMoves(Board board);
    protected  boolean isValidMove(Board board, int x, int y){
        if(x<0 || x >=8 || y<0 || y>=8){
            return false;
        }
        Square targetSquare = board.getSquare(x, y);
        Piece targetSquarePiece = targetSquare.getPiece();
        if(targetSquarePiece == null){
            return true;
        }
        if(targetSquarePiece.getIsWhite() != this.white){
            return true;
        }
        return false;
    }
}

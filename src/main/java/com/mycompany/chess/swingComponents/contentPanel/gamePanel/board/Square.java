/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.gamePanel.board;

import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.pieces.Piece;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Board;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author guilh
 */
public class Square extends javax.swing.JPanel {
    private Position position;
    private Piece piece;
    private Board board;
    private boolean brown;
    private boolean highlighted;
    private final Square currentSquare = this;
    /**
     * Creates new form Square
     */
    public Square(int x, int y, boolean brown, int height, Board board) {
        initComponents();
        this.board = board;
        this.position = new Position(x, y);
        this.brown = brown;
        if(brown){
            setBackground(new Color(177,110,65));
        }else{
            setBackground(new Color(251,209,151));
        }
        setPreferredSize(new Dimension(height, height));
        this.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            if(highlighted){
                setPiece(board.getSquareChosen().getPiece());
                board.nextTurn();
            }
            if (piece != null) {
                ArrayList<Square> legalMoves = piece.calculateLegalMoves(board);
                if(legalMoves != null && legalMoves.size() > 0){
                    board.highlightLegalMoves(legalMoves, currentSquare);
                }
            }
            
        }
    });
    }
    
    public void setPiece(Piece piece){
        this.piece = piece;
        removeAll();
        if(piece != null){
            JLabel pieceLabel = new JLabel(piece.getIcon());
            add(pieceLabel);
        }
        revalidate();
        repaint();
    }
    
    public Piece getPiece(){
        return piece;
    }
    
    public void highlight(){
        highlighted = true;
        if(brown){
            setBackground(new Color(118,150,86));
        }
        else{
            setBackground(new Color(208,238,180));
        }
    }
    
    public void disableHighlight(){
        highlighted = false;
        if(brown){
            setBackground(new Color(177,110,65));
        }else{
            setBackground(new Color(251,209,151));
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

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

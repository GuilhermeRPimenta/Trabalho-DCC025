/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.gamePanel.board;

import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.pieces.Piece;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Board;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.pieces.Bishop;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.pieces.Knight;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.pieces.Pawn;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.pieces.Queen;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.pieces.Rook;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
        if (brown) {
            setBackground(new Color(177, 110, 65));
        } else {
            setBackground(new Color(251, 209, 151));
        }
        setPreferredSize(new Dimension(height, height));
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (highlighted) {
                    setPiece(board.getSquareChosen().getPiece());
                    piece.setPosition(currentSquare.position);
                    if(piece instanceof Pawn){
                        ((Pawn) piece).setFirstMoveToFalse();
                        Position pawnPosition = piece.getPosition();
                        if(pawnPosition.X == 7 || pawnPosition.X == 0){
                            boolean whitePawn = board.getIsPlayer1Turn();
                            ImageIcon bishop = new ImageIcon(getClass().getResource(whitePawn? "/images/pieces/white-bishop.png":"/images/pieces/black-bishop.png"));
                            ImageIcon knight = new ImageIcon(getClass().getResource(whitePawn? "/images/pieces/white-knight.png":"/images/pieces/black-knight.png"));
                            ImageIcon queen = new ImageIcon(getClass().getResource(whitePawn? "/images/pieces/white-queen.png":"/images/pieces/black-queen.png"));
                            ImageIcon rook = new ImageIcon(getClass().getResource(whitePawn? "/images/pieces/white-rook.png":"/images/pieces/black-rook.png"));
                            
                            Object[] options = {bishop, knight, queen, rook};
                            int selectedOption = -1;
                            while(selectedOption == -1){
                                selectedOption = JOptionPane.showOptionDialog(null, "Escolha a peça para substituir o peão", "Promoção de peão", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon(getClass().getResource(whitePawn? "/images/pieces/white-pawn.png":"/images/pieces/black-pawn.png")), options, -1);
                            switch(selectedOption){
                                case 0:
                                    setPiece(new Bishop(position.X, position.Y, whitePawn));
                                    break;
                                case 1:
                                    setPiece(new Knight(position.X, position.Y, whitePawn));
                                    break;
                                case 2:
                                    setPiece(new Queen(position.X, position.Y, whitePawn));
                                    break;
                                case 3:
                                    setPiece(new Rook(position.X, position.Y, whitePawn));
                                    break;
                            }
                            }
                            
                        }
                    }
                    setCursor(Cursor.getDefaultCursor());
                    board.nextTurn();
                } else if (piece != null) {
                    if (board.getIsPlayer1Turn() && !piece.getIsWhite()) {
                        return;
                    }
                    if (!board.getIsPlayer1Turn() && piece.getIsWhite()) {
                        return;
                    }
                    ArrayList<Square> legalMoves = piece.calculateLegalMoves(board);
                    if (legalMoves != null && legalMoves.size() > 0) {
                        board.highlightLegalMoves(legalMoves, currentSquare);
                    }
                }

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (highlighted || (piece != null && (board.getIsPlayer1Turn() && piece.getIsWhite() || !board.getIsPlayer1Turn() && !piece.getIsWhite()))) {
                    setCursor(Cursor.getDefaultCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(Cursor.getDefaultCursor());
            }
        });
    }

    public void setPiece(Piece piece) {
        removeAll();
        this.piece = piece;
        if (piece != null) {
            JLabel pieceLabel = new JLabel(piece.getIcon());
            add(pieceLabel);
        }
        revalidate();
        repaint();
    }

    public Piece getPiece() {
        return piece;
    }

    public void highlight() {
        highlighted = true;
        if (brown) {
            setBackground(new Color(118, 150, 86));
        } else {
            setBackground(new Color(208, 238, 180));
        }
    }

    public void disableHighlight() {
        highlighted = false;
        if (brown) {
            setBackground(new Color(177, 110, 65));
        } else {
            setBackground(new Color(251, 209, 151));
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

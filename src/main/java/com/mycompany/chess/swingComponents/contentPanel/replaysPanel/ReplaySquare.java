/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.replaysPanel;

import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.pieces.Piece;
import entitites.BoardSquare;
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
public class ReplaySquare extends JPanel implements BoardSquare{

    private boolean brown;

    public ReplaySquare(boolean brown, SquareSaveData squareSaveData, int height) {
        this.brown = brown;
        if (brown) {
            setBackground(new Color(177, 110, 65));
        } else {
            setBackground(new Color(251, 209, 151));
        }
        setPreferredSize(new Dimension(height, height));
        setLayout(new java.awt.BorderLayout());
        ReplayPiece initialReplayPiece = new ReplayPiece(squareSaveData.getType(), squareSaveData.isWhite());
        setPiece(initialReplayPiece);
    }

    public void highlight() {
        setBackground(new Color(100, 100, 255));
    }

    public void updateSquare(SquareSaveData squareSaveData) {
        setPiece(new ReplayPiece(squareSaveData.getType(), squareSaveData.isWhite()));
        if (brown) {
            setBackground(new Color(177, 110, 65));
        } else {
            setBackground(new Color(251, 209, 151));
        }
    }

    private void setPiece(ReplayPiece piece) {
        removeAll();
        if (piece.getIcon() != null) {
            JLabel pieceLabel = new JLabel(piece.getIcon());
            if (pieceLabel != null) {
                add(pieceLabel);
            }
        }
    }
}

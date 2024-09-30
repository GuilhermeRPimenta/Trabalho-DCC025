//Victor Wingert de Almeida         - 202335036
//Guilherme Roldão dos Reis Pimenta - 202365085A
//Bruno Nascimento Rodrigues        - 202065114A
//Pablo Novaes Costa                - 202335031

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess.swingComponents.contentPanel.gamePanel.board;

import entitites.Bishop;
import entitites.King;
import entitites.Knight;
import entitites.Pawn;
import entitites.Piece;
import entitites.Queen;
import entitites.Rook;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.gameScreen.GameScreen;
import entitites.Replay;
import entitites.SquareSaveData;
import entitites.Player;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author guilh
 */
public class Board extends JPanel {

    private final int SIZE = 8;
    private final int SQUARE_HEIGHT = 80;
    private Square[][] tiles = new Square[8][8];
    private ArrayList<Square> currentAvailableMoves;
    private Square squareChosen = null;
    private Square previousSquareChosen = null;
    private GameScreen gameScreen;
    private Replay replay;

    public Board() {

        setLayout(new GridLayout(SIZE, SIZE));
        boolean brown = true;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                Square square = new Square(i, j, brown, SQUARE_HEIGHT, this);
                tiles[i][j] = square;

                brown = !brown;
                this.add(square);
            }
            brown = !brown;
        }

        tiles[0][0].setPiece(new Rook(0, 0, false));
        tiles[0][1].setPiece(new Knight(0, 1, false));
        tiles[0][2].setPiece(new Bishop(0, 2, false));
        tiles[0][3].setPiece(new Queen(0, 3, false));
        tiles[0][4].setPiece(new King(0, 4, false));
        tiles[0][5].setPiece(new Bishop(0, 5, false));
        tiles[0][6].setPiece(new Knight(0, 6, false));
        tiles[0][7].setPiece(new Rook(0, 7, false));
        for (int i = 0; i < 8; i++) {
            tiles[1][i].setPiece(new Pawn(1, i, false));
        }

        tiles[7][0].setPiece(new Rook(7, 0, true));
        tiles[7][1].setPiece(new Knight(7, 1, true));
        tiles[7][2].setPiece(new Bishop(7, 2, true));
        tiles[7][3].setPiece(new Queen(7, 3, true));
        tiles[7][4].setPiece(new King(7, 4, true));
        tiles[7][5].setPiece(new Bishop(7, 5, true));
        tiles[7][6].setPiece(new Knight(7, 6, true));
        tiles[7][7].setPiece(new Rook(7, 7, true));
        for (int i = 0; i < 8; i++) {
            tiles[6][i].setPiece(new Pawn(6, i, true));
        }

    }

    public void setGameScreen(GameScreen gameScreen) {
        this.gameScreen = gameScreen;
        replay = new Replay(gameScreen.getPlayer1().getNome(), gameScreen.getPlayer2().getNome());
    }

    public Square getSquare(int x, int y) {
        return tiles[x][y];
    }

    public Square getSquareChosen() {
        return squareChosen;
    }

    public boolean getIsPlayer1Turn() {

        return gameScreen.isPlayer1Turn();
    }

    public void highlightLegalMoves(ArrayList<Square> legalMoves, Square squareChosen) {

        if (currentAvailableMoves != null) {
            for (Square square : currentAvailableMoves) {
                square.disableHighlight();
            }
        }
        previousSquareChosen = this.squareChosen;
        if(previousSquareChosen != null){
            previousSquareChosen.disableHighlight();
        }

        currentAvailableMoves = legalMoves;
        this.squareChosen = squareChosen;
        for (Square square : legalMoves) {
            square.highlight();
        }
    }

    public void nextTurn(boolean end) {
        squareChosen.setPiece(null);
        squareChosen.disableHighlight();
        squareChosen = null;
        previousSquareChosen = null;
        for (Square square : currentAvailableMoves) {
            square.disableHighlight();
        }

        gameScreen.nextTurn(end);
    }

    public SquareSaveData[][] getboardPiecesesMatrix() {
        SquareSaveData[][] boardPiecesesMatrix = new SquareSaveData[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Square currentSquare = tiles[i][j];
                Piece currentPiece = tiles[i][j].getPiece();
                if (currentPiece == null) {
                    boardPiecesesMatrix[i][j] = new SquareSaveData(currentSquare.getPosition(), "none", false);
                    continue;
                }
                String pieceType = "none";
                if (currentPiece instanceof Bishop) {
                    pieceType = "bishop";
                } else if (currentPiece instanceof King) {
                    pieceType = "king";
                } else if (currentPiece instanceof Knight) {
                    pieceType = "knight";
                } else if (currentPiece instanceof Pawn) {
                    pieceType = "pawn";
                } else if (currentPiece instanceof Queen) {
                    pieceType = "queen";
                } else if (currentPiece instanceof Rook) {
                    pieceType = "rook";
                }
                boardPiecesesMatrix[i][j] = new SquareSaveData(currentPiece.getPosition(), pieceType, currentPiece.getIsWhite());
            }
        }
        return boardPiecesesMatrix;
    }

    public void addStateToReplay() {
        SquareSaveData[][] boardPiecesesMatrix = getboardPiecesesMatrix();
        replay.addBoardState(squareChosen.getPosition(), boardPiecesesMatrix);
    }

    public Replay getReplay() {
        return replay;
    }

}

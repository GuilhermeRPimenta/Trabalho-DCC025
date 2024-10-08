//Victor Wingert de Almeida         - 202335036
//Guilherme Roldão dos Reis Pimenta - 202365085A
//Bruno Nascimento Rodrigues        - 202065114A
//Pablo Novaes Costa                - 202335031

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitites;

import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Board;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Position;
import com.mycompany.chess.swingComponents.contentPanel.gamePanel.board.Square;
import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public class Bishop extends Piece {
    
    public Bishop(int x, int y, boolean white){
        super(x, y, white);
    }
    
    @Override
    protected void assignImage(){
        image = new javax.swing.ImageIcon(getClass().getResource(white? "/images/pieces/white-bishop.png":"/images/pieces/black-bishop.png"));
        scaleImage();
    }
    
    @Override
    public ArrayList<Square> calculateLegalMoves(Board board){
        ArrayList<Square> legalMoves = new ArrayList<>();
        int analysedX = position.X + 1;
        int analysedY = position.Y + 1;
        
        while(analysedX < 8 && analysedY < 8){
            
            if(isValidMove(board, analysedX, analysedY)){
                legalMoves.add(board.getSquare(analysedX, analysedY));
            }
            
            if(board.getSquare(analysedX, analysedY).getPiece() != null){
                break;
            }
            
            analysedX++;
            analysedY++;
            
        }
        analysedX = position.X - 1;
        analysedY = position.Y - 1;
        while(analysedX >= 0 && analysedY >= 0){
            
            
            if(isValidMove(board, analysedX, analysedY)){
                legalMoves.add(board.getSquare(analysedX, analysedY));
            }
            
            if(board.getSquare(analysedX, analysedY).getPiece() != null){
                break;
            }
            
            analysedX--;
            analysedY--;
            
        }
        analysedX = position.X - 1; 
        analysedY = position.Y + 1;
        while(analysedX >= 0 && analysedY < 8){
            
            
            if(isValidMove(board, analysedX, analysedY)){
                legalMoves.add(board.getSquare(analysedX, analysedY));
            }
            
            if(board.getSquare(analysedX, analysedY).getPiece() != null){
                break;
            }
            
            analysedX--;
            analysedY++;
            
        }
        analysedX = position.X + 1;
        analysedY = position.Y - 1;
        while(analysedX < 8 && analysedY >= 0){
            
            
            if(isValidMove(board, analysedX, analysedY)){
                legalMoves.add(board.getSquare(analysedX, analysedY));
            }
            
            if(board.getSquare(analysedX, analysedY).getPiece() != null){
                break;
            }
            
            analysedX++;
            analysedY--;
            
        }
        return legalMoves;
    }
    
}

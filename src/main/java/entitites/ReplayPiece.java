//Victor Wingert de Almeida         - 202335036
//Guilherme Roldão dos Reis Pimenta - 202365085A
//Bruno Nascimento Rodrigues        - 202065114A
//Pablo Novaes Costa                - 202335031

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitites;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author guilh
 */
public class ReplayPiece {
    private boolean white;
    private ImageIcon image;
    
    
    public ReplayPiece(String pieceType, boolean white){
        if(pieceType == "none"){
            return;
        }
        
        switch (pieceType){
            case "bishop":
                image = scaleImage(new ImageIcon(getClass().getResource(white? "/images/pieces/white-bishop.png":"/images/pieces/black-bishop.png")));
                break;
            case "king":
                image = scaleImage(new ImageIcon(getClass().getResource(white? "/images/pieces/white-king.png":"/images/pieces/black-king.png"))) ;
                break;
            case "knight":
                image = scaleImage(new ImageIcon(getClass().getResource(white? "/images/pieces/white-knight.png":"/images/pieces/black-knight.png")));
                break;
            case "pawn":
                image = scaleImage(new ImageIcon(getClass().getResource(white ? "/images/pieces/white-pawn.png" : "/images/pieces/black-pawn.png")));
                break;
            case "queen":
                image = scaleImage(new ImageIcon(getClass().getResource(white? "/images/pieces/white-queen.png":"/images/pieces/black-queen.png")));
                break;
            case "rook":
                image =scaleImage(new ImageIcon(getClass().getResource(white? "/images/pieces/white-rook.png":"/images/pieces/black-rook.png")));
                break;
            case "null":
                image = null;
        }
    }
    
    
    private ImageIcon scaleImage(ImageIcon image){
        Image scaledImage = image.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        image = new ImageIcon(scaledImage);
        return image;
    }
    
    public ImageIcon getIcon(){
        return image;
    }
}

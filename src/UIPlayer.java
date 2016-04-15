import javax.swing.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * Created by Tomas on 4/14/16.
 */
public class UIPlayer extends JPanel {
    private ArrayList<BufferedImage> pieces;
    private ArrayList<UIPiece> uiPieces;
    private Game game;

    public UIPlayer(Game game) {
        this.game = game;
        getHand();
    }

    public void getHand(){
        ArrayList<Piece> a = game.getUser().getPieces();
        pieces = new ArrayList<>();
        uiPieces = new ArrayList<>();
        for(Piece p: a){
            pieces.add(ImageHolder.getImage(p));
            uiPieces.add(new UIPiece(p, game));
        }
    }

    public void display(){
        for(UIPiece p: uiPieces){
            this.addMouseListener(p);
        }
        setVisible(true);
    }
}

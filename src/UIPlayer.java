import javax.swing.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * Created by Tomas on 4/14/16.
 */
public class UIPlayer extends JPanel {
    private ArrayList<BufferedImage> pieces;
    private Game game;

    public UIPlayer(Game game) {
        this.game = game;
        getHand();
    }

    public void getHand(){
        ArrayList<Piece> a = game.getUser().getPieces();
        for(Piece p: a){
            pieces.add(ImageHolder.getImage(p));
        }
    }
}

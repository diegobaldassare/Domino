import javax.swing.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * Created by Tomas on 4/14/16.
 */
public class UIPlayer extends JPanel {
    private ArrayList<UIPiece> uiPieces;
    private Game game;

    public UIPlayer(Game game) {
        this.game = game;
        getHand();
    }

    public void getHand(){
        ArrayList<Piece> a = game.getUser().getPieces();
        uiPieces = new ArrayList<>();
        for(Piece p: a){
            uiPieces.add(new UIPiece(p, game));
        }
    }
}

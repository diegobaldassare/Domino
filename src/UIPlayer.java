import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by Tomas on 4/14/16.
 */
public class UIPlayer extends JPanel {
    private ArrayList<UIPiece> uiPieces;
    private Game game;

    public UIPlayer(Game game) {
        this.game = game;
        initialize();
    }

    //las UIPiece se crean solo la primera vez, cuando se reparten las piezas
    public void initialize(){
        ArrayList<Piece> a = game.getUser().getPieces();
        uiPieces = new ArrayList<>();
        for(Piece p: a){
            uiPieces.add(new UIPiece(p, game));
        }
    }

    /**
     * Muestra las piezas que le quedan al humano.
     * Se actualizan las piezas que tiene el player.
     * Se agregan las que faltan y se sacan las que ya se usaron.
     */
    public void getHand() {
        ArrayList<Piece> playerPieces = game.getUser().getPieces();
        ArrayList<UIPiece> usedPieces = new ArrayList<>();

        for (Piece p: playerPieces) {
            if (!uiPieces.contains(p))
                uiPieces.add(new UIPiece(p, game));
        }

        for (UIPiece p: uiPieces) {
            if (!playerPieces.contains(p.getPiece()))
                usedPieces.add(p);
        }
        for (UIPiece p: usedPieces) {
            uiPieces.remove(p);
        }

        //aca tendria q hacer un JComponent para mostrar todas las UIPiece de la mano en el juego
    }
}

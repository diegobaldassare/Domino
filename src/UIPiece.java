import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

/**
 * Created by Tomas on 4/14/16.
 */
public class UIPiece implements MouseListener {

    private BufferedImage pieceImage;
    private Piece piece;
    private Game game;

    public UIPiece(Piece piece, Game game){
        this.game = game;
        this.piece = piece;
        pieceImage = ImageHolder.getImage(piece);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        game.getUser().play(piece);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

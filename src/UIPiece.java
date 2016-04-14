import javax.swing.*;
import java.awt.image.BufferedImage;

/**
 * Created by Tomas on 4/14/16.
 */
public class UIPiece extends JPanel {
    private BufferedImage piece;

    public UIPiece(Piece piece){
        this.piece = ImageHolder.getImage(piece);
    }


}

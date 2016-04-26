import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Tomas on 4/14/16.
 */
public class ImageHolder {

    private static HashMap<Piece, ImageIcon> dominoPieces;
    private Game game;

    public ImageHolder(Game game) {
        this.game = game;
        init();
        dominoPieces = new HashMap<>();
    }

    //se le pasa una pieza y devuelve su imagen (para uso UI)
    public static ImageIcon getImage(Piece piece){
        return dominoPieces.get(piece);
    }

    //mete las imagenes en el mapa
    public void init(){
        for(int i = 0; i < 7; i++){
            for (int j = i; j < 7; j++) {

            }
        }
    }
}

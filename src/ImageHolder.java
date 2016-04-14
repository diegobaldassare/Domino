import java.awt.image.BufferedImage;
import java.util.HashMap;

/**
 * Created by Tomas on 4/14/16.
 */
public class ImageHolder {
    private static HashMap<Piece, BufferedImage> dominoPieces;

    public ImageHolder() {
        dominoPieces = new HashMap<>();
        for(int i = 0; i <= 28; i++){
//            Tenemos que poner una pieza y su imagen en el mapa y despues al metodo le pasas una piece y te devuelve la imagen
//            dominoPieces.put();
        }
    }

    //se le pasa una pieza y devuelve su imagen (para uso UI)
    public static BufferedImage getImage(Piece piece){
        return dominoPieces.get(piece);
    }
}

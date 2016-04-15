import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Tomas on 4/14/16.
 */
public class ImageHolder {

    private static HashMap<Piece, BufferedImage> dominoPieces;
    private Game game;

    public ImageHolder(Game game) {
        this.game = game;
        dominoPieces = new HashMap<>();
        init();
    }

    //se le pasa una pieza y devuelve su imagen (para uso UI)
    public static BufferedImage getImage(Piece piece){
        return dominoPieces.get(piece);
    }

    //mete las imagenes en el mapa
    public void init(){
        for(int i = 0; i < 7; i++){
            for (int j = i; j < 7; j++) {
                BufferedImage image;
                try{
                    image = ImageIO.read(new File("/Users/Tomas/IdeaProjects/Domino/Images/" + j + i + ".jpg"));
                    dominoPieces.put(new Piece(j, i), image);
                } catch(IOException e){
                    System.out.println(e.getMessage());
                    j--;
                }
            }
        }
    }
}

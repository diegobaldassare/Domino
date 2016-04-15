import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * Created by Tomas on 4/14/16.
 */
public class MainWindow extends JFrame {
    private Game game;
    private ArrayList<BufferedImage> images;

    public MainWindow(Game game){
        this.game = game;
        init();
    }

    public void init(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(700, 700);
        setResizable(false);
        setLocationRelativeTo(null);

        setVisible(true);
    }

    //se necesita para poner las imagenes
    public void paintComponent(Graphics g){
        for(Piece p: game.getUser().getPieces()){
            g.drawImage(ImageHolder.getImage(p), 0, 0, null); //se tiene que cambiar el 0, 0 por la posicion que tiene que ir
        }
    }


    public static void main(String[] args){ new MainWindow(new Game()); }
}

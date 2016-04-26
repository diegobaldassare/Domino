import javax.swing.*;
import java.awt.*;

/**
 * Created by Tomas on 4/15/16.
 */
public class Draw extends JPanel {

    private Game game;

    public Draw(Game game){
        this.game = game;
    }

    public void drawing(){
        repaint();
    }

    //se necesita para poner las imagenes
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        drawBoard(g);
        drawHand(g);
    }

    public void drawHand(Graphics g){
        for(Piece p: game.getUser().getPieces()){
//            g.drawImage(ImageHolder.getImage(p), 0, game.getUser().getPieces().indexOf(p), null); //se tiene que cambiar el 0, 0 por la posicion que tiene que ir
        }
    }

    public void drawBoard(Graphics g){
        g.drawLine(1,1,50,50);
    }
}

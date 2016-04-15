import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Tomas on 4/14/16.
 */
public class MainWindow extends JFrame {
    private Game game;
    private Draw all;
    private ImageHolder imgHldr;

    public MainWindow(Game game){
        this.game = game;
        all = new Draw(game);
        imgHldr = new ImageHolder(game);
        init();
    }

    public void init(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(700, 700);
        setResizable(false);
        setLocationRelativeTo(null);
        all.drawing();
        this.add(all);
        setVisible(true);
    }

    //se debe llamar cada vez para ver si alguno gano y poner los carteles en pantalla
    public void win(){
        if(game.isGameEnded()){
            final JFrame frame = new JFrame("Game Ended");
            JPanel panel = new JPanel();
            JButton button = new JButton();
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                }
            });
            if(game.win()) {
                JLabel label = new JLabel("YOU WIN!");
                frame.add(panel.add(label));
            } else {
                JLabel label = new JLabel("YOU LOSE!");
                frame.add(panel.add(label));
            }
            panel.add(button);
        }
    }


    public static void main(String[] args){ new MainWindow(new Game()); }
}

import javax.swing.*;

/**
 * Created by Tomas on 4/14/16.
 */
public class MainWindow extends JFrame {
    private Game game;
    private UIGame uiGame;

    public MainWindow(Game game){
        this.game = game;
//        uiGame = new UIGame(game,);
        init();
    }

    public void init(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(700, 700);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public JFrame getFrame(){
        return this;
    }


    public static void main(String[] args){ new MainWindow(new Game()); }
}

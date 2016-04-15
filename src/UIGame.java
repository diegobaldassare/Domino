import javax.swing.*;

/**
 * Created by Tomas on 4/14/16.
 */
public class UIGame extends JFrame{

    private Game game;
    private UIBoard uiBoard;
    private UIPlayer uiPlayer;

    public UIGame(Game game){
        this.game = game;
        uiBoard = new UIBoard(game);
        uiPlayer = new UIPlayer(game);
    }

    public UIPlayer getUiPlayer() {
        return uiPlayer;
    }

    public UIBoard getUiBoard() {
        return uiBoard;
    }
}

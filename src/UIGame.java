import javax.swing.*;

/**
 * Created by Tomas on 4/14/16.
 */
public class UIGame extends JFrame{

    private UIPlayer uiPlayer;
    private UIBoard uiBoard;
    private Game game;

    public UIGame(Game game, UIPlayer uiPlayer, UIBoard uiBoard){
        this.uiBoard = uiBoard;
        this.uiPlayer = uiPlayer;
    }

    public UIPlayer getUiPlayer() {
        return uiPlayer;
    }

    public UIBoard getUiBoard() {
        return uiBoard;
    }
}

import java.util.ArrayList;

/**
 * Created by diegobaldassare on 4/12/16.
 */
public class Game {

    private ArrayList<Piece> pieces;
    private Board board;
    private Player user = new Player(this, true);
    private Player computer = new Player(this, false);
    private UIGame uiGame;
    private boolean turn; //true: user turn
    private boolean win; //true: user won
    private boolean endGame;

    public Game() {
        uiGame = new UIGame(this);
        pieces = new ArrayList<>();
        board = new Board();
        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7; j++) {
                pieces.add(new Piece(i, j));
            }
        }
        giveOut();
        begin();
    }


    public void giveOut() {
        int random;
        while (!pieces.isEmpty()) {
            random = (int)Math.random() * pieces.size();
            user.receivePieces(pieces.get(random));
            pieces.remove(random);
            random = (int)Math.random() * pieces.size();
            computer.receivePieces(pieces.get(random));
            pieces.remove(random);
        }
    }

    //empieza el juego
    public void begin(){
        if(user.starts()){
            turn = true;
            //falta algo??
        } else {
            turn = false;
        }
    }

    //termina el juego y da un ganador
    public void endGame(boolean humanPlayer){
        if(humanPlayer){
            win = true;
        } else {
            win = false;
        }
        endGame = true;
    }

    //si el juego termino devuelve quien gano
    public boolean win(){
        if(endGame){
            return win;
        } else {
            throw new RuntimeException("Unfinished Game");
        }
    }

    //devuelve si el juego termino
    public boolean isGameEnded(){
        return endGame;
    }

    //si es true juega el humano, si es false juega la computadora
    public boolean turns(){
        boolean result = turn;
        turn = !turn;
        return result;
    }


    public Player getUser() {
        return user;
    }

    public Board getBoard() {
        return board;
    }

    public UIGame getUiGame() {
        return uiGame;
    }
}

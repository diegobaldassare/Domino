import java.util.ArrayList;

/**
 * Created by diegobaldassare on 4/12/16.
 */
public class Game {

    private ArrayList<Piece> pieces;
    private Board board;
    private Player user = new Player(this, true);
    private Player computer = new Player(this, false);

    public Game() {
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

    public ArrayList<Piece> getPieces() {
        return pieces;
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

    public void begin(){
        if(user.starts()){
            //user starts
        } else {
            //computer starts
        }
    }

    public Player getComputer() {
        return computer;
    }

    public Player getUser() {
        return user;
    }

    public Board getBoard() {
        return board;
    }
}

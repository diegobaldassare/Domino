import java.util.ArrayList;

/**
 * Created by Tomas on 4/20/16.
 */
public abstract class AbstractPlayer {

    private ArrayList<Piece> pieces = new ArrayList<>();
    private Game game;

    public AbstractPlayer(Game game){
        this.game = game;
    }

    public void receivePieces(Piece p){
        pieces.add(p);
    }

    public ArrayList<Piece> getPieces(){
        return pieces;
    }

    public Game getGame() {
        return game;
    }

    public void didIWin(){
        if(pieces.isEmpty()){
            getGame().endGame(this);
        }
    }

    public boolean starts() {
        for (Piece p : pieces) {
            if ((p.getBack() == p.getFront()) && p.getBack() == 6)
                return true;
        }
        return false;
    }

    public abstract void play(Piece piece);




}

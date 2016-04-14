import java.util.ArrayList;

/**
 * Created by diegobaldassare on 4/12/16.
 */
public class Player {

    private ArrayList<Piece> pieces = new ArrayList<>();


    public void receivePieces(Piece p) {
        pieces.add(p);
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public boolean starts(){
        for(Piece p: pieces){
            if((p.getBack() == p.getFront()) && p.getBack() == 6)
                return true;
        }
        return false;
    }
}

import java.util.ArrayList;

/**
 * Created by diegobaldassare on 4/12/16.
 */
public class Board {

    private ArrayList<Integer> extremes = new ArrayList<>();
    private ArrayList<Piece> usedPieces = new ArrayList<>();

    public boolean add(Piece p){
        if (extremes.isEmpty()) {
            extremes.add(p.getBack());
            extremes.add(p.getFront());
            usedPieces.add(p);
            return true;
        }
        if (extremes.contains(p.getBack())) {
            extremes.remove(p.getBack());
            extremes.add(p.getFront());
            usedPieces.add(p);
            return true;
        }
        if (extremes.contains(p.getFront())) {
            extremes.remove(p.getFront());
            extremes.add(p.getBack());
            usedPieces.add(p);
            return true;
        }
        return false;
    }
}

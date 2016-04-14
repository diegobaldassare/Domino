import java.util.ArrayList;

/**
 * Created by diegobaldassare on 4/12/16.
 */
public class Board {

    private ArrayList<Integer> extremes = new ArrayList<>();
    private ArrayList<Piece> usedPieces = new ArrayList<>();

    private boolean addNormally(Piece p){
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

    //vendria a ser el addSideways, para no llamar a los dos metodos siempre, primero trata el addSideways y si no puede lo mete normalmente.
    public boolean add(Piece p){
        if(p.getBack() != p.getFront()){
           return addNormally(p);
        }
        if(extremes.isEmpty()){
            usedPieces.add(p);
            extremes.add(p.getBack());
            extremes.add(p.getBack());
            extremes.add(p.getBack());
            extremes.add(p.getBack());
            return true;
        }
        if(extremes.contains(p.getBack())){
            usedPieces.add(p);
            extremes.add(p.getBack());
            extremes.add(p.getBack());
            return true;
        }
        return false;
    }
}

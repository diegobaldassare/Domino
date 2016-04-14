/**
 * Created by diegobaldassare on 4/12/16.
 */
public class Piece {

    private int front;
    private int back;

    public Piece(int front, int back) {
        this.front = front;
        this.back = back;
    }

    public int getFront() {
        return front;
    }

    public int getBack() {
        return back;
    }

    public boolean equals(Piece piece){
        return (piece.getFront() == front && piece.getBack() == back) || (piece.getFront() == back && piece.getBack() == front);
    }
}

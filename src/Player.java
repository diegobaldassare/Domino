import java.util.ArrayList;

/**
 * Created by diegobaldassare on 4/12/16.
 */
public class Player {

    private Game game;
    private boolean humanPlayer;
    private ArrayList<Piece> pieces = new ArrayList<>();

    public Player(Game game, boolean humanPlayer) {
        this.game = game;
        this.humanPlayer = humanPlayer;
    }

    public void receivePieces(Piece p) {
        pieces.add(p);
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public boolean starts() {
        for (Piece p : pieces) {
            if ((p.getBack() == p.getFront()) && p.getBack() == 6)
                return true;
        }
        return false;
    }

    /**
     * Si es humano:
     * - getHand() le muestra sus uiPieces actualizadas
     * - alguien le tiene que pasar la piece que elija
     * - la saca de su mano y la pone en el tablero.
     *
     * Si es la computadora:
     * - pone la primera piece que sea valida (no tiene estrategia!)
     *
     * @param piece recive una pieza solo cuando es el turno del humano
     */
    public void play(Piece piece) {
        if (humanPlayer) {
            game.getBoard().add(piece);
            pieces.remove(piece);
        } else {
            for (Piece p : pieces) {
                if (game.getBoard().add(p)) {
                    break;
                }
            }
        }
        if(pieces.isEmpty()){
            game.endGame(humanPlayer);
        }
    }
}

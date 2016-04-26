import java.util.ArrayList;

/**
 * Created by diegobaldassare on 4/12/16.
 */
public class HumanPlayer extends AbstractPlayer {

    public HumanPlayer(Game game) {
        super(game);
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

    @Override
    public void play(Piece piece) {
        getGame().getBoard().add(piece);
        getPieces().remove(piece);
        didIWin();
    }
}

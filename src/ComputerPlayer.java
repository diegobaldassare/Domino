/**
 * Created by Tomas on 4/26/16.
 */
public class ComputerPlayer extends AbstractPlayer {

    public ComputerPlayer(Game game){
        super(game);
    }

    @Override
    public void play(Piece piece) {
        for (Piece p : getPieces()) {
            didIWin();
            if (getGame().getBoard().add(p)) {
                break;
            }
        }
    }

}

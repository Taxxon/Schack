package Games;

/**
 * Created by emka15 on 2018-04-11.
 */
public abstract class Piece {
int x;
int y;
char symbol;
    /*
    King king;
    Queen queen;
    Knight knight;
    Rook rook;
    Bishop bishop;
    Pawn pawn;
*/
    public Piece (int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void setSymbol(char s) {
        this.symbol = s;
    }
}

package Games;

/**
 * Created by emka15 on 2018-04-11.
 */
public abstract class Piece {

    int x;
    int y;
    char symbol;

    public Piece (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setSymbol(char s) {
        this.symbol = s;
    }
}

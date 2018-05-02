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

    public String getSymbol() {
        return Character.toString(symbol);
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setSymbol(char s) {
        this.symbol = s;
    }
}

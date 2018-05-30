package Games;

/**
 * Created by Emil Käck on 2018-04-11.
 */
public abstract class Piece {

    int x;
    int y;
    char symbol;
    Class c;

    /**
     * Constructor that sets the x and y value on piece
     * @param x value of x coordinate on piece
     * @param y value of y coordinate on piece
     */
    public Piece (int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the symbol of the piece
     * @return symbol
     */
    public String getSymbol() {
        return Character.toString(symbol);
    }

    /**
     * Sets the x coordinate value
     * @param x coordinate that piece move to
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Sets the y coordinate value
     * @param y coordinate that piece move to
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Gets the y coordinate value
     * @return y coordinate
     */
    public int getY() {

        return y;
    }

    /**
     * Gets the x coordinate value
     * @return x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the symbol of the piece
     * @param s char with the symbol
     */
    public void setSymbol(char s) {
        this.symbol = s;
    }

}

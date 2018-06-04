package Games;

import java.util.ArrayList;

/**
 * Created by Emil Käck on 2018-04-11.
 */
public abstract class Piece {

    int x;
    int y;
    char symbol;
    char color;

    /**
     * Constructor that sets the x and y value on piece
     * @param x value of x coordinate on piece
     * @param y value of y coordinate on piece
     */
    public Piece (int x, int y, char color) {
        this.x = x;
        this.y = y;
        this.color = color;
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

    /**
     * Gets color on piece
     * @return char that shows color
     */
    public char getColor(){
        return color;
    }

    /**
     * Checks if there is a piece in the way of the Path
     * If there is it stops the path
     * It also checks if they are the same color
     * @param pieces
     * @param x
     * @param y
     * @param xStart
     * @param yStart
     * @return
     */
    public boolean checkPath(ArrayList<Piece> pieces, int x, int y, int xStart, int yStart){
        boolean canMove = true;
        for (int i = 0; i < pieces.size(); i++) {
            if ((pieces.get(i).getX() / 100) == x && (pieces.get(i).getY() / 100) == y) {
                canMove = false;
            }
        }
        return canMove;
    }
}

package Pieces;

import Games.Piece;

/**
 * Created by Emil Käck on 2018-04-25.
 */
public class Bishop extends Piece {

    /**
     * Sets the symbol on the Bishop depending on color
     * Also sets the x ant y coordinates
     * @param x value on x coordinate on Bishop
     * @param y value on y coordinate on Bishop
     * @param c color on Bishop
     */
    public Bishop(int x, int y, char c){
        super(x, y);
        if (c == 'b') {
            setSymbol('♝');
        }
        if (c == 'w') {
            setSymbol('♗');
        }
    }
}

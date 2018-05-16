package Pieces;

import Games.Piece;

/**
 * Created by Emil Käck on 2018-04-25.
 */
public class Knight extends Piece {

    /**
     * Sets the symbol ont the Knight depending on color
     * Also sets the x ant y coordinates
     * @param x value on x coordinate on Knight
     * @param y value on y coordinate on Knight
     * @param c color on Knight
     */
    public Knight(int x, int y, char c){
        super(x, y);
        if (c == 'b') {
            setSymbol('♞');
        }
        if (c == 'w') {
            setSymbol('♘');
        }
    }
}

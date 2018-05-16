package Pieces;

import Games.Piece;

/**
 * Created by Emil Käck on 2018-04-25.
 */
public class Rook extends Piece {

    /**
     * Sets the symbol ont the Rook depending on color
     * Also sets the x ant y coordinates
     * @param x value on x coordinate on Rook
     * @param y value on y coordinate on Rook
     * @param c color on Rook
     */
    public Rook(int x, int y, char c){
        super(x, y);
        if (c == 'b') {
            setSymbol('♜');
        }
        if (c == 'w') {
            setSymbol('♖');
        }
    }
}

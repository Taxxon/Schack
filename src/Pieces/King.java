package Pieces;

import Games.Piece;

import java.util.ArrayList;

/**
 * Created by emka15 on 2018-04-25.
 */
public class King extends Piece {

    /**
     * Sets the symbol ont the King depending on color
     * Also sets the x ant y coordinates
     * @param x value on x coordinate on King
     * @param y value on y coordinate on King
     * @param c color on King
     */
    public King(int x, int y, char c){
        super(x, y);
        if (c == 'b') {
            setSymbol('♚');
        }
        if (c == 'w') {
            setSymbol('♔');
        }
    }

    public ArrayList getMoves(int y, int x){


        return null;
    }
}

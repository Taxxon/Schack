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

    /**
     * Gets the path that the Rook can move
     * Puts in first the x value then the y value (coordinate)
     * The x value and y value have different indexes in the array
     * @param y value on y coordinate on piece that were pressed
     * @param x value on x coordinate on piece that were pressed
     * @return array with the y coordinate that the piece can move to
     */
    public int[] getMoves(int y, int x){
        int[] moves = new int[32];
        int yStart = y;
        int xStart = x;
        x = 7;
        y = 7;
        for (int i = 0; i < 16; i += 2){
            moves[i] = xStart;
            if (y > -1){
                moves[i + 1] = y;
                y -= 1;
            }
        }
        for (int i = 16; i < 32; i += 2){
            moves[i + 1] = yStart;
            if (x > -1){
                moves[i] = x;
                x -= 1;
            }
        }
        return moves;
    }
}

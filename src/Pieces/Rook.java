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

    public int[] getMoves(int y, int x){
        int[] moves = new int[32];
        for (int i = 0; i < 16; i += 2){
            moves[i] = x;
            if (y > -1) {
                moves[i + 1] = y - 1;
            } else if (y < 8){
                moves[i + 1] = y + 1;
            }
        }
        for (int i = 16; i < 32; i += 2){
            moves[i+1] = y;
            if (x > -1) {
                moves[i] = x - 1;
            } else  if (x < 8){
                moves[i] = x + 1;
            }
        }
        return null;
    }
}

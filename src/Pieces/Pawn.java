package Pieces;

import Games.Piece;

/**
 * Created by Emil Käck on 2018-04-25.
 */
public class Pawn extends Piece {

    /**
     * Sets the symbol ont the Pawn depending on color
     * Also sets the x ant y coordinates
     * @param x value on x coordinate on Pawn
     * @param y value on y coordinate on Pawn
     * @param c color on Pawn
     */
    public Pawn(int x, int y, char c) {
        super(x, y);
        if (c == 'b') {
            setSymbol('♟');
        }
        if (c == 'w') {
            setSymbol('♙');
        }
    }

    /**
     * Gets the path that the Pawn can move
     * Puts in first the x value then the y value in array(coordinate)
     * The x value and y value have different indexes in the array
     * @param y value on y coordinate on piece that were pressed
     * @param x value on x coordinate on piece that were pressed
     * @return array with the y coordinate that the piece can move to
     */
    public int[] getMoves(int y, int x){
        int[] moves = new int[4];
        moves[0] = x;
        moves[2] = x;
        if (getSymbol().equals("♟")){
            moves[1] = (y-1);
            moves[3] = (y-2);
        } else if (getSymbol().equals("♙")){
            moves[1] = (y+1);
            moves[3] = (y+2);
        } else {
            System.out.println("ERROR");
        }
        return moves;
    }
}
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
     * @param y value on y coordinate on piece you pressed
     * @return array with the y coordinate that the piece can move to
     */
    public int[] getMoves(int y){
        int[] moves = new int[2];
        if (getSymbol().equals("♟")){
            moves[0] = (y-1);
            moves[1] = (y-2);
            System.out.println(moves[0] + moves[1]);
        } else if (getSymbol().equals("♙")){
            moves[0] = (y+1);
            moves[1] = (y+2);
            System.out.println(moves[0] + moves[1]);
        } else {
            System.out.println("Not a pawn");
            System.out.println(getSymbol());
        }
        return moves;
    }
}
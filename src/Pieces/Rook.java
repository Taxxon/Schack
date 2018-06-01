package Pieces;

import Games.Piece;

import java.util.ArrayList;

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
     * Puts in first the x value then the y value (coordinates)
     * The x value and y value have different indexes in the arrayList
     * @param y value on y coordinate on piece that were pressed
     * @param x value on x coordinate on piece that were pressed
     * @return arrayList with the (x,y) coordinates that the Piece can move to
     */
    public ArrayList<Integer> getMoves(int y, int x){
        ArrayList<Integer> moves = new ArrayList<>();
        int xStart = x;
        int yStart = y;
        y = 0;
        x = 0;
        while(x < 8){
            if (x != xStart && y != yStart) {
                moves.add(x);
                moves.add(yStart);
            }
            x += 1;
        }

        while (y < 8){
            if (x != xStart && y != yStart) {
                moves.add(xStart);
                moves.add(y);
            }
            y += 1;
        }
        return moves;
    }
}

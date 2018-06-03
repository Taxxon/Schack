package Pieces;

import Games.Piece;

import java.util.ArrayList;

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

    /**
     * Gets the path that the Knight can move
     * Puts in first the x value then the y value in arrayList(coordinates)
     * The x value and y value have different indexes in the arrayList
     * @param y value on y coordinate on piece that were pressed
     * @param x value on x coordinate on piece that were pressed
     * @return arrayList with the (x,y) coordinates the piece can move to
     */
    public ArrayList<Integer> getMoves(int y, int x, ArrayList<Piece> pieces){
        ArrayList<Integer> moves = new ArrayList<>();
        if (x + 2 < 8) {
            if(y + 1 < 8) {
                if (checkPath(pieces, x + 2, y + 1) == true) {
                    moves.add(x + 2);
                    moves.add(y + 1);
                }
            }
            if(y - 1 > -1) {
                if (checkPath(pieces, x + 2, y - 1) == true) {
                    moves.add(x + 2);
                    moves.add(y - 1);
                }
            }
        }

        if (x - 2 > -1){
            if(y + 1 < 8) {
                if (checkPath(pieces, x - 2, y + 1) == true) {
                    moves.add(x - 2);
                    moves.add(y + 1);
                }
            }
            if(y - 1 > -1) {
                if (checkPath(pieces, x - 2, y - 1) == true) {
                    moves.add(x - 2);
                    moves.add(y - 1);
                }
            }
        }

        if ((y + 2) < 8){
            if(x + 1 < 8) {
                if (checkPath(pieces, x + 1, y + 2) == true) {
                    moves.add(x + 1);
                    moves.add(y + 2);
                }
            }
            if((x - 1) > -1) {
                if (checkPath(pieces, x - 1, y + 2) == true) {
                    moves.add(x - 1);
                    moves.add(y + 2);
                }
            }
        }

        if (y - 2 > -1){
            if(x + 1 < 8) {
                if (checkPath(pieces, x + 1, y - 2) == true) {
                    moves.add(x + 1);
                    moves.add(y - 2);
                }
            }
            if(x - 1 > -1) {
                if (checkPath(pieces, x - 1, y - 2) == true) {
                    moves.add(x - 1);
                    moves.add(y - 2);
                }
            }
        }

        return moves;
    }
}

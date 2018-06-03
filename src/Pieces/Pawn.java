package Pieces;

import Games.Piece;

import java.util.ArrayList;

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
        super(x, y, c);
        if (c == 'b') {
            setSymbol('♟');
        }
        if (c == 'w') {
            setSymbol('♙');
        }
    }

    /**
     * Gets the path that the Pawn can move
     * Puts in first the x value then the y value in arrayList(coordinate)
     * The x value and y value have different indexes in the arrayList
     * @param y value on y coordinate on piece that were pressed
     * @param x value on x coordinate on piece that were pressed
     * @return arrayList with the (x,y) coordinates that the Piece can move to
     */
    public ArrayList<Integer> getMoves(int y, int x, ArrayList<Piece> pieces){
        ArrayList<Integer> moves = new ArrayList<>();
        if (getSymbol().equals("♟")){
            if (checkPath(pieces, x, y - 1, x, y) == true) {
                moves.add(x);
                moves.add(y - 1);
                if (y == 6) {
                    moves.add(x);
                    moves.add(y - 2);
                }
            }
        } else if (getSymbol().equals("♙")){
            if (checkPath(pieces, x, y + 1, x, y) == true) {
                moves.add(x);
                moves.add(y + 1);
                if (y == 1) {
                    moves.add(x);
                    moves.add(y + 2);
                }
            }
        } else {
            System.out.println("ERROR");
        }
        return moves;
    }
}
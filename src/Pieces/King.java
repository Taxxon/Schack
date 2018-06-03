package Pieces;

import Games.Piece;

import java.util.ArrayList;

/**
 * Created by Emil Käck on 2018-04-25.
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
        super(x, y, c);
        if (c == 'b') {
            setSymbol('♚');
        }
        if (c == 'w') {
            setSymbol('♔');
        }
    }

    /**
     * Gets the path that the King can move
     * Puts in first the x value then the y value in arrayList(coordinates)
     * The x value and y value have different indexes in the arrayList
     * @param y value on y coordinate on piece that were pressed
     * @param x value on x coordinate on piece that were pressed
     * @return arrayList with the (x,y) coordinates that the Piece can move to
     */
    public ArrayList<Integer> getMoves(int y, int x, ArrayList<Piece> pieces){
        ArrayList<Integer> moves = new ArrayList<>();
        int yStart = y;
        int xStart = x;
        if ((x + 1) < 8 && (x + 1) > -1){
            x += 1;
            y -= 1;
            for (int i = 0; i < 3; i++) {
                if (y < 8 && y > -1) {
                    if (checkPath(pieces, x, y, xStart, yStart) == true) {
                        moves.add(x);
                        moves.add(y);
                    }
                }
                y += 1;
            }
        }
        x = xStart;
        y = yStart;
        if ((x - 1) < 8 && (x - 1) > -1){
            x -= 1;
            y -= 1;
            for (int i = 0; i < 3; i++) {
                if (y < 8 && y > -1) {
                    if (checkPath(pieces, x, y, xStart, yStart) == true) {
                        moves.add(x);
                        moves.add(y);
                    }
                }
                y += 1;
            }
        }
        if ((yStart + 1) < 8 && (yStart + 1) > -1) {
            if (checkPath(pieces, xStart, yStart + 1, xStart, yStart) == true) {
                moves.add(xStart);
                moves.add(yStart + 1);
            }
        }
        if ((yStart - 1) < 8 && (yStart - 1) > -1) {
            if (checkPath(pieces, xStart, yStart - 1, xStart, yStart) == true) {
                moves.add(xStart);
                moves.add(yStart - 1);
            }
        }
        return moves;
    }
}

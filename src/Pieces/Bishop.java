package Pieces;

import Games.Piece;

import java.util.ArrayList;

/**
 * Created by Emil Käck on 2018-04-25.
 */
public class Bishop extends Piece {

    /**
     * Sets the symbol on the Bishop depending on color
     * Also sets the x ant y coordinates
     * @param x value on x coordinate on Bishop
     * @param y value on y coordinate on Bishop
     * @param c color on Bishop
     */
    public Bishop(int x, int y, char c){
        super(x, y, c);
        if (c == 'b') {
            setSymbol('♝');
        }
        if (c == 'w') {
            setSymbol('♗');
        }
    }

    /**
     * Gets the path that the Bishop can move
     * Puts in first the x value then the y value in arrayList(coordinates)
     * The x value and y value have different indexes in the arrayList
     * @param y value on y coordinate on piece that were pressed
     * @param x value on x coordinate on piece that were pressed
     * @return arrayList with the (x,y) coordinates that the Piece can move to
     */
    public ArrayList<Integer> getMoves(int y, int x, ArrayList<Piece> pieces){
        ArrayList<Integer> moves = new ArrayList<>();
        int xStart = x;
        int yStart = y;
        outerloop:
        while ((x + 1) < 8 && (y + 1) < 8) {
            x += 1;
            y += 1;
            if (checkPath(pieces, x, y, xStart, yStart) == false){
                break outerloop;
            }
            moves.add(x);
            moves.add(y);
        }
        x = xStart;
        y = yStart;
        outerloop:
        while ((x - 1) > -1 && (y + 1) < 8){
            x -= 1;
            y += 1;
            if (checkPath(pieces, x, y, xStart, yStart) == false){
                break outerloop;
            }
            moves.add(x);
            moves.add(y);
        }
        x = xStart;
        y = yStart;
        outerloop:
        while ((x + 1) < 8 && (y - 1) > -1){
            x += 1;
            y -= 1;
            if (checkPath(pieces, x, y, xStart, yStart) == false){
                break outerloop;
            }
            moves.add(x);
            moves.add(y);
        }
        x = xStart;
        y = yStart;
        outerloop:
        while ((x - 1) > -1 && (y - 1) > -1){
            x -= 1;
            y -= 1;
            if (checkPath(pieces, x, y, xStart, yStart) == false){
                break outerloop;
            }
            moves.add(x);
            moves.add(y);
        }
        return moves;
    }
}

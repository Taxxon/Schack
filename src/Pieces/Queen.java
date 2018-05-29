package Pieces;

import Games.Piece;

import java.util.ArrayList;

/**
 * Created by Emil Käck on 2018-04-25.
 */
public class Queen extends Piece {

    /**
     * Sets the symbol ont the Queen depending on color
     * Also sets the x ant y coordinates
     * @param x value on x coordinate on Queen
     * @param y value on y coordinate on Queen
     * @param c color on Queen
     */
    public Queen(int x, int y, char c){
        super(x, y);
        if (c == 'b') {
            setSymbol('♛');
        }
        if (c == 'w') {
            setSymbol('♕');
        }
    }

    /**
     * Gets the path that the Queen can move
     * Puts in first the x value then the y value in arrayList(coordinates)
     * The x value and y value have different indexes in the arrayList
     * @param y value on y coordinate on piece that were pressed
     * @param x value on x coordinate on piece that were pressed
     * @return arrayList with the (x,y) coordinates that the Piece can move to
     */
    public ArrayList<Integer> getMoves(int y, int x){
        ArrayList<Integer> moves = new ArrayList<>();
        int xStart = x;
        int yStart = y;
        x = 0;
        y = 0;
        while (x < 8) {
            moves.add(x);
            moves.add(yStart);
            x += 1;
        }
        while (y < 8) {
            moves.add(xStart);
            moves.add(y);
            y += 1;
        }
        x = xStart;
        y = yStart;
        while ((x + 1) < 8 && (y - 1) > -1) {
            x += 1;
            y -= 1;
            moves.add(x);
            moves.add(y);
        }
        x = xStart;
        y = yStart;
        while ((x - 1) > -1 && (y - 1) > -1){
            x -= 1;
            y -= 1;
            moves.add(x);
            moves.add(y);
        }
        x = xStart;
        y = yStart;
        while ((x + 1) < 8 && (y + 1) < 8) {
            x += 1;
            y += 1;
            moves.add(x);
            moves.add(y);
        }
        x = xStart;
        y = yStart;
        while ((x - 1) > -1 && (y + 1) < 8){
            x -= 1;
            y += 1;
            moves.add(x);
            moves.add(y);
        }

        return moves;
    }
}

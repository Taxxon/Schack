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
        super(x, y, c);
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
    public ArrayList<Integer> getMoves(int y, int x, ArrayList<Piece> pieces){
        ArrayList<Integer> moves = new ArrayList<>();
        int xStart = x;
        int yStart = y;
        outerloop:
        while(x < 8){
            x += 1;
            if (checkPath(pieces, x, yStart, xStart, yStart) == false){
                break outerloop;
            }
            moves.add(x);
            moves.add(yStart);
        }
        x = xStart;
        outerloop:
        while(x > -1){
            x -= 1;
            if (checkPath(pieces, x, yStart, xStart, yStart) == false){
                break outerloop;
            }
            moves.add(x);
            moves.add(yStart);
        }
        outerloop:
        while (y < 8){
            y += 1;
            if (checkPath(pieces, xStart, y, xStart, yStart) == false){
                break outerloop;
            }
            moves.add(xStart);
            moves.add(y);
        }
        y = yStart;
        outerloop:
        while (y > -1){
            y -= 1;
            if (checkPath(pieces, xStart, y, xStart, yStart) == false){
                break outerloop;
            }
            moves.add(xStart);
            moves.add(y);
        }
        return moves;
    }
}

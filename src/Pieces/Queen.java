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

    public ArrayList<Integer> getMoves(int y, int x){
        ArrayList<Integer> moves = new ArrayList<>();
        int xStart = x;
        int yStart = y;
        x = 0;
        y = 0;
        while (x < 8){
            moves.add(x);
            moves.add(yStart);
            x += 1;
        }
        while (y < 8) {
            moves.add(xStart);
            moves.add(y);
            y += 1;
        }

        return moves;
    }
}

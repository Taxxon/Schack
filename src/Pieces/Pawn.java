package Pieces;

import Games.Piece;

/**
 * Created by Emil Käck on 2018-04-25.
 */
public class Pawn extends Piece {

    public Pawn(int x, int y, char c) {
        super(x, y);
        if (c == 'b') {
            setSymbol('♟');
        }
        if (c == 'w') {
            setSymbol('♙');
        }
    }

    public int[] showMoves(int y){
        int[] moves = new int[2];
        moves[0] = y;
        if (getSymbol() == "♟"){
            moves[0] = (y+1);
            moves[1] = (y+2);
        } else if (getSymbol() == "♙"){
            moves[0] = (y-1);
            moves[1] = (y-2);
        }
        return moves;
    }
}
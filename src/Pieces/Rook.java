package Pieces;

import Games.Piece;

/**
 * Created by emka15 on 2018-04-25.
 */
public class Rook extends Piece {

    public Rook(int x, int y, char c){
        super(x, y);
        if (c == 'b') {
            setSymbol('♜');
        }
        if (c == 'w') {
            setSymbol('♖');
        }
    }
}

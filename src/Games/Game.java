package Games;

import Pieces.*;

import java.util.ArrayList;

/**
 * Created by emka15 on 2018-04-11.
 */
public class Game {

    private ArrayList pieces;
    King king;
    Queen queen;
    Bishop bishop;
    Knight knight;
    Rook rook;
    Pawn pawn;


    Game(){
        pieces.add(king = new King(400, 80, 'w'));
        pieces.add(king = new King(400, 780, 'b'));
        pieces.add(queen = new Queen(300, 80, 'w'));
        pieces.add(queen = new Queen(300, 780, 'b'));
        for (int i = 100; i <= 600; i += 500){
           pieces.add(knight = new Knight(i, 80, 'w'));
           pieces.add(knight = new Knight(i, 780, 'w'));
        }
        for (int i = 0; i <= 700; i += 700){
            pieces.add(rook = new Rook(i, 80, 'w'));
            pieces.add(rook = new Rook(i, 780, 'b'));
        }
        for (int i = 200; i <= 500; i += 300){
            pieces.add(bishop = new Bishop(i, 80, 'w'));
            pieces.add(bishop = new Bishop(i, 780, 'b'));
        }
        for (int i = 0; i <= 800; i +=100){
            pieces.add(pawn = new Pawn(i, 180, 'w'));
            pieces.add(pawn = new Pawn(i, 680, 'b'));
        }
    }
}

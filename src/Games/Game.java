package Games;

import Pieces.*;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Emil Käck on 2018-04-11.
 */
public class Game {

    private ArrayList<Piece> pieces = new ArrayList<Piece>();

    Game() {
        pieces.add(new King(400, 80, 'w'));
        pieces.add(new King(400, 780, 'b'));
        pieces.add(new Queen(300, 80, 'w'));
        pieces.add(new Queen(300, 780, 'b'));
        for (int i = 100; i <= 600; i += 500){
           pieces.add(new Knight(i, 80, 'w'));
           pieces.add(new Knight(i, 780, 'w'));
        }
        for (int i = 0; i <= 700; i += 700){
            pieces.add(new Rook(i, 80, 'w'));
            pieces.add(new Rook(i, 780, 'b'));
        }
        for (int i = 200; i <= 500; i += 300){
            pieces.add(new Bishop(i, 80, 'w'));
            pieces.add(new Bishop(i, 780, 'b'));
        }
        for (int i = 0; i <= 800; i +=100){
            pieces.add(new Pawn(i, 180, 'w'));
            pieces.add(new Pawn(i, 680, 'b'));
        }
    }

    public void draw(Graphics g) {
        for ( int i = 0 ; i < 32 ; i++) {
            g.drawString(pieces.get(i).getSymbol(), pieces.get(i).getX(), pieces.get(i).getY());
        }
    }

    public void moves(Graphics g, int x, int y) {
        int index;
        String symbol;
        int[] moves = new int[20];
        if((x > -1 && x < 8) && (y > -1 && y < 8)) {
            for ( int i = 0 ; i < 32 ; i++) {
                if ((pieces.get(i).getX()/100) == x && (pieces.get(i).getY()/100) == y) {
                    index = i;
                    Graphics2D g2 = (Graphics2D) g;
                    symbol = pieces.get(index).getSymbol();
                    switch (symbol){
                        case "♟":
                            moves =((Pawn)pieces.get(index)).showMoves(y);

                    }
                    drawPath(g2, x, y, moves);
                }
            }
        }
    }

    public void drawPath(Graphics2D g, int x, int y, int[] moves) {
        int width = 100;
        int height = 100;
        x *= 100;
        y *= 100;
        g.setColor(Color.YELLOW);
        g.setStroke(new BasicStroke(5F));
        g.drawRect(x, y, width, height);
    }
}

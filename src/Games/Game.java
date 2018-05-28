package Games;

import Pieces.*;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Emil Käck on 2018-04-11.
 */
public class Game {

    private ArrayList<Piece> pieces = new ArrayList<Piece>();

    /**
     * Creates all pieces and sets them in a ArrayList
     */
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

    /**
     * Draws all pieces on the board
     * @param g public graphics on canvas
     */
    public void draw(Graphics g) {
        for ( int i = 0 ; i < 32 ; i++) {
            g.drawString(pieces.get(i).getSymbol(), pieces.get(i).getX(), pieces.get(i).getY());
        }
    }

    /**
     * Method that looks what piece that were pressed and looks what piece it is
     * Depending on piece it writes out different path that it can move
     * @param g Graphics that writes out the path
     * @param x value on piece that were pressed
     * @param y value on piece that were pressed
     */
    public void moves(Graphics g, int x, int y) {
        int index;
        String symbol;
        ArrayList<Integer> moves;
        if ((x > -1 && x < 8) && (y > -1 && y < 8)) {
            for (int i = 0; i < 32; i++) {
                if ((pieces.get(i).getX() / 100) == x && (pieces.get(i).getY() / 100) == y) {
                    index = i;
                    Graphics2D g2 = (Graphics2D) g;
                    symbol = pieces.get(index).getSymbol();
                    switch (symbol) {
                        case ("♟"):
                        case ("♙"):
                            moves = ((Pawn) pieces.get(index)).getMoves(y, x);
                            drawPath(g2, x, y, moves);
                            break;
                        case ("♜"):
                        case ("♖"):
                            moves = ((Rook) pieces.get(index)).getMoves(y, x);
                            drawPath(g2, x, y, moves);
                            break;
                        case ("♞"):
                        case ("♘"):
                            moves = ((Knight) pieces.get(index)).getMoves(y, x);
                            drawPath(g2, x, y, moves);
                            break;
                        case ("♚"):
                        case ("♔"):
                            moves = ((King) pieces.get(index)).getMoves(y, x);
                            drawPath(g2, x, y, moves);
                            break;
                        case ("♛"):
                        case ("♕"):
                            moves = ((Queen) pieces.get(index)).getMoves(y, x);
                            drawPath(g2, x, y, moves);
                            break;
                    }
                }
            }
        }
    }

    /**
     * Draws the path for the piece that was pressed
     * @param g public graphics on canvas
     * @param x value of x coordinate on piece
     * @param y value of y coordinate on piece
     * @param moves arraylist with the moves the piece can take
     */
    public void drawPath(Graphics2D g, int x, int y, ArrayList<Integer> moves) {
        int width = 100;
        int height = 100;
        x *= 100;
        y *= 100;
        g.setColor(Color.YELLOW);
        g.setStroke(new BasicStroke(5F));
        g.drawRect(x, y, width, height);
        System.out.println(moves.size());
        for (int i = 0; moves.size() > i; i += 2){
            moves.set(i, moves.get(i) * 100);
            moves.set((i + 1), moves.get(i+1) * 100);
            g.drawRect((moves.get(i)), (moves.get(i + 1)), width, height);
        }
    }
}

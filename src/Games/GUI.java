package Games;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Emil Käck on 2018-02-21.
 */
public class GUI extends Canvas {

    Game game;
    Image dbImage;
    Graphics dbg;
    JFrame frame;
    BufferedImage image;
    private int with = 800;
    private int height = 800;
    Dimension screenSize;
    String whKing ="♔";
    String whQueen ="♕";
    String whRook ="♖";
    String whBishop ="♗";
    String whKnight ="♘";
    String whPawn ="♙";
    String blKing ="♚";
    String blQueen ="♛";
    String blRook ="♜";
    String blBishop ="♝";
    String blKnight ="♞";
    String blPawn ="♟";

    /**
     * Method Games() that sets the values on all needed components
     */
    public GUI() {
        try {
            image = ImageIO.read(new File("board.png"));
        } catch (IOException e) {
            e.getMessage();
        }
        screenSize = new Dimension(with, height);
        frame = new JFrame();
        setPreferredSize(screenSize);
        frame.add(this);
        frame.setTitle("Chess");
        frame.setResizable(false);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addMouseListener(new ML());
        frame.setVisible(true);
    }

    /**
     * Method that makes a double buffer so the image dose'nt filmer
     * It also draws everything on the canvas (board and pieces)
     * @param g public graphics on canvas
     */
    public void paint(Graphics g){
        if (dbImage == null) {
            dbImage = createImage(with, height);
            if (dbImage == null) {
                System.out.println("dbImage is still null!");
                return;
            } else {
                dbg = dbImage.getGraphics();
            }
        }
        dbg.setColor(Color.WHITE);
        dbg.fillRect(0, 0, with, height);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
        g.drawImage(image,0,0, with, height, null);
        g.drawString(whKing, 400, 80);
        g.drawString(whQueen, 300, 80);
        g.drawString(blKing, 400, 780);
        g.drawString(blQueen, 300, 780);
        for (int i = 100; i <= 600; i += 500){
            g.drawString(whKnight, i, 80);
            g.drawString(blKnight, i, 780);
        }
        for (int i = 0; i <= 700; i += 700){
            g.drawString(whRook, i, 80);
            g.drawString(blRook, i, 780);
        }
        for (int i = 200; i <= 500; i += 300){
            g.drawString(whBishop, i, 80);
            g.drawString(blBishop, i, 780);
        }
        for (int i = 0; i <= 800; i +=100){
            g.drawString(whPawn, i, 180);
            g.drawString(blPawn, i, 680);
        }
    }

    public class ML extends MouseAdapter{

        /**
         * Method that does something when mouse is pressed.
         * @param e is mouse event
         */
        @Override
        public void mousePressed(MouseEvent e){
           int x = e.getX();
           int y = e.getY();
           x /= 100;
           y /= 100;

        }
    }

    public static void main(String[] args) {
        GUI test = new GUI();
    }

}
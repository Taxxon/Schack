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
    private int selectedPieceX = -1;
    private int selectedPieceY = -1;

    /**
     * Method Games() that sets the values on all needed components
     */
    public GUI() {
        game =  new Game();
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
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addMouseListener(new ML());
        frame.setVisible(true);
    }

    /**
     * Method that makes a double buffer so the image doesn't filmer
     * It also draws everything on the canvas (board and pieces)
     * @param g public graphics on canvas
     */
    public void paint(Graphics g) {
        if (dbImage == null) {
            dbImage = createImage(with, height);
            if (dbImage == null) {
                System.out.println("dbImage is still null!");
                return;
            } else {
                dbg = dbImage.getGraphics();
            }
        }
        dbg.setColor(Color.black);
        dbg.setFont(new Font("TimesRoman", Font.PLAIN, 100));
        dbg.drawImage(image,0,0, with, height, null);
        game.draw(dbg);
        game.moves(dbg, selectedPieceX, selectedPieceY);
        g.drawImage(dbImage, 0, 0, with, height, null);
    }

    public class ML extends MouseAdapter{
        /**
         * Method that gets the x and y coordinates to check for piece
         * @param e is mouse event
         */
        @Override
        public void mousePressed(MouseEvent e){
            int x = e.getX();
            int y = e.getY();
            x /= 100;
            y /= 100;

            selectedPieceX = x;
            selectedPieceY = y;
            repaint();
        }
    }

    public static void main(String[] args) {
        GUI test = new GUI();
    }

}
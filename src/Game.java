import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by emka15 on 2018-02-21.
 */
public class Game extends JFrame {

    Image dbgImage;
    Graphics dbg;

    int with = 1000, height = 800;
    Dimension screenSize = new Dimension(with, height);

    private int[] pieces;

    public Game() {
        this.setTitle("Chess");
        this.setSize(screenSize);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addMouseListener(new ML());
    }

    public void boardReader() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("chess_board.png"));
            this.dbgImage = img;
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void draw(Graphics g){
        boardReader();
        g.drawImage(dbgImage, with, height, this);
        repaint();
    }

    public static void main(String[] args) {
        Game test = new Game();
    }

    public class ML extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e){

        }
    }
}
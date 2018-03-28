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
public class Game extends Canvas {

    Image dbImage;
    Graphics dbg;
    JFrame frame;
    BufferedImage image;
    private int with;
    private int height;
    Dimension screenSize;

    private int[] pieces;

    public Game() {
        try {
            image = ImageIO.read(new File("board.png"));
        } catch (IOException e) {
            e.getMessage();
        }
        with = 800;
        height = 800;
        screenSize = new Dimension(with, height);
        frame = new JFrame();
        setPreferredSize(screenSize);
        frame.add(this);
        frame.setTitle("Chess");
        frame.setResizable(false);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addMouseListener(new ML());
        frame.setVisible(true);
    }

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
        g.drawImage(image,0,0, with, height, null);
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
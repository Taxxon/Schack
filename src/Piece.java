/**
 * Created by emka15 on 2018-04-11.
 */
public abstract class Piece  {

    int pos_x;
    int pos_y;

    private void setPosition(int x, int y){
        pos_x = x;
        pos_y = y;
    }

    private int getX(){
        return pos_x;
    }

    private int getY(){
        return pos_y;
    }
}

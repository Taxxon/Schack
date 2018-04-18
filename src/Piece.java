/**
 * Created by emka15 on 2018-04-11.
 */
public abstract class Piece  {

    String colour;
    int pos_x;
    int pos_y;

    private void setPosition(int x, int y){
        pos_x = x;
        pos_y = y;
    }

    private int[] getPosition(){
        int[] pos_xy  =new int[2];
        pos_xy[0] = pos_x;
        pos_xy[1] = pos_y;
        return pos_xy;
    }
}

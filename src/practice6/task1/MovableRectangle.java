package practice6.task1;

public class MovableRectangle extends Rectangle implements Movable{
    MovablePoints movablepoints = new MovablePoints (0, 0, 0, 0, 0, 0, 0, 0);
    public void move(int up_left_x, int up_left_y, int down_right_x, int down_right_y){
        movablepoints.move(up_left_x, up_left_y, down_right_x, down_right_y);
    }

    public boolean isSpeed(){
        return ( movablepoints.isSpeed() );
    }
}

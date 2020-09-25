package practice6.task1;

public class MovablePoints {
    int current_up_left_x = 0;
    int current_up_left_y = 0;
    int last_up_left_x = 0;
    int last_up_left_y = 0;
    int current_down_right_x = 0;
    int current_down_right_y = 0;
    int last_down_right_x = 0;
    int last_down_right_y = 0;

    public MovablePoints ( int _current_up_left_x,
                           int _current_up_left_y,
                           int _last_up_left_x,
                           int _last_up_left_y,
                           int _current_down_right_x,
                           int _current_down_right_y,
                           int _last_down_right_x,
                           int _last_down_right_y){
        current_up_left_x = _current_up_left_x;
        current_up_left_y = _current_up_left_y;
        last_up_left_x = _last_up_left_x;
        last_up_left_y = _last_up_left_y;
        current_down_right_x = _current_down_right_x;
        current_down_right_y = _current_down_right_y;
        last_down_right_x = _last_down_right_x;
        last_down_right_y = _last_down_right_y;

    }

    public void move(int up_left_x, int up_left_y, int down_right_x, int down_right_y){
        last_up_left_x = current_up_left_x;
        last_up_left_y = current_up_left_y;
        current_up_left_x = up_left_x;
        current_up_left_y = up_left_y;
        last_down_right_x = current_down_right_x;
        last_down_right_y = current_down_right_y;
        current_down_right_x = down_right_x;
        current_down_right_y = down_right_y;
    }

    public boolean isSpeed(){

        return ( ( ( current_up_left_x - last_up_left_x ) == ( current_down_right_x - last_down_right_x ) ) && ( ( current_up_left_y - last_up_left_y ) == ( current_down_right_y - last_down_right_y ) ) );
    }
}

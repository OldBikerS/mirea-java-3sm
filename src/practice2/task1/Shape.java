package practice2.task1;

public class Shape {

    String Form;

    int Perimeter;
    int Square;

    public Shape ( String _Form , int _Perimeter , int _Square ) {

        this.Form = _Form;

        this.Perimeter = _Perimeter;
        this.Square = _Square;

    }

    public String getForm ( ) {

        return Form;

    }

    public void setForm ( String _Form ) {

        this.Form = _Form;

    }

    public int getPerimeter ( ) {

        return Perimeter;

    }

    public void setPerimeter ( int _Perimeter ) {

        this.Square = _Perimeter;

    }

    public int getSquare ( ) {

        return Square;

    }

    public void setSquare ( int _Square ) {

        this.Square = _Square;

    }

}
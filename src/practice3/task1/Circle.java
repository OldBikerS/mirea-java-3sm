package practice3.task1;

import java.lang.Math;

public class Circle {

    double Radius;
    double Square;
    double Perimeter;

    Circle ( double _Radius ) {

        updateRadius ( _Radius );

    }

    void updateRadius ( double _Radius ) {

        this.Radius = _Radius;
        this.Square = 3.14 * _Radius * _Radius;
        this.Perimeter = 2 * 3.14 * _Radius;

    }

    void updateSquare ( double _Square ) {

        this.Square = _Square;
        this.Radius = Math.sqrt ( _Square / 3.14 );
        this.Perimeter = 2 * 3.14 * this.Radius;

    }

    void updatePerimeter ( double _Perimeter ) {

        this.Perimeter = _Perimeter;
        this.Radius = Perimeter / ( 2 * 3.14 );
        this.Square = 3.14 * this.Radius * this.Radius;

    }

}
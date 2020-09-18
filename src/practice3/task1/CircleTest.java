package practice3.task1;

public class CircleTest {

    public static void main ( String[] args ) {

        Circle circle = new Circle ( 7 );

        System.out.println ( "--> Radius = " + circle.Radius + "; <--" );
        System.out.println ( "--> Square = " + circle.Square + "; <--" );
        System.out.println ( "--> Perimeter = " + circle.Perimeter + "; <--" );

        circle.updateRadius ( 1 );

        System.out.println ( "--> Radius = " + circle.Radius + "; <--" );
        System.out.println ( "--> Square = " + circle.Square + "; <--" );
        System.out.println ( "--> Perimeter = " + circle.Perimeter + "; <--" );

        circle.updateSquare ( 1 );

        System.out.println ( "--> Radius = " + circle.Radius + "; <--" );
        System.out.println ( "--> Square = " + circle.Square + "; <--" );
        System.out.println ( "--> Perimeter = " + circle.Perimeter + "; <--" );

        circle.updatePerimeter ( 1 );

        System.out.println ( "--> Radius = " + circle.Radius + "; <--" );
        System.out.println ( "--> Square = " + circle.Square + "; <--" );
        System.out.println ( "--> Perimeter = " + circle.Perimeter + "; <--" );

    }

}

package practice2.task1;

public class ShapeTest {

    public static void main ( String[] args ) {

        Shape сircle = new Shape ( "сircle" , 32 , 64 );
        System.out.println ( );

        System.out.println ( "--> Form: " + сircle.getForm ( ) + "; <--" );

        System.out.println ( "--> Perimeter = " + сircle.getPerimeter ( ) + "; <--" );
        System.out.println ( "--> Square = " + сircle.getSquare ( ) + "; <--" );

        сircle.setForm ( "disk" );

        сircle.setPerimeter ( 33 );
        сircle.setSquare ( 65 );

        System.out.println ( );
        System.out.println ( "--> Form: " + сircle.getForm ( ) + "; <--" );

        System.out.println ( "--> Perimeter = " + сircle.getPerimeter ( ) + "; <--" );
        System.out.println ( "--> Square = " + сircle.getSquare ( ) + "; <--" );
        System.out.println ( );

    }

}
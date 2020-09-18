package practice2.task2;

import java.util.ArrayList;

public class DogKennel {

    public static void main ( String[] args ) {
        ArrayList < Dog > dogArray = new ArrayList <> ( );

        String Name;
        int Years;

        int n = 4;

        for ( int i = 1 ; i <= n ; i++ ) {

            Name = "DogRobot" + Integer.toString ( i );
            System.out.print ( "--> Name = " + Name + "; <--" );
            System.out.println ( );
            Years = i;
            System.out.print ( "--> Years = " + Years + "; <--" );
            System.out.println ( );
            System.out.println ( );
            dogArray.add ( new Dog ( Name , Years ) );

        }

        for ( Dog element : dogArray ) {

            System.out.println ( element.toString ( ) );

        }

    }

}
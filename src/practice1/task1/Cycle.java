package practice1.task1;

public class Cycle {
    public static void main ( String[] args ) {

        int[] array = new int[ 16 ];

        for ( int i = 0 ; i < 16 ; ++ i ) {

            array[ i ] = ( int ) ( Math.random ( ) * 512 );

        }

        for ( int i = 0 ; i < 16 ; ++ i ) {

            if ( i == 0 ) {
                System.out.print ( "--> Array: " );
            }
            if ( i != 15 ) {
                System.out.print ( array[ i ] + ", " );
            }
            else {
                System.out.print ( array[ i ] + "; <--" );
            }

        }

        System.out.println ( );
        System.out.println ( "--> Sum = " + sum ( array ) + " <--" );
    }

    private static int sum ( int[] array ) {
        int sum = 0;
        for ( int i = 0 ; i < 16 ; ++ i ) {
            sum += array[ i ];
        }
        return sum;
    }
}
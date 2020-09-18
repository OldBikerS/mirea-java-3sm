package practice1.task2;

import java.util.Random;

public class RandFunction {
    public static void main(String[] args) {
        int[] array = new int[ 16 ];

        for ( int i = 0; i < 16; ++i ) {

            array[i]=(int)( Math.random() * 512 );

        }

        for( int i = 0; i < 16; ++i ) {

            if ( i == 0 ) {
                System.out.print("--> Array: " );
            }
            if (i != 15) {
                System.out.print( array[ i ] + ", " );
            }
            else {
                System.out.print( array[ i ] + "; <--" );
            }

        }

        System.out.println();
        sort( array );

        for( int i = 0; i < 16; ++i ) {

            if ( i == 0 ) {
                System.out.print("--> Array: " );
            }
            if (i != 15) {
                System.out.print( array[ i ] + ", " );
            }
            else {
                System.out.print( array[ i ] + "; <--" );
            }
        }

        System.out.println();
        Random random = new Random();

        for ( int i = 0; i < 16; ++i ) {

            array[i]=random.nextInt(512);

        }

        for( int i = 0; i < 16; ++i ) {

            if ( i == 0 ) {
                System.out.print("--> Array: " );
            }
            if (i != 15) {
                System.out.print( array[ i ] + ", " );
            }
            else {
                System.out.print( array[ i ] + "; <--" );
            }

        }

        System.out.println();
        sort(array);
        for( int i = 0; i < 16; ++i ) {

            if ( i == 0 ) {
                System.out.print("--> Array: " );
            }
            if (i != 15) {
                System.out.print( array[ i ] + ", " );
            }
            else {
                System.out.print( array[ i ] + "; <--" );
            }

        }

    }

    public static void sort( int[] array ) {

        boolean bool_sort = true;
        int buffer;

        while( bool_sort ) {

            bool_sort = false;

            for ( int i = 0; i < 16 - 1; i++ ) {

                if (array[ i ] > array[ i + 1 ]) {
                    buffer = array[ i ];
                    array[ i ] = array[ i + 1 ];
                    array[ i + 1 ] = buffer;
                    bool_sort = true;

                }

            }

        }

    }

}
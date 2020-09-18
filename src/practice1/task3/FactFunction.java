package practice1.task3;

public class FactFunction {
    public static void main(String[] args) {

        System.out.println("--> factorial( 4 ) = " + factorial(4)+"; <--");

    }

    public static int factorial( int level ) {
        int result=1;
        for( int i = 1; i <= level ; ++i ) result *= i;
        return result;
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
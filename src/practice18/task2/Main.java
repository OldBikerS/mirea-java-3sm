package practice18.task2;

import java.util.Scanner;

public class Main {
    private static int growNumber;
    private static int dropNumber;
    private static String word;
    private static boolean lastResult = false;

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        word = scanner.next ( );

        growNumber = 0;
        dropNumber = word.length ( ) - 1;

        process ( );
        System.out.println ( lastResult );
    }

    private static void process ( ) {
        if ( growNumber > dropNumber ) {
            return;
        }

        if ( word.charAt ( growNumber ) == word.charAt ( dropNumber ) ) {
            lastResult = true;
            growNumber++;
            dropNumber--;
            process ( );
        } else {
            lastResult = false;
        }
    }
}

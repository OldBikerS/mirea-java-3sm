package practice18.task3;

import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        System.out.println ( findMax ( ) );
    }

    private static int findMax ( ) {
        Scanner scanner = new Scanner ( System.in );
        int number = scanner.nextInt ( );
        int maxNumber = number;

        if ( number != 0 ) {
            int newNumber = findMax ( );
            if ( newNumber > maxNumber )
                maxNumber = newNumber;
        }

        return maxNumber;
    }
}
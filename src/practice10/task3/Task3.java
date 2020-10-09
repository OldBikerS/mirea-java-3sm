package practice10.task3;

import java.util.Scanner;

public class Task3 {
    public Task3 ( int num ) {
        if ( num >= 10 )
            new Task3 ( num / 10 );
        System.out.print ( num % 10 + " " );
    }

    public static void main ( String[] args ) {
        System.out.println ( "Введите N:" );
        Scanner scanner = new Scanner ( System.in );
        int N = scanner.nextInt ( );
        new Task3 ( N );
    }

}

package practice10.task2;



import java.util.Scanner;

public class Task2 {
    public Task2 ( ) {
        System.out.println ( "Введите a и b:" );
        Scanner sc = new Scanner ( System.in );
        System.out.println ( F ( sc.nextInt ( ) , sc.nextInt ( ) ) );
    }

    public static void main ( String[] args ) {
        new Task2 ( );
    }

    public static int F ( int a , int b ) {
        if ( a > b + 1 )
            return 0;
        if ( a == 0 || b == 0 )
            return 1;
        return F ( a , b - 1 ) + F ( a - 1 , b - 1 );
    }
}

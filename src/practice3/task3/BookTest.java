package practice3.task3;

public class BookTest {

    public static void main ( String[] args ) {

        System.out.println ( );

        Book utopia = new Book ( "Джордж Оруэлл" , "1984" , 1949 );

        System.out.println ( "--> Author: " + utopia.getAuthor ( ) + "; <--");
        System.out.println ( "--> Name: " + utopia.getName ( ) + "; <--");
        System.out.println ( "--> Year: " + utopia.getYear ( ) + ". <--");
        System.out.println ( );

        utopia.setAuthor ( "Олдос Хаксли" );
        utopia.setName ( "О дивный новый мир" );
        utopia.setYear ( 1932 );

        System.out.println ( "--> Author: " + utopia.getAuthor ( ) + "; <--");
        System.out.println ( "--> Name: " + utopia.getName ( ) + "; <--");
        System.out.println ( "--> Year: " + utopia.getYear ( ) + ". <--");
        System.out.println ( );

    }

}
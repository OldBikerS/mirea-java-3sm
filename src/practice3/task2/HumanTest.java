package practice3.task2;

public class HumanTest {

    public static void main ( String[] args ) {

        String name_head = "Bashka";
        boolean isHand = true;
        int sizeLeg = 42;

        System.out.println ( "   --> Head = " + name_head + "; <--" );
        System.out.println ( "      --> Leg = " + sizeLeg + "; <--" );
        System.out.println ( "         --> Hand = " + isHand + "; <--" );
        System.out.println ( );

        Human Boris = new Human ( name_head , isHand , sizeLeg );

        Boris.crash ( );
    }
}

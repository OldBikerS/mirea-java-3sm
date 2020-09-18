package practice3.task2;

public class Human {

    Head head;
    Leg legs;
    Hand hands;

    public Human ( String nameHead , boolean isHand , int sizeLeg ) {

        head = new Head ( nameHead );
        legs = new Leg ( sizeLeg );
        hands = new Hand ( isHand );

    }

    void crash ( ) {

        head.crash ( );
        legs.crash ( );
        hands.crash ( );

    }

}
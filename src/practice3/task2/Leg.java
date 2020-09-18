package practice3.task2;

public class Leg {

    private int sizeLeg;

    public Leg ( int _sizeLeg ) {

        this.sizeLeg = _sizeLeg;

    }

    void crash ( ) {

        this.sizeLeg = 0;

        System.out.println ( "      --> Leg = " + this.sizeLeg + "; <--" );

    }

}
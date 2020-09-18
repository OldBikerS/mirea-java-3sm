package practice3.task2;

public class Hand {

    private boolean isHand = true;

    public Hand(boolean _isHand) {

        this.isHand = _isHand;

    }

    void crash(){

        this.isHand = false;

        System.out.println ( "         --> Hand = " + this.isHand + "; <--" );

    }

}

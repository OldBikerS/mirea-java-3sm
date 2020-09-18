package practice3.task2;

public class Head {

    private String name_head = "Bashka";

    public Head(String _head) {

        this.name_head = _head;

    }

    void crash(){

        this.name_head = "Pumpkin";

        System.out.println ( "   --> Head = " + this.name_head + "; <--" );

    }

}
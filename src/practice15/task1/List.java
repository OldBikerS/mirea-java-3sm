package practice15.task1;

import java.util.Scanner;

public class List {
    public int i_value;
    List next = null;
    List previous = null;


    Scanner scanner = new Scanner ( System.in );

    List first = null;
    List last = null;

    public void add_value_on_start ( ) {

        System.out.println ( "[1] N =.." );
        System.out.println ( "[I]..." );
        int N = scanner.nextInt ( );
        for ( int i = 0 ; i < N ; i++ ) {
            System.out.println ( "(" + ( i + 1 ) + "/" + N + ")" );
            System.out.println ( "[I]..." );
            add_value ( );

        }


    }

    public void add_value ( ) {

        List list = new List ( );

        list.i_value = scanner.nextInt ( );
        if ( first == null ) {
            first = list;
            last = list;

        } else {
            last.next = list;
            list.previous = last;
            last = list;

        }
    }


    public void delete_value ( ) {
        System.out.println ( "Value:" );
        System.out.println ( "[I]..." );
        int i_value = scanner.nextInt ( );
        List list = first;
        while ( list != null ) {
            if ( list.i_value == i_value ) {
                if ( list.previous != null )
                    list.previous.next = list.next;
                else
                    first = list.next;
                if ( list.next != null )
                    list.next.previous = list.previous;
                else
                    last = list.previous;
                break;
            }
            list = list.next;
        }
        if ( list == null ) {
            System.out.println ( "Not found" );
        }
    }

    public void find_by_value ( ) {
        System.out.println ( "Value:" );
        System.out.println ( "[I]..." );
        int i_value = scanner.nextInt ( );
        int i = 0;
        List list = first;
        while ( list != null ) {
            i++;
            if ( list.i_value == i_value ) {
                System.out.println ( "Index: " + i );
                break;
            }
            list = list.next;
        }
        if ( list == null ) {
            System.out.println ( "Not found" );
        }
    }

    public void find_by_key ( ) {
        System.out.println ( "Index:" );
        System.out.println ( "[I]..." );
        List list = first;
        int index = scanner.nextInt ( );
        for ( int i = 0 ; i < index - 1 ; i++ ) {
            if ( list == null ) {
                System.out.println ( "Not found" );
                return;
            }
            list = list.next;
            if ( list == null ) {
                System.out.println ( "Not found" );
                return;
            }
        }
        System.out.println ( "Value: " + list.i_value );
    }

    public void find_max ( ) {
        int max = 0;
        List list = first;
        while ( list != null ) {
            max = Math.max ( list.i_value , max );
            list = list.next;
        }
        System.out.println ( "Value: " + max );
    }

    public void find_min ( ) {
        int min = Integer.MAX_VALUE;
        List list = first;
        while ( list != null ) {
            min = Math.min ( list.i_value , min );
            list = list.next;
        }
        System.out.println ( "Value: " + min );
    }

    public void find_Middle ( ) {
        int middle = 0;
        int size = 0;
        List list = first;
        while ( list != null ) {
            size++;
            middle += list.i_value;
            list = list.next;
        }

        System.out.println ( "Value: " + middle / size );
    }


    public void show_List ( ) {
        List list = first;
        int i = 1;
        while ( list != null ) {
            System.out.print ( "(" + i + ") " + list.i_value + "\n" );
            list = list.next;
            i++;

        }
        System.out.println ( );
    }


    public void menu ( ) {
        int condition = 9;
        add_value_on_start ( );
        while ( condition != 0 ) {


            if ( condition == 1 ) {
                add_value_on_start ( );

            } else
                if ( condition == 2 ) {
                    delete_value ( );

                } else
                    if ( condition == 3 ) {
                        find_by_value ( );

                    } else
                        if ( condition == 4 ) {
                            find_by_key ( );

                        } else
                            if ( condition == 5 ) {
                                find_max ( );

                            } else
                                if ( condition == 6 ) {
                                    find_min ( );

                                } else
                                    if ( condition == 7 ) {
                                        find_Middle ( );

                                    } else
                                        if ( condition == 8 ) {
                                            show_List ( );

                                        } else
                                            if ( condition == 9 ) {
                                                System.out.println ( "[ Menu: ]" );
                                                System.out.println ( "[ Write '1' for add new value ]" );
                                                System.out.println ( "[ Write '2' for delete value ]" );
                                                System.out.println ( "[ Write '3' for find by value ]" );
                                                System.out.println ( "[ Write '4' for find by key ]" );
                                                System.out.println ( "[ Write '5' for find max value ]" );
                                                System.out.println ( "[ Write '6' for find min value ]" );
                                                System.out.println ( "[ Write '7' for find average all list ]" );
                                                System.out.println ( "[ Write '8' for start showing ]" );
                                                System.out.println ( "[ Write '9' for open menu ]" );
                                                System.out.println ( "[ Write '0' for exit ]" );

                                            }
            System.out.println ( "  Write command.. " );
            condition = scanner.nextInt ( );
            if ( condition == 0 ) {
                System.out.println ( "[0] Exit" );

            }

        }

    }
}

package practice13.task1;

import java.util.ArrayList;
import java.util.Collections;

public class Tester13 {
    static ArrayList < Student > students = new ArrayList ( );
    static ArrayList < Integer > iDNumber = new ArrayList ( );
    static Student student1 = new Student ( 1111 , 3.3 , "FirstStudent" );
    static Student student2 = new Student ( 2222 , 4.4 , "MiddleStudent" );
    static Student student3 = new Student ( 3333 , 5.0 , "BestStudent" );
    static SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA ( );

    public static int[] Output ( ) {
        System.out.println ("idNumber List:");
        students.add ( student1 );

        students.add ( student2 );

        students.add ( student3 );

        students.forEach ( student -> iDNumber.add ( student.iDNumber ) );

        Collections.sort ( iDNumber );

        iDNumber.forEach ( id -> System.out.println ( id ) );

        Collections.sort ( students , sortingStudentsByGPA );
        System.out.println ("Student List:");
        students.forEach ( student -> System.out.println ( student.nameStudent ) );
        System.out.println ("Mark List:");
        students.forEach ( student -> System.out.println ( student.dMark ) );
        students.forEach ( student -> iDNumber.add ( student.iDNumber ) );
        int[] res = new int[ iDNumber.size ( ) ];
        for ( int i = 0 ; i < iDNumber.size ( ) ; i++ ) {
            res[ i ] = iDNumber.get ( i );
        }
        return res;
    }

}
package practice14.task1;
import java.util.Scanner;
import practice13.task1.*;
public class Tester14 {
    static FindSort findsort =new FindSort();
    static Main main13=new Main();
    static int[] old_array=Tester13.Output();
    static int new_array[]=null;
    public static void Output(){
        Scanner sc=new Scanner(System.in);

        while(true){
            int iInput=sc.nextInt();
            if(iInput==0){
                break;
            }
            int iCondition=sc.nextInt();

            if(iInput==1){
                findsort.quickSort(old_array,0,old_array.length-1);
                new_array=old_array;

            }else if(iInput==2){
                findsort.mergesort(old_array);
                new_array=old_array;

            }else{
                new_array=null;

            }


            if(iInput==1){
                System.out.println( findsort.binarySearch(new_array,iCondition));
                break;

            }else if(iInput==2){
                System.out.println( findsort.recursiveBinarySearch(new_array,new_array[0],new_array[new_array.length-1],iCondition));
                break;

            }else if(iInput==3){
                if(new_array!=null)
                    System.out.println( findsort.lineSearch(new_array,iCondition));
                break;

            }else if(iInput==4){
                if(new_array!=null)
                    System.out.println( findsort.lineRecSearch(new_array,iCondition,0));
                break;

            }else if(iInput==0){
                break;

            }

        }

    }
}

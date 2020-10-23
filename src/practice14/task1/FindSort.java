package practice14.task1;

import java.util.Arrays;

public class FindSort {
    public static int lineRecSearch(int[] array,int elementToSearch,int index){
        if(array[index]==elementToSearch)
            return index;
        else if(index<=array.length)
            return lineRecSearch(array,elementToSearch,index+1);
        else return -1;
    }

    public int recursiveBinarySearch(int array[],int firstElement,int lastElement,int elementToSearch){


        if(lastElement>=firstElement){
            int mid=firstElement+(lastElement-firstElement)/2;


            if(array[mid]==elementToSearch)
                return mid;


            if(array[mid]>elementToSearch)
                return recursiveBinarySearch(array,firstElement,mid-1,elementToSearch);


            return recursiveBinarySearch(array,mid+1,lastElement,elementToSearch);
        }

        return -1;
    }

    public static int lineSearch(int array[],int elementToSearch){
        for(int index=0;index<array.length;index++){
            if(array[index]==elementToSearch)
                return index;
        }
        return -1;
    }

    public int binarySearch(int array[],int elementToSearch){

        int firstIndex=0;
        int lastIndex=array.length-1;

        while(firstIndex<=lastIndex){
            int middleIndex=(firstIndex+lastIndex)/2;
            if(array[middleIndex]==elementToSearch){
                return middleIndex;
            }else if(array[middleIndex]<elementToSearch)
                firstIndex=middleIndex+1;


            else if(array[middleIndex]>elementToSearch)
                    lastIndex=middleIndex-1;

        }
        return -1;
    }

    public static void quickSort(int[] array,int low,int high){
        if(array.length==0)
            return;

        if(low>=high)
            return;

        int middle=low+(high-low)/2;
        int middle_value=array[middle];

        int i=low, j=high;
        while(i<=j){
            while(array[i]<middle_value){
                i++;

            }

            while(array[j]>middle_value){
                j--;

            }

            if(i<=j){
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                i++;
                j--;

            }

        }

        if(low<j)
            quickSort(array,low,j);
        if(high>i)
            quickSort(array,i,high);

    }

    public static int[] mergesort(int[] array1){
        int[] buffer1= Arrays.copyOf(array1,array1.length);
        int[] buffer2=new int[array1.length];
        int[] result=mergesortInner(buffer1,buffer2,0,array1.length);
        return result;

    }

    public static int[] mergesortInner(int[] buffer1,int[] buffer2,int startIndex,int endIndex){
        if(startIndex>=endIndex-1){
            return buffer1;

        }

        int middle=startIndex+(endIndex-startIndex)/2;
        int[] sorted1=mergesortInner(buffer1,buffer2,startIndex,middle);
        int[] sorted2=mergesortInner(buffer1,buffer2,middle,endIndex);
        int index1=startIndex;
        int index2=middle;
        int destIndex=startIndex;

        int[] result=sorted1==buffer1?buffer2:buffer1;

        while(index1<middle&&index2<endIndex){
            result[destIndex++]=sorted1[index1]<sorted2[index2]
                    ?sorted1[index1++]:sorted2[index2++];
        }

        while(index1<middle){
            result[destIndex++]=sorted1[index1++];
        }

        while(index2<endIndex){
            result[destIndex++]=sorted2[index2++];
        }

        return result;

    }
}

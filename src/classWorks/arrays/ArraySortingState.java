package classWorks.arrays;

import java.util.Arrays;

public class ArraySortingState {
    public static void main(String[] args) {
        int [] array={2,4,6,8,10};
        System.out.println("Array : "+(Arrays.toString(array)));
       boolean isSortedArray = sortingState(array);
        if (isSortedArray){
            System.out.println("Array is sorted.");
        }
        else {
            System.out.println("Array is not sorted!");
        }

    }
    public static boolean sortingState(int [] array){
        boolean isSortedArray=true;

        for (int index=0;index<array.length-1;index++){
            if (array[index] > array[index+1] ) {
                isSortedArray=false;
            }

        }
        return isSortedArray;
    }
}

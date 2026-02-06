package classWorks.arrays;

import java.util.Arrays;

public class ArraySorting {
  private static   int[] originalArray = {4, 2, 5, 1, 3};
   private static int[] sortingIndex={3,1,4,0,2};
 private static  int[] sortedArray=new int[sortingIndex.length];

    public static void main(String[] args) {
       System.out.println("Original Array: " + Arrays.toString(originalArray));

        System.out.println("SortedArray: "+(Arrays.toString(sorting(originalArray))));
    }
    public static int [] sorting(int[] originalArray){
        for (int index=0;index<sortingIndex.length;index++){
             sortedArray[index]=originalArray[sortingIndex[index]];
        }
        return sortedArray;
    }

}

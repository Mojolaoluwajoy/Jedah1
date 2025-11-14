package classworks;

import java.util.Arrays;

public class RemovingDuplicatesFromArray {
    public static void main(String[] args) {
        int[] numbers = {4,2,6,4,8,3,2,4,1};
        System.out.println("Array with duplicates: " + (Arrays.toString(numbers)));
          System.out.println("Array without duplicates: "+(Arrays.toString(removeDuplicates(numbers))));
    }
   public static int[] removeDuplicates(int[] numbers){
        int index1=1;
 for (int index2=1;index2<numbers.length;index2++){
                if (numbers[index2] != numbers[index2 - 1]) {
                numbers[index1++]=numbers[index2];
                }
                }
        int[] noDuplicates=new int[index1];
        for (int index=0;index<index1;index++){
            noDuplicates[index]=numbers[index];
        }
     return noDuplicates;
    }
}

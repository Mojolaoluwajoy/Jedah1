package classworks;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int [] array={12,35,1,10,34,1};
        System.out.println("Array: "+(Arrays.toString(array)));
        System.out.println("Second largest number is: "+findingSecondLargest(array));
    }
    public static int findingSecondLargest(int [] array){
        int firstLargest=0;
        int secondLargest=0;
        for (int index1=0;index1<array.length;index1++){
          for (int index2=0;index2<index1;index2++){
              if (array[index1]>array[index2]){
                  firstLargest=array[index1];
                  secondLargest=firstLargest;
              }
          }

        }
        return secondLargest;
    }
}

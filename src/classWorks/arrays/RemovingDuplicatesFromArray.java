package classWorks.arrays;

import java.util.Arrays;

public class RemovingDuplicatesFromArray {
    private static int[] noDuplicates;

    public static void main(String[] args) {
        int[] numbers = {4, 2, 6, 4, 8, 3, 2, 4, 1};
        System.out.println("Array with duplicates: " + (Arrays.toString(numbers)));
     removeDuplicates(numbers)   ;
    }

    public static int[] removeDuplicates(int[] numbers) {
        for(int index1=1;index1<numbers.length;index1++) {
           noDuplicates = new int[numbers.length];

            for (int index2 = 1; index2 < numbers.length; index2++) {
                if (numbers[index1] != numbers[index2]) {
                    noDuplicates[index1++] = numbers[index2];

                }
            }
            System.out.println("Array without duplicates: " + (Arrays.toString((noDuplicates))));

        }
     return noDuplicates;
    }
}

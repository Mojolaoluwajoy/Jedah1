package classWorks.arrays;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {6, 2, 1, 7, 0, 9, 5, 8, 3, 4};
        System.out.println("Original Array: " + (Arrays.toString(numbers)));
        System.out.println("Sorted Array: " + (Arrays.toString(sorting(numbers))));
    }

    public static int[] sorting(int[] numbers) {

        for (int index1 = 0; index1 < numbers.length; index1++) {
            for (int index2 = 0; index2 < numbers.length - index1 - 1; index2++) {
                if (numbers[index2] > numbers[index2 + 1]) {
                    int temporaryStorage = numbers[index2];
                    numbers[index2] = numbers[index2 + 1];
                    numbers[index2 + 1] = temporaryStorage;
                }
            }
        }
        return numbers;
    }
}

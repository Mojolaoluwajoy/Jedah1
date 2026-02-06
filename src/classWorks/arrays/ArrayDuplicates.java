package classWorks.arrays;

import java.util.Arrays;

public class ArrayDuplicates {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 6, 4, 8, 3, 2, 4, 1};
        System.out.println("Array with duplicates: " + (Arrays.toString(numbers)));
        int[] noDuplicate = new int[numbers.length];
        int count = removeDuplicates(numbers, noDuplicate);

        System.out.print("Array without duplicates: [");
        for (int index = 1; index < count; index++) {
            if (index != count - 1) {
                System.out.print(noDuplicate[index] + " ,");
            } else {
                System.out.print(noDuplicate[index]);
            }
        }
        System.out.print("]");
    }

    public static int removeDuplicates(int[] numbers, int[] noDuplicate) {
        int count = 0;
        for (int index1 = 0; index1 < numbers.length; index1++) {

            int found = 0;
            for (int index2 = 1; index2 < index1 - 1; index2++) {
                if (numbers[index1] == numbers[index2]) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) {
                noDuplicate[count++] = numbers[index1];
            }
        }
        return count++;
    }
}

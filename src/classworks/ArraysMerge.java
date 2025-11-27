package classworks;

import java.util.Arrays;

public class ArraysMerge {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};
        System.out.println("Array1: " + (Arrays.toString(array1)));
        System.out.println("Array2: " + (Arrays.toString(array2)));
        int[] mergedArray = merge(array1, array2);
        System.out.print("Merged Array: " + (Arrays.toString(sort(mergedArray))));

    }

    public static int[] merge(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int counter = 0;
        for (int index1 : array1) {
            mergedArray[counter++] = index1;
        }
        for (int index2 : array2) {
            mergedArray[counter++] = index2;

        }


        return mergedArray;
    }

    public static int[] sort(int[] mergedArray) {

        for (int index1 = 0; index1 < mergedArray.length; index1++) {
            for (int index2 = 0; index2 < mergedArray.length - index1 - 1; index2++) {

                if (mergedArray[index2] > mergedArray[index2 + 1]) {
                    int temp = mergedArray[index2];
                    mergedArray[index2] = mergedArray[index2 + 1];
                    mergedArray[index2 + 1] = temp;
                }
            }
        }

        return mergedArray;
    }

}

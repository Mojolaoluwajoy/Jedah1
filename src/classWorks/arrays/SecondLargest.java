package classWorks.arrays;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {12, 35, 1, 10, 34, 1};
        System.out.println(" Array: " + (Arrays.toString(array)));
        System.out.println("Second largest number: " + findSecondLargest(array));
    }

    public static int findSecondLargest(int[] array) {

        int largest = array[0];
        int secondLargest =array[0];

        for (int index = 0; index < array.length; index++) {
            if (array[index] > largest) {
               secondLargest = largest;
                largest = array[index];
                 }
            else if (array[index] > secondLargest && array[index] !=largest) {
                 secondLargest = array[index];
            }
        }

            return secondLargest;

        }
    }


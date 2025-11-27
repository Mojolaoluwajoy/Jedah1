package chapter7.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] array =new int[10];

        for (int index = 0; index< array.length; index++){
            array[index]=-1;
        }

    for (int index1 = 0; index1 < array.length; index1++) {
        while (true) {
            System.out.println("Kindly enter a number between 10 and 100: ");
          int  number = scanner.nextInt();

            if (number >= 10 && number <= 100) {
                array[index1] = number;
                break;
            } else {
                System.err.println("Invalid input!Your entry didn't fit between the specified range! ");
            }
             }
    }
    System.out.println(Arrays.toString(array));

    for (int index=0;index<array.length;index++){
        for (int index1=0;index1<array.length-index-1;index1++){

            if (array[index1 ]> array[index1+1]){
                int temporaryStorage=array[index1];
                array[index1]=array[index1+1];
                array[index1+1]=temporaryStorage;
            }
        }
    }
        System.out.println("Sorted Array: "+Arrays.toString(array));

    }
}

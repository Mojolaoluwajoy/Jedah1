package chapter8.exercises.setOfIntegers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class IntegerSetTest {
    public static void main(String[] args) {
        IntegerSet integerSet=new IntegerSet();
        Scanner scanner=new Scanner(System.in);
        boolean []set=integerSet.getArray();
        toStrings(set);
        for (int index=0;index<set.length;index++){
            System.out.println("Enter an integer between 0-100," +
                    "if its within the required range," +
                    "it will be stored as true and if not it will be stored as false ");
            int number= scanner.nextInt();
            integerSet.isTrue(index,number);
            integerSet.isFalse(index,number);
            toStrings(set);
        }
       toStrings(set);
    }
    public static void toStrings(boolean[] set){
        System.out.print("[");
        for (int arrayIndex=0;arrayIndex<set.length;arrayIndex++) {
            if (arrayIndex % 10 == 0&& arrayIndex!=0) {
                System.out.println("]");
                System.out.print("[");
            }
             System.out.print(set[arrayIndex]+",");
            if (arrayIndex==set.length-1){
                System.out.print("]");
            }

        }
        System.out.println();
    }

}

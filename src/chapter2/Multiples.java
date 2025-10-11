package chapter2;

import java.util.Scanner;

public class Multiples{
                    public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);

                    System.out.print("Enter first integer : ");
                    int number1 = input.nextInt();

                    System.out.print("Enter second integer :");
                    int number2 = input.nextInt();

                    int trippled = number1 * 3;
                    int doubled = number2 * 2;

                    if (trippled % doubled == 0) {
                        System.out.printf("%d trippled (%d) is a multiple of %d doubled (%d).%n", number1, trippled, number2, doubled);

}

                    if (trippled % doubled != 0) {
                       System.out.printf("%d trippled (%d) is not a multiple of (%d).%n", number1, trippled, number2,doubled);

}



}





}
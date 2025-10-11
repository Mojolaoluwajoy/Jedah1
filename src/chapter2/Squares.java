package chapter2;

import java.util.Scanner;

public class Squares{
                       public static void main(String[] args) {
                       Scanner input = new Scanner(System.in);

                       System.out.print("Enter first integer:");
                       int num1 = input.nextInt();

                       System.out.print("Enter second integer:");
                       int num2 = input.nextInt();

                       int square1 = num1 * num1;
                       int square2 = num2 * num2;

                       int sumOfSquares = square1 + square2;
                       int differenceOfSquares = square1 - square2;

                       System.out.println("Square of " + num1 + "is:" + square1);
                       System.out.println("Square of " + num2 + "is:" + square2);
                       System.out.println("Sum of squares is: " + sumOfSquares);
                       System.out.println("Difference of squares is: " +differenceOfSquares);
            


}
   




}
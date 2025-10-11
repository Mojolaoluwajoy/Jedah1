package chapter4;

import java.util.Scanner;
public class Comparator {
    public static void main(String[] args) {


        int secondNumber = 0;
        int counter = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number:");
       int  firstNumber= input.nextInt();

        while (counter == 1) {

            System.out.print("Enter the second number:");
            secondNumber= input.nextInt();

            if(firstNumber == secondNumber) {
                firstNumber=0;
                secondNumber=0;
            }
            if(firstNumber > secondNumber) {
                firstNumber=1;
                System.out.println();
                secondNumber=1;
            }

            if(secondNumber > firstNumber) {
                firstNumber = -1;
                System.out.println();
                secondNumber = -1;

                counter++;
            }
        }
        System.out.println("Number one:"+firstNumber+ "Number 2:" +secondNumber);
    }
}
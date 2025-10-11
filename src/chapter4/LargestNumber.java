package chapter4;

import java.util.Scanner;
public class LargestNumber {
    public static void main (String[] args) {
    int number =0;
    int largest =0;
    int counter =1;
    Scanner input = new Scanner(System.in);

    while(counter <= 10) {
        System.out.print("Enter a number:");
         number = input.nextInt();

        while(number < 0) {
            System.out.print("invalid number!Please enter a non-negative integer:");
            number = input.nextInt();
        }

        if(number > largest) {
                 largest = number;
             }
             counter++;
             }
             System.out.println("The largest number is:"+largest);

    }

    }


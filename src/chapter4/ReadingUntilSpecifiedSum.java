package chapter4;

import java.util.Scanner;
public class ReadingUntilSpecifiedSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the target number:");
       int targetNum = input.nextInt();

       int sum =0;

       while (sum <= targetNum) {

           System.out.println("Enter the next number:");
           int number = input.nextInt();

           sum += number;
           System.out.println("Sum :" + sum);
           
           if (sum > targetNum) {

               System.out.println("Sum has exceeded the target number.Stopping the request for more user input now....");
           }

       }



    }
}
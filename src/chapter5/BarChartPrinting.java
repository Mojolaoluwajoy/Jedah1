package chapter5;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {

        Scanner mojo = new Scanner(System.in);
        int number = 0;
        int counter;
        String output = "";

        for (counter = 1; counter <= 5; counter++) {

            while (true) {
                System.out.println("Kindly enter a number between 1-30:");
                number = mojo.nextInt();

                if (number >= 1 && number <= 30) {
                   break;
                } else {
                    System.err.println("Invalid input!!");
                }
            }
            output += "*".repeat(number) + "  ";
        }
       System.out.println(output);
    }
        }




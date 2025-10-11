package chapter5;
import java.util.Scanner;
public class Extremes {
    public static void main(String[] args) {

        Scanner mojo =new Scanner(System.in);

        System.out.println("Kindly enter the first number:");
        int number = mojo.nextInt();

        int maximum =number;
        int minimum =number;
        int extremeSum = 0;
        int counter=1;

        while(counter <= 4) {
            System.out.println("Kindly enter the next number:");
             number = mojo.nextInt();

            if(number > maximum ) {
                maximum = number;
            }
            if (number < minimum) {
                minimum =number;
            }
            counter++;
            extremeSum = maximum +minimum;
        }

        System.out.printf("""
                The maximum number is:%d
                The minimum number is:%d%n""",maximum,minimum
        );

        System.out.println("The sum of the two extremes is:" +extremeSum);
    }
}

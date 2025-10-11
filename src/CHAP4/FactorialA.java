package CHAP4;
import java.util.Scanner;

public class FactorialA {
    public static void main(String[] args) {

        int number=0;
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a non negative integer:");
            number = input.nextInt();

            if(number > 0) {
                break;
            } else {
                System.out.println("Invalid input!!! ");
            }
        }

        long factorial = 1;
        int counter=1;

        while (counter <= number) {
            factorial *= counter;

            counter++;

        }

        System.out.println("Factorial of the non negative integer entered is:" +factorial);

    }
}



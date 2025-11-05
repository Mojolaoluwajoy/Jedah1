package chapter6;
import java.util.Scanner;
public class CalculatingTheSumOfDigits {
    Scanner mojo = new Scanner(System.in);
    int number = 0;
    private int sumCalculation;
    int sum=0;

    public void sumCalculation() {
        while (true) {
            sum=0;
            System.out.println("Strickly enter a four digit integer:  ");
            number = mojo.nextInt();

            if (number >= 1000 && number <= 9999) {
                break;
            } else {
                System.err.println("Incorrect input");
            }
        }
        int temporaryNumber = 0;
        temporaryNumber = number;
        while (temporaryNumber > 0) {

            sum += temporaryNumber % 10;
            temporaryNumber /= 10;
        }
        System.out.println("The sum of " + number + " is " + sum);


    }




public static void main(String[] args) {
        Scanner mojo =new Scanner(System.in);
        CalculatingTheSumOfDigits calculating =new CalculatingTheSumOfDigits();
        int sentinelValue=-5;
        int quitValue=0;
        while (sentinelValue!=quitValue){
            calculating.sumCalculation();

            System.out.println("Would you like to quit or continue: ");
            quitValue=mojo.nextInt();

    }
}
}
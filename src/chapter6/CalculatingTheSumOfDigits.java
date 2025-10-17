package chapter6;
import java.util.Scanner;
public class CalculatingTheSumOfDigits {
    public static void main(String[] args) {

        Scanner mojo =new Scanner(System.in);
        int number=0;
        int sum=0;
        while (true){
            System.out.println("Strickly enter a four digit integer:  ");
            number = mojo.nextInt();

            if (number >= 1000 && number<=9999){
                break;
            }
            else {
                System.err.println("Incorrect input");
            }
        }
        int temporaryNumber=0;
        temporaryNumber = number;
        while (temporaryNumber > 0){
            sum +=temporaryNumber%10;
           temporaryNumber /=10;
        }
        System.out.println("The sum of "+number +" is " +sum);
    }
}

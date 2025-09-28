import java.util.Scanner;

public class SeperatingDigits{
                     public static void main(String[] args) {
                     Scanner input = new Scanner(System.in);

                     System.out.print("Enter five digit number : ");
                     int number = input.nextInt();

                     int digit1 = number / 10000;
                     int remaining = number % 10000;
                     int digit2 = remaining / 1000;  
                     remaining = remaining % 1000;
                     int digit3 = remaining / 100;
                     remaining = remaining % 100;
                     int digit4 = remaining / 10;
                     int digit5 = remaining % 10;

                     System.out.printf("%d   %d   %d   %d   %d%n", digit1, digit2, digit3, digit4, digit5);





}




}
import java.util.Scanner;

public class ComparingIntegers{
                                public static void main(String[] args) {
                                Scanner input = new Scanner(System.in);

                                System.out.print("Enter an integer:");
                                int number = input.nextInt();
                                int square = number * number;

                                System.out.println("Number: " + number + ", Square: " + square);

                                System.out.println("Number is " + (number > 100 ? "greater than" : number == 100 ? "equal to" : "less than") + "100.");
                                System.out.println("Square is " + (square > 100 ? "greater than" : square == 100 ? "equal to" : "less than") + "100.");





}





}
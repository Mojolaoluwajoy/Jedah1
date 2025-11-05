package chapter6;
import java.util.Scanner;
public class DisplayingSquareOfAsterisks {
    public static void main(String[] args) {
        Scanner mojo = new Scanner(System.in);
        String sentinel = "Exit";
        String quitValue = "";
        while (!sentinel.equalsIgnoreCase(quitValue)) {
            squareOfAsterisks(mojo);
            System.out.println("Enter the sentinel value to terminate or any other value to continue: ");
            quitValue = mojo.nextLine();
            ;
        }
    }
    public static int squareOfAsterisks(Scanner mojo){
        System.out.println("Enter an integer value for the side of your square: ");
        int integer= mojo.nextInt();
        for (int column=1;column<=integer;column++){
        for (int rows=1;rows <=integer;rows++){
            System.out.print("*");
               }
            System.out.println();
        }
        System.out.println();
        return squareOfAsterisks(mojo);
    }
}

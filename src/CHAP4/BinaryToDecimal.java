package CHAP4;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner mojo = new Scanner(System.in);
        String binaryN;
        double decimalValue = 0;

        while (true) {

            System.out.println("Enter your preferred binary numbers: ");
            binaryN = mojo.nextLine();

            if (binaryN.matches("[01]+")) {
                decimalValue = (double) Integer.parseInt(binaryN, 2);
                System.out.println("The decimal equivalent of the binary number is: " + decimalValue);

            } else {
                System.err.println("Incorrect input!Please enter a binary number!!");
            }
        }


    }
}



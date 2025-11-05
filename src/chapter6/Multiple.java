package chapter6;
import java.util.Scanner;
public class Multiple {

    public static void main(String[] args) {
        Scanner mojo =new Scanner(System.in);

        String sentinelValue="Terminate";
        String quiteValue="";
        while (!sentinelValue.equalsIgnoreCase(quiteValue)) {
            System.out.println( isMultiple(mojo));

            System.out.println("Enter your sentinel value to quit or any other value to continue: ");
            quiteValue= mojo.nextLine();

        }
    }
    public static boolean isMultiple(Scanner mojo){
        int num1=0;
        int num2=0;

        while (true) {
            System.out.print("Enter the first integer: ");
            num1 = mojo.nextInt();
            System.out.print("Enter the second integer: ");
            num2 = mojo.nextInt();
            if (num1 > 0 && num2 >0){
               System.out.println("Numbers successfully taken for evaluation! ");
             return num2 % num1==0;

            }else {
                System.out.println("The numbers to be evaluated has to be greater than zero.");
                mojo.nextLine();
            }

        }
    }
}

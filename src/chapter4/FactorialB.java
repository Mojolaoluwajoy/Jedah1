package chapter4;

import java.util.Scanner;
public class FactorialB {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double e =1;
         int termCounter =1;

        System.out.println("Kindly enter the number of terms you desire:");
        int n = scanner.nextInt();

        while (termCounter <= n) {
            long factorial =1;
            int factorialCounter =1;




            while (factorialCounter <= termCounter) {
               factorial *= factorialCounter ;

               factorialCounter++;

            }
            e += (double)1/factorial;
            termCounter++;
        }

        System.out.printf("The estimated value of the mathematical constsant e based on the term enterred by the user is: %f", e);
    }
}

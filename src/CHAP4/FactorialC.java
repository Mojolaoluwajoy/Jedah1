package CHAP4;
import java.util.Scanner;

public class FactorialC {
    public static void main(String[] args) {

        Scanner mj=new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        int x = mj.nextInt();

        System.out.println("Kindly enter the number of terms you desire: ");
        int n = mj.nextInt();

        double ex =1.0;
        int termCounter =1;
        int terms =1;

        while(termCounter <= n) {
            double factorial =1;
            int factorialCounter=1;

            while (factorialCounter <= termCounter) {
                factorial *=factorialCounter;
                factorialCounter++;
            }
            terms *= x;
            ex += terms/factorial;

            termCounter++;

        }
        System.out.println("The estimated value of ex is : " +ex);

    }
}



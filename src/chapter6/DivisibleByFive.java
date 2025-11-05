package chapter6;
import java.util.Scanner;
public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner mojo=new Scanner(System.in);
        System.out.println("""
                               =====================
                                DIVISIBLE BY FIVE
                               ====================""");
         for (int i=1;i<=10;i++){
            System.out.println(isDivisibleByFive(mojo));

        }

    }
   public static  boolean isDivisibleByFive(Scanner mojo){
       System.out.println("Kindly and gently enter a number to determine if it's divisible by 5: ");
       int number = mojo.nextInt();
       return number %5==0;

   }
}

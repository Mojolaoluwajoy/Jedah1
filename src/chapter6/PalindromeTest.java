package chapter6;
import java.util.Scanner;
public class PalindromeTest {
    public static void main(String[] args) {
         String sentinelValue= "Exit";
         String quitValue =" ";
         Palindrome palindrome =new Palindrome();
        System.out.println("""
                ===================
                  PALINDROME CHECK
                ====================
                
              This app allows you to enter a number and determines whether 
              the number you've entered is a palindrome or not""");
        System.out.println();
        while (!sentinelValue.equalsIgnoreCase(quitValue)){
            palindrome.numberInput();
            palindrome.itsPalindrome();

            System.out.println("Is there more numbers you'd like to check or you'd like to exit now: ");
            quitValue =new Scanner(System.in).nextLine();

        }



    }
}

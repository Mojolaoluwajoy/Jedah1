package chapter6;
import java.util.Scanner;
public class Palindrome {
    private int numberInput;
    private int itsPalindrome;
     int number=0;

    public void numberInput() {
        while (true){
            System.out.println("Kindly enter the number you'd like to check: ");
            number =new Scanner(System.in).nextInt();
            if (number>0){
                System.out.println("""
                        Number successfully taken!
                        Result of our evaluation will be printed shortly.....""");
                ParkingChargesTest.sleep();
                break;
            }else {
                System.err.println("The palindrome evaluation cannot be carried out on a negative number!!!");}
        }}
public void itsPalindrome(){
        int temporaryNumber =number;
        int reversedNumber=0;
        while (temporaryNumber !=0){

            int digit=temporaryNumber % 10;
            reversedNumber=reversedNumber*10+digit;
            temporaryNumber/=10;
        }
    if (reversedNumber == number) {
        System.out.println("The number you entered is a palindrome.");
    }
    else {
        System.out.println("The number you entered is not a palindrome!");
    }
    }
}


package chapter4;

import java.util.Scanner;

public class Decryption {
    public static void main(String[] args) {
         Scanner scanner =new Scanner(System.in);

        System.out.println("Kindly enter the encrypted number for decryption:");
        int number= scanner.nextInt();



          int digit1 = number/1000;
          int digit2 = (number/100) %10;
          int digit3 = (number/10)  %10;
          int digit4 = number % 10;

        System.out.println("The number after decryption is1: "+digit1 +digit2 +digit3 +digit4);

        digit1= (digit1 -7 )+10;
        digit2=(digit2-7 )+10;
        digit3=(digit3-7 )+10;
        digit4=(digit4-7 )+10;

        System.out.println("The number after decryption2 is: "+digit1 +digit2 +digit3 +digit4);



        int temporaryStorage1 =digit1;
           digit1=digit3;
           digit3 = temporaryStorage1;

          int temporaryStorage2=digit2;
          digit2 =digit4;
          digit4 =temporaryStorage2;



        System.out.println("The encrypted number you entered has been sucessfully decrypted!");
        System.out.println("The number you entered for decryptionn is:" +number);
        System.out.println("The number after decryption is: "+digit1 +digit2 +digit3 +digit4);
    }
}

import java.util.Scanner;

public class Cryptography1{
    public static void main(String[] args) {
        int number =0;
        Scanner scanner =new Scanner(System.in);

        while (true) {
            System.out.println("Please enter a four digit integer:");
             number = scanner.nextInt();

            if(number >= 1000 & number<= 9999){
                break;
        }else {
                System.err.println("Invalid input!!1");
        }
    }
      int  digit1 = number/1000;
        int digit2 =(number/100) %10;
        int digit3 = (number/10) %10;
        int digit4 = number % 10;

        digit1= (digit1 + 7) % 10;
        digit2= (digit2 + 7) % 10;
        digit3= (digit3 + 7) % 10;
        digit4= (digit4 + 7) % 10;


        int temporaryStorage1 = digit1;
        digit1 =digit3;
        digit3 = temporaryStorage1;

        int temporaryStorage2=digit2;
       digit2 =digit4;
       digit4 = temporaryStorage2;

        System.out.println("Encrypted number: "+digit1 + digit2 + digit3 + digit4);

    }
}
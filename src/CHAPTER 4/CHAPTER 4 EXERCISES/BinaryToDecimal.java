import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner mojo =new Scanner(System.in);
        int binaryN=0;

            System.out.println("Enter your preferred binary numbers: ");
             binaryN = mojo.nextInt();


        double decimal =0;
        int power =1;

        while (binaryN >0) {
            decimal+= (binaryN %10) * power;
            binaryN /=10;
            power *=2;
        }
        System.out.println("The decimal equivalent of the binary number is: "+decimal);
    }
}

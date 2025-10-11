package CHAP5;
import java.util.Scanner;

public class ModifiedDiamondPrinting {

    public static void main(String[] args) {
        Scanner mojo =new Scanner(System.in);
        int x;
        int length;

        do {
            System.out.println("Enter a number between 1-19:");
             length = mojo.nextInt();

            if (length < 1 || length > 19) {
                System.err.println("Number is out of range,kindly enter a number between 1-19!!");
            } else if (length % 2 == 0) {
                System.err.println("Number i not odd!Pleae enter an odd number!!!");
            }
        }
            while (length < 1 || length >19 || length % 2==0);


        for (x = 1; x <= length; x += 2) {

            for (int y=1; y<= length-x;y++) {
                System.out.print(" ");
            }

            for (int y = 1; y <=(2* x-1); y ++) {
                System.out.print("*" );
            }
            System.out.println();
        }


        for ( x=5;x>=1; x-=2){
            for (int j=1; j<= length-x;j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=(2*x -1);j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }}

package chapter4;

import java.util.Scanner;
public class DanglingElseProblem1 {
    public static void main(String[] args) {
        Scanner mojo =new Scanner(System.in);



        System.out.println("Kindly enter the value of x: ");
        int x = mojo.nextInt();
        System.out.println("Kindly enter the value of y: ");
        int y= mojo.nextInt();

        if(x > 5) {
            if (y > 5) {

                System.out.println("x and y are > 5");
            }
        }
             else{
                    System.out.println("x is <=5");

                }


    }
}

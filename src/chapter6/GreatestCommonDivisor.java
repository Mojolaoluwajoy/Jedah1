package chapter6;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int gcd(int a,int b){
        while (b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner mojo=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=mojo.nextInt();
        System.out.println("Enter the second number:");
        int num2=mojo.nextInt();

        System.out.println("The GCD of "+num1+" and "+num2+ " is "+gcd(num1,num2));
    }
}

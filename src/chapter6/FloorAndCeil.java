package chapter6;

import java.util.Scanner;

public class FloorAndCeil {
    public static int myFloor(double number){
        return (int)number;
    }
    public static int myCeil(double number){
        int ceil=(int)number;
        if (number==ceil){
            return ceil;
        }
        else {
            return ceil+1;
        }
    }

    public static void main(String[] args) {
        Scanner mojo =new Scanner(System.in);
        String option="";
        do {
            System.out.println("Enter the double number you'd like to check: ");
            double number =mojo.nextDouble();
            mojo.nextLine();
            System.out.println("Floor: " + myFloor(number));
            System.out.println("Ceil: " + myCeil(number));
            System.out.println("Do you have more numbers to check or you'd like to exit? ");
            option =mojo.nextLine();
        }
    while (!option.equalsIgnoreCase("Exit"));
    }
}

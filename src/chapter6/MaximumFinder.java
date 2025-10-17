package chapter6;
import java.util.Scanner;
public class MaximumFinder {
    public static void main(String[] args) {
        Scanner mojo =new Scanner(System.in);

        System.out.println(
                "Enter three floating-point values separated by spaces: ");
        double number1 =mojo.nextDouble();
        double number2 = mojo.nextDouble();
        double number3= mojo.nextDouble();

        double result = maximum(number1,number2,number3);

        System.out.println("maximunm is: " +result);
    }
    public static double maximum(double x, double y,double z){
        double maximumValue =x;

        if (y > maximumValue) {
            maximumValue =y;
        }
        if (z > maximumValue) {
            maximumValue =z;
        }
        return  maximumValue;
    }
}


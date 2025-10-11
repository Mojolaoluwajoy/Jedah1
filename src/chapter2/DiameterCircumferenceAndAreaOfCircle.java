package chapter2;

import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfCircle{
                                   public static void main(String[] args) {
                                   Scanner input = new Scanner(System.in);

                                   System.out.print("Enter the radius of the circle :");
                                   int radius =input.nextInt();

                                   System.out.printf("Diameter: %d%n", 2 * radius );
                                   System.out.printf("Circumference: %.2f%n", 2 * 3.14159 * radius);
                                   System.out.printf("Area: %.2f%n", 3.14159 * radius * radius);







}







}
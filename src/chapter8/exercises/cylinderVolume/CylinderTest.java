package chapter8.exercises.cylinderVolume;

import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double radius=0.0;
        double height=0.0;
        Cylinder cylinder = new Cylinder(radius, height);

        try {


            System.out.println("Kindly enter the radius first then height of the cylinder: ");
             radius = scanner.nextDouble();
            System.out.println();
             height = scanner.nextDouble();
cylinder.setRadius(radius);
cylinder.setHeight(height);
            System.out.println("The volume of a cylinder with " + radius + " radius and " + height + " height is: " +
                    "" + cylinder.cylinderVolume());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

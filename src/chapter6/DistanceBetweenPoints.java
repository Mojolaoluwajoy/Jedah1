package chapter6;
import java.util.Scanner;
public class DistanceBetweenPoints {
Scanner mojo=new Scanner(System.in);
private int userInput;
private int calculations;

    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    public void userInput() {
        System.out.println("Enter  x1 coordinates: ");
        x1 = mojo.nextInt();
        System.out.println("Enter x2 y coordinates: ");
        x2 = mojo.nextInt();


        System.out.println("Enter y1 coordinates: ");
        y1 = mojo.nextInt();
        System.out.println("Enter  y2 coordinates: ");
        y2 = mojo.nextInt();
    }


    public void calculations() {
        if (x1 == x2) {
            System.out.println("The points are on a line perpendicular to the x-axis.");
        }


        if (y1 == y2) {
            System.out.println("The points are on a line perpendicular to the y-axis.");

        } else if (x1 != x2 && y1 != y2) {
            System.out.println("The points are not on a line perpendicular to any axis!");

        }

    }
}


package CHAP4;
import  java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first x coordinate:");
        int x1 = scanner.nextInt();
        System.out.println("Enter the first y coordinate:");
        int y1 = scanner.nextInt();

        System.out.println("Enter the second x coordinate:");
        int x2 = scanner.nextInt();
        System.out.println("Enter the second y coordinate:");
        int y2 = scanner.nextInt();

        if(x1 == x2) {
            System.out.println("The points are on a line perpendicular to the x-axis.");
        }

        if(y1 == y2) {
            System.out.println("The points are on a line perpendicular to the y-axis.");
        }

        if(x1 != x2 && y1 != y2) {
            System.out.println("The points are not on a line perpendicular to any axis!");

        }



    }
}



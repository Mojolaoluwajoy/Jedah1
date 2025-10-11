package CHAP5;

import java.util.Scanner;

public class TrianglePrinting {
    public static void main(String[] args) {
        int x;
        int triangleBase = 10;

        for (x = 1; x <= triangleBase; x++) {
            int y;

            for (y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (x = 10; x >= 1; x--) {
            int y;

            for (y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (x = 10; x >= 1; x--) {
            int y;

            for (y=1; y<= triangleBase -x; y++) {
                System.out.print(" ");
            }
            for (y = 1; y <= x; y++) {

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();



            for (x = 1; x <= triangleBase; x++) {
            int y;

            for (y=1; y<= triangleBase -x; y++) {
                System.out.print(" ");
            }
            for (y = 1; y <= x; y++) {

                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();




    }
}

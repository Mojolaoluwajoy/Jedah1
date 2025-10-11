package chapter5;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner mojo = new Scanner(System.in);

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

        for (int counter = 1; counter <= 5; counter++) {
            System.out.print("Kindly enter student " + counter + "'s name: ");
            String name = mojo.nextLine();

            System.out.print("Enter student " + counter + "'s grade(A,B,C or D): ");
            char grade = mojo.next().charAt(0);
            mojo.nextLine();


           switch (grade) {

               case 'A':
               case 'a':
                   aCount++;
                   break;

               case 'B':
               case 'b':
                   bCount++;
                   break;

               case 'C':
               case 'c':
                   cCount++;
                   break;

               case 'D':
               case 'd':
                   dCount++;
                   break;

               default:
                   System.err.println("Invalid grade!!");
           }
        }

        System.out.println("A's: " +aCount);
        System.out.println("B's: " +bCount);
        System.out.println("C's: " +cCount);
        System.out.println("D's: " +dCount);

    }
}


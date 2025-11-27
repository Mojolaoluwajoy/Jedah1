package classworks;

import java.util.Scanner;

public class StudentGradeReport {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
        System.out.println("How many students are in the class?");
        int numberOfStudents=scanner.nextInt();
        System.out.println("How many number of terms would you like to record?");
        int numberOfTerms=scanner.nextInt();
        int[] [] studentGrades=new int[numberOfStudents][numberOfTerms];
        int studentTotal=0;

        for (int studentIndex=0;studentIndex<numberOfStudents;studentIndex++) {
            studentTotal =0;

            System.out.println("Recording grades for Student " + (studentIndex + 1));
            for (int termIndex = 0; termIndex < numberOfTerms; termIndex++) {
                System.out.printf("Enter grade %d for Student %d\n. ", (termIndex + 1), (studentIndex + 1));
              int grades = scanner.nextInt();
                studentTotal += grades;

                studentGrades[studentIndex][termIndex] = grades;
                 }
           // studentTotal += grades;

        }
        System.out.println("STUDENT GRADES REPORT!!!");
        for (int termIndex=0;termIndex<numberOfTerms;termIndex++){
            System.out.printf("%17s","GRADE"+(termIndex+1));
        }
      System.out.printf("%17s","TOTAL GRADE");
        System.out.printf("%17s","POSITION");
        System.out.println();

        int totalGradePerStudent=0;
        int termIndex;
        for (int studentIndex=0;studentIndex<numberOfStudents;studentIndex++){
            System.out.println("STUDENT "+(studentIndex+1));

            for ( termIndex=0;termIndex<numberOfTerms;termIndex++) {
                System.out.printf("%15d", studentGrades[studentIndex][termIndex]);
            }
            System.out.printf("%15d",studentTotal);
                System.out.println();
        }

    }
}

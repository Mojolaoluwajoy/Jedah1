package classworks;

import java.util.Scanner;

public class StudentsGradeReport {
  private static final Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
         System.out.println("How many students are in the class? ");
        int numberOfStudent=scanner.nextInt();
        System.out.println("How many number of terms would you like to record for?");
        int numberOfTerm=scanner.nextInt();
        printGrades(numberOfStudent,numberOfTerm);

    }
    public static int [] [] getGrades(int numberOfStudent,int numberOfTerm){
      int [] [] studentGrades=new int [numberOfStudent] [numberOfTerm];
        for (int studentIndex=0;studentIndex<numberOfStudent;studentIndex++){
            System.out.println("Recording Grades for Student "+(studentIndex+1));
            for (int termIndex=0;termIndex< numberOfTerm;termIndex++){
                System.out.printf("Enter grade %d for student %d\n. ",(termIndex+1),(studentIndex+1));
                int grade=scanner.nextInt();
                studentGrades[studentIndex][termIndex]=grade;
            }
        }
        return studentGrades;
    }
    public static void printGrades(int numberOfStudent,int numberOfTerm){
      int [][] studentGrades=  getGrades(numberOfStudent,numberOfTerm);
        System.out.println("STUDENT GRADES REPORT!!!");
        for (int termIndex=0;termIndex<numberOfTerm;termIndex++){
            System.out.printf("%18s","GRADE"+(termIndex+1));
        }
        System.out.printf("%17s","TOTAL GRADE");
        System.out.printf("%13s","RANK");
        System.out.printf("%15s","POSITION");
        System.out.println();

        System.out.println();
        int [] studentTotal=new int[numberOfStudent];
        for (int studentIndex=0;studentIndex<numberOfStudent;studentIndex++) {
            int total=0;
            System.out.print("STUDENT: "+(studentIndex+1));
            for (int termIndex=0;termIndex<numberOfTerm;termIndex++){
                System.out.printf("%11d",studentGrades[studentIndex][termIndex]);
                total+=studentGrades[studentIndex][termIndex];
            }
            studentTotal[studentIndex]=total;
            System.out.printf("%15d",studentTotal[studentIndex]);
             determineRank(total);
            determinePosition(numberOfStudent,studentTotal);
            System.out.println();
        }
    }
    public static void determineRank(int total){
        String grade;
        if (total>=90){
            grade="A";
        }
        else if (total>=80){
        grade="B";
    }
        else if (total>=70){
            grade="C";
        }else if (total>=60){
            grade="D";
        }
        else {
            grade="F";
        }
        System.out.printf("%16s",grade);
    }

public static void determinePosition(int numberOfStudent,int [] studentTotal){
    int position=0;

    for (int index1=0;index1<numberOfStudent;index1++){
         position=1;

        for (int index2=0;index2<numberOfStudent;index2++){
                if (index1!=index2&&studentTotal[index2] > studentTotal[index1]){
                  ++  position;
                }
            }
        }
    System.out.printf("%15d",position);


}

       }

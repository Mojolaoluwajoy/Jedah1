package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ReducingStudentFatigue {
    public static final SecureRandom secureRandom=new SecureRandom();
    public static Scanner mojo =new Scanner(System.in);
    private static int randomNumber1;
    private static int randomNumber2;
    public static void questionGeneration() {

        randomNumber1 = secureRandom.nextInt(10);
        randomNumber2 = secureRandom.nextInt(10);
    }
    public static void askQuestions(){

        System.out.println("How much is " + randomNumber1+ "*"+ randomNumber2+":?");
        int answer= mojo.nextInt();

        int correctAnswer=randomNumber1* randomNumber2;
        if (answer==correctAnswer){
           displayChatter(true);
             questionGeneration();
        }
        else {
           displayChatter(false);
            askQuestions();

        }
    }

    public static void main(String[] args) {
        int count =0;
        String option=" ";
        String sentinel="Yes";
        do {
            askQuestions();
            mojo.nextLine();
            count++;
            System.out.println("You've answered " + count + "questions so far.");
            System.out.println("Do you wish to move on to the next question : ");
            option = mojo.nextLine();
        }
        while (!option.equalsIgnoreCase("No")) ;


    }
    public static void displayChatter(boolean correct){
        SecureRandom random=new SecureRandom();
        int randomNumber=random.nextInt(4);

        if (correct){
            switch (randomNumber){
                case 0:
                    System.out.println("Very good!");
                    break;
                case 1:
                    System.out.println("Excellent!");
                    break;
                case 2:
                    System.out.println("Nice work!");
                    break;
                case 3:
                    System.out.println("Keep up the good work!");
            }
        }
        else {
            switch (randomNumber){
                case 0:
                    System.out.println("No.Please try again!");
                    break;
                case 1:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 2:
                    System.out.println("Don't give up now!");
                    break;
                case 3:
                    System.out.println("No.Keep trying");
            }

        }

    }
}

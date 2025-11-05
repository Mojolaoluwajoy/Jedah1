package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstructions {
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
                System.out.println("Very good!");
                questionGeneration();
            }
            else {
                System.out.println("No.Please try again!");

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
    }


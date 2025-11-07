package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class VaryingTheTypeOfProblems {
    private static final SecureRandom secureRandom = new SecureRandom();
    private static Scanner mojo = new Scanner(System.in);
    private static int randomNumber1;
    private static int randomNumber2;
    private static int level;
private static int operator;
    public static void levels() {
        while (true) {
            System.out.println("""
                    ================================
                        LEARNING MULTIPLICATION
                    ================================
                    1.Difficulty level 1
                    2.Difficulty level 2
                    3.Difficulty level 3
                    Pick a level:""");
            level = mojo.nextInt();
            if (level >= 1 && level <= 3) {
                break;
            } else {
                System.err.println("Incorrect option!Kindly enter an option from 1-3 ");
            }
        }
    }

    public static void generateQuestions() {
        switch (level) {
            case 1:
                randomNumber1 = secureRandom.nextInt(9);
                randomNumber2 = secureRandom.nextInt(9);
                break;
            case 2:
                randomNumber1 = 10 + secureRandom.nextInt(90);
                randomNumber2 = 10 + secureRandom.nextInt(90);
                break;
            case 3:
                randomNumber1 = 100 + secureRandom.nextInt(900);
                randomNumber2 = 100 + secureRandom.nextInt(900);
                break;
        }
    }
public static void arithmeticOperation(){
        while (true){
            System.out.println("""
                    Now that you've chosen a level,
                    proceed to picking the type of operation you'd like to perform.
                     1.Addition problems only.
                     2.Subtraction problems only.
                     3.Multiplication problems only.
                     4.Division problems only.
                     5.A mixture of all four problems.""");
            operator = mojo.nextInt();
            if (operator >= 1 && operator <= 5) {
                break;
            } else {
                System.err.println("Incorrect option!Kindly enter an option from 1-5 ");
            }

        }
}
    public static int askQuestions() {

        int score = 0;
        levels();
        generateQuestions();
        arithmeticOperation();
        for (int i = 1; i <= 10; i++) {
          if (operator==5){

              operator=1+secureRandom.nextInt(3);
          }
            if (operator ==1) {
                System.out.println("Question " + i + "." + "How much is " + randomNumber1 + "+" + randomNumber2 + ":?");
                int answer = mojo.nextInt();
                int correctAnswer = randomNumber1 + randomNumber2;
                if (answer == correctAnswer) {
                    displayChatter(true);
                    score++;
                } else {

                    System.out.print("Incorrect answer! ");
                    displayChatter(false);
                    System.out.println("The correct answer is: " + correctAnswer);
                }
            }
          else if (operator ==2) {
                System.out.println("Question " + i + "." + "How much is " + randomNumber1 + "-" + randomNumber2 + ":?");
                int answer = mojo.nextInt();
                int correctAnswer = randomNumber1 - randomNumber2;
                if (answer == correctAnswer) {
                    displayChatter(true);
                    score++;
                } else {

                    System.out.print("Incorrect answer! ");
                    displayChatter(false);
                    System.out.println("The correct answer is: " + correctAnswer);
                }
            }
            if (operator ==3) {
                System.out.println("Question " + i + "." + "How much is " + randomNumber1 + "*" + randomNumber2 + ":?");
                int answer = mojo.nextInt();
                int correctAnswer = randomNumber1 * randomNumber2;
                if (answer == correctAnswer) {
                    displayChatter(true);
                    score++;
                } else {

                    System.out.print("Incorrect answer! ");
                    displayChatter(false);
                    System.out.println("The correct answer is: " + correctAnswer);
                }
            }
           else if (operator ==4) {
                System.out.println("Question " + i + "." + "How much is " + randomNumber1 + "/" + randomNumber2 + ":?");
                int answer = mojo.nextInt();
                int correctAnswer = randomNumber1 / randomNumber2;
                if (answer == correctAnswer) {
                    displayChatter(true);
                    score++;
                } else {

                    System.out.print("Incorrect answer! ");
                    displayChatter(false);
                    System.out.println("The correct answer is: " + correctAnswer);
                }
            }


            generateQuestions();

        }
        return score;
    }

    public static void main(String[] args) {
        String option;

        do {
            int score = askQuestions();
            mojo.nextLine();
            System.out.println("Your total score is: " + score);
            double percentage = (double) score / 10 * 100;
            if (percentage >= 75) {
                System.out.println("Congratulations!You're ready to go to the next level.");
            } else if (percentage < 75) {
                System.out.println("You scored below 75%,Please ask your teacher for extra help.");
            }

            System.out.println("Would you like to quit or move on to the next set of questions for the next student?: ");
            option = mojo.nextLine();

        }
        while (!option.equalsIgnoreCase("Quit"));


    }

    public static void displayChatter(boolean correct) {
        SecureRandom random = new SecureRandom();
        int randomNumber = random.nextInt(4);

        if (correct) {
            switch (randomNumber) {
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
        } else {
            switch (randomNumber) {
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

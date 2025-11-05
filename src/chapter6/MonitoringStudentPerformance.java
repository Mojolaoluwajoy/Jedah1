package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class MonitoringStudentPerformance {
    public static final SecureRandom secureRandom=new SecureRandom();
    public static Scanner mojo =new Scanner(System.in);
    private static int randomNumber1;
    private static int randomNumber2;
    public static void questionGeneration() {

        randomNumber1 = secureRandom.nextInt(10);
        randomNumber2 = secureRandom.nextInt(10);
    }
    public static int askQuestions(){
int score=0;
for (int i=1;i<=10;i++){
        System.out.println("Question "+i+"."+"How much is " + randomNumber1+ "*"+ randomNumber2+":?");
        int answer= mojo.nextInt();

        int correctAnswer=randomNumber1* randomNumber2;
        if (answer==correctAnswer){
            displayChatter(true);
            score++;
        }
        else {

            System.out.print("Incorrect answer! ");
            displayChatter(false);
            System.out.println("The correct answer is: "+correctAnswer);
             }
    questionGeneration();

}
return score;
    }

    public static void main(String[] args) {
        int count =0;
        String option;

        do {
            int score=askQuestions();
            mojo.nextLine();
            System.out.println("Your total score is: "+score);
            double percentage=(double)score/10 *100;
             if (percentage >= 75){
                System.out.println("Congratulations!You're ready to go to the next level.");
            }
            else if (percentage < 75){
                System.out.println("You scored below 75%,Please ask your teacher for extra help.");
            }

            System.out.println("Would you like to quit or move on to the next set of questions for the next student?: ");
            option = mojo.nextLine();

        }
        while (!option.equalsIgnoreCase("Quit")) ;


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


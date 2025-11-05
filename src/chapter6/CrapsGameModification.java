package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsGameModification {
    private static final SecureRandom randomNumbers= new SecureRandom();
private static int bankBalance=1000;
public static int wager=0;
    public enum  status{ CONTINUE, WON,LOST};
    private static final int SNAKE_EYE=2;
    private static final int TREY=3;
    private static final int SEVEN=7;
    private static final int YO_ELEVEN=11;
    private static final int BOX_CARS=12;

    public static void main(String[] args) {
        Scanner mojo =new Scanner(System.in);
       getWager(mojo);
             int myPoint = 0;


        CrapsGameModification.status gameStatus;

        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN:
            case YO_ELEVEN:
                gameStatus =  CrapsGameModification.status.WON;
                break;

            case SNAKE_EYE:
            case TREY:
                gameStatus =  CrapsGameModification.status.LOST;
                break;

            default:
                gameStatus =  CrapsGameModification.status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("My point is: %d%n", myPoint);
                break;
        }

        while (gameStatus == CrapsGameModification.status.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint) {
                gameStatus =  CrapsGameModification.status.WON;
                } else {
                if (sumOfDice == SEVEN) {
                    gameStatus =  CrapsGameModification.status.LOST;
                }

            }
        }

        if (gameStatus ==  CrapsGameModification.status.WON) {
            System.out.println("Player wins");
            bankBalance +=wager;
            System.out.println("Your winning is: "+wager);
            System.out.println("Your new balance is: "+bankBalance);

        } else {
            System.out.println("Player lost");
            bankBalance-=wager;
            System.out.println("Your loss is: "+wager);

            System.out.println("Your new balance is: "+bankBalance);

               displayChatter();
        }
    }



    public static int rollDice() {
        int diel1 = 1 + randomNumbers.nextInt(6);
        int diel2 = 1 + randomNumbers.nextInt(6);

        int sum = diel1+diel2;
        System.out.printf("Player rolled %d + %d = %d%n",diel1,diel2,sum);

        return sum;

    }
    public static void displayChatter(){
        int random =randomNumbers.nextInt(5);
        String message="";
        switch (random){
            case 0:
                message ="oh,you're going for broke,huh?";
                break;

            case 1:
                message="Aw C'mon,take a chance!";
                break;

            case 2:
                message="You're up big.Now's the time to cash in your chips!";
                break;

            case 3:
                message="Dont get too confident,the dice can turn on you!";
                break;

             default:
                message="Keep playing,you're on a roll!";
        }
        if (bankBalance >=1000 && bankBalance <=1500){
            System.out.println("You are still so close to your original bank balance! "+message);
        }
       else if (bankBalance>1500 ){
            System.out.println("You're doing great ! "+message);
        }
        else if(bankBalance<500){
            System.out.println("You're running low. "+message);
        }
        else {
            System.out.println(message);
        }

    }
    public static int getWager(Scanner mojo) {
        while (true) {
            System.out.println("Enter your wager: ");
            wager = mojo.nextInt();
            if (wager <= bankBalance) {
                break;
            } else {
                System.err.println("Invalid wager! Your wager cannot exceed the bank balance...");
            }

        }
        return wager;
    }
}

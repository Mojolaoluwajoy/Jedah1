package chapter6;

import java.security.SecureRandom;

public class Craps {
    private static final SecureRandom randomNumbers= new SecureRandom();

    private enum status{CONTINUE,WON,LOST};

    private static final int SNAKE_EYE=2;
    private static final int TREY=3;
    private static final int SEVEN=7;
    private static final int YO_ELEVEN=11;
    private static final int BOX_CARS=12;

public static void main(String[] args) {
    int myPoint = 0;
    status gameStatus;

    int sumOfDice = rollDice();

    switch (sumOfDice) {
        case SEVEN:
        case YO_ELEVEN:
            gameStatus = status.WON;
            break;

        case SNAKE_EYE:
        case TREY:
            gameStatus = status.LOST;
            break;

        default:
            gameStatus = status.CONTINUE;
            myPoint = sumOfDice;
            System.out.printf("My point is: %d%n", myPoint);
            break;
    }
        while (gameStatus == status.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint) {
                gameStatus = status.WON;
            } else {
                if (sumOfDice == SEVEN) {
                    gameStatus = status.LOST;

                }

            }
        }

        if (gameStatus == status.WON) {
            System.out.println("Player wins");
        } else {
            System.out.println("Player lost");
        }
    }



public static int rollDice() {
    int diel1 = 1 + randomNumbers.nextInt(6);
    int diel2 = 1 + randomNumbers.nextInt(6);

    int sum = diel1+diel2;
    System.out.printf("Player rolled %d + %d = %d%n",diel1,diel2,sum);

    return sum;

}
}

package chapter6;
import java.security.SecureRandom;
import java.util.Scanner;
public class GuessTheNumberModification {
    public static void main(String[] args) {

        SecureRandom random =new SecureRandom();
        boolean playAgain =true;
        Scanner mojo=new Scanner(System.in);

        while (playAgain) {
      int guessesOptions= 1+ random.nextInt(100);
      int attemptsMade=0;

            System.out.println("Guess a number between 1 and 1,000");

            while (true) {
                System.out.println("Enter your guess: ");
                int guess = mojo.nextInt();
                attemptsMade++;
                mojo.nextLine();

                if (guess == guessesOptions && attemptsMade <= 10) {
                    System.out.println("""
                            Aha!You know the secret!
                            you guessed right on """ + attemptsMade + " attempts.");
                    break;
                } else if (guess == guessesOptions && attemptsMade > 10) {
                    System.out.println("""
                            You should be able to do better!!
                            you guessed right on """ + attemptsMade + " attempts.");
                    break;

                } else if (guess < guessesOptions) {
                    System.out.println("Too low..try again.");

                } else if (guess > guessesOptions) {

                    System.out.println("Too high…try again.");
                }
            }
                System.out.println("Do you want to play again?(Yes /No): ");
                String response= mojo.nextLine();
                playAgain= response.equalsIgnoreCase("yes");
        }
    }
}

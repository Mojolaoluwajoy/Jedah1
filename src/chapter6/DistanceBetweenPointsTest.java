package chapter6;
import java.util.Scanner;
public class DistanceBetweenPointsTest {
    public static void main(String[] args) {
        DistanceBetweenPoints distance = new DistanceBetweenPoints();
        int sentinelValue = -5;
        int quitValue = 0;
        Scanner mojo = new Scanner(System.in);

        while (sentinelValue != quitValue) {

            distance.userInput();
            distance.calculations();

            System.out.println("Would you like to enter more coordinates to check? or you would like to quit: ");
            quitValue = mojo.nextInt();

        }
    }
}

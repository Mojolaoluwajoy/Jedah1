package classWorks.multiplicationGameWithArray;

import java.util.Scanner;

public class MultiplicationGameTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Multiplication game=new Multiplication();

        game.playGame(scanner);
    }
}

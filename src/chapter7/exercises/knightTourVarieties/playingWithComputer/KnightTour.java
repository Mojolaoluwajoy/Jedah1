package chapter7.exercises.knightTourVarieties.playingWithComputer;

import java.util.Scanner;

public class KnightTour {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ChessBoard.displayIntroMessage();
        ChessBoard.registerPlayers(scanner);
        System.out.println();
        ChessBoard.gameStartCall();
       System.out.println();
        ChessBoard.playGame(scanner);
    }
}

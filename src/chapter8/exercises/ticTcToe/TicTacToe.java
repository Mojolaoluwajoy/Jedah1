package chapter8.exercises.ticTcToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PlayBoard playBoard=new PlayBoard();
        playBoard.playGame(scanner);
    }
}

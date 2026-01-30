package chapter8.ticTcToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PlayBoard playBoard=new PlayBoard();
        playBoard.playGame(scanner);
    }
}

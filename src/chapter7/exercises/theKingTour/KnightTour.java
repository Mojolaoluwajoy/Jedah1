package chapter7.exercises.theKingTour;

import java.util.Scanner;

public class KnightTour {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
         for (int currentPlayer=0;currentPlayer<2;currentPlayer++){
            System.out.println("Enter player "+(currentPlayer+1)+ " name");
            Chessboard.registerPlayer(currentPlayer,scanner.nextLine());
        }
        Chessboard.setDefaultPlayerPosition();
     //   Chessboard.displayBoard();

        do {
            try {
                Chessboard.play(scanner);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        while (Chessboard.isGameInProgress());

    }
}



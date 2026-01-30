package chapter7.exercises.knightTourVarieties.knightTourSinglePlayer;

import java.util.Scanner;

public class ChessBoard {
    private static final String[][] chessBoard = new String[8][8];
    private static String currentPlayer;
    private static int[][] possibleMoves = new int[8][2];
    int moveIndex = 0;
    private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static Player[] players = new Player[1];
static boolean isWon=false;
    public static void displayIntroMessage() {
        System.out.println("""
                               ===============================
                                 THE KNIGHTS TOUR TOURNAMENT
                               ===============================
                Welcome to THE knight tour game...
                
             
                The first phase of the game is players registration,
                a way to that will be displayed on the screen shortly.
                """);

        sleep();
    }

        public static void setPlayer(int currentPlayer, String name) {
               players[currentPlayer]=new Player(name,"K1");


        }
        public static void registerPlayers(Scanner scanner){
            for (int currentPlayer=0;currentPlayer<players.length;currentPlayer++){
                System.out.println();
                System.out.println("Enter player's name");
                setPlayer(currentPlayer,scanner.nextLine());

                System.out.println("Player has been successfully registered");
                System.out.printf("%s is now registered with the player symbol %s%n ",players[currentPlayer].getName(),players[currentPlayer].getSymbol());

            }
        }



    public static int [][] getPossibleMoves(int row,int column){
        int[][] possibleMoves=new int[8][2];
        int validMovesCount=0;

        for (int index=0;index<chessBoard.length;index++) {
            int newColumn = column + horizontal[index];
            int newRow = row + vertical[index];
            if (newRow >= 0 && newRow < chessBoard.length && newColumn >= 0 && newColumn < chessBoard.length) {
                possibleMoves[validMovesCount][0] = newColumn;
                possibleMoves[validMovesCount][1] = newRow;
                validMovesCount++;
            }
        }


        int [][] validMoves=new int[validMovesCount][2];
        for (int index=0;index<validMovesCount;index++){
        validMoves[index][0]=possibleMoves[index][0];
        validMoves[index][1]=possibleMoves[index][1];

        }
         return validMoves;
    }
public static void playGame(Scanner scanner){
        Player currentPlayer=players[0];
       for (int roundIndex=1;roundIndex<11;roundIndex++) {
           System.out.println("             ROUND " + roundIndex);
           System.out.println();

           for (int eachRound = 0; eachRound < players.length; eachRound++) {

               int row = currentPlayer.getCurrentRowPosition();
               int column = currentPlayer.getCurrentColumnPosition();
               int[][] validMoves = getPossibleMoves(row, column);
               showBoardWithValidMoves(validMoves);
               System.out.println(currentPlayer.getName() + ",make your move");
               int playerMoveIndex = scanner.nextInt();

               int newRow = validMoves[playerMoveIndex][1];
               int newColumn = validMoves[playerMoveIndex][0];
               updateBoard(currentPlayer, newRow, newColumn);


           }
       }}


public static void showBoardWithValidMoves(int[][] validMoves) {
    for (int rowIndex = 0; rowIndex < chessBoard.length; rowIndex++) {
        System.out.print("[");
        for (int columnIndex = 0; columnIndex < 8; columnIndex++) {
            Player playerAtPosition = getPlayerPosition(rowIndex, columnIndex);
            if (playerAtPosition != null) {
                System.out.print(playerAtPosition.getSymbol()+",");
            } else {
                boolean isValidMove = false;
                for (int index = 0; index < validMoves.length; index++) {
                    if (validMoves[index][0] == columnIndex && validMoves[index][1] == rowIndex) {
                        System.out.print(index+" ,");
                        isValidMove = true;
                        break;
                    }
                }
                if (!isValidMove) {
                    System.out.print(" , ");
                }
            }
        }
        System.out.print("]");

    System.out.println();
    }
}
public static Player getPlayerPosition(int row, int column){
        for (Player player: players){
            if (player.getCurrentRowPosition()==row&&player.getCurrentColumnPosition()==column){
                return player;
            }
        }
        return null;
}

public static void updateBoard(Player player, int newRow, int newColumn){
        int oldRow=player.getCurrentRowPosition();
        int oldColumn=player.getCurrentColumnPosition();
        chessBoard[oldRow][oldColumn]=",";
        chessBoard[newRow][newColumn]=player.getSymbol();
        player.setCurrentRowPosition((newRow));
        player.setCurrentColumnPosition(newColumn);
}
    public static void gameStartCall(){

        print("Game begins in ");
        load();
        System.out.println();
        print("1");
        load();
        System.out.println();
        print("2");
        load();
        System.out.println();
       print("START!!!");
        System.out.println();
    }
    public static void print(String message){
        System.out.print(message);
    }
    public static void load(){
        for (int count=0;count<3;count++){
            System.out.print(".");
            sleep();
        }
    }
    public static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
    }}
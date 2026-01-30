package chapter7.exercises.knightTourVarieties.playingWithComputer;

import java.security.SecureRandom;
import java.util.Scanner;

public class ChessBoard {
    private static final String[][] chessBoard = new String[8][8];
    private static String currentPlayer;
    private static int[][] possibleMoves = new int[8][2];
    int moveIndex = 0;
    private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static Player[] players = new Player[2];
static boolean isValidCapture=false;

static SecureRandom random=new SecureRandom();

    public static void displayIntroMessage() {
        System.out.println("""
                               ===============================
                                 THE KNIGHTS TOUR TOURNAMENT
                               ===============================
                Welcome to THE knight tour game...
                
                To determine a winner,a player in a cell must 
                move to a cell where the other player can move to.   
                         
                The first phase of the game is players registration,
                a way to that will be displayed on the screen shortly.
                """);

        sleep();
    }

        public static void setPlayer(int currentPlayer, String name) {
            if (currentPlayer==0){
               players[currentPlayer]=new Player(name,"K1");
            }    else {
                players[currentPlayer]=new Player(name,"K2");
            }


        }
        public static void registerPlayers(Scanner scanner){
                System.out.println();
                System.out.println("Enter player's name ");
                setPlayer(0,scanner.nextLine());

                System.out.println("Player has been successfully registered");
                System.out.printf("%s is now registered with the player symbol %s%n ",players[0].getName(),players[0].getSymbol());
            System.out.println();
            setPlayer(1,"Computer");

            System.out.printf("The %s is now registered with the player symbol %s%n ",players[1].getName(),players[1].getSymbol());
            System.out.println();
        }



    public static int [][] getPossibleMoves(int row,int column,int opponentRow,int opponentColumn){
        int[][] possibleMoves=new int[8][2];
        int validMovesCount=0;

        for (int index=0;index<chessBoard.length;index++) {
            int newColumn = column + horizontal[index];
            int newRow = row + vertical[index];
            String currentPlayerSymbol=players[0].getSymbol();
            if (newRow >= 0 && newRow < chessBoard.length && newColumn >= 0 && newColumn < chessBoard.length) {
          if (chessBoard[newRow][newColumn]==null || !chessBoard[newRow][newColumn].equals((currentPlayerSymbol)))  {

                possibleMoves[validMovesCount][0] = newColumn;
                possibleMoves[validMovesCount][1] = newRow;
                validMovesCount++;
                  }
        }}


        int [][] validMoves=new int[validMovesCount][2];
        for (int index=0;index<validMovesCount;index++){
        validMoves[index][0]=possibleMoves[index][0];
        validMoves[index][1]=possibleMoves[index][1];

        }
         return validMoves;
    }
public static void playGame(Scanner scanner){
        Player currentPlayer=players[0];
boolean winnerFound=false;
int roundIndex=1;
    int playerMoveIndex=0;
       while(true){
           System.out.println("             ROUND " + roundIndex);
            System.out.println();

            for (int eachRound=0;eachRound<players.length;eachRound++) {

                int row = currentPlayer.getCurrentRowPosition();
                int column = currentPlayer.getCurrentColumnPosition();
               Player opponent=players[1-eachRound];
                int[][] validMoves = getPossibleMoves(row, column,opponent.getCurrentRowPosition(),opponent.getCurrentColumnPosition());
                showBoardWithValidMoves(validMoves,currentPlayer,roundIndex);
                if (currentPlayer==players[1]){
                    playerMoveIndex=random.nextInt(0,validMoves.length);
                    System.out.println("The computer is playing..");
                    System.out.println("The computer made move "+playerMoveIndex);
                }else {

                    System.out.println(currentPlayer.getName() + ",it's your turn to play,make your move");
                     playerMoveIndex = scanner.nextInt();
                }
                int newRow = validMoves[playerMoveIndex][1];
                int newColumn = validMoves[playerMoveIndex][0];
                updateBoard(currentPlayer, newRow, newColumn);
                if (gameIsWon()) {
                    System.out.println("CHOPPED!!!");
                    System.out.println("We have a winner on "+roundIndex+"!!!Drum rolls please!!!");
                    System.out.println("And the winner of the game is "+currentPlayer.getName()+" with the player Symbol "+currentPlayer.getSymbol());
                     break;
                }
                currentPlayer = (currentPlayer == players[0] ? players[1] : players[0]);

            }
            roundIndex++;
if (gameIsWon()){
    break;
}


    }}
public static void showBoardWithValidMoves(int[][] validMoves, Player player, int roundIndex) {
        boolean isValidMove=false;
    Player opponent=(player==players[0])? players[1]:players[0];
int trimmedValidMoved;
    for (int rowIndex = 0; rowIndex < chessBoard.length; rowIndex++) {
        System.out.print("[");
        for (int columnIndex = 0; columnIndex < 8; columnIndex++) {
            Player playerAtPosition = getPlayerPosition(rowIndex, columnIndex);
            if (playerAtPosition != null) {
                isValidCapture=false;

                for (int index = 0; index < validMoves.length; index++) {
                    if (roundIndex != 1) {
                        if (validMoves[index][0] == rowIndex && validMoves[index][1] == columnIndex) {
                            System.out.print(playerAtPosition.getSymbol() +index+ " ,");
                            isValidCapture = true;

                            break;
                        }
                    }
                }
                if (!isValidCapture) {
                    System.out.print(playerAtPosition.getSymbol() + ",");

                }
                }

            else{
                isValidMove=false;
                for (int index = 0; index < validMoves.length; index++) {
                    if (validMoves[index][0] == columnIndex && validMoves[index][1] == rowIndex ) {
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
    for ( Player player:players){
        if (player.getCurrentRowPosition()==row&&player.getCurrentColumnPosition()==column){
            return player;
        }
    }
    return null;
}

public static boolean gameIsWon(){
   if (isValidCapture){
      return true;   }
   return false;
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
        System.out.println();
        print("1.");
        System.out.println();
        print("2..");
        System.out.println();
        System.out.println("MAY THE BEST MAN/WOMAN WIN!");
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
    public static void sleep(){
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
    }
}
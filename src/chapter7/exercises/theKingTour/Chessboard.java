package chapter7.exercises.theKingTour;

import java.util.Scanner;

public class Chessboard {
    public static final String[][] board = new String[8][8];
    private static int moveCount = 0;
    private static String currentPlayer;
    public static  int[][] possibleMoves=new int[8][2];
    public static Player[] players=new Player[2];

    public static void displayMenu() {
        System.out.println("""
                =======================
                   THE KNIGHTS TOUR
                ========================
                Welcome to THE knight tour game...""");
    }

    public static void registerPlayer(int currentPlayer, String name) {
        if (currentPlayer==0){
            players[currentPlayer]=new Player(name,"K1");
        }    else {
            players[currentPlayer]=new  Player(name,"K2");
        }

    }

    public static void setDefaultPlayerPosition() {
        board[0][4] = players[0].getSymbol();
        board[7][5] =players[1].getSymbol();
    }

    public static void displayBoard(){
        for (int rowIndex=0;rowIndex<board.length;rowIndex++) {
            System.out.print("[ ");
            for (int columnIndex = 0; columnIndex < 8; columnIndex++) {
                boolean isMove = false;
                for (int currentPlayerMoveIndex = 0; currentPlayerMoveIndex < possibleMoves.length; currentPlayerMoveIndex++) {
                    if (possibleMoves[currentPlayerMoveIndex][0]==rowIndex && possibleMoves[currentPlayerMoveIndex][1]==columnIndex) {
                        System.out.print((currentPlayerMoveIndex + 1) + " ");
                        isMove = true;
                        break;
                    }
                }
                if (!isMove) {
                    if (board[rowIndex][columnIndex] == null) {
                        System.out.print("  ,");
                    } else {
                        System.out.print(board[rowIndex][columnIndex] + " ");
                    }
                }
            }
            System.out.print(" ]");
            System.out.println();
        }
    }
    public static String getCurrentPlayerName() {
        // for (int currentPlayerIndex = 0; currentPlayerIndex < playersSymbols.length; currentPlayerIndex++)
        currentPlayer = players[0].getName();//[currentPlayerIndex];
        return currentPlayer;
    }

    public static void play(Scanner scanner){
        int moveNumber=0;
        int currentPlayerIndex=0;
        while (true) {
            int[][] possibleMoves = getPossibleMoves(players[currentPlayerIndex].getSymbol());
            displayBoard();
            System.out.println(players[currentPlayerIndex].getName() + ",it's your turn to make a move. ");
            moveNumber = scanner.nextInt();
            // if (moveNumber>0 &&moveNumber<=possibleMoves.length){
            int newRow = possibleMoves[moveNumber - 1][0];
            int newColumn = possibleMoves[moveNumber - 1][1];
            board[newRow][newColumn] = players[currentPlayerIndex].getSymbol();
            GameStatus result = status();
            if (result == GameStatus.WON) {
                displayBoard();
                System.out.println(players[currentPlayerIndex] + "wins!!!");
                break;
            }
            currentPlayerIndex = (currentPlayerIndex = 1) % players.length;
        }
    }
    public static  GameStatus status(){
        int moveCount=0;
        for (int rowIndex=0;rowIndex<board.length;rowIndex++){
            for (int columnIndex=0;columnIndex<8;columnIndex++){
                if (board[rowIndex][columnIndex]!=null) {
                    moveCount++;
                }
            }
        }
        if (moveCount==64){
            return GameStatus.WON;
        }else {
            return GameStatus.IN_PROGRESS;
        }}
    public static boolean isGameInProgress(){
        return status()==GameStatus.IN_PROGRESS;
    }
    public static int[][] getPossibleMoves(String currentPlayer) {
        int[] currentPosition = getCurrentPosition();

        // if (currentPosition == null) {
        //     return possibleMoves=board[0][1];
        //  }//   int moveIndex=0;

        // for (int rowIndex=0;rowIndex<board.length;rowIndex++){
        //  for (int columnIndex=0;columnIndex<8;columnIndex++){
        // possibleMoves[moveIndex][0]=rowIndex;
        // possibleMoves[moveIndex][1]=columnIndex;
        //    moveIndex++;
        //  }
        //}
        //return possibleMoves;
        //  }else {
        int[][] possibleMoves = new int[8][2];
        int moveIndex = 0;
        int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

        for (int verticalMovesIndex = 0; verticalMovesIndex < vertical.length; verticalMovesIndex++) {
            int newRow = currentPosition[0] + vertical[verticalMovesIndex];
            int newColumn = currentPosition[1] + horizontal[verticalMovesIndex];
            if (isValidPosition(newRow, newColumn)) {
                possibleMoves[moveIndex][0] = newRow;
                possibleMoves[moveIndex][1] = newColumn;


                moveIndex++;

            }
        }
        int[][] validMoves = new int[moveIndex][2];
        for (int possibleMovesIndex = 0; possibleMovesIndex < moveIndex; possibleMovesIndex++) {
            validMoves[possibleMovesIndex][0] = possibleMoves[possibleMovesIndex][0];
            validMoves[possibleMovesIndex][1] = possibleMoves[possibleMovesIndex][1];

        }

        return validMoves;
    }

    public static int[] getCurrentPosition(){
        for (int rowIndex=0;rowIndex<board.length;rowIndex++){
            for (int columnIndex=0;columnIndex<8;columnIndex++){
                if (board[rowIndex][columnIndex]!=null&&board[rowIndex][columnIndex].equalsIgnoreCase(players[rowIndex].getSymbol())){
                    return new int[] {rowIndex,columnIndex};

                }
            }

        }return null;

    }
    public static boolean isValidPosition(int row,int column){
        try{
            return board[row][column]!=null;
        }catch (ArrayIndexOutOfBoundsException e){
            return false;
        }

    }


}
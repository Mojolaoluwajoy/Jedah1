package chapter8.exercises.ticTcToe;

import java.util.Scanner;

public class PlayBoard {
    private String[][] gameBoard = new String[3][3];
    Players[] players = new Players[2];
    private int[][] possibleMove = new int[9][2];

    public PlayBoard() {
        for (int rowindex = 0; rowindex < gameBoard.length; rowindex++) {
            for (int columnIndex = 0; columnIndex < gameBoard[rowindex].length; columnIndex++) {
                gameBoard[rowindex][columnIndex] = Constants.EMPTY.toString();
            }
        }
    }

    public void introMessage() {
        System.out.println("""
                       =======================
                           TIC-TAC-TOE
                       ======================
                This is a game of strategy and wits!!!!
                Be the first to place your symbol on
                three straight cells across the board
                and you'll emerge the winner!
                
                Now,UNTO the registration phase!!""");
    }

    public void setPlayers(int currentPlayer, String name) {
        if (currentPlayer == 0) {
            players[currentPlayer] = new Players(name, Constants.X.toString());
        } else {
            players[currentPlayer] = new Players(name, Constants.O.toString());
        }
    }

     public void printGameBoard() {
        for (int rowIndex = 0; rowIndex < gameBoard.length; rowIndex++) {
            System.out.println();
            for (int columnIndex = 0; columnIndex < gameBoard[rowIndex].length; columnIndex++) {
                System.out.print(gameBoard[rowIndex][columnIndex] + "|");

            }

        }

    }

    public void registerPlayers(Scanner scanner) {
        for (int currentPlayer = 0; currentPlayer < players.length; currentPlayer++) {
            System.out.println();
            System.out.println("Kindly enter player " + (currentPlayer + 1) + " name");
            setPlayers(currentPlayer, scanner.nextLine());
            System.out.println((currentPlayer == 0 ? "First" : "Second") + " player successfully registered");
            System.out.println(players[currentPlayer].getPlayerName() + " will now be playing as " + players[currentPlayer].getSymbol());
        }
    }

    public int[][] getPossibleMove() {
        int index = 0;
        for (int rowIndex = 0; rowIndex < gameBoard.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < gameBoard[rowIndex].length; columnIndex++) {
                possibleMove[index][0] = rowIndex;
                possibleMove[index][1] = columnIndex;
                index++;
            }
        }
         return possibleMove;
    }

    public void playGame(Scanner scanner) {
        introMessage();
        registerPlayers(scanner);
int player1Score=0;
int player2Score=0;
        possibleMove = getPossibleMove();
        Players currentPlayer = players[0];
        for (int roundIndex = 1; roundIndex <= 10; roundIndex++) {

          boolean winnerFound=false;
            boolean draw=false;
           System.out.println("""
                                    ================
                                        ROUND """+roundIndex);
            System.out.println(    "================  ");

            for (int rowindex = 0; rowindex < gameBoard.length; rowindex++) {
                for (int columnIndex = 0; columnIndex < gameBoard[rowindex].length; columnIndex++) {
                    gameBoard[rowindex][columnIndex] = Constants.EMPTY.toString();
                }
            }
        while (!winnerFound && !draw) {
                boolean cellSecured;
                printGameBoard();
                System.out.println();
                System.out.println(currentPlayer.getPlayerName() + " make your move");
                int move = scanner.nextInt();
                int newRow = possibleMove[move][1];
                int newColumn = possibleMove[move][0];

                if (move < possibleMove.length && gameBoard[newRow][newColumn].equals(Constants.EMPTY.toString())) {
                    gameBoard[newRow][newColumn] = "  "+currentPlayer.getSymbol()+"  ";
                    cellSecured = true;

                } else {
                    System.err.println("""
                            The move you made is either off the board or 
                            you're trying to move where you or your opponent 
                            is currently occupying!!""");
                    cellSecured = false;
                }

            if (gameIsWon()) {
                printGameBoard();
                System.out.println();
                System.out.println( currentPlayer.getPlayerName()+" won round"+roundIndex);
                if (currentPlayer==players[0]){
                     player1Score +=1;
                }
                else if (currentPlayer==players[1]){
                    player2Score+=1;
                }
                System.out.println();
                System.out.println("""
                             ================
                              SCORE BOARD
                             ================""");
                System.out.printf("%5s%10s%n%5d%8d%n",players[0].getPlayerName(),players[1].getPlayerName(),player1Score,player2Score);
delay();
               space();
               winnerFound=true;
            }
                if (isDraw()){
                    printGameBoard();
                    System.out.println();
                    System.out.println("""
                            No possible moves left!
                            This round is draw and
                            the scores remains;""");
                    System.out.println();
                        System.out.println("""
                             ================
                               SCORE BOARD
                             ================""");
                System.out.printf("%5s%10s%n%5d%8d%n",players[0].getPlayerName(),players[1].getPlayerName(),player1Score,player2Score);
delay();
space();
                    draw=true;
                }
                if (cellSecured) {
                    currentPlayer = (currentPlayer == players[0]) ? players[1] : players[0];
                }
            }
        }
        if (player2Score==player1Score){
            System.out.println("""
       Ten rounds has been completed and no winner was made!!
        The game is declared DRAW!!!""");
        }else if (player1Score>player2Score){
            System.out.println("Ten rounds has been completed and "+players[0].getPlayerName()+" is the winner!");

        }else if (player2Score>player1Score){
            System.out.println("Ten rounds has been completed and "+players[1].getPlayerName()+" is the winner!");

        }
    }
    public boolean gameIsWon() {
        if (gameBoard[0][0].equals("  "+players[0].getSymbol()+"  ")  && gameBoard[0][1].equals("  "+players[0].getSymbol()+"  ")  && gameBoard[0][2].equals("  "+players[0].getSymbol()+"  ")){
        return true;
    }
        if ( gameBoard[0][0].equals("  "+players[1].getSymbol()+"  ") && gameBoard[0][1].equals("  "+players[1].getSymbol()+"  ") &&  gameBoard[0][2].equals("  "+players[1].getSymbol()+"  ")){
            return true;
        }


        if (gameBoard[1][0].equals("  "+players[0].getSymbol()+"  ")  && gameBoard[1][1].equals("  "+players[0].getSymbol()+"  ")  && gameBoard[1][2].equals("  "+players[0].getSymbol()+"  ")){
        return true;
    }
        if ( gameBoard[1][0].equals("  "+players[1].getSymbol()+"  ") && gameBoard[1][1].equals("  "+players[1].getSymbol()+"  ") &&  gameBoard[1][2].equals("  "+players[1].getSymbol()+"  ")){
            return true;
        }


        if (gameBoard[2][0].equals("  "+players[0].getSymbol()+"  ")  && gameBoard[2][1].equals("  "+players[0].getSymbol()+"  ")  && gameBoard[2][2].equals("  "+players[0].getSymbol()+"  ")){
        return true;
    }
        if ( gameBoard[2][0].equals("  "+players[1].getSymbol()+"  ") && gameBoard[2][1].equals("  "+players[1].getSymbol()+"  ") &&  gameBoard[2][2].equals("  "+players[1].getSymbol()+"  ")){
            return  true;
        }


        if (gameBoard[0][0].equals("  "+players[0].getSymbol()+"  ")  && gameBoard[1][0].equals("  "+players[0].getSymbol()+"  ")  && gameBoard[2][0].equals("  "+players[0].getSymbol()+"  ")){
        return true;

    }
        if ( gameBoard[0][0].equals("  "+players[1].getSymbol()+"  ") && gameBoard[1][0].equals("  "+players[1].getSymbol()+"  ") &&  gameBoard[2][0].equals("  "+players[1].getSymbol()+"  ")){
            return true;
        }
        if (gameBoard[0][1].equals("  "+players[0].getSymbol()+"  ")  && gameBoard[1][1].equals("  "+players[0].getSymbol()+"  ")  && gameBoard[2][1].equals("  "+players[0].getSymbol()+"  ")){
        return true;
    }
        if ( gameBoard[0][1].equals("  "+players[1].getSymbol()+"  ") && gameBoard[1][1].equals("  "+players[1].getSymbol()+"  ") &&  gameBoard[2][1].equals("  "+players[1].getSymbol()+"  ")){
            return true;
        }


        if (gameBoard[0][2].equals("  "+players[0].getSymbol()+"  ")  && gameBoard[1][2].equals("  "+players[0].getSymbol()+"  ")  && gameBoard[2][2].equals("  "+players[0].getSymbol()+"  ")){
        return true;
    }
        if ( gameBoard[0][2].equals("  "+players[1].getSymbol()+"  ") && gameBoard[1][2].equals("  "+players[1].getSymbol()+"  ") &&  gameBoard[2][2].equals("  "+players[1].getSymbol()+"  ")){
            return true;
        }


        if (gameBoard[0][0].equals("  "+players[0].getSymbol()+"  ")  && gameBoard[1][1].equals("  "+players[0].getSymbol()+"  ")  && gameBoard[2][2].equals("  "+players[0].getSymbol()+"  ")){
        return  true;
    }
        if ( gameBoard[0][0].equals("  "+players[1].getSymbol()+"  ") && gameBoard[1][1].equals("  "+players[1].getSymbol()+"  ") &&  gameBoard[2][2].equals("  "+players[1].getSymbol()+"  ")){
            return true;
        }


        if (gameBoard[0][2].equals("  "+players[0].getSymbol()+"  ")  && gameBoard[1][1].equals("  "+players[0].getSymbol()+"  ")  && gameBoard[2][0].equals("  "+players[0].getSymbol()+"  ")){
        return true;
    }
        if ( gameBoard[0][2].equals("  "+players[1].getSymbol()+"  ") && gameBoard[1][1].equals("  "+players[1].getSymbol()+"  ") &&  gameBoard[2][0].equals("  "+players[1].getSymbol()+"  ")){
            return true;
        }
    return false;
    }
    public boolean isDraw(){
        int counter=0;
       for (int rowIndex=0;rowIndex< gameBoard.length;rowIndex++){
           for (int columnIndex=0;columnIndex<gameBoard[rowIndex].length;columnIndex++){
               if (!gameBoard[rowIndex][columnIndex].equals(Constants.EMPTY.toString())){
                  counter++;
                   }
           }
       }
       if (counter==9){
           return true;
       }
       return false;
    }
    public void delay(){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){

        }
    }
public void space(){
    System.out.println("""
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            """);
}
}

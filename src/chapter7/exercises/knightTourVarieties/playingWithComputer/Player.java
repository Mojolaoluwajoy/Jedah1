package chapter7.exercises.knightTourVarieties.playingWithComputer;

public class Player {
    private String name;
    private String symbol;
    private int numbersOfPlayers;
    private int currentRowPosition;
    private int currentColumnPosition;
   public Player(String name,String symbol){
        this.name=name;
        this.symbol=symbol;
       }
    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setNumbersOfPlayers(int numbersOfPlayers) {
        this.numbersOfPlayers = numbersOfPlayers;
    }

    public int getNumbersOfPlayers() {
        return numbersOfPlayers;
    }

    public void setCurrentRowPosition(int currentRowPosition) {
        this.currentRowPosition = currentRowPosition;
    }

    public int getCurrentRowPosition() {
        return currentRowPosition;
    }

    public void setCurrentColumnPosition(int currentColumnPosition) {
        this.currentColumnPosition = currentColumnPosition;
    }

    public int getCurrentColumnPosition() {
        return currentColumnPosition;
    }
}


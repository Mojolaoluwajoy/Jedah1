package chapter7.exercises.theKingTour;

public class Player {
    private String name;
    private GameStatus status;
    private int currentRowPosition;
    private int currentColumnPosition;
    private String symbol;
    public Player(String name,String symbol){
        this.name=name;
        this.symbol=symbol;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setCurrentRowPosition(int currentRowPosition){
        this.currentRowPosition=currentRowPosition;
    }
    public int getCurrentRowPosition(){
        return currentRowPosition;
    }
    public void setCurrentColumnPosition(int currentColumnPosition){
        this.currentColumnPosition=currentRowPosition;
    }
    public int getCurrentColumnPosition(){
        return currentColumnPosition;
    }
    public void setSymbol(String symbol){
        this.symbol=symbol;
    }
    public String getSymbol(){
        return symbol;
    }
}



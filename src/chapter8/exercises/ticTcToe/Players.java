package chapter8.exercises.ticTcToe;

public class Players {
    private String playerName;
    private String symbol;
private int currentRow;
private int currentColumn;
    public Players(String playerName,String symbol){
        this.playerName=playerName;
        this.symbol=symbol;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }
}

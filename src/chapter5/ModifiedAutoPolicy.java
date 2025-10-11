package chapter5;

public class ModifiedAutoPolicy {

    private int accountNumber;
    private String makeAndModel;
    private String state;

    public ModifiedAutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setState(String state) {

        if (state.equals("CT") || state.equals("MA") || state.equals("ME") || state.equals("NH") || state.equals("NJ") || state.equals("NY") || state.equals("PH") || state.equals("VT")) {
            this.state = state;
        } else {
            System.err.println("invalid input!!!");
        }
    }

    public String getState() {
        return state;
    }

    public boolean isNoFaultState() {
        boolean noFaultState;

        switch (getState()) {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
            case "CT" :
            case "ME":
            case "NH":
            case "PH":
            case "VT":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }
}







package chapter9.exercises.installmentCalculator;

public class Loan {
    private int principalAmount;
    private int loanTenure;
    private double interestRate;
    public Loan(int principalAmount,int loanTenure){
        this.principalAmount=principalAmount;
        this.loanTenure=loanTenure;
        this.interestRate=interestRate;
    }

    public int getPrincipalAmount() {
        return principalAmount;
    }

    public int getLoanTenure() {
        return loanTenure;
    }
    public double getInterestRate() {
        return interestRate;
    }

    public double calculateMonthlyInstallment(){
        double overallInterest=getPrincipalAmount()*(getInterestRate()/100/12)*getLoanTenure();
        double repaymentAmount= getPrincipalAmount()+overallInterest;
        return repaymentAmount/getLoanTenure();
    }

    @Override
    public String toString() {
        return String.format("%s: %d%n%s: %d%n","Principal amount",getPrincipalAmount(),"Loan tenure",getLoanTenure());
    }
}

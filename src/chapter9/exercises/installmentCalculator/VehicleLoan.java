package chapter9.exercises.installmentCalculator;

public class VehicleLoan extends Loan {
    private double interestRate;

    public VehicleLoan(int principalAmount,int loanTenure){
        super(principalAmount, loanTenure);
    }

    @Override
    public double getInterestRate() {
        return interestRate=.8;
    }

    @Override
    public String toString() {
        return String.format("%s: %d%n%s: %d%n%s:%.2f%n%n%s:%.2f%n","Principal amount",getPrincipalAmount(),"Loan tenure",getLoanTenure(),"Interest rate",getInterestRate(),"Monthly repayment",calculateMonthlyInstallment());
    }
}

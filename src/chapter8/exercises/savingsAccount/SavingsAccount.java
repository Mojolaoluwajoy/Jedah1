package chapter8.exercises.savingsAccount;

public class SavingsAccount {
    public static double annualInterest;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance){
        this.savingsBalance=savingsBalance;
    }
    public double getSavingsBalance(){
         return savingsBalance;
    }

    public  double getAnnualInterest() {
        return annualInterest/100;
    }

    public double calculateMonthlyInterestRate(){

        return (getSavingsBalance())*getAnnualInterest()/12;
    }
    public double calculateNewBalance(){
       double monthlyRate=calculateMonthlyInterestRate();
       return (monthlyRate*12) + getSavingsBalance();
    }
    public static double modifyAnnualInterest(double rate){
        return  annualInterest=rate;
    }
}

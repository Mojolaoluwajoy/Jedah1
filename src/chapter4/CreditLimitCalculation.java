package chapter4;

import java.util.Scanner;

public class CreditLimitCalculation {

    private int accountNumber;
    private int balance;
    private int charges;
    private int credits;
    private int creditsLimits;

    public CreditLimitCalculation(int accountNumber,int balance,int charges,int credits,int creditsLimits) {
        this.accountNumber= accountNumber;
        this.balance = balance;
        this.charges= charges;
        this.credits= credits;
        this.creditsLimits= creditsLimits;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

    public int getCharges() {
        return charges;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setCreditsLimits(int creditsLimits) {
        this.creditsLimits = creditsLimits;
    }

    public int getCreditsLimits() {
        return creditsLimits;
    }



    public int newBalance() {
        int newBalance =  balance + charges - credits;
        if(newBalance > creditsLimits) {
         System.out.print("Credit limit exceeded!");
        }
        else {
            System.out.println("New balance:" + newBalance);
        }
        return newBalance;
    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your account number:");
        int accountNumber = input.nextInt();

        System.out.print("Enter the b alance at the beginning of the month:");
        int balance = input.nextInt();

        System.out.print("Enter the total of items charges:");
        int charges = input.nextInt();

        System.out.print("Enter the total of all credits applied:");
        int credits = input.nextInt();

        System.out.print("Enter the allowed credit limit:");
        int creditLimit = input.nextInt();

        CreditLimitCalculation credit = new CreditLimitCalculation(accountNumber, balance, charges, credits, creditLimit);

        System.out.printf("Account number:%d%nAccount Balance:$%d%nNew Account Balance:%d%n", credit.getAccountNumber(),credit.getBalance(),credit.newBalance() );

    }
}
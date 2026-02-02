package chapter9.exercises.installmentCalculator;

import java.util.Scanner;

public class LoanTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kindly enter the principal amount and the loan tenure in that order:");
        int principal= scanner.nextInt();;
        int tenure= scanner.nextInt();
        HomeLoan homeLoan=new HomeLoan(principal,tenure);
        System.out.printf("%s%n%s%n","Home Loan",homeLoan);

        PersonalLoan personalLoan=new PersonalLoan(principal,tenure);
        System.out.printf("%s%n%s%n","Personal Loan",personalLoan);

        VehicleLoan vehicleLoan=new VehicleLoan(principal,tenure);
        System.out.printf("%s%n%s%n","Vehicle Loan",vehicleLoan);
    }
}

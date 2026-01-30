package chapter8.exercises.savingsAccount;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount account1=new SavingsAccount(2000.00);
        SavingsAccount account2=new SavingsAccount(3000.00);
        System.out.println("Before calling the modify rate method");

        SavingsAccount.annualInterest=4;
        System.out.println("Initial balance for Account 1 is:"+account1.getSavingsBalance()+" New balance with the annual interest added is: "+account1.calculateNewBalance());
        System.out.println("Initial balance for Account 1 is: "+account2.getSavingsBalance()+"New balance for Account 2 with the annual interest added is: "+account2.calculateNewBalance());
        System.out.println();
        SavingsAccount.modifyAnnualInterest(5);
        System.out.println("After calling the modify rate method");


        System.out.println("Initial balance for Account 1 is:"+account1.getSavingsBalance()+" New balance with the annual interest added is: "+account1.calculateNewBalance());
        System.out.println("Initial balance for Account 1 is: "+account2.getSavingsBalance()+"New balance for Account 2 with the annual interest added is: "+account2.calculateNewBalance());


    }
}

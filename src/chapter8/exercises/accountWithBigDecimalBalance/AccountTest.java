package chapter8.exercises.accountWithBigDecimalBalance;

import java.math.BigDecimal;
import java.util.Scanner;

public class AccountTest {
    public static void main (String[] args) {
        Account account1 = new Account("Jane Green:", new BigDecimal("50.00"));
        Account account2 = new Account("John Blue:", BigDecimal.valueOf(-7.53));

        displayAccount(account1);
        displayAccount(account2);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for Account1: ");
        BigDecimal depositAmount = input.nextBigDecimal();
        System.out.printf("%n adding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for Account2: ");
        depositAmount = input.nextBigDecimal();
        System.out.printf("%n adding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);






    }

    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s balance: $%.2f%n",
                accountToDisplay.getName(), accountToDisplay.getBalance());

    }



    }

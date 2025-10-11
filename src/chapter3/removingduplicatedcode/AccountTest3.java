package chapter3.removingduplicatedcode;

import java.util.Scanner;

public class AccountTest3{
         public static void main (String[] args) {
       Account3 account1 = new Account3("Jane Green:", 50.00);
       Account3 account2 = new Account3("John Blue:", -7.53);

         displayAccount(account1);
         displayAccount(account2);

         Scanner input = new Scanner(System.in);

         System.out.print("Enter deposit amount for Account1: ");
         double depositAmount = input.nextDouble();
          System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
         account1.deposit(depositAmount);

         displayAccount(account1);
        displayAccount(account2);

         System.out.print("Enter deposit amount for Account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

         displayAccount(account1);
        displayAccount(account2);


           



}

      public static void displayAccount(Account3 accountToDisplay) {
                 System.out.printf("%s balance: $%.2f%n",
            accountToDisplay.getName(), accountToDisplay.getBalance());
         



}}
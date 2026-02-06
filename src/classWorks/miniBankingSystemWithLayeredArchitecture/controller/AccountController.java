package classWorks.miniBankingSystemWithLayeredArchitecture.controller;

import classWorks.miniBankingSystemWithLayeredArchitecture.model.Account;
import classWorks.miniBankingSystemWithLayeredArchitecture.services.AccountService;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Scanner;

public class AccountController {
    private AccountService accountService;
    Scanner scanner=new Scanner(System.in);
    private Account currentAccount;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }
   public void performActions(){
  while (true){
      System.out.println();
      System.out.println("""
              1.Create account
              2.View all accounts
              3.Find account by accountNumber
              4.Deposit money
              5.withdraw money
              6.Transfer money
              7.Delete account
              8.Check balance
              9.exit
              
              Which of our services would you like to pick?""");
      int option= scanner.nextInt();
scanner.nextLine();
if (option<=0||option>9){
    System.out.println("There's no service assigned to the number you picked\nKindly go through the options and pick one that suits your needs.");
}
      switch (option){
          case 1:
              System.out.println("""
                      Welcome to account creation section
                      Kindly enter your first name:""");
              String firstName=scanner.nextLine();
              System.out.println("Enter your last name:");
              String lastName=scanner.nextLine();
              System.out.println("Kindly choose a passWord");
              String passWord=scanner.nextLine();
           Account account=accountService.createAccount(firstName,lastName,passWord);
              System.out.println("Account successfully created!!\nYour account number is "+account.getAccountNumber());
     break;
          case 2:
              System.out.println("Your accounts will be displayed below");
              Collection <Account> accounts=accountService.getAllAccounts();
              if (accounts.isEmpty()){
                  System.out.println("No accounts found");
              }
             int  counter=1;
              for (Account acc: accounts){
                  System.out.println("Account "+counter);
                  System.out.println(acc);

                  counter++;
                  System.out.println();

      }
              break;
          case 3:
              System.out.println("Enter the account number you'd like to find");
              String accountNumber=scanner.nextLine();
     Account acc =accountService.getAccount(accountNumber);
      if (acc!=null){
          System.out.println("Account selected");
          System.out.println(acc);
      }
      else {
          System.out.println("Account not found.");
      }
      break;

          case 4:
              System.out.println("Kindly enter the account number you wish you deposit into");
              accountNumber=scanner.nextLine();
              System.out.println("Enter an amount to deposit");
              BigDecimal depositAmount=scanner.nextBigDecimal();
              scanner.nextLine();
              System.out.println("Enter your passWord");
               passWord=scanner.nextLine();
               if (passWord.equals(accountService.getAccount(accountNumber).getPassWord())) {
                   System.out.println(depositAmount + " has been successfully deposited.");
                   accountService.deposit(accountNumber, depositAmount);
               }
               else {
                   System.out.println("Incorrect password!!");
               }
               break;
       case 5:
              System.out.println("Kindly enter the account number you wish you withdraw from");
              accountNumber=scanner.nextLine();
              System.out.println("Enter an amount to withdraw");
              BigDecimal withdrawAmount =scanner.nextBigDecimal();
              scanner.nextLine();
           System.out.println("Enter your passWord");
           passWord=scanner.nextLine();
           if (passWord.equals(accountService.getAccount(accountNumber).getPassWord())) {

               System.out.println(withdrawAmount +" has been successfully withdrawn.");
              accountService.withdraw(accountNumber, withdrawAmount);
           }
           else {
               System.out.println("Incorrect password!!");
           }
           break;

      case 6:
              System.out.println("Kindly enter the account number you wish to make the transfer from");
             String accountToDebit=scanner.nextLine();
             System.out.println("Kindly enter the account number you wish to make the transfer to");
             String accountToCredit =scanner.nextLine();
              System.out.println("Enter the amount to transfer");
              BigDecimal transferAmount =scanner.nextBigDecimal();
              scanner.nextLine();
           System.out.println("Enter your passWord");
           passWord=scanner.nextLine();
           if (passWord.equals(accountService.getAccount(accountToDebit).getPassWord())) {

               System.out.println(transferAmount +" has been successfully transferred to "+accountService.getAccount(accountToCredit).getFirstName()+" " +accountService.getAccount(accountToCredit).getLastName());
              accountService.withdraw(accountToDebit, transferAmount);
           accountService.deposit(accountToCredit, transferAmount);

           }
           else {
               System.out.println("Incorrect password!!");
           }
           break;


          case 7:
              System.out.println("Kindly enter the account number you wish to delete");
              accountNumber=scanner.nextLine();
              System.out.println("Enter your passWord");
              passWord=scanner.nextLine();
               if (passWord.equals(accountService.getAccount(accountNumber).getPassWord())) {
                           accountService.deleteAccount(accountNumber);
                  System.out.println("Account successfully deleted");

              }
              break;
          case 8:
              System.out.println("Kindly enter the account number you wish to check it's balance");
              accountNumber=scanner.nextLine();
              System.out.println("Enter your passWord");
              passWord=scanner.nextLine();
              if (passWord.equals(accountService.getAccount(accountNumber).getPassWord())) {
                  System.out.println("Your account balance is: "+accountService.CheckBalance(accountNumber));
              }
              break;
                  case 9:
              System.exit(0);


              }}
  }
    }


package classWorks.atmMachine;
import java.util.Scanner;
public class Atm {
    private int logInPassword;
    private int transactionPassword;
    private int password;
    private int deposit;
    private double withdrawal;
    double depositAmt=0;
    double withdrawAmmt=0;
    double balance=0;


    Scanner mojo =new Scanner(System.in);

    public int logInPassword() {
        while (true) {
            System.out.println("Enter your six digit  password to access our services:");
            password = mojo.nextInt();

            if (password==(221709) | password==(199923) | password==(530095)) {
                System.out.println("Login successful");
                break;
            } else {
                System.out.println("Incorrect password!");
            }
        }
        return logInPassword;
    }
    public int transactionPassword() {
        while (true) {
            System.out.println("Enter your four digit transaction password :");
            password = mojo.nextInt();

            if (password==(2217) | password==(1999) | password==(5300)) {
                break;
            } else {
                System.out.println("Incorrect password!");
            }
        }
        return transactionPassword;
    }

    public double deposit() {
        while (true) {
            System.out.println("Kindly choose from the options above or enter a greater amount you'd like to withdraw: ");
            depositAmt = mojo.nextDouble();
            if (depositAmt > 0) {
                transactionPassword();
                System.out.println("Your deposit of "+depositAmt+" was successful! ");
               balance+=depositAmt;
                System.out.println("your new balance is: "+balance);
                break;
            } else {
                System.out.println("Deposit amount has to be at least greater than zero! ");

            }
        }
        return deposit;
    }
    public double withdrawal() {
      while(true) {
          System.out.println("Kindly choose from the options above or enter a greater amount you'd like to withdraw: ");
          withdrawAmmt =mojo.nextDouble();
          if (withdrawAmmt>0) {
              transactionPassword();
              System.out.println("Your withdrawal of "+withdrawAmmt+ " was succesful");
             balance =balance-withdrawAmmt;
              System.out.println("Your new balance is: "+balance);
                 break;
          }
          else {
              System.out.println("Withdrawal amount has to be at least greater than zero! ");
          }
          }
       return withdrawal;
      }

    public void balance() {
        if (depositAmt ==0){
            System.out.println("Your balance is "+balance);
        }
        else if (depositAmt > 0) {
             balance += depositAmt;

            System.out.println("Your new balance after depositing "+ " is: "+balance);
        }
       else if (withdrawAmmt > 0) {
            balance -= withdrawAmmt;
            System.out.println("Your new balance after withdrawing " + withdrawAmmt + " is " + balance);
        }

    }
    }


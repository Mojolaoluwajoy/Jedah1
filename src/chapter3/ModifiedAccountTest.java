package chapter3;

import java.util.Scanner;

public class ModifiedAccountTest{
       public static void main(String[] args) {
       ModifiedAccount account1 = new ModifiedAccount ("Bolanle Victoria:", 100.00);
       ModifiedAccount account2 = new ModifiedAccount ("Oluwapelumi Michael", 150.00);

       System.out.printf("%s balance: $%.2f %n",
        account1.getName(), account1.getBalance());

       System.out.printf("%s balance: $%.2f %n",
        account2.getName(), account2.getBalance());

        Scanner input = new Scanner (System.in);

       
          System.out.print("Enter withdrawal amount for Account1: ");
          double withdrawAmount = input.nextDouble();
          System.out.printf("%nwithdrawing %.2f from account1 balance%n%n", withdrawAmount);
          
          if (withdrawAmount > account1.getBalance ()) {
          System.out.println("Withdrawal amount exceeds account1 balance");
           
}        else {
              account1.withdraw(withdrawAmount);

}


          System.out.printf("%s balance: $%.2f%n",
             account1.getName(), account1.getBalance());
         System.out.printf("%s balance: $%.2f%n",
             account2.getName(), account2.getBalance());

           System.out.print("Enter withdrawal amount for Account2: ");
          withdrawAmount = input.nextDouble();
          System.out.printf("%nwithdrawing %.2f from account2 balance%n%n", withdrawAmount);
          
          if (withdrawAmount > account2.getBalance ()) {
         System.out.println("Withdrawal amount exceeds account2 balance");
           
}        else {   
      account2.withdraw(withdrawAmount);

  }        


          System.out.printf("%s balance: $%.2f%n",
             account1.getName(), account1.getBalance());
         System.out.printf("%s balance: $%.2f%n",
             account2.getName(), account2.getBalance());

}
}
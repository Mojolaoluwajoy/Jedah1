package classworks;
import java.util.Scanner;

public class AtmApp {
    public static void skip(){
        System.out.println("""
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                """);
    }

    public static void main(String[] args) {
         Scanner mojo=new Scanner(System.in);
        Atm atm =new Atm();

        System.out.println("""
    ================================
       WELCOME TO GTB ATM SYSTEM
    ================================
    """);
        atm.logInPassword();
             skip();

while (true) {
    System.out.println("""
            =====================
                 ATM SERVICES
           ======================
           1.Check Balance
           2.Deposit Money
           3.Withdraw Money
           4.Exit
           
           Choose an option to proceed: """);
    int option =mojo.nextInt();
    if (option ==1){

       atm.balance();

    }
    else if(option==2) {
        moneyDisplay();
        atm.deposit();

    }
    else if(option==3) {
        moneyDisplay();
        atm.withdrawal();
    }
    else {
        System.out.println("""
                
               Thank you for banking with us.
               Goodbye!""");
        break;
    }
}
       }
       public static void moneyDisplay() {
           System.out.println("""
                         1.1,000\t\t2.2000
                         3.5,000\t\t4.10,000
                         5.20,000            """);
       }
}

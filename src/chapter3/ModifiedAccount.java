package chapter3;

public class ModifiedAccount{
             private String name;
             private double balance;

             public ModifiedAccount(String name, double balance) {
                    this.name = name;
                    this.balance = balance;
             


}
           public void withdraw( double withdrawAmount) {
               if (withdrawAmount < balance ) {
                   balance = balance - withdrawAmount;

}

}
          public double getBalance() {
               return balance;

}

          public void setName (String name) {
                this.name = name;

}


          public String getName() {
                 return name;

}


}
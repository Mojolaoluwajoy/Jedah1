package classWorks.miniBankingSystemWithLayeredArchitecture.model;

import java.math.BigDecimal;

public class Account {
    private String firstName;
    private String lastName;
    private String accountNumber;
   private String passWord;
    private BigDecimal balance;

    public  Account(String firstName,String lastName,String accountNumber,String passWord){
        this.firstName=firstName;
        this.lastName=lastName;
        this.accountNumber=accountNumber;
        this.passWord=passWord;
        this.balance=BigDecimal.valueOf(10.00);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public BigDecimal getBalance() {
        return balance;
    }

    public String getPassWord() {
        return passWord;
    }

    public BigDecimal withdraw(BigDecimal amount){
        if (amount.compareTo(getBalance()) <0){
       balance= balance.subtract(amount);
            return balance;

        }
       return getBalance();
    }
    public BigDecimal deposit(BigDecimal amount){
            if (amount.compareTo(BigDecimal.ZERO)>=0){
            balance=balance.add(amount);
              return balance;
            }
            return getBalance();
    }

    @Override
    public String toString() {
        return String.format("%s%n%s:%s%n%s:%s %s%n%s:%s%n%s:#%s","Account Details",
                "AccountNumber",accountNumber,
                "accountName",firstName,lastName,
                "passWord",passWord,
                "accountBalance",balance);

    }
}

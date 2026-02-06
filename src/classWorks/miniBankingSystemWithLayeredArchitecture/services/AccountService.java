package classWorks.miniBankingSystemWithLayeredArchitecture.services;

import classWorks.miniBankingSystemWithLayeredArchitecture.model.Account;
import classWorks.miniBankingSystemWithLayeredArchitecture.repository.AccountRepository;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.Collection;

public class AccountService {
    private AccountRepository accountRepository;
    SecureRandom random=new SecureRandom();
    public AccountService(AccountRepository accountRepository){
        this.accountRepository=accountRepository;
    }

    public Account createAccount(String firstName,String lastName,String passWord){
        String accountNumber=generateAccountNumber();
        Account account=new Account(firstName,lastName,accountNumber,passWord);
        accountRepository.saveAccount(account);
        return account;
    }
    public BigDecimal CheckBalance(String accountNumber){
        Account account=accountRepository.getAccount(accountNumber);
        return account!=null?account.getBalance():BigDecimal.ZERO;
    }


    public BigDecimal withdraw(String accountNumber, BigDecimal amount){
        Account account=accountRepository.getAccount(accountNumber);
if (account!=null){
    return account.withdraw(amount);
}
else {
    throw new NullPointerException("Account must not be null");
}
    }

    public BigDecimal deposit(String accountNumber, BigDecimal amount){
        Account account=accountRepository.getAccount(accountNumber);
if (account!=null){
    return account.deposit(amount);
}
else {
    throw new NullPointerException("Account must not be null");
}    }


    public Account getAccount(String accountNumber){
        return accountRepository.getAccount(accountNumber);
    }

public void deleteAccount(String accountNumber){
    Account account=accountRepository.getAccount(accountNumber);
        if (account!=null) {
            accountRepository.deleteAccount(accountNumber);
        }else {
            throw new NullPointerException("There's no record of the account you're trying to delete");
        }
}
    public String generateAccountNumber(){
         int number=random.nextInt(1000000000);
         return  String.valueOf(number);

    }
    public Collection<Account> getAllAccounts(){
        return accountRepository.getAllAccount();
    }
}

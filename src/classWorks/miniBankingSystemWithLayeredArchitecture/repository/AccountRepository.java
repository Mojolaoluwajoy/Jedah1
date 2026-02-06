package classWorks.miniBankingSystemWithLayeredArchitecture.repository;

import classWorks.miniBankingSystemWithLayeredArchitecture.model.Account;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AccountRepository {
    private Map<String, Account> accounts= new HashMap<>();

    public void saveAccount(Account account){
        accounts.put(account.getAccountNumber(),account);
    }
    public Account getAccount(String accountNumber){
        return accounts.get(accountNumber);
    }
    public void deleteAccount(String accountNumber){
        accounts.remove(accountNumber);
    }
    public Collection<Account> getAllAccount(){
        return accounts.values();
    }
}

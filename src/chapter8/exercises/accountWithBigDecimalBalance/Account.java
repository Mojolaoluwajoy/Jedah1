package chapter8.exercises.accountWithBigDecimalBalance;

import java.math.BigDecimal;

public class Account {
    private String name;
    private BigDecimal balance;

    public Account(String name, BigDecimal balance) {
        this.name = name;

        if (balance.compareTo(BigDecimal.ZERO)> 0.0) {
            this.balance = balance;
        }else {
            this.balance=BigDecimal.ZERO;
        }
    }

    public void deposit(BigDecimal depositAmount) {
        if (depositAmount.compareTo(BigDecimal.ZERO) > 0.0) {
          balance = balance.add(depositAmount);

        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

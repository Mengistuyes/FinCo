package project.finCoFramework.entry;

import project.finCoFramework.account.Account;

public class Withdraw extends Entry implements EntryStrategy {

    public Withdraw(Account accountNo) {
        super(accountNo);
    }

    @Override
    public Double newBalance(Double currentBalance, Double amount) {
        return currentBalance - amount;
    }

    @Override
    public void executeEntry(String name, double interest) {

    }
}


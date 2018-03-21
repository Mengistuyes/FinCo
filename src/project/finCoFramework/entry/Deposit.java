package project.finCoFramework.entry;

import project.finCoFramework.account.Account;

public class Deposit extends Entry implements EntryStrategy {

    public Deposit(Account account) {
        super(account);
    }

    @Override
    public Double newBalance(Double currentBalance, Double amount) {
        return currentBalance + amount;
    }

    @Override
    public void executeEntry(String name, double interest) {

    }
}

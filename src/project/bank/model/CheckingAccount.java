package project.bank.model;

import project.finCoFramework.account.Account;
import project.finCoFramework.party.Party;

public class CheckingAccount extends Account {

    private Double interestRate = 0.04;
    public CheckingAccount() {
        super();
    }

    public CheckingAccount(String accountType, String accountNumber, Party party) {
        super(accountType, accountNumber, party);
    }

    @Override
    public void addInterest() {
        balance = balance + (balance * interestRate);
    }


    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double amount) {
        this.balance =  amount;
    }

    @Override
    public boolean createAccount() {
        return false;
    }
}
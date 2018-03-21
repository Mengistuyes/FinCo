package project.bank.model;


import project.finCoFramework.account.Account;
import project.finCoFramework.party.Party;

public class SavingAccount extends Account {

    private Double interestRate = 0.05;

    public SavingAccount() {
    }

    public SavingAccount(String AccountType, String accountnr, Party party) {
        super(AccountType, accountnr, party);
    }


    @Override
    public void addInterest() {
        balance = balance + (balance * interestRate);
    }

    @Override
    public Double getBalance() {
        // TODO Auto-generated method stub
        return balance;
    }

    @Override
    public void setBalance(double amount) {
        this.balance = amount;
    }



}

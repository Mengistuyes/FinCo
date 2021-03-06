package project.finCoFramework.account;

import project.finCoFramework.party.Party;

public abstract class Account implements IAccount {

    protected String accountNumber;
    protected Double balance;
    protected String accountType;
    protected Party party;

    public Account(String accountType, String accountNumber, Party party) {
        this.balance = 10.0;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.party = party;
    }

    public Account() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void setBalance(double amount) {
        this.balance = amount;
    }

    @Override
    public Double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public abstract void addInterest();


}

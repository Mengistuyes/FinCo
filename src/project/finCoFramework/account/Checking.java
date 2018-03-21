package project.finCoFramework.account;

import project.finCoFramework.util.Functor;
import project.finCoFramework.party.Party;

public class Checking extends Account {
    private Double interestRate = 0.01;
    private Functor functor;
    public Checking() {
        super();
        functor = (interest_rate, Balance) -> null;
    }

    public Checking(String AccountType, String accountnr, Party party) {
        super(AccountType, accountnr, party);
    }

    @Override
    public void addInterest() {
        balance = functor.addInterest(interestRate, balance);
    }


    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double amount) {
        this.balance = balance;
    }

    @Override
    public boolean createAccount() {
        return false;
    }
}
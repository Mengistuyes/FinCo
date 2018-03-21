package project.finCoFramework.account;

import project.finCoFramework.util.Functor;
import project.finCoFramework.party.Party;

public class Checking extends Account {
    private Double interestRate = 0.01;
    private static Functor functor = (interest_rate, Balance) -> null;

    public Checking() {
        super();
    }

    public Checking(String accountType, String accountNumber, Party party) {
        super(accountType, accountNumber, party);
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
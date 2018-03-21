package project.finCoFramework.account;


import project.finCoFramework.util.Functor;
import project.finCoFramework.party.Party;

public class Saving extends Account {

    private Double interestRate = 0.01;
    private Functor functor;

    public Saving() {
        super();
        functor = (interest_rate, Balance) -> null;
    }

    public Saving(String AccountType, String accountnr, Party party) {
        super(AccountType, accountnr, party);
    }


    @Override
    public void addInterest() {
        balance = functor.addInterest(interestRate, balance);
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

    @Override
    public boolean createAccount() {
        return false;
    }

}

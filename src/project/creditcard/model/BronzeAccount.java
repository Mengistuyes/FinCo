package project.creditcard.model;

import project.finCoFramework.party.Party;

public class BronzeAccount extends AbstractCreditCard {

    private static double interest = 0.6;

    public BronzeAccount(String accountType, String ccNumber, Party party, String expireDate) {
        super(accountType, ccNumber, party, expireDate);
    }

    @Override
    public double getNewMonthlyBalance() {
        return balance - (balance * interest);
    }

    @Override
    public double getMonthlyAmountDue() {
        return (balance * interest);
    }

}

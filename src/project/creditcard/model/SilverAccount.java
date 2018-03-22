package project.creditcard.model;

import project.finCoFramework.party.Party;

public class SilverAccount extends AbstractCreditCard {

    private static double interest = 0.1;

    public SilverAccount(String accountType, String ccNumber, Party party, String expireDate) {
        super(accountType, ccNumber, party, expireDate);
    }

    @Override
    public double getNewMonthlyBalance() {
        return balance - (balance * interest);
    }

    @Override
    public double getMonthlyAmountDue() {
        return balance * interest;
    }

}

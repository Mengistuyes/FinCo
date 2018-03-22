package project.creditcard.model;

import project.finCoFramework.account.Account;
import project.finCoFramework.party.Party;

public class GoldAccount extends AbstractCreditCard {

    private static double silver = 0.8;

    public GoldAccount(String accountType, String ccNumber, Party party, String expireDate) {
        super(accountType, ccNumber, party, expireDate);
    }

    @Override
    public double getNewMonthlyBalance() {
        return balance - (balance * silver);
    }

    @Override
    public double getMonthlyAmountDue() {
        return  (balance * silver);
    }

}

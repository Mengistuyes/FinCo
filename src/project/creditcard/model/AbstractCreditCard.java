package project.creditcard.model;

import project.finCoFramework.account.Account;
import project.finCoFramework.party.Party;

public abstract class AbstractCreditCard extends Account {

    private String expireDate;

    public AbstractCreditCard(String accountType, String ccNumber, Party party, String expireDate) {
        super(accountType, ccNumber, party);
        this.expireDate = expireDate;
    }

    @Override
    public void addInterest() {

    }

    public abstract double getNewMonthlyBalance();

    public abstract double getMonthlyAmountDue();

}

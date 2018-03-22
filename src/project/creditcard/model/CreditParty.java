package project.creditcard.model;

import project.finCoFramework.party.Party;

public class CreditParty  extends Party{

    public CreditParty(String name, String street, String city, String state, String zip, String email) {
        super(name, street, city, state, zip, email);
    }

    @Override
    public String getTypeAccount() {
        return null;
    }
}

package project.bank.model;

import project.finCoFramework.party.IPerson;
import project.finCoFramework.party.Party;

public class Person extends Party implements IPerson {
    protected String birthDate;

    public Person(String birthDate, String name, String street, String city, String state, String zip, String email) {
        super(name, street, city, state, zip, email);
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String getTypeAccount() {
        return "Personal";
    }
}

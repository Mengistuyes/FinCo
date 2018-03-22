package project.finCoFramework.party;

import project.finCoFramework.party.IOrganization;
import project.finCoFramework.party.Party;

public class Organization extends Party implements IOrganization {

    protected Integer numberOfEmployers;

    public Organization(Integer numberOfEmployers, String name, String street, String city, String state,
                        String zip, String email) {
        super(name, street, city, state, zip, email);
        this.numberOfEmployers = numberOfEmployers;
    }

    public Integer getNumberOfEmployers() {
        return numberOfEmployers;
    }

    public void setNumberOfEmployers(Integer numberOfEmployers) {
        this.numberOfEmployers = numberOfEmployers;
    }

    @Override
    public String getTypeAccount() {
        return "Organization";
    }
}

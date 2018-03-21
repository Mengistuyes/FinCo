package project.finCoFramework.party;

public class Organization extends Party implements IOrganization {

    protected Integer numberOfEmployers;

    public Organization(Integer nr_of_employees, Integer PartyId, String name, String street, String city, String state,
                        String zip, String email) {
        super(PartyId, name, street, city, state, zip, email);
        this.numberOfEmployers = nr_of_employees;
    }

    public Integer getNumberOfEmployers() {
        return numberOfEmployers;
    }

    public void setNumberOfEmployers(Integer numberOfEmployers) {
        this.numberOfEmployers = numberOfEmployers;
    }
}

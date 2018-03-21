package project.finCoFramework.party;

public class Person extends Party implements IPerson {
    protected String birthDate;

    public Person(Integer personId, String birthDate, String name, String street, String city, String state, String zip, String email) {
        super(personId, name, street, city, state, zip, email);
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}

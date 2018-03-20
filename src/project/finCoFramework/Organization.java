package project.finCoFramework;

public class Organization extends Party implements IOrganization,IParty{
	Integer nr_of_employees;
	public Organization(Integer nr_of_employees,Integer PartyId,String name, String street, String city, String state,
			String zip, String email) {
		super(PartyId, name, street, city, state, zip, email);
		this.nr_of_employees=nr_of_employees;
	}
}

package project.bank;

import project.finCoFramework.Organization;

public class CompanyInfo extends Organization {
	Integer id;
	CompanyInfo(Integer id,Integer nr_of_employees, String name, String street,
			String city, String state, String zip, String email) {
		super(nr_of_employees, name, street, city, state, zip, email);
		this.id=id;
	}
}

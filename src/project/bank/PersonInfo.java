package project.bank;

import java.util.Date;

import project.finCoFramework.Person;

public class PersonInfo extends Person{
	Integer id;
	PersonInfo(Integer id,String birthDate, String name, String street, String city,
			String state, String zip, String email) {
		super(id, birthDate, name, street, city, state, zip, email);
		// TODO Auto-generated constructor stub
		this.id=id;
	}

}

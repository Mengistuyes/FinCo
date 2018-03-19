package project.finCoFramework;

import java.util.Date;

public class Person extends Party implements IPerson,IParty{
	
	String birthDate;
	public Person(String birthDate,String name,String street,String city,String state,String zip,String email)
	{
		super(name,street,city,state,zip,email);
		this.birthDate=birthDate;
	}

}

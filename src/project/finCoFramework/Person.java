package project.finCoFramework;

import java.util.Date;

public class Person extends Party implements IPerson,IParty{
	String birthDate;
	Integer personId;
	String name;
	String street;
	String city;String state;
	String zip;
	String email;
	public Person(Integer personId,String birthDate,String name,String street,String city,String state,String zip,String email)
	{
		super(personId,name,street,city,state,zip,email);
		this.birthDate=birthDate;
	}
	
	
}

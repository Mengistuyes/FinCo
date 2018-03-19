package project.finCoFramework;

import java.util.Date;

public abstract class Party implements IParty{
	String name;
	String street;
	String city;
	String state;
	String zip;
	Date birthDate;
	String email;
	Party(String name,String street,String city,String state,String zip,String email)
	{
		this.name=name;
		this.street=street;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.email=email;
	}
}

package project.finCoFramework;

public class PartyFactory extends AbstractFactory {
	public IParty getFactory(String choice)
	{
		if(choice.equalsIgnoreCase("Person"))
		{
			return new Person();
		}
		if(choice.equalsIgnoreCase("Organization"))
		{
			return new OrganizationFactory();
		}
		return null;
		
	}

	@Override
	AbstractFactory getInstance(String choice) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

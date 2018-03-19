package project.finCoFramework;
public class AbstractFactoryProducer{
	public static AbstractFactory getAbstractFactory(String choice)
	{
		if(choice.equalsIgnoreCase("Account"))
		{
			return new AccountFactory();
		}
		if(choice.equalsIgnoreCase("Party"))
		{
			return new PartyFactory();
		}
		if(choice.equalsIgnoreCase("CreditCard"))
		{
			return new CreditCardFactory();
		}
		if(choice.equalsIgnoreCase("Entity"))
		{
			return new EntityFactory();
		}

		return null;
		
	}
}
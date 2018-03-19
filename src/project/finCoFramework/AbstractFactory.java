package project.finCoFramework;

public abstract class AbstractFactory {
//	abstract IParty getPartyInstance(String choice);
//	abstract IAccount getAccountInstance(String choice);
//	abstract IEntry getEntityInstance(String choice);
	abstract AbstractFactory getInstance(String choice);
}

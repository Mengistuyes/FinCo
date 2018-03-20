package project.finCoFramework;

public class EntryContext {
	private EntryStategy entryStrategy;
	
	public EntryContext(EntryStategy entryStrategy){
		this.entryStrategy=entryStrategy;
	}
	public Double ExcuteStrategy(Double currentBalance,Double amount)
	{
		 return entryStrategy.newBalance(currentBalance,amount);
	}
}

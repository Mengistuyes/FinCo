package project.finCoFramework;

public class Withdraw  extends Entry implements EntryStategy {
	String accountNo;
	public Withdraw(String accountNo,Double amount,String EDate,String transactionType)
	{
		super(accountNo,amount,EDate,transactionType);
		this.accountNo=accountNo;
	}
	@Override
	public Double newBalance(Double currentBalance,Double amount) {
			return currentBalance - amount;
	}
}


package project.finCoFramework;

import project.dao.fileDao;

public class Deposit extends Entry implements EntryStategy {
	String accountNo;
	public Deposit(String accountNo,Double amount,String EDate,String transactionType)
	{
		super(accountNo,amount,EDate,transactionType);
		this.accountNo=accountNo;
	}

	@Override
	public Double newBalance(Double currentBalance,Double amount) {
			return currentBalance + amount;
	}
//	public notify()
//	{
//		
//	}
}


//@Override
//public Double newBalance(Double currentBalance,Double amount) {
//	// fileDao.getAccount(this.accountNo).setBalance(fileDao.getAccount(this.accountNo).getBalance() + amount);
//	// System.out.println(fileDao.getAccount(this.accountNo).getBalance());
//	return currentBalance + amount;
//}

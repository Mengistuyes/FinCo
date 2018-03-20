package project.finCoFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import project.dao.fileDao;

public class Checking extends Account {
	Double interest_rate=0.01;
	Double minimum_balance;
	List<Account> accounts=new ArrayList<Account>();
	List<Account> interestUpdatedAccounts=new ArrayList<Account>();
	
	public Checking()
	{
		super();
	//	account=new Saving();
	}
	public Checking(String AccountType, String accountnr, Party party) {
		super(AccountType,accountnr, party);
	}
	
//	 <R, T> void addInterest(Functor<T,R> addInterestFunctor){
//		 Account account=new Saving();
//		//accounts=fileDao.getSavingAccount(account);
//		 accounts=fileDao.getAllAccounts();
//		Iterator<Account> iterator=accounts.iterator();
//		Double newBalance=0.0;
//	//	fileDao.clearFile();
//		int count=0;
//		while(iterator.hasNext())
//		{
//			accounts.get(count).setBalance(addInterestFunctor.addInterest(interest_rate, iterator.next().getBalance()));
//			interestUpdatedAccounts.add(accounts.get(count));
//			fileDao.saveAccount(accounts.get(count));
//			count++;
//		}
//		
//		
//	}
	@Override
	public void addInterest(Functor addInterestFunctor) {
		 Account account=new Saving();
			//accounts=fileDao.getSavingAccount(account);
			 accounts=fileDao.getAllAccounts();
			Iterator<Account> iterator=accounts.iterator();
			Double newBalance=0.0;
		//	fileDao.clearFile();
			int count=0;
			while(iterator.hasNext())
			{
				accounts.get(count).setBalance(addInterestFunctor.addInterest(interest_rate, iterator.next().getBalance()));
				interestUpdatedAccounts.add(accounts.get(count));
				fileDao.saveAccount(accounts.get(count));
				count++;
			}
		
	}

	@Override
	public Double getBalance(IAccount account) {

		return account.getBalance(account);
	}
}
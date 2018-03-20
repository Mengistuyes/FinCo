package project.finCoFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import project.dao.fileDao;

public class Saving extends Account    {
	Double interest_rate=0.0325;
	Double minimum_balance;
	List<Account> accounts=new ArrayList<Account>();
	List<Account> interestUpdatedAccounts=new ArrayList<Account>();
	
	public Saving()
	{
		super();
	//	account=new Saving();
	}
	public Saving(String AccountType, String accountnr, Party party) {
		super(AccountType,accountnr, party);
	}
	
	
	 public Double getInterest_rate() {
		return interest_rate;
	}
	public void setInterest_rate(Double interest_rate) {
		this.interest_rate = interest_rate;
	}
	public Double getMinimum_balance() {
		return minimum_balance;
	}
	public void setMinimum_balance(Double minimum_balance) {
		this.minimum_balance = minimum_balance;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	public List<Account> getInterestUpdatedAccounts() {
		return interestUpdatedAccounts;
	}
	public void setInterestUpdatedAccounts(List<Account> interestUpdatedAccounts) {
		this.interestUpdatedAccounts = interestUpdatedAccounts;
	}
//@Override
// void addInterest(Functor<T,R> addInterestFunctor){
//		 Account account=new Saving();
//		 accounts=fileDao.getAllAccounts();
//		Iterator<Account> iterator=accounts.iterator();
//		Double newBalance=0.0;
//		int count=0;
//		while(iterator.hasNext())
//		{ // add interest functor Functor
//			accounts.get(count).setBalance(addInterestFunctor.addInterest(interest_rate, iterator.next().getBalance()));
//			interestUpdatedAccounts.add(accounts.get(count));
//			fileDao.saveAccount(accounts.get(count));
//			count++;
//		}
//		
//		
//	
//	}
@Override
public void addInterest(Functor addInterestFunctor) {
	 Account account=new Saving();
	 accounts=fileDao.getAllAccounts();
	Iterator<Account> iterator=accounts.iterator();
	Double newBalance=0.0;
	int count=0;
	while(iterator.hasNext())
	{ // add interest functor Functor
		accounts.get(count).setBalance(addInterestFunctor.addInterest(interest_rate, iterator.next().getBalance()));
		interestUpdatedAccounts.add(accounts.get(count));
		fileDao.saveAccount(accounts.get(count));
		count++;
	}
	
}
@Override
public Double getBalance(IAccount account) {
	// TODO Auto-generated method stub
	return null;
}

}

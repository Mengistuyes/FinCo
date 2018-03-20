package project.finCoFramework;

import project.dao.fileDao;

public abstract class Account implements IAccount {
	//private Integer AccountNo;
	private String AccountNo;
	private static Integer accNo=0; 
	//String AccountNo;
	private Double Balance;
	private String AccountType;
	private Integer PartyId;
	private Party party;
	
	public Account(String AccountType,String accountnr, Party party)//,Integer PartyId)
	{
		this.Balance=0.0;
		this.AccountNo=accountnr;//++accNo;
		this.AccountType=AccountType;
		this.PartyId=party.partyId;
		this.party=party;
		saveNewAccount();
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public static Integer getAccNo() {
		return accNo;
	}

	public static void setAccNo(Integer accNo) {
		Account.accNo = accNo;
	}

	public Integer getPartyId() {
		return PartyId;
	}

	public void setPartyId(Integer partyId) {
		PartyId = partyId;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public boolean saveNewAccount()
	{
		boolean isPartySaved=false;
		boolean isAccountSaved=false;
		isPartySaved=fileDao.saveParty(party);
		
		if(isPartySaved)
		{
			isAccountSaved=fileDao.saveAccount(this);	
		}
		return isAccountSaved;
	}

	public String getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}
	public Double getBalance() {
		return Balance;
	}
	public void setBalance(Double balance) {
		Balance = balance;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	

}

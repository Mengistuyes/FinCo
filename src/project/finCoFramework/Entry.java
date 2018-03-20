package project.finCoFramework;

import java.util.List;
import java.util.UUID;

import project.dao.fileDao;

public abstract class Entry implements IEntry{
	public Double amount;
	public String eDate;
	public String entryType;
	public String accountNo;
	public String entryId = UUID.randomUUID().toString();
	
	public Entry(String accountNo,Double amount,String EDate,String transactionType)
	{
		this.amount=amount;
		this.eDate=eDate;
		this.entryType=transactionType;
		this.accountNo=accountNo;
		this.entryId=entryId;
//		fileDao.getAccount(accountNo);
//		List<Entry> entryList=fileDao.getAllEntry();
//		entryList.add(this);
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String geteDate() {
		return eDate;
	}
	public void seteDate(String eDate) {
		this.eDate = eDate;
	}
	public String getTransactionType() {
		return entryType;
	}
	public void setTransactionType(String transactionType) {
		this.entryType = transactionType;
	}
	public String getEntryId() {
		return entryId;
	}
	public void setEntryId(String entryId) {
		this.entryId = UUID.randomUUID().toString();
	}
	
	public void addEntry()
	{
		fileDao.saveEntry(this);
	}
	
}

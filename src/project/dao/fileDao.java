package project.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import com.google.gson.Gson;

import project.bank.PersonInfo;
import project.finCoFramework.Account;
import project.finCoFramework.Checking;
import project.finCoFramework.Deposit;
import project.finCoFramework.Entry;
import project.finCoFramework.IAccount;
import project.finCoFramework.Party;
import project.finCoFramework.Person;
import project.finCoFramework.Saving;
import project.finCoFramework.Transfer;
import project.finCoFramework.Withdraw;

public class fileDao {
	private static fileDao instance;
	private fileDao()
	{
		
	}
	public static fileDao getInstance()
	{
		if(instance==null)
		{
		instance=new fileDao();	
		}
		return instance;
		
	}

	public static Account getAccount(String accountNo)
	{
		for(Account account:fileDao.getAllAccounts())
		{
			if(accountNo.equalsIgnoreCase(account.getAccountNo()))
				{
					return account;
				}
		}
//		Account account;
//		Iterator<Account> iterator=fileDao.getAllAccounts().iterator();
//		while(iterator.hasNext())
//		{
//			if(accountNo.equalsIgnoreCase(iterator.next().getAccountNo()))
//			return iterator.next();
//		}
		return null;
		
	}
	public static List<Entry> getAllEntry()
	{
		List<Entry> entrys=new ArrayList<Entry>();
		Entry entry1=new Deposit("s12345678",7700.0,"03/18/2018","d");
		Entry entry2=new Transfer("s22245678",2200.0,"03/18/2018","t");
		Entry entry3=new Withdraw("s133345678",300.0,"03/18/2018","w");
	
		entrys.add(entry1);
		entrys.add(entry2);
		entrys.add(entry3);
		
		return entrys;
	}
	public static List<Party> getAllParty()
	{
		List<Party> partys=new ArrayList<Party>();
		Party person1=new Person(1,"03/18/2018","mmm","s1","FairField","Iowa","55555","mmm@mum.edu");
		Party person2=new Person(2,"03/17/2018","eee","s","Field","MN","55555","mmm@mum.edu");
		Party person3=new Person(3,"03/19/2018","aaa","d","iowa city","iowa","888","mmm@mum.edu");
		Party person4=new Person(4,"03/3/2018","ff","ooo","Minn","MN","55555","mmm@mum.edu");
		Party person5=new Person(5,"03/1/2018","ccc","ppp","Tyson c","Verginia","888","mmm@mum.edu");

		partys.add(person1);
		partys.add(person2);
		partys.add(person3);
		partys.add(person4);
		partys.add(person5);
		return partys;
	}
	public static List<Account> getAllAccounts()
	{
		List<Account> accounts=new ArrayList<Account>();
		
		Account account1=new Saving();
		account1.setPartyId(1);
		account1.setAccountNo("s12345678");
		account1.setBalance(50.0);
		account1.setAccountType("s");
		
		Account account2=new Saving();
		account2.setPartyId(2);
		account2.setAccountNo("s22245678");
		account2.setBalance(70.0);
		account2.setAccountType("s");
		
		Account account3=new Saving();
		account3.setPartyId(3);
		account3.setAccountNo("s133345678");
		account3.setBalance(1600.0);
		account3.setAccountType("s");
		
		Account account4=new Checking();
		account4.setPartyId(4);
		account4.setAccountNo("s133347778");
		account4.setBalance(300.0);
		account4.setAccountType("c");
		
		Account account5=new Checking();
		account5.setPartyId(5);
		account5.setAccountNo("s133348888");
		account5.setBalance(100.0);
		account5.setAccountType("c");
        
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		accounts.add(account4);
		accounts.add(account5);
		
		
		return accounts;
		
	}
	 public static boolean saveParty(Party party)
	    {
		 String fileName="Files" + "\\PartyInfo.text";
	        try
	        {
	            Gson gson = new Gson();
	            File file = new File(fileName);
	          //  String content = gson.toJson(party);
	            StringBuilder sb=new StringBuilder();
	            Integer test=party.getPartyId();
	            sb.append(party.getPartyId().toString());
	            sb.append(",");
	            sb.append(party.getName());
	            sb.append(",");
	            sb.append(party.getCity());
	            sb.append(",");
	            sb.append(party.getEmail());
	            sb.append(",");
	            sb.append(party.getState());
	            sb.append(",");
	            sb.append(party.getStreet());
	            sb.append(",");
	            sb.append(party.getZip());
	            sb.append(",");
	            SimpleDateFormat formatter=new SimpleDateFormat("mm-dd-yyyy");
	            String test2=party.getBirthDate();
	            sb.append(party.getBirthDate());
	           
	       //     sb.append(formatter.format(party.getBirthDate()));
	            
	            boolean isNewFile=false;
	            if (!file.exists()) {
	                file.createNewFile();
	                isNewFile=true;
	            }
				File stri=file.getAbsoluteFile();
				System.out.println(stri.getAbsolutePath().toString());
	            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
	            BufferedWriter bw = new BufferedWriter(fw);
	            if(!isNewFile)
	            {
	            	bw.newLine();
	            }
	            
	            bw.write(sb.toString());
	            bw.close();
	            fileDao.getAllParty().add(party);
	            return true;
	        }

	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	        return false;
	    }
	 public static boolean saveEntry(Entry entry)
	    {
		 String fileName="Files" + "\\EntryInfo.text";
	        try
	        {
	            Gson gson = new Gson();
	            File file = new File(fileName);
	          //  String content = gson.toJson(party);
	            StringBuilder sb=new StringBuilder();
	         
	            sb.append(entry.getEntryId());
	            sb.append(",");
	            sb.append(entry.getAmount());
	            sb.append(",");
	            sb.append(entry.geteDate());
	            sb.append(",");
	            sb.append(entry.getTransactionType());       
	            if (!file.exists()) {
	                file.createNewFile();
	            }
				File stri=file.getAbsoluteFile();
				System.out.println(stri.getAbsolutePath().toString());
	            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
	            BufferedWriter bw = new BufferedWriter(fw);
	            bw.newLine();
	            bw.write(sb.toString());
	            bw.close();
	            fileDao.getAllEntry().add(entry);
	            return true;
	        }

	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	        return false;
	    }
	 public static boolean saveAccount(Account account)
	    {
		 String fileName="Files" + "\\AccountInfo.text";
	        try
	        {
	            Gson gson = new Gson();
	            File file = new File(fileName);
	          //  String content = gson.toJson(party);
	            StringBuilder sb=new StringBuilder();
	            String test=account.getAccountNo();
	            sb.append(account.getPartyId().toString());
	            sb.append(",");
	            sb.append(account.getAccountNo());
	            sb.append(",");
	            sb.append(account.getAccountType());
	            sb.append(",");
	            sb.append(account.getBalance());        
	            if (!file.exists()) {
	                file.createNewFile();
	            }
				File stri=file.getAbsoluteFile();
				System.out.println(stri.getAbsolutePath().toString());
	            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
	            BufferedWriter bw = new BufferedWriter(fw);
	            bw.newLine();
	            bw.write(sb.toString());
	            bw.close();
	            fileDao.getAllAccounts().add(account);
	            return true;
	        }

	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	        return false;
	    }
	 public static Party getParty(Party party)
	 {
		 
		 String fileName="Files" + "\\PartyInfo.text";
		 File file = new File(fileName);
		 if (!file.exists()) {
           //  file.createNewFile();
             System.out.println("File Not Found");
             return null;
         }
		
		 try {
		 FileReader reader=new FileReader(file);
		 BufferedReader bReader=new BufferedReader(reader);
		 String oneLine;
		 String[] fields;
			while((oneLine=bReader.readLine())!=null)
			 {
				fields=oneLine.split(",");
				party.setPartyId(Integer.parseInt(fields[0]));
				party.setName(fields[1]);
				party.setCity(fields[2]);
				party.setEmail(fields[3]);
				party.setState(fields[4]);
				party.setStreet(fields[5]);
				party.setZip(fields[6]);
				party.setBirthDate(fields[7]);
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return party;
	 }
	 public static List<Account> getSavingAccount(Account account)
	 {
		 List<Account> accounts=new ArrayList<Account>();
		 Account account1=new Saving();
		 String fileName="Files" + "\\AccountInfo.text";
		 File file = new File(fileName);
		 if (!file.exists()) {
           //  file.createNewFile();
             System.out.println("File Not Found");
             return null;
         }
		
		 try {
		 FileReader reader=new FileReader(file);
		 BufferedReader bReader=new BufferedReader(reader);
		 String oneLine;
		 String[] fields;
		 int i=0;
			while((oneLine=bReader.readLine())!=null)
			 {
				fields=oneLine.split(",");
				if(fields[2].equalsIgnoreCase("s"))
				{		
					account1.setPartyId(Integer.parseInt(fields[0]));
					account1.setAccountNo(fields[1]);
					account1.setAccountType(fields[2]);
					account1.setBalance(Double.parseDouble(fields[3]));
					i++;
				}
				
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}
		return accounts;
	 }
	 public static boolean saveToFileWithFileName(PersonInfo person,String fileName)
	    {
	        try
	        {
	            Gson gson = new Gson();
	            File file = new File("\resouces\\" + fileName);
	            String content = gson.toJson(person);

	            if (!file.exists()) {
	                file.createNewFile();
	            }

	            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
	            BufferedWriter bw = new BufferedWriter(fw);
	            bw.newLine();
	            bw.write(content);
	            bw.close();

	            return true;
	        }

	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	        return false;
	    }
	 public static boolean clearFile()
	 {
		 String fileName="Files" + "\\AccountInfo.text";
		 File file=new File(fileName);
		 if(file.exists())
		 {
			 file.delete();
			 return true;
		 }
		 return false;
	 }
}

package project.finCoFramework.model;

import project.finCoFramework.account.Account;
import project.finCoFramework.account.IAccount;

public class EntryOperationImpl implements EntryOperation {

    private FincoDao fincoDao;

    public EntryOperationImpl() {
        fincoDao = FincoDao.getInstance();
    }

    @Override
    public void deposit(Account account, String name, double amount) {
        IAccount accounts = fincoDao.account(account);
        double balance = accounts.getBalance() + amount;
        account.setBalance(balance);
    }

    @Override
    public void withdraw(Account account, String name, double amount) {
        IAccount accounts = fincoDao.account(account);
        double balance = accounts.getBalance() - amount;
        account.setBalance(balance);
    }
}

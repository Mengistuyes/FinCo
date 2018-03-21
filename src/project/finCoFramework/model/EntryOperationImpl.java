package project.finCoFramework.model;

import project.finCoFramework.account.IAccount;

public class EntryOperationImpl implements EntryOperation {

    private FincoDao fincoDao;

    public EntryOperationImpl() {
        fincoDao = FincoDao.getInstance();
    }

    @Override
    public void deposit(IAccount account, String name, double amount) {
        IAccount accounts = fincoDao.account(account);
        double balance = accounts.getBalance() + amount;
        account.setBalance(balance);
    }

    @Override
    public void withdraw(IAccount account, String name, double amount) {
        IAccount accounts = fincoDao.account(account);
        double balance = accounts.getBalance() - amount;
        account.setBalance(balance);
    }
}

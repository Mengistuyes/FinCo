package project.finCoFramework.model;

import project.finCoFramework.account.Account;

import java.util.ArrayList;
import java.util.List;

public class Entry implements IEntry, ISubject {

    private FincoDao fincoDao;
    private static List<Observer> observerList = new ArrayList<>();

    public Entry() {
        fincoDao = FincoDao.getInstance();
    }

    @Override
    public void deposit(int accountid, double amount) {
        Account accounts = fincoDao.getAccountById(accountid);
        accounts.setBalance(accounts.getBalance() + amount);
        fincoDao.update(accountid, accounts);
        notifyAllViews();
    }

    @Override
    public void withdraw(int accountid, double amount) {
        Account account = fincoDao.getAccountById(accountid);
        account.setBalance(account.getBalance() - amount);
        fincoDao.update(accountid, account);
        notifyAllViews();
    }

    @Override
    public void addSubscriberView(Observer object) {
        observerList.add(object);
    }

    @Override
    public void removeSubscriberView(Observer object) {
        observerList.remove(object);
    }

    @Override
    public void notifyAllViews() {
        for (Observer ob : observerList) {
            ob.update(fincoDao.getAccountList());
        }
    }
}

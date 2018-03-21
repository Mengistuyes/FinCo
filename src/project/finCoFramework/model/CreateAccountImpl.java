package project.finCoFramework.model;

import com.sun.org.apache.bcel.internal.generic.ISUB;
import project.finCoFramework.account.Account;
import project.finCoFramework.account.IAccount;
import project.finCoFramework.util.Functor;

import java.util.ArrayList;
import java.util.List;

public class CreateAccountImpl implements ICreateAccount, ISubject {

    private FincoDao fincoDao;
    private static List<Observer> observerList = new ArrayList<>();

    public CreateAccountImpl() {
        fincoDao = FincoDao.getInstance();
    }

    @Override
    public void createAccount(Account account) {
        fincoDao.addAccount(account);
        notifyAllViews(account);
    }

    @Override
    public void addInterest(List<Account> accountList) {
        for (IAccount account : accountList) {
            account.addInterest();
        }
    }

    @Override
    public List<Account> getAllAccounts() {
        return fincoDao.getAccountList();
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
    public void notifyAllViews(Account account) {
        for (Observer ob : observerList) {
            ob.update(account);
        }
    }
}

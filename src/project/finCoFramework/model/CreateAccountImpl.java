package project.finCoFramework.model;

import project.finCoFramework.account.IAccount;
import project.finCoFramework.util.Functor;

import java.util.List;

public class CreateAccountImpl implements ICreateAccount {

    private FincoDao fincoDao;

    public CreateAccountImpl() {
        fincoDao = FincoDao.getInstance();
    }

    @Override
    public void createAccount(IAccount account) {
        fincoDao.addAccount(account);
    }

    @Override
    public void addInterest(List<IAccount> accountList) {
        for (IAccount account : accountList) {
            account.addInterest();
        }
    }
}

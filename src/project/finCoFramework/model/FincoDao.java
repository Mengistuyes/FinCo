package project.finCoFramework.model;

import project.finCoFramework.account.IAccount;

import java.util.ArrayList;
import java.util.List;

public class FincoDao {

    private static List<IAccount> accountList = new ArrayList<>();
    private static FincoDao fincoDao = new FincoDao();

    private FincoDao() {
    }

    public static FincoDao getInstance() {
        return fincoDao;
    }

    public void addAccount(IAccount account) {
        accountList.add(account);
    }

    public IAccount account(IAccount account){
        for (IAccount account1 : accountList){
            if (account1.equals(account)){
                return account1;
            }
        }
        return null;
    }
}

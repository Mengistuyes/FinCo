package project.finCoFramework.model;

import project.finCoFramework.account.Account;
import project.finCoFramework.account.IAccount;

import java.util.ArrayList;
import java.util.List;

public class FincoDao {


    private static List<Account> accountList = new ArrayList<>();
    private static FincoDao fincoDao = new FincoDao();

    private FincoDao() {
    }

    public static FincoDao getInstance() {
        return fincoDao;
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public List<Account> getAccountList(){
        return accountList;
    }

    public IAccount account(Account account) {
        for (Account account1 : accountList) {
            if (account1.equals(account)) {
                return account1;
            }
        }
        return null;
    }


}

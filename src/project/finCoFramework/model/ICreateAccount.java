package project.finCoFramework.model;

import project.finCoFramework.account.Account;
import project.finCoFramework.account.IAccount;

import java.util.List;

public interface ICreateAccount {

    void createAccount(IAccount account);
    void addInterest(List<IAccount> accountList);
}

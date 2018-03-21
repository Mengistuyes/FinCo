package project.finCoFramework.model;

import project.finCoFramework.account.Account;
import project.finCoFramework.account.IAccount;

public interface EntryOperation {

    void deposit(Account account, String name, double amount);
    void withdraw(Account account, String name, double amount);
}

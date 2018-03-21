package project.finCoFramework.model;

import project.finCoFramework.account.IAccount;

public interface EntryOperation {

    void deposit(IAccount account, String name, double amount);
    void withdraw(IAccount account, String name, double amount);
}

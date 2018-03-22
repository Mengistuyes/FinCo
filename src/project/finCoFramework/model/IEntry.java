package project.finCoFramework.model;

import project.finCoFramework.account.Account;
import project.finCoFramework.account.IAccount;

public interface IEntry {

    void deposit(int accountid, double amount);
    void withdraw(int accountid, double amount);
}

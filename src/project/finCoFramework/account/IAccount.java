package project.finCoFramework.account;

import project.finCoFramework.util.Functor;

public interface IAccount {

    void addInterest();
    Double getBalance();
    void setBalance(double amount);
}

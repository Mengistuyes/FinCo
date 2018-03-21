package project.finCoFramework.model;

import project.finCoFramework.account.Account;

public interface ISubject {

    void addSubscriberView(Observer object);

    void removeSubscriberView(Observer object);

    void notifyAllViews(Account account);
}

package project.finCoFramework.views;

import project.finCoFramework.account.Account;

public interface CommandView {
    Account getAccount();

    void close();
}

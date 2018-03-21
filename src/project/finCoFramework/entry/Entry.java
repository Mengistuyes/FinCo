package project.finCoFramework.entry;

import java.util.UUID;

import project.finCoFramework.account.Account;

public abstract class Entry implements IEntry {

    public Account account;
    public String entryId = UUID.randomUUID().toString();

    public Entry(Account account) {
        this.account = account;
    }


    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = UUID.randomUUID().toString();
    }


    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

package project.bank.commands.account;

import project.bank.views.CompanyAccountView;
import project.bank.views.DepositView;
import project.bank.views.PersonalAccountView;
import project.bank.views.WithdrawView;
import project.finCoFramework.account.Account;
import project.finCoFramework.account.IAccount;
import project.finCoFramework.model.*;
import project.finCoFramework.views.AbstractFincoUi;

public class Receiver {

    private AbstractFincoUi abstractFincoUi;
    private ICreateAccount createAccount;
    private EntryOperation entryOperation;

    public Receiver(AbstractFincoUi abstractFincoUi) {
        this.abstractFincoUi = abstractFincoUi;
        createAccount = new CreateAccountImpl();
        entryOperation = new EntryOperationImpl();
    }

    public void createPersonalAccount() {
        new PersonalAccountView(abstractFincoUi);
    }

    public void createCompanyAccount() {
        new CompanyAccountView(abstractFincoUi);
    }

    public void createDepositView() {
        new DepositView(abstractFincoUi, abstractFincoUi.getSelectedRow());
    }

    public void createWithdrawView() {
        new WithdrawView(abstractFincoUi, abstractFincoUi.getSelectedRow());
    }

    public void addInterest() {
        System.out.println("AddInterest");
        createAccount.addInterest();
    }

    public void exit() {
        System.exit(0);
    }

    public void createAccount(Account account) {
        createAccount.createAccount(account);
    }

    public void depositAccount(int id, double sum) {
        entryOperation.deposit(id, sum);
    }

    public void withdrawMoney(int id, double sum) {
        entryOperation.withdraw(id, sum);
    }


}

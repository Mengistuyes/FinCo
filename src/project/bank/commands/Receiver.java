package project.bank.commands;

import project.bank.views.CompanyAccountView;
import project.bank.views.DepositView;
import project.bank.views.PersonalAccountView;
import project.bank.views.WithdrawView;
import project.finCoFramework.account.Account;
import project.finCoFramework.account.IAccount;
import project.finCoFramework.model.CreateAccountImpl;
import project.finCoFramework.model.ICreateAccount;
import project.finCoFramework.views.AbstractFincoUi;

public class Receiver {

    private AbstractFincoUi abstractFincoUi;
    private ICreateAccount createAccount;

    public Receiver(AbstractFincoUi abstractFincoUi) {
        this.abstractFincoUi = abstractFincoUi;
        createAccount = new CreateAccountImpl();
    }

    public void createPersonalAccount() {
        new PersonalAccountView(abstractFincoUi);
    }

    public void createCompanyAccount() {
        new CompanyAccountView(abstractFincoUi);
    }

    public void createDepositView() {
        new DepositView(abstractFincoUi);
    }

    public void createWithdrawView() {
        new WithdrawView(abstractFincoUi);
    }

    public void addInterest() {
        System.out.println("AddInterest");
    }

    public void exit() {
        System.exit(0);
    }

    public void createAccount(Account account) {
        createAccount.createAccount(account);
    }


}

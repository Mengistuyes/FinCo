package project.bank.commands;

import project.bank.views.CompanyAccountView;
import project.bank.views.DepositView;
import project.bank.views.PersonalAccountView;
import project.bank.views.WithdrawView;
import project.finCoFramework.account.IAccount;
import project.finCoFramework.views.AbstractFincoUi;

public class Receiver {

    private AbstractFincoUi abstractFincoUi;

    public Receiver(AbstractFincoUi abstractFincoUi) {
        this.abstractFincoUi = abstractFincoUi;
    }

    public void createPersonalAccount() {
        new PersonalAccountView(abstractFincoUi);
    }

    public void createCompanyAccount(){
        new CompanyAccountView(abstractFincoUi);
    }

    public void createDepositView(){
       new DepositView(abstractFincoUi);
    }

    public void createWithdrawView(){
      new WithdrawView(abstractFincoUi);
    }

    public void addInterest(){
        System.out.println("AddInterest");
    }
    public void exit(){
        System.exit(0);
    }



}

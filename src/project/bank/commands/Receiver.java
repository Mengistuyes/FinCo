package project.bank.commands;

import project.bank.views.CompanyAccountView;
import project.bank.views.DepositView;
import project.bank.views.PersonalAccountView;
import project.bank.views.WithdrawView;
import project.finCoFramework.account.IAccount;
import project.finCoFramework.views.AbstractFincoUi;

public class Receiver {

    private static AbstractFincoUi abstractFincoUi;

    public Receiver(AbstractFincoUi abstractFincoUi) {
        this.abstractFincoUi = abstractFincoUi;
    }

    public void createPersonalAccount() {
        PersonalAccountView personalAccountView = new PersonalAccountView(abstractFincoUi);
    }

    public void createCompanyAccount(){
        CompanyAccountView companyAccountView = new CompanyAccountView(abstractFincoUi);
    }

    public void createDepositView(){
        DepositView depositView = new DepositView(abstractFincoUi);
    }

    public void createWithdrawView(){
        WithdrawView withdrawView = new WithdrawView(abstractFincoUi);
    }

    public void addInterest(){
        System.out.println("AddInterest");
    }
    public void createAccount(IAccount account){

    }

    public void cancel(){

    }
}

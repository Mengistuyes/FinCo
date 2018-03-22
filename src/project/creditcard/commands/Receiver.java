package project.creditcard.commands;

import project.creditcard.views.CreditCardView;
import project.creditcard.views.DepositView;
import project.finCoFramework.account.Account;
import project.finCoFramework.model.CreateAccountImpl;
import project.finCoFramework.model.EntryOperation;
import project.finCoFramework.model.EntryOperationImpl;
import project.finCoFramework.model.ICreateAccount;
import project.finCoFramework.views.AbstractFincoUi;

public class Receiver {

    private AbstractFincoUi abstractFincoUi;
    private ICreateAccount createAccount;
    private EntryOperation entryOperation;

    public Receiver(AbstractFincoUi abstractFincoUi){
        this.abstractFincoUi = abstractFincoUi;
        this.createAccount = new CreateAccountImpl();
        this.entryOperation = new EntryOperationImpl();
    }
    public void openCreditCard(){
        new CreditCardView(abstractFincoUi);
    }

    public void generateMonthlyBill(){

    }

    public void openCharge(){

    }

    public void openDeposit(){
        new DepositView(abstractFincoUi, abstractFincoUi.getSelectedRow());
    }
    public void exit(){
        System.exit(0);
    }

    public void createAccount(Account account) {
        createAccount.createAccount(account);
    }

    public void depositAccount(int id, double sum){
        entryOperation.deposit(id, sum);
    }
}

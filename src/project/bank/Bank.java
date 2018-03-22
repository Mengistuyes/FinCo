package project.bank;

import project.bank.commands.account.AbstractCommand;
import project.bank.commands.account.Receiver;
import project.bank.commands.main.*;
import project.finCoFramework.account.Account;
import project.finCoFramework.model.CreateAccountImpl;
import project.finCoFramework.model.Entry;
import project.finCoFramework.model.Observer;
import project.finCoFramework.views.AbstractFincoUi;
import project.finCoFramework.views.commands.Command;

import javax.swing.*;
import java.util.List;

public class Bank extends AbstractFincoUi implements Observer {


    public Bank() {
        setTitle("CreditCard Application");
        setSize(600, 400);
        setVisibile(true);

        JButton personalAccount = new JButton();
        personalAccount.setBounds(24, 20, 192, 33);
        personalAccount.setText("Add Personal Account");

        JButton companyAccount = new JButton();
        companyAccount.setText("Add company account");
        companyAccount.setBounds(240, 20, 192, 33);

        JButton addInterest = new JButton();
        addInterest.setBounds(448, 20, 106, 33);
        addInterest.setText("Add interest");

        JButton deposit = new JButton();
        deposit.setText("Deposit");
        deposit.setBounds(468, 104, 96, 33);

        JButton withdraw = new JButton();
        withdraw.setText("Withdraw");
        withdraw.setBounds(468, 164, 96, 33);

        JButton exit = new JButton();
        exit.setText("Exit");
        exit.setBounds(468, 248, 96, 31);

        addButtons(addInterest);
        addButtons(personalAccount);
        addButtons(companyAccount);
        addButtons(deposit);
        addButtons(withdraw);
        addButtons(exit);

        addColumns("Account Number");
        addColumns("Name");
        addColumns("City");
        addColumns("P/C");
        addColumns("Ch/S");
        addColumns("Amount");

        Command addPersonalAcCommand = new OpenAddPersonalAcCommand(new Receiver(this));
        Command addAccountCommand = new OpenCompanyAccount(new Receiver(this));
        Command depositCommand = new OpenDepositCommand(new Receiver(this));
        Command withdrawCommand = new OpenWithdrawCommand(new Receiver(this));
        Command addInterestCommand = new OpenAddInterestCommand(new Receiver(this));
        Command exitCommand = new ExitCommand(new Receiver(this));


        addCommandClick(personalAccount, addPersonalAcCommand);
        addCommandClick(companyAccount, addAccountCommand);
        addCommandClick(deposit, depositCommand);
        addCommandClick(withdraw, withdrawCommand);
        addCommandClick(addInterest, addInterestCommand);
        addCommandClick(exit, exitCommand);

        //Registering for observer
        CreateAccountImpl createAccount = new CreateAccountImpl();
        createAccount.addSubscriberView(this);

        Entry entryOperation = new Entry();
        entryOperation.addSubscriberView(this);

        build();
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }

        //Create a new instance of our application's frame, and make it visible.
        (new Bank()).setVisibile(true);

    }

    @Override
    public void update(List<Account> accountList) {
        clearModel();
        for (Account ac : accountList) {
            Object[] rowData = new Object[8];
            rowData[0] = ac.getAccountNumber();
            rowData[1] = ac.getParty().getName();
            rowData[2] = ac.getParty().getCity();
            rowData[3] = ac.getParty().getTypeAccount();
            rowData[4] = ac.getAccountType();
            rowData[5] = ac.getBalance();
            addRowModel(rowData);
        }


    }
}

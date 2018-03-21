package project.bank;

import project.bank.commands.*;
import project.bank.commands.main.*;
import project.finCoFramework.account.Account;
import project.finCoFramework.model.CreateAccountImpl;
import project.finCoFramework.model.Observer;
import project.finCoFramework.views.AbstractFincoUi;
import project.finCoFramework.views.commands.Command;

import javax.swing.*;
import java.util.List;

public class Bank extends AbstractFincoUi implements Observer {


    public Bank() {
        setTitle("Bank Application");
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

        Command addPersonalAcCommand = new AddPersonalAcCommand(new Receiver(this));
        Command addAccountCommand = new AddCompanyAccount(new Receiver(this));
        Command depositCommand = new DepositCommand(new Receiver(this));
        Command withdrawCommand = new WithdrawCommand(new Receiver(this));
        Command addInterestCommand = new AddInterestCommand(new Receiver(this));
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
    public void update(Account account) {
        Object[] rowData = new Object[8];
        rowData[0] = account.getAccountNumber();
        rowData[1] = account.getParty().getName();
        rowData[2] = account.getParty().getCity();
        rowData[3] = account.getParty().getTypeAccount();
        rowData[4] = account.getAccountType();
        rowData[5] = account.getBalance();
        addRowModel(rowData);

    }
}

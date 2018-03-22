package project.creditcard;

import project.creditcard.commands.ExitCommand;
import project.creditcard.commands.OpenCreditAccountCommand;
import project.creditcard.commands.OpenDepositCommand;
import project.finCoFramework.account.Account;
import project.finCoFramework.model.CreateAccountImpl;
import project.finCoFramework.model.Entry;
import project.finCoFramework.model.Observer;
import project.finCoFramework.views.AbstractFincoUi;
import project.finCoFramework.views.commands.Command;

import javax.swing.*;
import java.util.List;

public class CreditCard extends AbstractFincoUi implements Observer {


    public CreditCard() {
        setTitle("CreditCard Application");
        setSize(600, 400);
        setVisibile(true);

        JButton creditCardAccount = new JButton();
        creditCardAccount.setBounds(24, 20, 192, 33);
        creditCardAccount.setText("Add Credit-card Account");

        JButton generateMonthlyBills = new JButton();
        generateMonthlyBills.setText("Generate Monthly Bills");
        generateMonthlyBills.setBounds(240, 20, 192, 33);

        JButton deposit = new JButton();
        deposit.setText("Deposit");
        deposit.setBounds(468, 104, 96, 33);

        JButton charge = new JButton();
        charge.setText("Charge");
        charge.setBounds(468, 164, 96, 33);

        JButton exit = new JButton();
        exit.setText("Exit");
        exit.setBounds(468, 248, 96, 31);

        addButtons(creditCardAccount);
        addButtons(generateMonthlyBills);
        addButtons(deposit);
        addButtons(charge);
        addButtons(exit);

        addColumns("Name");
        addColumns("CCNumber");
        addColumns("Exp Date");
        addColumns("Type");
        addColumns("Balance");

        Command creditAccountCommand = new OpenCreditAccountCommand(new project.creditcard.commands.Receiver(this));
        Command depositCommand = new OpenDepositCommand(new project.creditcard.commands.Receiver(this));
//        Command withdrawCommand = new OpenWithdrawCommand(new Receiver(this));
//        Command addInterestCommand = new OpenAddInterestCommand(new Receiver(this));
        Command exitCommand = new ExitCommand(new project.creditcard.commands.Receiver(this));


        addCommandClick(creditCardAccount, creditAccountCommand);
        addCommandClick(deposit, depositCommand);
//        addCommandClick(withdraw, withdrawCommand);
//        addCommandClick(addInterest, addInterestCommand);
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
        (new CreditCard()).setVisibile(true);

    }

    @Override
    public void update(List<Account> accountList) {
        clearModel();
        for (Account ac : accountList) {
            Object[] rowData = new Object[8];
            rowData[0] = ac.getParty().getName();
            rowData[1] = ac.getAccountNumber();
            rowData[2] = "Unknown";
            rowData[3] = ac.getAccountType();
            rowData[4] = ac.getBalance();
            addRowModel(rowData);
        }
    }


}

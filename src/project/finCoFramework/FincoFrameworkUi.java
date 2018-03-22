package project.finCoFramework;

import project.finCoFramework.account.Account;
import project.finCoFramework.account.IAccount;
import project.finCoFramework.model.CreateAccountImpl;
import project.finCoFramework.model.Entry;
import project.finCoFramework.model.ICreateAccount;
import project.finCoFramework.model.Observer;
import project.finCoFramework.views.AbstractFincoUi;
import project.finCoFramework.views.commands.maincommands.ExitCommand;

import javax.swing.*;
import java.util.List;

public class FincoFrameworkUi extends AbstractFincoUi implements Observer {


    public FincoFrameworkUi() {

        setVisibile(true);
        setTitle("Default Framework Title");
        setSize(575, 310);

        //Adding the buttons for Ui Framework
        JButton defaultButton = new JButton();
        defaultButton.setBounds(24, 20, 192, 33);
        defaultButton.setText("Add Personal Account");

        addButtons(defaultButton);
        addCommandClick(defaultButton, new ExitCommand());

        //Adding the columns for framework fields
        addColumns("1st Field");
        addColumns("2nd Field");
        addColumns("3rd Field");
        addColumns("4th Field");
        addColumns("5th Field");
        addColumns("6th Field");

        //for subscribing for listeners
        CreateAccountImpl account = new CreateAccountImpl();
        account.addSubscriberView(this);

        Entry entry  = new Entry();
        entry.addSubscriberView(this);
    }

    public static void main(String[] args) {
        new FincoFrameworkUi().setVisibile(true);

    }

    @Override
    public void update(List<Account> list) {
        System.out.println("Custom Update is ");
    }
}

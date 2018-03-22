package project.creditcard.views;

import project.creditcard.commands.Receiver;
import project.creditcard.commands.menu.DepositOkCommands;
import project.creditcard.commands.menu.TransactionCancelCo;
import project.finCoFramework.account.Account;
import project.finCoFramework.entry.Transaction;
import project.finCoFramework.model.FincoDao;
import project.finCoFramework.views.AbstractFincoUi;
import project.finCoFramework.views.AbstractPopUp;
import project.finCoFramework.views.commands.Command;

import javax.swing.*;

public class DepositView implements Transaction {
    private AbstractPopUp abstractPopUp;
    private FincoDao fincoDao;
    private JTextField deposit = new JTextField();

    public DepositView(AbstractFincoUi abstractFincoUi, int id) {
        abstractPopUp = new AbstractPopUp(abstractFincoUi);
        abstractPopUp.setTitle("Deposit");
        abstractPopUp.setSize(268, 100);

        fincoDao = FincoDao.getInstance();
        JLabel accountLabel = new JLabel();
        accountLabel.setText("Acc Nr");
        accountLabel.setBounds(12, 12, 60, 24);


        JLabel amountLabel = new JLabel();
        amountLabel.setText("Amount");
        amountLabel.setBounds(12, 48, 60, 24);


        JTextField account = new JTextField();
        account.setEditable(false);

        Account account1 = fincoDao.getAccountById(id);
        account.setText(account1.getAccountNumber());
        account.setBounds(84, 12, 144, 24);

        deposit.setBounds(84, 48, 144, 24);


        JButton okButton = new JButton();
        okButton.setText("OK");
        okButton.setBounds(36, 84, 84, 24);

        JButton cancelButton = new JButton();
        cancelButton.setText("Cancel");
        cancelButton.setBounds(156, 84, 84, 24);

        abstractPopUp.addComponents(accountLabel);
        abstractPopUp.addComponents(amountLabel);
        abstractPopUp.addComponents(account);
        abstractPopUp.addComponents(deposit);
        abstractPopUp.addComponents(okButton);
        abstractPopUp.addComponents(cancelButton);

        Receiver receiver = new Receiver(abstractFincoUi);
        Command command = new DepositOkCommands(receiver, id, this);
        abstractPopUp.addActionListener(okButton, command);

        Command command1 = new TransactionCancelCo(this);
        abstractPopUp.addActionListener(cancelButton, command1);

        abstractPopUp.setBounds(450, 20, 300, 330);
        abstractPopUp.show();
        abstractPopUp.build();
    }


    @Override
    public double getTransaction() {
        return Double.parseDouble(deposit.getText());
    }

    @Override
    public void close() {
        abstractPopUp.close();
    }
}

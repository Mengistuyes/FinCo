package project.bank.views;

import project.bank.commands.account.Receiver;
import project.bank.commands.account.TransactionCancelCommand;
import project.bank.commands.account.WithDrawCommand;
import project.finCoFramework.entry.EntryCommand;
import project.finCoFramework.account.Account;
import project.finCoFramework.model.FincoDao;
import project.finCoFramework.views.AbstractFincoUi;
import project.finCoFramework.views.AbstractPopUp;
import project.finCoFramework.views.commands.Command;

import javax.swing.*;

public class WithdrawView implements EntryCommand {

    private AbstractPopUp abstractPopUp;
    private FincoDao fincoDao;
    protected JTextField deposit = new JTextField();

    public WithdrawView(AbstractFincoUi abstractFincoUi, int id) {
        abstractPopUp = new AbstractPopUp(abstractFincoUi);
        abstractPopUp.setTitle("Withdraw");
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
        account.setBounds(84, 12, 144, 24);

        deposit.setBounds(84, 48, 144, 24);

        Account account1 = fincoDao.getAccountById(id);
        account.setText(account1.getAccountNumber());

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

        Command withDrawCommand = new WithDrawCommand(receiver, id, this);
        abstractPopUp.addActionListener(okButton, withDrawCommand);
        Command cancelCommand = new TransactionCancelCommand(this);
        abstractPopUp.addActionListener(cancelButton, cancelCommand);


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

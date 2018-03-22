package project.bank.commands.account;

import project.finCoFramework.entry.Transaction;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class WithDrawCommand implements Command {

    private Receiver receiver;
    private int id;
    private Transaction transaction;

    public WithDrawCommand(Receiver receiver, int id, Transaction transaction){
        this.receiver = receiver;
        this.id = id;
        this.transaction = transaction;
    }
    @Override
    public void execute(ActionEvent actionEvent) {
        receiver.withdrawMoney(id, transaction.getTransaction());
        transaction.close();
    }
}

package project.bank.commands.account;

import project.finCoFramework.entry.EntryCommand;

import java.awt.event.ActionEvent;

public class WithDrawCommand extends AbstractCommand {

    private Receiver receiver;
    private int id;
    private EntryCommand transaction;

    public WithDrawCommand(Receiver receiver, int id, EntryCommand transaction){
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

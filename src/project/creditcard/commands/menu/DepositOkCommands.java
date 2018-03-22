package project.creditcard.commands.menu;

import project.creditcard.commands.Receiver;
import project.finCoFramework.entry.EntryCommandInterface;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class DepositOkCommands implements Command {

    private Receiver receiver;
    private int id;
    private EntryCommandInterface transaction;

    public DepositOkCommands(Receiver receiver, int id, EntryCommandInterface transaction){
        this.receiver = receiver;
        this.id = id;
        this.transaction = transaction;
    }


    @Override
    public void execute(ActionEvent actionEvent) {
        receiver.depositAccount(id, transaction.getTransaction());
        transaction.close();
    }
}

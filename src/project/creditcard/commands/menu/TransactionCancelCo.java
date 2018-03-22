package project.creditcard.commands.menu;

import project.finCoFramework.entry.EntryCommandInterface;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class TransactionCancelCo implements Command {
    private EntryCommandInterface transaction;

    public TransactionCancelCo(EntryCommandInterface transaction){
        this.transaction = transaction;
    }


    @Override
    public void execute(ActionEvent actionEvent) {
        transaction.close();
    }
}

package project.creditcard.commands.menu;

import project.finCoFramework.entry.EntryCommand;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class TransactionCancelCo implements Command {
    private EntryCommand transaction;

    public TransactionCancelCo(EntryCommand transaction){
        this.transaction = transaction;
    }


    @Override
    public void execute(ActionEvent actionEvent) {
        transaction.close();
    }
}

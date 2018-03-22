package project.creditcard.commands.menu;

import project.finCoFramework.entry.Transaction;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class TransactionCancelCo implements Command {
    private Transaction transaction;

    public TransactionCancelCo(Transaction transaction){
        this.transaction = transaction;
    }


    @Override
    public void execute(ActionEvent actionEvent) {
        transaction.close();
    }
}

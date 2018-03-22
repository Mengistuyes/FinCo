package project.bank.commands.account;

import project.finCoFramework.entry.EntryCommandInterface;

import java.awt.event.ActionEvent;

public class TransactionCancelCommand extends AbstractCommand{

    private EntryCommandInterface transaction;

    public TransactionCancelCommand(EntryCommandInterface transaction){
        this.transaction = transaction;
    }


    @Override
    public void execute(ActionEvent actionEvent) {
        transaction.close();
    }
}

package project.bank.commands.account;

import project.finCoFramework.entry.EntryCommand;

import java.awt.event.ActionEvent;

public class TransactionCancelCommand extends AbstractCommand{

    private EntryCommand transaction;

    public TransactionCancelCommand(EntryCommand transaction){
        this.transaction = transaction;
    }


    @Override
    public void execute(ActionEvent actionEvent) {
        transaction.close();
    }
}

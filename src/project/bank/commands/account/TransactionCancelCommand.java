package project.bank.commands.account;

import project.bank.commands.main.Transaction;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class TransactionCancelCommand implements Command{

    private Transaction transaction;

    public TransactionCancelCommand(Transaction transaction){
        this.transaction = transaction;
    }


    @Override
    public void execute(ActionEvent actionEvent) {
        transaction.close();
    }
}

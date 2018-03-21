package project.bank.commands.account;

import project.bank.commands.main.Transaction;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class DepositOkCommand implements Command {

   private project.bank.commands.Receiver receiver;
   private int id;
   private Transaction transaction;

   public DepositOkCommand(project.bank.commands.Receiver receiver, int id, Transaction transaction){
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

package project.bank.commands.account;

import project.finCoFramework.entry.EntryCommandInterface;

import java.awt.event.ActionEvent;

public class DepositOkCommand extends AbstractCommand{

   private Receiver receiver;
   private int id;
   private EntryCommandInterface transaction;

   public DepositOkCommand(Receiver receiver, int id, EntryCommandInterface transaction){
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

package project.bank.commands.account;

import project.bank.commands.Receiver;
import project.finCoFramework.account.IAccount;
import project.finCoFramework.model.CreateAccountImpl;
import project.finCoFramework.model.ICreateAccount;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class OkCommand implements Command {
    private Receiver receiver;
    private IAccount account;

    public OkCommand(Receiver receiver, IAccount account) {
        this.receiver = receiver;
        this.account = account;
    }


    @Override
    public void execute(ActionEvent actionEvent) {
        receiver.createAccount(account);
    }
}

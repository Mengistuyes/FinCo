package project.bank.commands.account;

import project.bank.commands.Receiver;
import project.finCoFramework.account.IAccount;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class OkCommand implements Command {
    private Receiver receiver;

    public OkCommand(Receiver receiver) {
        this.receiver = receiver;
    }


    @Override
    public void execute(ActionEvent actionEvent) {

    }
}

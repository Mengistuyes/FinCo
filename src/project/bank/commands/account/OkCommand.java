package project.bank.commands.account;

import project.finCoFramework.views.CommandView;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class OkCommand implements Command {
    private Receiver receiver;
    private CommandView abstractPopUp;

    public OkCommand(Receiver receiver, CommandView abstractPopUp) {
        this.receiver = receiver;
        this.abstractPopUp = abstractPopUp;
    }


    @Override
    public void execute(ActionEvent actionEvent) {
        receiver.createAccount(abstractPopUp.getAccount());
        abstractPopUp.close();
    }
}

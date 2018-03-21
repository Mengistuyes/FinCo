package project.bank.commands.account;

import project.bank.commands.Receiver;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class CancelCommand implements Command {

    private Receiver receiver;

    public CancelCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(ActionEvent actionEvent) {

    }
}
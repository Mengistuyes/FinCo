package project.creditcard.commands;

import project.bank.commands.Receiver;
import project.finCoFramework.views.CommandView;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class ExitCommand implements Command {

    private project.creditcard.commands.Receiver receiver;

    public ExitCommand(project.creditcard.commands.Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute(ActionEvent actionEvent) {
        receiver.exit();
    }
}

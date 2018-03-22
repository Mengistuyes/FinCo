package project.bank.commands.account;

import project.finCoFramework.views.CommandView;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class CancelCommand extends AbstractCommand {

    private Receiver receiver;
    private CommandView commandView;

    public CancelCommand(Receiver receiver, CommandView commandView) {
        this.receiver = receiver;
        this.commandView = commandView;
    }

    @Override
    public void execute(ActionEvent actionEvent) {
        commandView.close();
    }
}

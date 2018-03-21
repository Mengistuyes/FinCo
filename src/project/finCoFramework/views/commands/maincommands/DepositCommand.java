package project.finCoFramework.views.commands.maincommands;

import project.finCoFramework.views.commands.Receiver;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class DepositCommand implements Command {

    private Receiver reciever;

    public DepositCommand(Receiver reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute(ActionEvent actionEvent) {
        reciever.performDeposit(actionEvent);
    }
}

package project.creditcard.commands;

import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class OpenChargeCommand implements Command {

    private Receiver receiver;

    public OpenChargeCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute(ActionEvent actionEvent) {
        receiver.openCharge();
    }
}

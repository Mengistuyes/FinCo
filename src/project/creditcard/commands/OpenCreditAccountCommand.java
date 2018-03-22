package project.creditcard.commands;

import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class OpenCreditAccountCommand implements Command {

    private Receiver receiver;

    public OpenCreditAccountCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute(ActionEvent actionEvent) {
        receiver.openCreditCard();
    }
}

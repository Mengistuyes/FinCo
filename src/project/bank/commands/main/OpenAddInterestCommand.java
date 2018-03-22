package project.bank.commands.main;

import project.bank.commands.account.Receiver;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class OpenAddInterestCommand implements Command {

    private Receiver receiver;

    public OpenAddInterestCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(ActionEvent actionEvent) {
        receiver.addInterest();
    }
}

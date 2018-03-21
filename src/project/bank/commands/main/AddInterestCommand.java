package project.bank.commands.main;

import project.bank.commands.Receiver;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class AddInterestCommand implements Command{

    private Receiver receiver;

    public AddInterestCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute(ActionEvent actionEvent) {
        receiver.addInterest();
    }
}

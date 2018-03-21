package project.bank.commands.main;

import project.bank.commands.Receiver;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class AddPersonalAcCommand implements Command {

    private Receiver reciever;

    public AddPersonalAcCommand(Receiver reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute(ActionEvent actionEvent) {
        System.out.println("Personal Account");
        reciever.createPersonalAccount();

    }
}

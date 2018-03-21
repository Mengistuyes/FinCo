package project.finCoFramework.views.commands.maincommands;

import project.finCoFramework.views.commands.Receiver;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class AddAccount implements Command {
    private Receiver reciever;

    public AddAccount(Receiver reciever){
        this.reciever =  reciever;
    }

    @Override
    public void execute(ActionEvent actionEvent) {
        reciever.createAccount(actionEvent);
    }
}

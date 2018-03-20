package project.finCoFramework.views.commands.maincommands;

import project.finCoFramework.views.Reciever;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class AddAccount implements Command {
    private Reciever reciever;

    public AddAccount(Reciever reciever){
        this.reciever =  reciever;
    }

    @Override
    public void execute(ActionEvent actionEvent) {
        reciever.createAccount(actionEvent);
    }
}

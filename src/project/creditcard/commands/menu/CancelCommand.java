package project.creditcard.commands.menu;

import project.finCoFramework.views.CommandView;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class CancelCommand implements Command {

    private CommandView commandView;

    public CancelCommand(CommandView commandView){
        this.commandView = commandView;
    }

    @Override
    public void execute(ActionEvent actionEvent) {
        commandView.close();
    }
}

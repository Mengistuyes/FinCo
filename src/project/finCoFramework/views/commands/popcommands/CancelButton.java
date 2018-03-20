package project.finCoFramework.views.commands.popcommands;

import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class CancelButton implements Command {
    @Override
    public void execute(ActionEvent actionEvent) {
        System.out.println("Cancel Button");
    }
}

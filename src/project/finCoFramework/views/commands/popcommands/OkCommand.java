package project.finCoFramework.views.commands.popcommands;

import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class OkCommand implements Command {
    @Override
    public void execute(ActionEvent actionEvent) {
        System.out.println("Ok Button");
    }
}

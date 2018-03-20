package project.finCoFramework.views.commands;

import java.awt.event.ActionEvent;

public class CommandInvoker {
    private Command command;

    public CommandInvoker(Command command) {
        this.command = command;
    }


    public void execute(ActionEvent actionEvent) {
        command.execute(actionEvent);
    }
}

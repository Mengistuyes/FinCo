package project.finCoFramework.views.commands.maincommands;

import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class ExitCommand implements Command {

    @Override
    public void execute(ActionEvent actionEvent) {
        System.out.println("Button Clicked Test");

    }
}

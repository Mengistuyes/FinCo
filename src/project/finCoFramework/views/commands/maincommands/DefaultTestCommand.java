package project.finCoFramework.views.commands.maincommands;

import project.finCoFramework.views.commands.Command;
import project.finCoFramework.views.commands.Receiver;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;

public class DefaultTestCommand implements Command {

    private Receiver receiver;

    public DefaultTestCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(ActionEvent actionEvent) {
        System.out.println("Exit");
        receiver.buttonExit(actionEvent);
    }
}

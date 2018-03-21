package project.bank.commands.main;

import com.sun.org.apache.regexp.internal.RE;
import project.bank.commands.Receiver;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class ExitCommand implements Command {

    private Receiver receiver;

    public ExitCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute(ActionEvent actionEvent) {
        receiver.exit();
    }
}

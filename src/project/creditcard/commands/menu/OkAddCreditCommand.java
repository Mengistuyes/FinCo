package project.creditcard.commands.menu;

import project.finCoFramework.views.CommandView;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class OkAddCreditCommand implements Command {
    private project.creditcard.commands.Receiver receiver;
    private CommandView abstractPopUp;

    public OkAddCreditCommand(project.creditcard.commands.Receiver receiver, CommandView abstractPopUp) {
        this.receiver = receiver;
        this.abstractPopUp = abstractPopUp;
    }


    @Override
    public void execute(ActionEvent actionEvent) {
        receiver.createAccount(abstractPopUp.getAccount());
        abstractPopUp.close();
    }
}

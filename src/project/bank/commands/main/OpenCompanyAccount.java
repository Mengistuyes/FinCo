package project.bank.commands.main;

import project.bank.commands.account.AbstractCommand;
import project.bank.commands.account.Receiver;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class OpenCompanyAccount extends AbstractCommand {

    private Receiver receiver;

    public OpenCompanyAccount(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute(ActionEvent actionEvent) {
        receiver.createCompanyAccount();
    }
}

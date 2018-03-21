package project.bank.commands;

import project.finCoFramework.entry.Deposit;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class DepositCommand implements Command {


    private Receiver receiver;

    public DepositCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(ActionEvent actionEvent) {
        receiver.createDepositView();
    }
}

package project.finCoFramework.views.commands.maincommands;

import project.bank.Deposit;
import project.finCoFramework.views.Reciever;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class DepositCommand implements Command {

    private Reciever reciever;

    public DepositCommand(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute(ActionEvent actionEvent) {
        reciever.performDeposit(actionEvent);
    }
}

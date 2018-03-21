package project.bank.commands.main;

import project.bank.commands.Receiver;
import project.finCoFramework.views.commands.Command;

import java.awt.event.ActionEvent;

public class WithdrawCommand implements Command {

    private Receiver receiver;

    public WithdrawCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute(ActionEvent actionEvent) {
        receiver.createWithdrawView();
    }
}

package project.finCoFramework.views;

import project.finCoFramework.account.Account;

import javax.swing.*;
import java.awt.*;

public class EntryPopUp implements CommandView{

    private AbstractPopUp abstractPopUp;

    public EntryPopUp(AbstractFincoUi abstractFincoUi) {
        abstractPopUp = new AbstractPopUp(abstractFincoUi);
        abstractPopUp.setTitle("Default Transaction Title");
        abstractPopUp.setSize(268, 126);

        //Adding label for our abstract Pop Up

        JLabel nameLabel = new JLabel();
        nameLabel.setText("Name");
        nameLabel.setForeground(Color.black);
        nameLabel.setBounds(12,12,48,24);
        abstractPopUp.addComponents(nameLabel);

        //Place where the setBounds
        abstractPopUp.setBounds(450, 20, 300, 330);
        abstractPopUp.show();
        abstractPopUp.build();
    }


    @Override
    public Account getAccount() {
        return null;
    }

    @Override
    public void close() {

    }
}

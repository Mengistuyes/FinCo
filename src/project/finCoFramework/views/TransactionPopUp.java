package project.finCoFramework.views;

import javax.swing.*;
import java.awt.*;

public class TransactionPopUp {

    private AbstractPopUp abstractPopUp;

    public TransactionPopUp(AbstractFincoUi abstractFincoUi) {
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




}

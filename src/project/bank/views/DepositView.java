package project.bank.views;

import project.bank.commands.DepositCommand;
import project.bank.commands.Receiver;
import project.finCoFramework.views.AbstractFincoUi;
import project.finCoFramework.views.AbstractPopUp;
import project.finCoFramework.views.commands.Command;

import javax.swing.*;
import java.awt.*;

public class DepositView {

   private  AbstractPopUp abstractPopUp;

   public DepositView(AbstractFincoUi abstractFincoUi){
       abstractPopUp =  new AbstractPopUp(abstractFincoUi);
       abstractPopUp.setTitle("Deposit");
       abstractPopUp.setSize(268,100);

       JLabel accountLabel = new JLabel();
       accountLabel.setText("Acc Nr");
       accountLabel.setBounds(12,12,60,24);


       JLabel amountLabel = new JLabel();
       amountLabel.setText("Amount");
       amountLabel.setBounds(12,48,60,24);


       JTextField account = new JTextField();
       account.setEditable(false);
       account.setBounds(84,12,144,24);

       JTextField deposit = new JTextField();
       deposit.setBounds(84,48,144,24);


       JButton okButton = new JButton();
       okButton.setText("OK");
       okButton.setBounds(36,84,84,24);

       JButton cancelButton = new JButton();
       cancelButton.setText("Cancel");
       cancelButton.setBounds(156,84,84,24);

       abstractPopUp.addComponents(accountLabel);
       abstractPopUp.addComponents(amountLabel);
       abstractPopUp.addComponents(account);
       abstractPopUp.addComponents(deposit);
       abstractPopUp.addComponents(okButton);
       abstractPopUp.addComponents(cancelButton);


       abstractPopUp.setBounds(450, 20, 300, 330);
       abstractPopUp.show();
       abstractPopUp.build();
   }
}

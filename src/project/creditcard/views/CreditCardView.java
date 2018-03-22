package project.creditcard.views;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import project.creditcard.commands.Receiver;
import project.creditcard.commands.menu.CancelCommand;
import project.creditcard.commands.menu.OkAddCreditCommand;
import project.creditcard.model.BronzeAccount;
import project.creditcard.model.CreditParty;
import project.creditcard.model.GoldAccount;
import project.creditcard.model.SilverAccount;
import project.finCoFramework.account.Account;
import project.finCoFramework.party.Party;
import project.bank.model.Person;
import project.finCoFramework.views.AbstractFincoUi;
import project.finCoFramework.views.AbstractPopUp;
import project.finCoFramework.views.CommandView;
import project.finCoFramework.views.commands.Command;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class CreditCardView implements CommandView {

    private AbstractPopUp abstractPopUp;
    private JRadioButton goldRadio = new JRadioButton();
    private JRadioButton silverRadio = new JRadioButton();
    private JRadioButton bronzeRadio = new JRadioButton();
    private JTextField textName = new JTextField();
    private JTextField textCity = new JTextField();
    private JTextField textState = new JTextField();
    private JTextField textStreet = new JTextField();
    private JTextField textZip = new JTextField();
    private JTextField textCCnumber = new JTextField();
    private JTextField textEmail = new JTextField();
    private JTextField expireDateText = new JTextField();
    private Account account = null;

    public CreditCardView(AbstractFincoUi abstractFincoUi) {

        abstractPopUp = new AbstractPopUp(abstractFincoUi);
        abstractPopUp.setTitle("Add Credit Card");
        abstractPopUp.setSize(500, 250);


        //CheckingAccount Radio Button
        goldRadio.setText("Gold");
        goldRadio.setBounds(36, 0, 84, 24);

        //SavingAccount Radio Button
        silverRadio.setText("Silver");
        silverRadio.setBounds(36, 24, 84, 24);

        bronzeRadio.setText("Bronze");
        bronzeRadio.setBounds(36, 48, 84, 24);


        JLabel nameLabel = new JLabel();
        nameLabel.setText("Name");
        nameLabel.setBounds(12, 84, 48, 24);


        JLabel street = new JLabel();
        street.setText("Street");
        street.setBounds(12, 108, 48, 24);

        JLabel city = new JLabel();
        city.setText("City");
        city.setBounds(12, 132, 48, 24);

        JLabel state = new JLabel();
        state.setText("State");
        state.setBounds(12, 156, 48, 24);

        JLabel zip = new JLabel();
        zip.setText("Zip");
        zip.setBounds(12, 180, 48, 24);

        JLabel ccnumber = new JLabel();
        ccnumber.setText("CC number");
        ccnumber.setBounds(12, 204, 96, 24);

        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(12, 228, 48, 24);

        JLabel expireDate = new JLabel();
        expireDate.setText("Exp. Date");
        expireDate.setBounds(12, 252, 96, 24);


        textName.setBounds(84, 84, 156, 20);
        textCity.setBounds(84, 132, 156, 20);
        textState.setBounds(84, 156, 156, 20);
        textStreet.setBounds(84, 108, 156, 20);
        textZip.setBounds(84, 180, 156, 20);
        textCCnumber.setBounds(84, 204, 156, 20);
        textEmail.setBounds(84, 228, 156, 20);
        expireDateText.setBounds(84, 252, 156, 20);


        JButton okButton = new JButton();
        okButton.setText("OK");
        okButton.setBounds(48, 280, 84, 24);

        JButton cancelButton = new JButton();
        cancelButton.setText("Cancel");
        cancelButton.setBounds(156, 280, 84, 24);


        abstractPopUp.addComponents(cancelButton);
        abstractPopUp.addComponents(okButton);

        abstractPopUp.addComponents(textName);
        abstractPopUp.addComponents(textCity);
        abstractPopUp.addComponents(textState);
        abstractPopUp.addComponents(textStreet);
        abstractPopUp.addComponents(textZip);
        abstractPopUp.addComponents(textCCnumber);
        abstractPopUp.addComponents(textEmail);
        abstractPopUp.addComponents(expireDateText);

        abstractPopUp.addComponents(nameLabel);
        abstractPopUp.addComponents(street);
        abstractPopUp.addComponents(city);
        abstractPopUp.addComponents(state);
        abstractPopUp.addComponents(zip);
        abstractPopUp.addComponents(ccnumber);
        abstractPopUp.addComponents(email);
        abstractPopUp.addComponents(expireDate);
        abstractPopUp.addComponents(goldRadio);
        abstractPopUp.addComponents(silverRadio);
        abstractPopUp.addComponents(bronzeRadio);

        SymMouse mouse = new SymMouse();
        goldRadio.addMouseListener(mouse);
        silverRadio.addMouseListener(mouse);
        bronzeRadio.addMouseListener(mouse);


        Command okCommand = new OkAddCreditCommand(new Receiver(abstractFincoUi), this);
        Command cancelCommand = new CancelCommand( this);

        abstractPopUp.addActionListener(okButton, okCommand);
        abstractPopUp.addActionListener(cancelButton, cancelCommand);


        //Place where the setBounds
        abstractPopUp.setBounds(450, 20, 300, 330);
        abstractPopUp.show();
        abstractPopUp.build();
    }

    public Account getAccount() {
        Party accountParty = new CreditParty(textName.getText(),
                textStreet.getText(), textCity.getText(), textState.getText(), textZip.getText(), textEmail.getText());
        if (goldRadio.isSelected()) {
            account = new GoldAccount("golden", textCCnumber.getText(), accountParty, expireDateText.getText());
        } else if (silverRadio.isSelected()) {
            account = new SilverAccount("silver", textCCnumber.getText(), accountParty, expireDateText.getText());
        } else if (bronzeRadio.isSelected()) {
            account = new BronzeAccount("bronze", textCCnumber.getText(), accountParty, expireDateText.getText());
        }
        return account;
    }

    @Override
    public void close() {
        abstractPopUp.close();
    }


    void radioGoldClicked(MouseEvent event) {
        goldRadio.setSelected(true);
        silverRadio.setSelected(false);
        bronzeRadio.setSelected(false);
    }

    void radioSilverBoxClick(MouseEvent event) {
        goldRadio.setSelected(false);
        silverRadio.setSelected(true);
        bronzeRadio.setSelected(false);
    }

    void radioBronzeBoxClick(MouseEvent event) {
        silverRadio.setSelected(false);
        goldRadio.setSelected(false);
        bronzeRadio.setSelected(true);

    }

    class SymMouse extends java.awt.event.MouseAdapter {
        public void mouseClicked(java.awt.event.MouseEvent event) {
            Object object = event.getSource();
            if (object == goldRadio)
                radioGoldClicked(event);
            else if (object == silverRadio)
                radioSilverBoxClick(event);
            else if (object == bronzeRadio)
                radioBronzeBoxClick(event);
        }
    }
}

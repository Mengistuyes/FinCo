package project.bank.views;

import project.bank.commands.Receiver;
import project.bank.commands.account.CancelCommand;
import project.bank.commands.account.OkCommand;
import project.bank.model.SavingAccount;
import project.finCoFramework.account.Account;
import project.bank.model.CheckingAccount;
import project.bank.model.Organization;
import project.finCoFramework.party.Party;
import project.finCoFramework.views.AbstractFincoUi;
import project.finCoFramework.views.AbstractPopUp;
import project.finCoFramework.views.CommandView;
import project.finCoFramework.views.commands.Command;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class CompanyAccountView implements CommandView {

    private AbstractPopUp abstractPopUp;
    private JRadioButton radioButtonChecking = new JRadioButton();
    private JRadioButton savingRadioButton = new JRadioButton();
    private JTextField textAccount = new JTextField();
    private JTextField textName = new JTextField();
    private JTextField textCity = new JTextField();
    private JTextField textState = new JTextField();
    private JTextField textStreet = new JTextField();
    private JTextField textZip= new JTextField();
    private JTextField textNumberEmployees= new JTextField();
    private JTextField textEmail = new JTextField();
    private Account account = null;

    public CompanyAccountView(AbstractFincoUi abstractFincoUi) {
        abstractPopUp = new AbstractPopUp(abstractFincoUi);
        abstractPopUp.setTitle("Add Company Account");
        abstractPopUp.setSize(500, 200);


        //CheckingAccount Radio Button

        radioButtonChecking.setText("Checkings");
        radioButtonChecking.setBounds(36,0,84,24);

        //SavingAccount Radio Button

        savingRadioButton.setText("Savings");
        savingRadioButton.setBounds(36,24,84,24);




        JLabel accountLabel = new JLabel();
        accountLabel.setText("Acc Nr");
        accountLabel.setBounds(12,60,48,24);


        JLabel nameLabel = new JLabel();
        nameLabel.setText("Name");
        nameLabel.setBounds(12,84,48,24);


        JLabel street = new JLabel();
        street.setText("Street");
        street.setBounds(12, 108, 48, 24);

        JLabel city = new JLabel();
        city.setText("City");
        city.setBounds(12, 132, 48, 24);

        JLabel state = new JLabel();
        state.setText("State");
        state.setBounds(12,156,48,24);

        JLabel zip = new JLabel();
        zip.setText("Zip");
        zip.setBounds(12, 180, 48, 24);

        JLabel numberOfEmployees = new JLabel();
        numberOfEmployees.setText("No of Employees");
        numberOfEmployees.setBounds(12, 204, 96, 24);

        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(12, 228, 48, 24);

        textAccount.setBounds(84,60,156,20);
        textName.setBounds(84,84,156,20);
        textCity.setBounds(84,132,156,20);
        textState.setBounds(84,156,156,20);
        textStreet.setBounds(84,108,156,20);
        textZip.setBounds(84,180,156,20);
        textNumberEmployees.setBounds(84,204,156,20);
        textEmail.setBounds(84,228,156,20);



        JButton okButton  = new JButton();
        okButton.setText("OK");
        okButton.setBounds(48,264,84,24);

        JButton cancelButton = new JButton();
        cancelButton.setText("Cancel");
        cancelButton.setBounds(156,264,84,24);


        SymMouse mouse = new SymMouse();
        radioButtonChecking.addMouseListener(mouse);
        savingRadioButton.addMouseListener(mouse);

        Command okCommand = new OkCommand(new Receiver(abstractFincoUi), this);
        Command cancelCommand = new CancelCommand(new Receiver(abstractFincoUi), this);

        abstractPopUp.addActionListener(okButton, okCommand);
        abstractPopUp.addActionListener(cancelButton, cancelCommand);

        abstractPopUp.addComponents(cancelButton);
        abstractPopUp.addComponents(okButton);
        abstractPopUp.addComponents(textName);
        abstractPopUp.addComponents(textCity);
        abstractPopUp.addComponents(textState);
        abstractPopUp.addComponents(textStreet);
        abstractPopUp.addComponents(textZip);
        abstractPopUp.addComponents(textNumberEmployees);
        abstractPopUp.addComponents(textEmail);
        abstractPopUp.addComponents(textAccount);

        abstractPopUp.addComponents(nameLabel);
        abstractPopUp.addComponents(street);
        abstractPopUp.addComponents(city);
        abstractPopUp.addComponents(state);
        abstractPopUp.addComponents(zip);
        abstractPopUp.addComponents(numberOfEmployees);
        abstractPopUp.addComponents(email);
        abstractPopUp.addComponents(accountLabel);
        abstractPopUp.addComponents(radioButtonChecking);
        abstractPopUp.addComponents(savingRadioButton);
        //Place where the setBounds
        abstractPopUp.setBounds(450, 20, 300, 330);
        abstractPopUp.show();
        abstractPopUp.build();
    }

    public Account getAccount() {
        Party personalAccount = new Organization(Integer.parseInt(textNumberEmployees.getText()), textName.getText(),
                textStreet.getText(), textCity.getText(), textState.getText(), textZip.getText(), textEmail.getText());

        if (radioButtonChecking.isSelected()) {
            account = new CheckingAccount("checking", textAccount.getText(), personalAccount);
        }
        if (savingRadioButton.isSelected()) {
            account = new SavingAccount("saving", textAccount.getText(), personalAccount);
        }
        return account;
    }

    @Override
    public void close() {
        abstractPopUp.close();
    }

    void radioCheckBoxClicked(MouseEvent event) {
        radioButtonChecking.setSelected(true);
        savingRadioButton.setSelected(false);
    }

    void radioSavingBoxClick(MouseEvent event) {
        radioButtonChecking.setSelected(false);
        savingRadioButton.setSelected(true);
    }

    class SymMouse extends java.awt.event.MouseAdapter {
        public void mouseClicked(java.awt.event.MouseEvent event) {
            Object object = event.getSource();
            if (object == radioButtonChecking)
                radioCheckBoxClicked(event);
            else if (object == savingRadioButton)
                radioSavingBoxClick(event);
        }
    }
}


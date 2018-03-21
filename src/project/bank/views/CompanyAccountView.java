package project.bank.views;

import project.finCoFramework.views.AbstractFincoUi;
import project.finCoFramework.views.AbstractPopUp;

import javax.swing.*;

public class CompanyAccountView {

    private AbstractPopUp abstractPopUp;


    public CompanyAccountView(AbstractFincoUi abstractFincoUi) {
        abstractPopUp = new AbstractPopUp(abstractFincoUi);
        abstractPopUp.setTitle("Add Company Account");
        abstractPopUp.setSize(500, 200);


        //Checking Radio Button
        JRadioButton radioButtonChecking = new JRadioButton();
        radioButtonChecking.setText("Checkings");
        radioButtonChecking.setBounds(36,0,84,24);

        //Saving Radio Button
        JRadioButton savingRadioButton = new JRadioButton();
        savingRadioButton.setText("Savings");
        savingRadioButton.setBounds(36,24,84,24);



        JTextField textAccount = new JTextField();
        textAccount.setBounds(84,60,156,20);

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

        JTextField textName = new JTextField();
        textName.setBounds(84,84,156,20);

        JTextField textCity = new JTextField();
        textCity.setBounds(84,132,156,20);

        JTextField textState = new JTextField();
        textState.setBounds(84,156,156,20);

        JTextField textStreet = new JTextField();
        textStreet.setBounds(84,108,156,20);

        JTextField textZip= new JTextField();
        textZip.setBounds(84,180,156,20);


        JTextField textNumberEmployees= new JTextField();
        textNumberEmployees.setBounds(84,204,156,20);

        JTextField textEmail = new JTextField();
        textEmail.setBounds(84,228,156,20);



        JButton okButton  = new JButton();
        okButton.setText("OK");
        okButton.setBounds(48,264,84,24);

        JButton cancelButton = new JButton();
        cancelButton.setText("Cancel");
        cancelButton.setBounds(156,264,84,24);


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
}

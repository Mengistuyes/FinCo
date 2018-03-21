package project.finCoFramework.views;

import project.finCoFramework.views.commands.Receiver;
import project.finCoFramework.views.commands.maincommands.DefaultTestCommand;

import javax.swing.*;

public class FincoFrameworkUi extends AbstractFincoUi{


    public static void main(String[] args) {
        //Initializing our framework
        FincoFrameworkUi frameworkUi =  new FincoFrameworkUi();
        frameworkUi.setVisibile(true);
        frameworkUi.setTitle("Default Framework Title");
        frameworkUi.setSize(575,310);

        //Adding the buttons for Ui Framework
        JButton defaultButton = new JButton();
        defaultButton.setBounds(24, 20, 192, 33);
        defaultButton.setText("Add Personal Account");

        frameworkUi.addButtons(defaultButton);
        frameworkUi.addCommandClick(defaultButton,new DefaultTestCommand(new Receiver()));

        //Adding the columns for framework fields
        frameworkUi.addColumns("1st Field");
        frameworkUi.addColumns("2nd Field");
        frameworkUi.addColumns("3rd Field");
        frameworkUi.addColumns("4th Field");
        frameworkUi.addColumns("5th Field");
        frameworkUi.addColumns("6th Field");

        //Building the framework for run
        frameworkUi.build();

    }
}

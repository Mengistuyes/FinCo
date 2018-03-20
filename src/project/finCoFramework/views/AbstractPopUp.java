package project.finCoFramework.views;

import project.finCoFramework.views.ccard.JDialog_Deposit;
import project.finCoFramework.views.commands.Command;
import project.finCoFramework.views.commands.CommandInvoker;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class AbstractPopUp{

    private AbstractFincoUi abstractFincoUi;
    private JDialog jDialog;
    private String title;
    private int width, height;
    private Map<Object, Command> commandMap = new HashMap<>();
    private SymAction lSymAction = new SymAction();

    public AbstractPopUp(AbstractFincoUi abstractFincoUi) {
        jDialog = new JDialog();
        this.abstractFincoUi = abstractFincoUi;
        jDialog.setModal(true);
        jDialog.getContentPane().setLayout(null);
    }

    public final void build() {
        jDialog.setTitle(title);
        jDialog.setSize(width, height);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addComponents(JComponent component) {
        jDialog.getContentPane().add(component);
    }

    public void addActionListener(JButton jButton, Command command) {
        jButton.addActionListener(lSymAction);
        commandMap.put(jButton, command);
    }

    class SymAction implements java.awt.event.ActionListener {
        public void actionPerformed(java.awt.event.ActionEvent event) {
            Object object = event.getSource();
            Command command = commandMap.get(object);
            CommandInvoker commandInvoker = new CommandInvoker(command);
            commandInvoker.execute(event);
        }
    }

    public void setBounds(int x, int y, int width, int height){
        jDialog.setBounds(x, y,width,height);
    }

    public void show(){
        jDialog.show();
    }
}

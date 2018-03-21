package project.finCoFramework.views;

import project.finCoFramework.views.commands.Command;
import project.finCoFramework.views.commands.CommandInvoker;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AbstractFincoUi {

    protected DefaultTableModel model;
    protected JTable table;
    protected JScrollPane jScrollPane;
    protected JFrame main;

    protected String title;
    protected int width = 575, height = 310;
    protected JPanel jPanel;
    protected Map<Object, Command> buttonClick = new HashMap<>();
    SymAction lSymAction = new SymAction();

    public AbstractFincoUi() {
        this.main = new JFrame();
        main.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        main.getContentPane().setLayout(new BorderLayout(0, 0));
        jPanel = createJPanel();
        jPanel.setLayout(null);
        main.getContentPane().add(BorderLayout.CENTER, jPanel);
        jPanel.setBounds(0, 0, 575, 310);
        jScrollPane = jScrollPane();
        model = new DefaultTableModel();
        table = new JTable(model);
        jPanel.add(jScrollPane);
        jScrollPane.setBounds(12, 92, 444, 160);
        jScrollPane.getViewport().add(table);
        table.setBounds(0, 0, 420, 0);
        SymWindow aSymWindow = new SymWindow();
        main.addWindowListener(aSymWindow);
        setFeelAndView();

    }

    public final void build() {
        main.setTitle(title);
        main.setSize(width, height);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setVisibile(boolean visibile) {
        main.setVisible(visibile);
    }

    private JPanel createJPanel() {
        return new JPanel();
    }

    private JScrollPane jScrollPane() {
        return new JScrollPane();
    }

    public void addColumns(String column) {
        model.addColumn(column);
    }

    public void addButtons(JButton button) {
        jPanel.add(button);
    }

    public void addCommandClick(JButton jButton, Command command) {
        jButton.addActionListener(lSymAction);
        buttonClick.put(jButton, command);
    }

    public void addRowModel(Object[] objects) {
        model.addRow(objects);
        table.getSelectionModel().setAnchorSelectionIndex(-1);
    }

    public void clearModel() {
        model.setRowCount(0);
    }

    class SymWindow extends java.awt.event.WindowAdapter {
        public void windowClosing(WindowEvent event) {
            Object object = event.getSource();
            if (object == AbstractFincoUi.this)
                bankFormWindowClosing(event);
        }
    }

    void bankFormWindowClosing(WindowEvent event) {
        bankFormWindowClosingInteraction(event);
    }

    void bankFormWindowClosingInteraction(WindowEvent event) {
        try {
            System.exit(0);
            this.exitApplication();
        } catch (Exception e) {
            System.exit(0);
        }
    }

    private void exitApplication() {
        try {
            main.setVisible(false);  // hide the Frame
            main.dispose();            // free the system resources
            System.exit(0);            // close the application
        } catch (Exception e) {
            System.exit(0);
        }
    }


    class SymAction implements java.awt.event.ActionListener {
        public void actionPerformed(ActionEvent event) {
            Object object = event.getSource();
            Command command = buttonClick.get(object);
            CommandInvoker commandInvoker = new CommandInvoker(command);
            commandInvoker.execute(event);
        }
    }

    private void setFeelAndView() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
    }

    public int getSelectedRow() {
        return table.getSelectionModel().getMinSelectionIndex();
    }
}

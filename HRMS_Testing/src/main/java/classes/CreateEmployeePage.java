package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CreateEmployeePage extends JFrame implements ActionListener, KeyListener {
    private JPanel CreateEmployeePanel;
    private JTextField NameField;
    private JTextField UsernameField;
    private JTextField DepartmentField;
    private JComboBox EmpTypeBox;
    private JButton confirmButton;
    private JButton cancelButton;
    private JTextField IDField;
    private JLabel IdLabel;
    private JTextField PasswordField;

    EmployeeType employeeType;

    public CreateEmployeePage() {
        setVisible(true);

        setContentPane(CreateEmployeePanel);
        setTitle("Edit Employee Data");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        confirmButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }
    private void createEmployeeData() {
        Main main = new Main();
        main.init();

        Employee employees = new Employee(NameField.getText(),Integer.parseInt(IDField.getText()),UsernameField.getText(),PasswordField.getText(),null, DepartmentField.getText(),EmployeeType.valueOf(EmpTypeBox.getSelectedItem().toString()),Evaluation.Excellent);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == confirmButton) {
            createEmployeeData();
            setVisible(false);
            new ManageEmployeeDataPage();
        }
        else if (e.getSource() == cancelButton) {
            setVisible(false);
            new ManageEmployeeDataPage();
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

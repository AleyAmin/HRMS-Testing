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
    HRemployee hre;

    public CreateEmployeePage(HRemployee hre) {
        this.hre = hre;

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
        Employee employee = new Employee(NameField.getText(),Integer.parseInt(IDField.getText()),UsernameField.getText(),PasswordField.getText(),null, DepartmentField.getText(),EmployeeType.valueOf(EmpTypeBox.getSelectedItem().toString()),Evaluation.Excellent);
        employee.setPay(null);
        hre.addEmployee(employee);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == confirmButton) {
            createEmployeeData();
            setVisible(false);
            new ManageEmployeeDataPage(hre);
        }
        else if (e.getSource() == cancelButton) {
            setVisible(false);
            new ManageEmployeeDataPage(hre);
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

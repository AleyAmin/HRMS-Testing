package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EditEmployeeDataPage extends JFrame implements ActionListener, KeyListener {

    private JPanel EditEmployeeDataPanel;
    private JTextField NameField;
    private JTextField UsernameField;
    private JTextField DepartmentField;
    private JComboBox EmpTypeBox;
    private JButton confirmButton;
    private JButton cancelButton;

    EmployeeType employeeType;

    public EditEmployeeDataPage() {
        setVisible(true);

        setContentPane(EditEmployeeDataPanel);
        setTitle("Edit Employee Data");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        confirmButton.addActionListener(this);
        cancelButton.addActionListener(this);

    }

    private void convertStringToEmployeeType(String empType) {
        switch (empType) {
            case "Hourly":
                employeeType = EmployeeType.Hourly;
                break;
            case "PartTime":
                employeeType = EmployeeType.PartTime;
                break;
            case "FullTime":
                employeeType = EmployeeType.FullTime;
                break;
            case "Intern":
                employeeType = EmployeeType.Intern;
                break;
        }
    }

    public static void main(String[] args) {
        new EditEmployeeDataPage();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

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


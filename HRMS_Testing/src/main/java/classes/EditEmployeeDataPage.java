package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

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

    public void setEmployeeData(String n, String u, String d, String t) {
        NameField.setText(n);
        UsernameField.setText(u);
        DepartmentField.setText(d);
        EmpTypeBox.setSelectedItem(t);
    }
    int ID;
    public void EmployeeId(String id){
        ID = Integer.parseInt(id);
    }

    private void changeEmployeeData() {
        Main main = new Main();
        main.init();

        Employee employees = main.hre.findEmployeeById(ID);

        employees.setName(NameField.getText());
        employees.setUsername(UsernameField.getText());
        employees.setDepartment(DepartmentField.getText());
        employees.setEmployeeType(EmployeeType.valueOf(EmpTypeBox.getSelectedItem().toString()));
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
        if (e.getSource() == confirmButton) {
            changeEmployeeData();
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


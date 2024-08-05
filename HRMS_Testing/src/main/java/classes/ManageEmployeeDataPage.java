package classes;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.List;

public class ManageEmployeeDataPage extends JFrame implements ActionListener, KeyListener {
    private JPanel ManageEmployeeDataPanel;
    private JButton addButton;
    private JButton editButton;
    private JButton removeButton;
    private JButton backButton;
    private JScrollPane TablePane;
    private JTable EmployeeDataTable;

    Main main = new Main();
    public ManageEmployeeDataPage() {
        setContentPane(ManageEmployeeDataPanel);
        setTitle("Manage Employee Data");
        setSize(500,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        main.init();

        List<Employee> employees = main.hre.getAllEmployees();

        String[] columnNames = { "Name", "ID", "Username", "Department", "Type", "Pay", "Evaluation" };

        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (Employee employee : employees) {
            Object[] row = {
                    employee.getName(),
                    employee.getId(),
                    employee.getUsername(),
                    employee.getDepartment(),
                    employee.getEmployeeType(),
                    employee.getPay().calculatePay(),
                    employee.getEvaluation()
            };
            model.addRow(row);
        }

        EmployeeDataTable.setModel(model);

        addButton.addActionListener(this);
        editButton.addActionListener(this);
        removeButton.addActionListener(this);
        backButton.addActionListener(this);
        setVisible(true);
    }

    public void EditEmployee() {
        DefaultTableModel model = (DefaultTableModel) EmployeeDataTable.getModel();
        if(EmployeeDataTable.getSelectedRowCount() == 1) {

            String name = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 0).toString();
            String username = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 2).toString();
            String department = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 3).toString();
            String type = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 4).toString();
            String ID = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 1).toString();
            EditEmployeeDataPage editEmployeeDataPage = new EditEmployeeDataPage();
            editEmployeeDataPage.EmployeeId(ID);
            editEmployeeDataPage.setEmployeeData(name,username,department,type);
        }

    }
    public void RemoveEmployee() {
        DefaultTableModel model = (DefaultTableModel) EmployeeDataTable.getModel();
        if(EmployeeDataTable.getSelectedRowCount() == 1) {
            main.init();

            main.hre.deleteEmployee(EmployeeDataTable.getSelectedRow());
        }
    }



    public static void main(String[] args) {
        new ManageEmployeeDataPage();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addButton) {
            setVisible(false);
            new CreateEmployeePage();

        }
        else if(e.getSource() == editButton) {
            setVisible(false);
            EditEmployee();

        }
        else if(e.getSource() == removeButton) {
            RemoveEmployee();

        }
        else if(e.getSource() == backButton) {
            setVisible(false);
            new HRemployeePage();
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

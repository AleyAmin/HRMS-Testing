package classes;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class ManageEmployeeDataPage extends JFrame implements ActionListener, KeyListener {
    private JPanel ManageEmployeeDataPanel;
    private JTable EmployeeDataTable;
    private JLabel EmployeeDataLable;

    public ManageEmployeeDataPage() {
        ManageEmployeeDataPanel = new JPanel();
        setContentPane(ManageEmployeeDataPanel);
        setTitle("Manage Employee Data");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Data to be displayed in the JTable
        String[][] data = {
                { "", "", "", "" , "" , "" , "" , ""  },
        };

        // Column Names
        String[] columnNames = { "Name", "ID", "username", "Department", "Type", "pay", "Address", "Evaluation" };

        // Initializing the JTable
        EmployeeDataTable = new JTable(data, columnNames);
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(EmployeeDataTable);
        ManageEmployeeDataPanel.add(sp);
        // Frame Visible = true
        setVisible(true);
    }

    public void TableMouseClicked(MouseEvent e) {
        DefaultTableModel model = (DefaultTableModel) EmployeeDataTable.getModel();
        String empName = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 0).toString();
        String empID = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 1).toString();
        String empUsername = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 2).toString();
        String empDepartment = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 3).toString();
        String empType = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 4).toString();
        String empPay = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 5).toString();
        String empAddress = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 6).toString();
        String empEvaluation = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 7).toString();

    }

    public static void main(String[] args) {
        new ManageEmployeeDataPage();
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

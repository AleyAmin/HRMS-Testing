package classes;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class ManageEmployeeDataPage extends JFrame implements ActionListener, KeyListener {
    private JPanel ManageEmployeeDataPanel;
    private JTable EmployeeDataTable;
    private JLabel EmployeeDataLable;
    private JButton EditEmployeeDataButton;

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
        EditEmployeeDataButton = new JButton("Edit Employee");
        EmployeeDataTable = new JTable(data, columnNames);
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(EmployeeDataTable);
        ManageEmployeeDataPanel.add(sp);
        ManageEmployeeDataPanel.add(EditEmployeeDataButton);
        // Frame Visible = true
        setVisible(true);
    }

    public void EditEmployee(MouseEvent e) {
        DefaultTableModel model = (DefaultTableModel) EmployeeDataTable.getModel();
        if(EmployeeDataTable.getSelectedRowCount() == 1) {

            String name = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 0).toString();
            String id = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 1).toString();
            String username = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 2).toString();
            String department = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 3).toString();
            String type = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 4).toString();
            String pay = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 5).toString();
            String address = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 6).toString();
            String evaluation = EmployeeDataTable.getValueAt(EmployeeDataTable.getSelectedRow(), 7).toString();

        }

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

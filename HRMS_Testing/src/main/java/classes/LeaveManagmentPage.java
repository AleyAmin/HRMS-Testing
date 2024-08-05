package classes;

import com.sun.net.httpserver.Request;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.List;

public class LeaveManagmentPage extends JFrame implements ActionListener, KeyListener{

    private JPanel LeaveManagmentPanel;
    private JButton ApproveButton;
    private JButton rejectButton;
    private JButton backButton;
    private JScrollPane TablePane;
    private JTable leaveRequestsTable;

    public LeaveManagmentPage() {
        setContentPane(LeaveManagmentPanel);
        setTitle("Manage Employee Data");
        setSize(500,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Main main = new Main();
        main.init();

        List<LeaveRequest> requests = main.hre.getAllLeaveRequests();

        String[] columnNames = { "ID", "Employee", "Type", "Start Date", "End Date", "Status" };

        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (LeaveRequest request : requests) {
            Object[] row = {
                    request.getId(),
                    request.getEmployee(),
                    request.getLeaveType(),
                    request.getStartDate(),
                    request.getEndDate(),
                    request.getLeaveStatus()
            };
            model.addRow(row);
        }

        leaveRequestsTable.setModel(model);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LeaveManagmentPage();
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

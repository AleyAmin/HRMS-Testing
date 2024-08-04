package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LeaveRequestPage {
    private JComboBox<String> comboBox1;
    private JPanel txt;
    private JTextField endField;
    private JTextField startField;
    private JButton btnsubmit;

    public LeaveRequestPage() {
        // Initialize the combo box with leave types
        comboBox1.addItem("Sick Leave");
        comboBox1.addItem("Casual Leave");
        comboBox1.addItem("Maternity Leave");
        comboBox1.addItem("Paternity Leave");

        // Set up action listener for the submit button
        btnsubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected leave type
                String leaveType = (String) comboBox1.getSelectedItem();

                // Get the input values
                String startDateStr = startField.getText();
                String endDateStr = endField.getText();

                // Validate and parse dates
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date startDate = null;
                Date endDate = null;
                try {
                    startDate = sdf.parse(startDateStr);
                    endDate = sdf.parse(endDateStr);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(txt, "Invalid date format. Please use yyyy-MM-dd.");
                    return;
                }

                // Check if dates are valid
                if (startDate == null || endDate == null || endDate.before(startDate)) {
                    JOptionPane.showMessageDialog(txt, "End date must be after start date.");
                    return;
                }

                // Save data to a file
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("leave_requests.txt", true))) {
                    writer.write("Leave Type: " + leaveType);
                    writer.newLine();
                    writer.write("Start Date: " + sdf.format(startDate));
                    writer.newLine();
                    writer.write("End Date: " + sdf.format(endDate));
                    writer.newLine();
                    writer.write("-------------------------------");
                    writer.newLine();
                } catch (IOException ioException) {
                    JOptionPane.showMessageDialog(txt, "Error saving data to file.");
                }

                // Confirmation message
                JOptionPane.showMessageDialog(txt,
                        "Leave Request Submitted\n" +
                                "Leave Type: " + leaveType + "\n" +
                                "Start Date: " + sdf.format(startDate) + "\n" +
                                "End Date: " + sdf.format(endDate));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Leave Request Page");
        frame.setContentPane(new LeaveRequestPage().txt);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EmployeePage  extends JFrame implements ActionListener, KeyListener {
    private JPanel EmployeePanel;
    private JButton submit;
    private JButton requestLeaveButton;
    private JButton viewEvaluationButton;

    private final Employee employee;

    public EmployeePage(Employee employee) {
        this.employee = employee;

        setVisible(true);

        setContentPane(EmployeePanel);
        setTitle("HRMS");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        submit.addActionListener(this);
        requestLeaveButton.addActionListener(this);
        viewEvaluationButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
        }
        else if (e.getSource() == requestLeaveButton) {
            new LeaveRequestPage(employee);
        }
        else if (e.getSource() == viewEvaluationButton) {
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

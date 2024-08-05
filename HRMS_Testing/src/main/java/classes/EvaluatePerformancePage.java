package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EvaluatePerformancePage extends JFrame implements ActionListener, KeyListener  {
    private JPanel EvaluatePerformancePanel;
    private JTextField SearchText;
    private JLabel SearchLabel;
    private JLabel PerformanceLabel;
    private JLabel AchievedPerformance;
    private JLabel EvaluateLabel;
    private JButton EvaluateButton;
    private JComboBox comboBox1;
    private JButton backButton;
    private JLabel AchievedEvaluation;

    public EvaluatePerformancePage() {
        setVisible(true);

        setContentPane(EvaluatePerformancePanel);
        setTitle("Edit Employee Data");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        EvaluateButton.addActionListener(this);
        backButton.addActionListener(this);
        comboBox1.addActionListener(this);

        Address address = new Address("Zahraa ElMaadi", "Cairo", "00000", "Egypt");
        Employee employee = new Employee("Aley", 101, "Aley", "password", address, "Computer Engineering", EmployeeType.FullTime, Evaluation.Excellent);

        String Evaluation = employee.getEvaluation().toString();
        AchievedEvaluation.setText(Evaluation);

        employee.addPerformance(Performance.Quality);
        employee.addPerformance(Performance.Attendance);
        employee.addPerformance(Performance.Productivity);

        StringBuilder sb = new StringBuilder();
        for (Performance per : employee.getPerformanceList()) {
            sb.append(per).append(", ");
        }
        String result = sb.toString().replaceAll(", $", "");
        AchievedPerformance.setText(result);

    }

    public static void main(String[] args) {
        new EvaluatePerformancePage();
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

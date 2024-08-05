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
    private JButton submit;

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
        submit.addActionListener(this);

        SearchText.addKeyListener(this);



    }

    public static void main(String[] args) {
        new EvaluatePerformancePage();
    }

    private int convertToInteger(){
        return Integer.parseInt(SearchText.getText());
    }
    private void SearchByID() {
            int ID = convertToInteger();
            Main main = new Main();
            main.init();

            Employee employee = main.hre.findEmployeeById(ID);

            if (employee != null) {


            employee.addPerformance(Performance.Quality);
            employee.addPerformance(Performance.Attendance);
            employee.addPerformance(Performance.Productivity);

            StringBuilder sb = new StringBuilder();
            for (Performance per : employee.getPerformanceList()) {
                sb.append(per).append(", ");
            String result = sb.toString().replaceAll(", $", "");
            AchievedPerformance.setText(result);
            }
        }
            else {
                JOptionPane.showMessageDialog(this, "Employee ID does not exist", "Error", JOptionPane.ERROR_MESSAGE);
            }

    }

    private void evaluatePerformance() {
        Main main = new Main();
        main.init();
        String Evaluation = main.hre.evaluateEmployeePerformance(convertToInteger()).toString();
        AchievedEvaluation.setText(Evaluation);
    }

    private void manualEvaluate() {
        Main main = new Main();
        main.init();
        AchievedEvaluation.setText(comboBox1.getSelectedItem().toString());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            SearchByID();
        }
        else if (e.getSource() == EvaluateButton) {
            evaluatePerformance();
        }
        else if (e.getSource() == comboBox1) {
            manualEvaluate();
        }
        else if (e.getSource() == backButton) {
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

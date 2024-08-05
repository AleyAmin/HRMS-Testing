package classes;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HRemployeePage extends JFrame implements ActionListener, KeyListener {
    private JButton submit;
    private JButton requestLeaveButton;
    private JButton viewEvaluationButton;
    private JPanel HRemployeePanel;
    private JButton payrollProcessingButton;

    public HRemployeePage() {
        setVisible(true);

        setContentPane(HRemployeePanel);
        setTitle("HRMS");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        submit.addActionListener(this);
        requestLeaveButton.addActionListener(this);
        viewEvaluationButton.addActionListener(this);
        payrollProcessingButton.addActionListener(this);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(HRemployeePage::createAndShowGUI);
    }

    private static void createAndShowGUI() {new HRemployeePage();}


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

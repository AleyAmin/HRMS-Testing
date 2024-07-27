import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame implements ActionListener {
    private JPanel LoginPanel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton submit;

    public LoginPage() {
        setVisible(true);

        setContentPane(LoginPanel);
        setTitle("HRMS");
        setSize(500,500);
        setVisible(true);

        // Close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        submit.addActionListener(this);
    }

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        }
    }
}

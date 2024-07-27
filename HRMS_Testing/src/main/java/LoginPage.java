import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame implements ActionListener {
    private JPanel LoginPanel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton submit;

    // private int loginStatus;

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
        new LoginPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {

            // .trim() to remove unwanted spaces --- zay el adv soft

            String username = usernameField.getText().trim();
            String password = new String(passwordField.getPassword()).trim();

            // loginStatus = ----.authenicate(username,password);

            // replace this part with the authenticate method when completed
            // for example authenicate returns -1 if invalid, 1 if user, 2 if admin

            if (username.equals("admin") && password.equals("admin")) {
                JOptionPane.showMessageDialog(this, "Welcome Admin" );
            }
            else if (username.isEmpty() && password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

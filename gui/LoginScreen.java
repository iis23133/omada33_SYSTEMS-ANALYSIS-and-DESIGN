import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginScreen extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginScreen() {
        setTitle("Είσοδος");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout());

        // Company Name Label
        JLabel companyNameLabel = new JLabel("SafeCar");
        companyNameLabel.setFont(new Font("Arial", Font.BOLD, 24));
        companyNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Add vertical padding to the company name label
        JPanel companyPanel = new JPanel();
        companyPanel.setLayout(new BorderLayout());
        companyPanel.add(companyNameLabel, BorderLayout.CENTER);
        companyPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 40, 0)); // Adjust top and bottom padding

        add(companyPanel, BorderLayout.NORTH);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridBagLayout());
        inputPanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 50)); // Increased padding

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.CENTER; // Centered components horizontally

        JLabel usernameLabel = new JLabel("Όνομα:");
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 18)); // Decreased font size
        usernameField = new JTextField(20); // Increased input field size
        usernameField.setFont(new Font("Arial", Font.PLAIN, 18)); // Increased font size
        JLabel passwordLabel = new JLabel("Κωδικός:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 18)); // Decreased font size
        passwordField = new JPasswordField(20); // Increased input field size
        passwordField.setFont(new Font("Arial", Font.PLAIN, 18)); // Increased font size
        loginButton = new JButton("Είσοδος");
        loginButton.setPreferredSize(new Dimension(140, 40));
        loginButton.setFont(new Font("Arial", Font.BOLD, 18)); // Decreased font size
        loginButton.setBackground(new Color(0, 153, 204));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);

        inputPanel.add(usernameLabel, gbc);
        inputPanel.add(usernameField, gbc);
        inputPanel.add(passwordLabel, gbc);
        inputPanel.add(passwordField, gbc);
        inputPanel.add(loginButton, gbc);

        add(inputPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen();
            }
        });
    }
}

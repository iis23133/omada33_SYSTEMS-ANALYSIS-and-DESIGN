import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ChangeDetailsPage extends JFrame {
    private JTextField nameField, addressField, contactNumberField, emailField;
    
    public ChangeDetailsPage() {
        setTitle("Αλλαγή Στοιχείων Πελάτη");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));
        
        // Labels
        JLabel nameLabel = new JLabel("Όνομα:");
        JLabel addressLabel = new JLabel("Διεύθυνση:");
        JLabel contactNumberLabel = new JLabel("Αριθμός Επικοινωνίας:");
        JLabel emailLabel = new JLabel("Διεύθυνση Email:");
        
        // Text Fields
        nameField = new JTextField();
        addressField = new JTextField();
        contactNumberField = new JTextField();
        emailField = new JTextField();
        
        // Buttons
        JButton saveChangesBtn = new JButton("Αποθήκευση Αλλαγών");
        JButton cancelBtn = new JButton("Ακύρωση");
        
        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(addressLabel);
        add(addressField);
        add(contactNumberLabel);
        add(contactNumberField);
        add(emailLabel);
        add(emailField);
        add(saveChangesBtn);
        add(cancelBtn);
        
        setVisible(true);
    }
}

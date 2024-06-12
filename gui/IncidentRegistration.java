import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IncidentRegistration extends JFrame {
    public IncidentRegistration() {
        setTitle("Καταχώρηση Συμβάντος");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));

        panel.add(new JLabel("Ημερομηνία Συμβάντος:"));
        JTextField dateField = new JTextField("2023-06-09");
        panel.add(dateField);

        panel.add(new JLabel("Τύπος Συμβάντος:"));
        JTextField typeField = new JTextField("Ατύχημα");
        panel.add(typeField);

        panel.add(new JLabel("Περιγραφή:"));
        JTextField descriptionField = new JTextField("Περιγραφή συμβάντος...");
        panel.add(descriptionField);

        panel.add(new JLabel("Τοποθεσία:"));
        JTextField locationField = new JTextField("Αθήνα");
        panel.add(locationField);

        panel.add(new JLabel("Μάρτυρες:"));
        JTextField witnessField = new JTextField("Όνομα μάρτυρα");
        panel.add(witnessField);

        JButton submitButton = new JButton("Υποβολή");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Το συμβάν καταχωρήθηκε με επιτυχία!");
            }
        });

        panel.add(submitButton);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new IncidentRegistration().setVisible(true);
            }
        });
    }
}

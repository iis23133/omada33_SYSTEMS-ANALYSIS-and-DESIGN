import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccidentClaimApplication extends JFrame {
    public AccidentClaimApplication() {
        setTitle("Αίτηση Αποζημίωσης");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));

        panel.add(new JLabel("Συμβάν ID Ημερομηνία Ατυχήματος:"));
        JTextField dateField = new JTextField("2023-06-09");
        panel.add(dateField);

        panel.add(new JLabel("Ζημιές Οχήματος:"));
        JTextField damageField = new JTextField("Περιγραφή ζημιών...");
        panel.add(damageField);

        panel.add(new JLabel("Κόστος Επισκευής:"));
        JTextField costField = new JTextField("1000€");
        panel.add(costField);

        panel.add(new JLabel("Ασφαλιστική Εταιρεία:"));
        JTextField insuranceField = new JTextField("Ins1");
        panel.add(insuranceField);

        JButton submitButton = new JButton("Υποβολή");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Η αίτηση αποζημίωσης καταχωρήθηκε με επιτυχία!");
            }
        });

        panel.add(submitButton);

        getContentPane().add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AccidentClaimApplication().setVisible(true);
            }
        });
    }
}

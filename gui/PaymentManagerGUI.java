import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PaymentManagerGUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private DefaultListModel<Payment> paymentListModel;
    private JList<Payment> paymentList;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
    	try {
    		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    	} catch (Throwable e) {
    		e.printStackTrace();
    	}
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PaymentManagerGUI frame = new PaymentManagerGUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public PaymentManagerGUI() {
        ArrayList<Payment> pendingPayments = new ArrayList<>();
        // Dummy data
        pendingPayments.add(new Payment("Όνομα Οφειλών 1", 1000));
        pendingPayments.add(new Payment("Όνομα Οφειλών 2", 200));
        pendingPayments.add(new Payment("Όνομα Οφειλών 3", 50));
        pendingPayments.add(new Payment("Όνομα Οφειλών 4", 50));
        pendingPayments.add(new Payment("Όνομα Οφειλών 5", 50));
        pendingPayments.add(new Payment("Όνομα Οφειλών 6", 50));
        pendingPayments.add(new Payment("Όνομα Οφειλών 7", 50));
        pendingPayments.add(new Payment("Όνομα Οφειλών 8", 50));
        pendingPayments.add(new Payment("Όνομα Οφειλών 9", 50));
        pendingPayments.add(new Payment("Όνομα Οφειλών 10", 50));
        pendingPayments.add(new Payment("Όνομα Οφειλών 11", 50));
        pendingPayments.add(new Payment("Όνομα Οφειλών 12", 50));
        pendingPayments.add(new Payment("Όνομα Οφειλών 13", 50));
        pendingPayments.add(new Payment("Όνομα Οφειλών 14", 50));
        pendingPayments.add(new Payment("Όνομα Οφειλών 15", 50));
        pendingPayments.add(new Payment("Όνομα Οφειλών 16", 50));
        pendingPayments.add(new Payment("Όνομα Οφειλών 17", 50));
        pendingPayments.add(new Payment("Όνομα Οφειλών 18", 50));
        pendingPayments.add(new Payment("Όνομα Οφειλών 19", 50));
        pendingPayments.add(new Payment("Όνομα Οφειλών 20", 50));


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setTitle("Επεξεργασία Οφειλών");

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        contentPane.add(buttonPanel, BorderLayout.NORTH);

        JButton saveButton = new JButton("Αποθήκευση Αλλαγών");
        saveButton.setFont(new Font("Times New Roman", Font.PLAIN, 26));
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to save changes goes here
                JOptionPane.showMessageDialog(null, "Changes saved successfully.");
            }
        });
       // buttonPanel.add(saveButton);
        contentPane.add(saveButton, BorderLayout.SOUTH);
        
        paymentListModel = new DefaultListModel<>();
        for (Payment payment : pendingPayments) {
            paymentListModel.addElement(payment);
        }

        paymentList = new JList<>(paymentListModel);
        paymentList.setFont(new Font("Times New Roman", Font.PLAIN, 20)); // Set font for the list

        contentPane.add(new JScrollPane(paymentList), BorderLayout.CENTER);

        JButton modifyButton = new JButton("Τροποποίηση Ποσού");
        modifyButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        modifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Payment selectedPayment = paymentList.getSelectedValue();
                if (selectedPayment != null) {
                    String newAmountStr = JOptionPane.showInputDialog(null, "Εισαγάγετε το νέο ποσό για το" + selectedPayment.getDescription() + ":", "Τροποποίηση Ποσού", JOptionPane.PLAIN_MESSAGE);
                    try {
                        double newAmount = Double.parseDouble(newAmountStr);
                        selectedPayment.setAmount(newAmount);
                        paymentList.repaint(); // Refresh the list to reflect the changes
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid amount entered.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a payment to modify.");
                }
            }
        });

        buttonPanel.add(modifyButton);

        JButton addButton = new JButton("Προσθήκη Οφειλής");
        addButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        buttonPanel.add(addButton);

        JButton deleteButton = new JButton("Διαγραφή Οφειλής");
        deleteButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
 
        buttonPanel.add(deleteButton);

        JButton clearButton = new JButton("Διαγραφή όλων των Οφειλών");
        clearButton.setForeground(new Color(0, 128, 0));
        clearButton.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paymentListModel.clear();
            }
        });
        buttonPanel.add(clearButton);
    }

    private class Payment {
        private String description;
        private double amount;

        public Payment(String description, double amount) {
            this.description = description;
            this.amount = amount;
        }

        public String getDescription() {
            return description;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        @Override
        public String toString() {
            return description + " : " + amount+"€";
        }
    }
}

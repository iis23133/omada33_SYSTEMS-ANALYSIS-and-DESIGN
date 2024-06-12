import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class termandconditions extends JFrame {
    private static final long serialVersionUID = 1L;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    termandconditions frame = new termandconditions();
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
    public termandconditions() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setTitle("Λεπτομέρειες και Όροι Ασφάλισης");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        JPanel TittlePanel = new JPanel();
        contentPane.add(TittlePanel);
        TittlePanel.setLayout(new FlowLayout());

        JLabel title = new JLabel("Προβολή Λεπτομερειών και Όρων Ασφάλισης");
        TittlePanel.add(title);
        title.setFont(new Font("Arial", Font.BOLD, 20));

        JPanel mainPanel = new JPanel();
        contentPane.add(mainPanel);

        JTextPane txt_plirofories_asfalistikou_soumboulaiou = new JTextPane();
        txt_plirofories_asfalistikou_soumboulaiou.setEditable(false);
        txt_plirofories_asfalistikou_soumboulaiou.setText("Πληροφορίες Ασφαλιστικού Συμβολαίου\r\nΑριθμός Συμβολαίου: 123456\r\nΌνομα Ασφαλισμένου: Γιάννης Παπαδόπουλος\r\nΤύπος Ασφάλισης: Αυτοκίνητο\r\nΗμερομηνία Έναρξης: 01/01/2024\r\nΗμερομηνία Λήξης: 31/12/2024\r\nΚατάσταση Συμβολαίου: Ενεργό\r\nΠληρωθείσα Ποσότητα: 500€\r\nΟφειλόμενη Ποσότητα: 0€");

        JTextPane txt_leptomeries_kalipsis = new JTextPane();
        txt_leptomeries_kalipsis.setText("Λεπτομέρειες Κάλυψης\r\nΚαλυπτόμενοι Κίνδυνοι:\r\n - Κλοπή\r\n - Πυρκαγιά\r\n - Ατύχημα\r\nΜέγιστο Ποσό Κάλυψης: 10,000€\r\nΑπαλλαγές: 300€");
        txt_leptomeries_kalipsis.setEditable(false);

        JTextPane txt_plirofories_asfalismenou = new JTextPane();
        txt_plirofories_asfalismenou.setText("Πληροφορίες Ασφαλισμένου\r\nΌνομα: Γιάννης\r\nΕπίθετο: Παπαδόπουλος\r\nΗμερομηνία Γέννησης: 15/03/1980\r\nΑριθμός Ταυτότητας/ΑΦΜ: ΧΧΧΧΧΧΧ\r\nΔιεύθυνση: Οδός Δείγματος 123\r\nΤηλέφωνο: 2101234567\r\nEmail: giannis@example.com");
        txt_plirofories_asfalismenou.setEditable(false);

        JTextPane txt_terms_condition = new JTextPane();
        txt_terms_condition.setText("Όροι και Προϋποθέσεις\r\nΌρος 1: ...\r\nΌρος 2: ...\r\nΌρος 3: ...\r\nΌρος 4: ...");

        JTextPane txtpnContentpaneaddnewJlabel = new JTextPane();
        txtpnContentpaneaddnewJlabel.setText("Πρόσθετες Πληροφορίες\r\nΠαρατήρηση 1: ...\r\nΠαρατήρηση 2: ...\r\nΠαρατήρηση 3: ...");
        
        GroupLayout gl_mainPanel = new GroupLayout(mainPanel);
        gl_mainPanel.setHorizontalGroup(
        	gl_mainPanel.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_mainPanel.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_mainPanel.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(txtpnContentpaneaddnewJlabel, GroupLayout.PREFERRED_SIZE, 566, GroupLayout.PREFERRED_SIZE)
        				.addGroup(gl_mainPanel.createSequentialGroup()
        					.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
        						.addComponent(txt_plirofories_asfalistikou_soumboulaiou, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txt_leptomeries_kalipsis, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(txt_terms_condition, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txt_plirofories_asfalismenou, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap())
        );
        gl_mainPanel.setVerticalGroup(
        	gl_mainPanel.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_mainPanel.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
        				.addComponent(txt_plirofories_asfalismenou, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        				.addComponent(txt_plirofories_asfalistikou_soumboulaiou, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
        				.addComponent(txt_terms_condition, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txt_leptomeries_kalipsis, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(txtpnContentpaneaddnewJlabel, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
        );
        mainPanel.setLayout(gl_mainPanel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton backButton = new JButton("Επιστροφή");
        JButton printButton = new JButton("Εκτύπωση");
        JButton emailButton = new JButton("Αποστολή μέσω Email");
        JButton saveButton = new JButton("Αποθήκευση σε PDF");

        buttonPanel.add(backButton);
        buttonPanel.add(printButton);
        buttonPanel.add(emailButton);
        buttonPanel.add(saveButton);

        contentPane.add(mainPanel);
        contentPane.add(buttonPanel);

        setContentPane(contentPane);
    }

}

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class ClientInformationPage extends JFrame {
	private JLabel clientInfoLabel, policyInfoLabel, vehicleInfoLabel, driverInfoLabel, coverageDetailsLabel,
			paymentInfoLabel, claimsHistoryLabel, additionalNotesLabel, policyDocumentsLabel, renewalInfoLabel,
			communicationPreferencesLabel, emergencyContactLabel;

	private JTextArea clientInfoTextArea, policyInfoTextArea, vehicleInfoTextArea, driverInfoTextArea,
			coverageDetailsTextArea, paymentInfoTextArea, claimsHistoryTextArea, additionalNotesTextArea,
			policyDocumentsTextArea, renewalInfoTextArea, communicationPreferencesTextArea, emergencyContactTextArea;

	public ClientInformationPage() {
		setTitle("Πληροφορίες Πελάτη");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Create a panel for the buttons

		JPanel infopanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

		// Add buttons to the button panel
		JButton changeDetailsBtn = new JButton("Αλλαγή Στοιχείων");
		changeDetailsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // Close the current frame
				new ChangeDetailsPage(); // Open the new frame for changing details
			}
		});
		changeDetailsBtn.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		JButton viewInsuranceDetailsBtn = new JButton("Προβολή Λεπτομερειών Ασφάλισης");
		viewInsuranceDetailsBtn.setFont(new Font("Times New Roman", Font.PLAIN, 8));
		JButton accidentCompensationBtn = new JButton("Αίτηση Αποζημίωσης Ατυχήματος");
		accidentCompensationBtn.setFont(new Font("Times New Roman", Font.PLAIN, 8));
		JButton reportIncidentBtn = new JButton("Καταχώρηση Συμβάντος");
		reportIncidentBtn.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		JButton debtsBtn = new JButton("Οφειλές");
		debtsBtn.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		JButton cancelInsuranceBtn = new JButton("Ακύρωση Ασφάλισης");
		// Add ActionListener to the cancelInsuranceBtn
		cancelInsuranceBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(ClientInformationPage.this,
						"Είστε σίγουρος ότι θέλετε να ακυρώσετε την ασφάλιση;", "Επιβεβαίωση Ακύρωσης Ασφάλισης",
						JOptionPane.YES_NO_OPTION);
				if (choice == JOptionPane.YES_OPTION) {
					// Add your cancellation logic here
					dispose(); // Close the current frame
					// Add any additional logic for cancellation
				}
			}
		});

		cancelInsuranceBtn.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		JButton renewPackageBtn = new JButton("Ανανέωση Πακέτου");
		renewPackageBtn.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		JButton back = new JButton("Επιστροφή στην αρχική");
		back.setFont(new Font("Times New Roman", Font.PLAIN, 10));

		buttonPanel.setLayout(new GridLayout(2, 6));

//         Add buttons to the button panel
		buttonPanel.add(changeDetailsBtn);
		buttonPanel.add(viewInsuranceDetailsBtn);
		buttonPanel.add(accidentCompensationBtn);
		buttonPanel.add(reportIncidentBtn);
		buttonPanel.add(debtsBtn);
		buttonPanel.add(cancelInsuranceBtn);
		buttonPanel.add(renewPackageBtn);
		buttonPanel.add(back);

		getContentPane().setLayout(new GridLayout(2, 1));

		infopanel.setLayout(new GridLayout(12, 2));
		infopanel.setPreferredSize(new Dimension(300, 800)); // Adjust the dimensions as needed

		// Client Information
		clientInfoLabel = new JLabel("Πληροφορίες Πελάτη:");
		clientInfoTextArea = new JTextArea();
		clientInfoTextArea.setEditable(false);
		clientInfoTextArea.setText(
				"Όνομα: Ιωάννης Παράδεισος\nΔιεύθυνση: Κύριος Οδός 123\nΑριθμός Επικοινωνίας: 123-456-7890\nΔιεύθυνση Email: john@example.com");

		infopanel.add(clientInfoLabel);
		infopanel.add(clientInfoTextArea);

		// Policy Information
		policyInfoLabel = new JLabel("Πληροφορίες Ασφάλειας:");
		policyInfoTextArea = new JTextArea();
		policyInfoTextArea.setEditable(false);
		policyInfoTextArea.setText(
				"Αριθμός Πολιτικής: 123456\nΗμερομηνία Έναρξης Πολιτικής: 2024-01-01\nΗμερομηνία Λήξης Πολιτικής: 2025-01-01\nΤύπος Κάλυψης: Ολοκληρωμένη\nΠοσό Ασφάλειας: $1000");

		infopanel.add(policyInfoLabel);
		infopanel.add(policyInfoTextArea);
		// Vehicle Information
		vehicleInfoLabel = new JLabel("Πληροφορίες Οχήματος:");
		vehicleInfoTextArea = new JTextArea();
		vehicleInfoTextArea.setEditable(false);
		vehicleInfoTextArea.setText(
				"Μάρκα Οχήματος: Toyota\nΜοντέλο Οχήματος: Camry\nΈτος Οχήματος: 2020\nΑριθμός Ταυτοποίησης Οχήματος (VIN): ABC123456DEF789\nΑριθμός Πινακίδας: XYZ123\nΧρήση Οχήματος: Προσωπική");

		infopanel.add(vehicleInfoLabel);
		infopanel.add(vehicleInfoTextArea);
		// Driver Information
		driverInfoLabel = new JLabel("Πληροφορίες Οδηγού:");
		driverInfoTextArea = new JTextArea();
		driverInfoTextArea.setEditable(false);
		driverInfoTextArea.setText(
				"Αριθμός Διπλώματος Οδήγησης: DL123456\nΗμερομηνία Γέννησης: 1990-01-01\nΦύλο: Άνδρας\nΟικογενειακή Κατάσταση: Εργένικος\nΙστορικό Οδήγησης: Χωρίς ατυχήματα ή παραβάσεις");

		infopanel.add(driverInfoLabel);
		infopanel.add(driverInfoTextArea);
		// Coverage Details
		coverageDetailsLabel = new JLabel("Λεπτομέρειες Κάλυψης:");
		coverageDetailsTextArea = new JTextArea();
		coverageDetailsTextArea.setEditable(false);
		coverageDetailsTextArea.setText(
				"Όρια Ευθύνης: $100,000\nΠοσό Αφαίρεσης: $500\nΕπιπλέον Κάλυψη: Βοήθεια σε περίπτωση έκτακτης ανάγκης, Κάλυψη ενοικίασης αυτοκινήτου");

		infopanel.add(coverageDetailsLabel);
		infopanel.add(coverageDetailsTextArea);
		// Payment Information
		paymentInfoLabel = new JLabel("Πληροφορίες Πληρωμής:");
		paymentInfoTextArea = new JTextArea();
		paymentInfoTextArea.setEditable(false);
		paymentInfoTextArea.setText(
				"Μέθοδος Πληρωμής: Πιστωτική Κάρτα\nΣυχνότητα Πληρωμής: Μηνιαία\nΚατάσταση Πληρωμής: Πληρώθηκε");

		infopanel.add(paymentInfoLabel);
		infopanel.add(paymentInfoTextArea);
		// Claims History
		claimsHistoryLabel = new JLabel("Ιστορικό Αξιώσεων:");
		claimsHistoryTextArea = new JTextArea();
		claimsHistoryTextArea.setEditable(false);
		claimsHistoryTextArea.setText(
				"Πληροφορίες Προηγούμενων Αξιώσεων: Χωρίς προηγούμενες αξιώσεις\nΚατάσταση Αίτησης: Δεν υπάρχουν ενεργές αξιώσεις");

		infopanel.add(claimsHistoryLabel);
		infopanel.add(claimsHistoryTextArea);
		// Additional Notes/Comments
		additionalNotesLabel = new JLabel("Πρόσθετες Σημειώσεις/Σχόλια:");
		additionalNotesTextArea = new JTextArea();
		additionalNotesTextArea.setEditable(false);
		additionalNotesTextArea.setText("Δεν υπάρχουν πρόσθετες σημειώσεις");

		infopanel.add(additionalNotesLabel);
		infopanel.add(additionalNotesTextArea);
		// Policy Documents
		policyDocumentsLabel = new JLabel("Έγγραφα Πολιτικής:");
		policyDocumentsTextArea = new JTextArea();
		policyDocumentsTextArea.setEditable(false);
		policyDocumentsTextArea.setText("Σύνδεσμοι ή συνημμένα έγγραφα πολιτικής");

		infopanel.add(policyDocumentsLabel);
		infopanel.add(policyDocumentsTextArea);
		// Renewal Information
		renewalInfoLabel = new JLabel("Πληροφορίες Ανανέωσης:");
		renewalInfoTextArea = new JTextArea();
		renewalInfoTextArea.setEditable(false);
		renewalInfoTextArea.setText("Ημερομηνία Ανανέωσης: 2025-01-01\nΚατάσταση Ανανέωσης: Δεν έχει ανανεωθεί ακόμα");

		infopanel.add(renewalInfoLabel);
		infopanel.add(renewalInfoTextArea);
		// Communication Preferences
		communicationPreferencesLabel = new JLabel("Προτιμήσεις Επικοινωνίας:");
		communicationPreferencesTextArea = new JTextArea();
		communicationPreferencesTextArea.setEditable(false);
		communicationPreferencesTextArea.setText(
				"Προτιμώμενη Μέθοδος Επικοινωνίας: Email\nΠροτιμήσεις Opt-in/Opt-out για επικοινωνία μάρκετινγκ: Opt-in");

		infopanel.add(communicationPreferencesLabel);
		infopanel.add(communicationPreferencesTextArea);
		// Emergency Contact
		emergencyContactLabel = new JLabel("Έκτακτη Επαφή:");
		emergencyContactTextArea = new JTextArea();
		emergencyContactTextArea.setEditable(false);
		emergencyContactTextArea.setText("Όνομα: Μαρία Παράδεισος\nΣχέση: Σύζυγος\nΑριθμός Επικοινωνίας: 098-765-4321");

		infopanel.add(emergencyContactLabel);
		infopanel.add(emergencyContactTextArea);

		JScrollPane scrollPane = new JScrollPane(infopanel);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		getContentPane().add(buttonPanel, BorderLayout.SOUTH);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		// getContentPane().add(infopanel);
		setVisible(true);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(ClientInformationPage::new);
	}
}
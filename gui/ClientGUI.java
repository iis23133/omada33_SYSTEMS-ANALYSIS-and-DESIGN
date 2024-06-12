import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientGUI extends JFrame {

    private DefaultListModel<String> clientsListModel;
    private JList<String> clientsList;
    private JTextField searchField;

    public ClientGUI() {
        setTitle("Πελάτες");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize clients list model and add some dummy data
        clientsListModel = new DefaultListModel<>();
        clientsListModel.addElement("Πελάτης 1");
        clientsListModel.addElement("Πελάτης 2");
        clientsListModel.addElement("Πελάτης 3");
        clientsListModel.addElement("Πελάτης 4");
        clientsListModel.addElement("Πελάτης 5");
        clientsListModel.addElement("Πελάτης 6");
        clientsListModel.addElement("Πελάτης 7");
        clientsListModel.addElement("Πελάτης 8");
        clientsListModel.addElement("Πελάτης 9");
        clientsListModel.addElement("Πελάτης 10");
        clientsListModel.addElement("Πελάτης 11");
        clientsListModel.addElement("Πελάτης 12");
        clientsListModel.addElement("Πελάτης 13");
        clientsListModel.addElement("Πελάτης 14");
        clientsListModel.addElement("Πελάτης 15");
        clientsListModel.addElement("Πελάτης 16");
        clientsListModel.addElement("Πελάτης 17");
        clientsListModel.addElement("Πελάτης 18");
        clientsListModel.addElement("Πελάτης 19");
        clientsListModel.addElement("Πελάτης 20");

        // Initialize clients list with the model
        clientsList = new JList<>(clientsListModel);

        // Create scroll pane for clients list
        JScrollPane scrollPane = new JScrollPane(clientsList);

        // Initialize search field
        searchField = new JTextField(20);
        searchField.setForeground(new Color(128, 128, 128));
        searchField.setFont(new Font("Tahoma", Font.ITALIC, 10));
        searchField.setText("Αναζητήστε όνομα πελάτη...");
        searchField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform search based on the entered text
                String searchText = searchField.getText();
                searchClients(searchText);
            }
        });

        // Create panel for search bar
        JPanel searchPanel = new JPanel();
        searchPanel.add(new JLabel("Αναζήτηση: "));
        searchPanel.add(searchField);

        // Add components to the frame
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(searchPanel, BorderLayout.NORTH);

        setVisible(true);
    }

    private void searchClients(String searchText) {
        // Method to search clients and update the list based on the search text
        DefaultListModel<String> filteredModel = new DefaultListModel<>();
        for (int i = 0; i < clientsListModel.getSize(); i++) {
            String client = clientsListModel.getElementAt(i);
            if (client.toLowerCase().contains(searchText.toLowerCase())) {
                filteredModel.addElement(client);
            }
        }
        clientsList.setModel(filteredModel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ClientGUI();
            }
        });
    }
}

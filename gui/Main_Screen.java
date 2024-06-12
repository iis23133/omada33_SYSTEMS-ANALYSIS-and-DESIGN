import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main_Screen extends JFrame {

    public Main_Screen() {
        setTitle("Αρχική Οθόνη");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // Center the frame
        getContentPane().setLayout(new BorderLayout());

        // Create a panel for the log-out button and add it to the top-left corner
        JPanel topPanel = new JPanel(new BorderLayout());
        JButton logoutButton = createLogoutButton("Αποσύνδεση", Color.RED);
        topPanel.add(logoutButton, BorderLayout.EAST);

        // Create the main panel with the three buttons
        JPanel mainPanel = new JPanel(new GridLayout(1, 3));
        mainPanel.setBackground(Color.WHITE); // Change background color

        JButton clientsButton = createButton("Πελάτες", new Color(52, 152, 219)); // Set color for Clients button
        JButton statisticsButton = createButton("Ανάλυση Απόδοσης των Πωλήσεών μου", Color.ORANGE); // Set color for Statistics button
        JButton packagesButton = createButton("Νέα Προσφορά", new Color(46, 204, 113)); // Set color for Packages button

        mainPanel.add(clientsButton);
        mainPanel.add(statisticsButton);
        mainPanel.add(packagesButton);

        getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(mainPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private JButton createButton(String text, Color color) {
        JButton button = new JButton("<html><div style='text-align:center;'>" + text + "</div></html>");
        button.setFont(new Font("Arial", Font.BOLD, 18)); // Set font
        button.setBackground(color); // Change button color
        button.setForeground(Color.WHITE); // Change text color
        button.setFocusPainted(false); // Remove focus border
        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // Add padding
        // Set preferred size based on the text width
        button.setPreferredSize(new Dimension(button.getPreferredSize().width + 20, button.getPreferredSize().height));

        // Add mouse listener to handle hover effect
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(color.darker()); // Darken the color on hover
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(color); // Restore original color on exit
            }
        });

        // Change button UI to provide visual feedback on click
        button.setUI(new BasicButtonUI() {
            @Override
            protected void paintButtonPressed(Graphics g, AbstractButton b) {
                g.setColor(color.darker()); // Darken the color when clicked
                g.fillRect(0, 0, b.getWidth(), b.getHeight());
                super.paintButtonPressed(g, b);
            }
        });

        return button;
    }

    private JButton createLogoutButton(String text, Color color) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 12)); // Set font
        button.setBackground(color); // Change button color
        button.setForeground(Color.WHITE); // Change text color
        button.setFocusPainted(false); // Remove focus border
        button.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // Add padding

        // Add mouse listener to handle hover effect
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(color.darker()); // Darken the color on hover
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(color); // Restore original color on exit
            }
        });

        // Add action listener for log-out functionality
        button.addActionListener(e -> {
            // Log-out logic here
            System.out.println("Log out button clicked");
        });

        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main_Screen());
    }
}

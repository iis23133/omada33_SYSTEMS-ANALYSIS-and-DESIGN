import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;

public class new_prosfora extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField textLicensePlate;
    private JTextField textFName;
    private JTextField textName;

    /**
     * Create the frame.
     */
    public new_prosfora() {
        setTitle("Νέα Προσφορά");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        
        JLabel lblName = new JLabel("Όνομα");
        
        JLabel lblFName = new JLabel("Επίθετο");
        
        JLabel lblLicensePlate = new JLabel("Aριθμός κυκλοφορίας");
        
        JButton btnCheckinfo = new JButton("Έλεγχος εγκυρότητας");
        
        textLicensePlate = new JTextField();
        textLicensePlate.setColumns(10);
        
        textFName = new JTextField();
        textFName.setColumns(10);
        
        textName = new JTextField();
        textName.setColumns(10);
        
        JButton btnNewOffer = new JButton("Νέα προσφορά");
        btnNewOffer.setFont(new Font("Times New Roman", Font.BOLD, 24));
        
        JPanel panel = new JPanel();
        GroupLayout groupLayout = new GroupLayout(panel);
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(btnNewOffer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(textName, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(lblFName, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(textFName, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(lblLicensePlate, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(textLicensePlate, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(136)
        					.addComponent(btnCheckinfo)))
        			.addContainerGap(323, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        				.addComponent(textName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblFName, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        				.addComponent(textFName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblLicensePlate, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        				.addComponent(textLicensePlate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btnCheckinfo)
        			.addGap(28)
        			.addComponent(btnNewOffer, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(89, Short.MAX_VALUE))
        );
        panel.setLayout(groupLayout);
        getContentPane().add(panel);
    }

    public static void main(String[] args) {
        new_prosfora frame = new new_prosfora();
        frame.setVisible(true);
    }
}

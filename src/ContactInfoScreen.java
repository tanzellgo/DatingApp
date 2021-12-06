import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ContactInfoScreen {

	private JFrame frame;
	private JTextField txtPhoneNumber;
	private JTextField txtEmail;
	private JTextField txtFacebookLink;
	private JTextField txtImage;
	private JButton btnSaveContactInfo;
	private JButton btnEditContactInformation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactInfoScreen window = new ContactInfoScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ContactInfoScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create Contact Information");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(128, 25, 184, 23);
		frame.getContentPane().add(lblNewLabel);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setText("Phone Number");
		txtPhoneNumber.setBounds(52, 59, 151, 20);
		frame.getContentPane().add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setColumns(10);
		txtEmail.setBounds(52, 90, 151, 20);
		frame.getContentPane().add(txtEmail);
		
		txtFacebookLink = new JTextField();
		txtFacebookLink.setText("Facebook Link");
		txtFacebookLink.setColumns(10);
		txtFacebookLink.setBounds(227, 59, 151, 20);
		frame.getContentPane().add(txtFacebookLink);
		
		txtImage = new JTextField();
		txtImage.setText("Image");
		txtImage.setColumns(10);
		txtImage.setBounds(227, 90, 151, 20);
		frame.getContentPane().add(txtImage);
		
		JLabel lblNewLabel_1 = new JLabel("Already have contact information saved?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(112, 169, 210, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		btnSaveContactInfo = new JButton("Save Contact Information");
		btnSaveContactInfo.setBounds(138, 121, 163, 23);
		frame.getContentPane().add(btnSaveContactInfo);
		
		btnEditContactInformation = new JButton("Edit Contact Information");
		btnEditContactInformation.setBounds(138, 194, 163, 23);
		frame.getContentPane().add(btnEditContactInformation);
	}

}

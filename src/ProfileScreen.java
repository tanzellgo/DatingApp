import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProfileScreen {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtPronouns;
	private JTextField txtSex;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileScreen window = new ProfileScreen();
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
	public ProfileScreen() {
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
		
		JLabel lblNewLabel = new JLabel("Create Profile");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(168, 23, 99, 17);
		frame.getContentPane().add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setBounds(68, 61, 137, 20);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setText("Age");
		txtAge.setColumns(10);
		txtAge.setBounds(68, 92, 137, 20);
		frame.getContentPane().add(txtAge);
		
		txtPronouns = new JTextField();
		txtPronouns.setText("Pronouns");
		txtPronouns.setColumns(10);
		txtPronouns.setBounds(227, 61, 137, 20);
		frame.getContentPane().add(txtPronouns);
		
		txtSex = new JTextField();
		txtSex.setText("Sex");
		txtSex.setColumns(10);
		txtSex.setBounds(227, 92, 137, 20);
		frame.getContentPane().add(txtSex);
		
		JButton btnNewButton = new JButton("Save Profile");
		btnNewButton.setBounds(168, 133, 99, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Already have a profile?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(159, 171, 121, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnEditProfile = new JButton("Edit Profile");
		btnEditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				EditProfileScreen frame = new EditProfileScreen();
//				frame.setVisible(true);
			}
		});
		btnEditProfile.setBounds(168, 201, 99, 23);
		frame.getContentPane().add(btnEditProfile);
	}

}

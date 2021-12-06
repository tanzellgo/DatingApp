import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Homepage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage window = new Homepage();
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
	public Homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 592, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Blind Dating App");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(232, 27, 119, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnLocations = new JButton("Locations");
		btnLocations.setBounds(183, 110, 89, 23);
		frame.getContentPane().add(btnLocations);
		
		JButton btnProfiles = new JButton("Profiles");
		btnProfiles.setBounds(309, 110, 89, 23);
		frame.getContentPane().add(btnProfiles);
		
		JButton btnContactInfo = new JButton("Contact Info");
		btnContactInfo.setBounds(179, 144, 93, 23);
		frame.getContentPane().add(btnContactInfo);
		
		JButton btnInterests = new JButton("Interests");
		btnInterests.setBounds(309, 144, 89, 23);
		frame.getContentPane().add(btnInterests);
		
		JButton btnActivities = new JButton("Activities");
		btnActivities.setBounds(254, 178, 89, 23);
		frame.getContentPane().add(btnActivities);
		
		JButton btnMatchPreferences = new JButton("Match Preferences");
		btnMatchPreferences.setBounds(163, 255, 123, 23);
		frame.getContentPane().add(btnMatchPreferences);
		
		JLabel lblNewLabel_1 = new JLabel("Get Started");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(249, 85, 80, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ready to Match?");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(249, 227, 101, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnSentInvites = new JButton("Sent Invites");
		btnSentInvites.setBounds(163, 304, 123, 23);
		frame.getContentPane().add(btnSentInvites);
		
		JButton btnReceivedInvites = new JButton("Received Invites");
		btnReceivedInvites.setBounds(309, 304, 123, 23);
		frame.getContentPane().add(btnReceivedInvites);
		
		JButton btnMatchProfiles = new JButton("Match Profiles");
		btnMatchProfiles.setBounds(309, 255, 123, 23);
		frame.getContentPane().add(btnMatchProfiles);
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class LocationScreen {

	private JFrame frame;
	private JTextField txtLocationName;
	private JTextField txtAddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocationScreen window = new LocationScreen();
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
	public LocationScreen() {
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
		
		JLabel lblNewLabel = new JLabel("Create Location");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(166, 41, 104, 17);
		frame.getContentPane().add(lblNewLabel);
		
		txtLocationName = new JTextField();
		txtLocationName.setText("Location Name");
		txtLocationName.setToolTipText("");
		txtLocationName.setBounds(102, 91, 227, 20);
		frame.getContentPane().add(txtLocationName);
		txtLocationName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setToolTipText("");
		txtAddress.setText("Address");
		txtAddress.setColumns(10);
		txtAddress.setBounds(102, 131, 227, 20);
		frame.getContentPane().add(txtAddress);
		
		JButton btnSaveLocation = new JButton("Save Location");
		btnSaveLocation.setBounds(166, 190, 104, 23);
		frame.getContentPane().add(btnSaveLocation);
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class InterestScreen {

	private JFrame frame;
	private JTextField txtAgePreference;
	private JTextField txtSexPreference;
	private JTextField txtMovieGenre;
	private JTextField txtSongGenre;
	private JTextField txtFavoriteFood;
	private JTextField txtFavoriteHobby;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterestScreen window = new InterestScreen();
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
	public InterestScreen() {
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
		
		JLabel lblNewLabel = new JLabel("Create Interests");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(154, 27, 114, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtAgePreference = new JTextField();
		txtAgePreference.setText("Age Preference");
		txtAgePreference.setBounds(80, 52, 114, 20);
		frame.getContentPane().add(txtAgePreference);
		txtAgePreference.setColumns(10);
		
		txtSexPreference = new JTextField();
		txtSexPreference.setText("Sex Preference");
		txtSexPreference.setColumns(10);
		txtSexPreference.setBounds(80, 83, 114, 20);
		frame.getContentPane().add(txtSexPreference);
		
		txtMovieGenre = new JTextField();
		txtMovieGenre.setText("Movie Genre");
		txtMovieGenre.setColumns(10);
		txtMovieGenre.setBounds(80, 114, 114, 20);
		frame.getContentPane().add(txtMovieGenre);
		
		txtSongGenre = new JTextField();
		txtSongGenre.setText("Song Genre");
		txtSongGenre.setColumns(10);
		txtSongGenre.setBounds(226, 52, 114, 20);
		frame.getContentPane().add(txtSongGenre);
		
		txtFavoriteFood = new JTextField();
		txtFavoriteFood.setText("Favorite Food");
		txtFavoriteFood.setColumns(10);
		txtFavoriteFood.setBounds(226, 83, 114, 20);
		frame.getContentPane().add(txtFavoriteFood);
		
		txtFavoriteHobby = new JTextField();
		txtFavoriteHobby.setText("Favorite Hobby");
		txtFavoriteHobby.setColumns(10);
		txtFavoriteHobby.setBounds(226, 114, 114, 20);
		frame.getContentPane().add(txtFavoriteHobby);
		
		JButton btnNewButton = new JButton("Save Interests");
		btnNewButton.setBounds(154, 145, 114, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Already have interests saved?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(134, 179, 156, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnEditInterests = new JButton("Edit Interests");
		btnEditInterests.setBounds(154, 203, 114, 23);
		frame.getContentPane().add(btnEditInterests);
	}

}

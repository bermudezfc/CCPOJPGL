package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginLibrarianFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textLibrarianUser;
	private JTextField textLibrarianPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginLibrarianFrame frame = new LoginLibrarianFrame();
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
	public LoginLibrarianFrame() {
		setTitle("Librarian Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLibrarianUser = new JLabel("Username");
		lblLibrarianUser.setBounds(70, 49, 91, 22);
		contentPane.add(lblLibrarianUser);
		
		textLibrarianUser = new JTextField();
		textLibrarianUser.setBounds(70, 103, 96, 19);
		contentPane.add(textLibrarianUser);
		textLibrarianUser.setColumns(10);
		
		textLibrarianPass = new JTextField();
		textLibrarianPass.setBounds(70, 198, 96, 19);
		contentPane.add(textLibrarianPass);
		textLibrarianPass.setColumns(10);
		
		JLabel lblLibrarianPass = new JLabel("Password");
		lblLibrarianPass.setBounds(70, 161, 79, 27);
		contentPane.add(lblLibrarianPass);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(215, 131, 85, 21);
		contentPane.add(btnLogin);
	}
}

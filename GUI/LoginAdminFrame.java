package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginAdminFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textAdminUser;
	private JTextField textAdminPass;	
	private LoginCredentials adminCredentials1;
	private LoginCredentials adminCredentials2;
	private LoginCredentials adminCredentials3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		LoginCredentials adminCredentials1 = new LoginCredentials("Admin_01", "AdminOne");
		LoginCredentials adminCredentials2 = new LoginCredentials("Admin_02", "AdminTwo");
		LoginCredentials adminCredentials3 = new LoginCredentials("Admin_02", "AdminThree");

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAdminFrame frame = new LoginAdminFrame();
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
	
	// pass the LoginCredentials object as credentials 
	public boolean checkCredentials(LoginCredentials adminCredentials1, LoginCredentials adminCredentials2, LoginCredentials adminCredentials3) {
	    // Check if the username and password match the expected values
	    if ((adminCredentials1.getUsername().equals(textAdminUser.getText()) && adminCredentials1.getPassword().equals(textAdminPass.getText()))
	            || (adminCredentials2.getUsername().equals(textAdminUser.getText()) && adminCredentials2.getPassword().equals(textAdminPass.getText()))
	            || (adminCredentials3.getUsername().equals(textAdminUser.getText()) && adminCredentials3.getPassword().equals(textAdminPass.getText()))) {
	        return true;
	    } else {
	        return false;
	    }
	}



	public LoginAdminFrame() {
		setTitle("Admin Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminUser = new JLabel("Username");
		lblAdminUser.setBounds(91, 74, 96, 13);
		contentPane.add(lblAdminUser);
		
		textAdminUser = new JTextField();
		textAdminUser.setBounds(91, 97, 96, 19);
		contentPane.add(textAdminUser);
		textAdminUser.setColumns(10);
		
		JLabel lblAdminPass = new JLabel("Password");
		lblAdminPass.setBounds(91, 142, 85, 13);
		contentPane.add(lblAdminPass);
		
		textAdminPass = new JTextField();
		textAdminPass.setBounds(91, 165, 96, 19);
		contentPane.add(textAdminPass);
		textAdminPass.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkCredentials(adminCredentials1, adminCredentials2, adminCredentials3)) {
				    JOptionPane.showMessageDialog(null, "Login Successful");
				} else {
				    JOptionPane.showMessageDialog(null, "Login failed");
				}
			}
		});
		btnLogin.setBounds(219, 123, 85, 21);
		contentPane.add(btnLogin);
	}
}

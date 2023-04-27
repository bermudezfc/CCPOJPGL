package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLMS = new JLabel("    Library Management System");
		lblLMS.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLMS.setBounds(175, 89, 304, 51);
		contentPane.add(lblLMS);

		
		JButton btnAdmin = new JButton("Admin Login");
		btnAdmin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginAdminFrame admin = new LoginAdminFrame(); 
				admin.setVisible(true);
				
				
			}
		});
		btnAdmin.setBounds(201, 217, 215, 21);
		contentPane.add(btnAdmin);
		
		JButton btnLibrarian = new JButton("Librarian Login");
		btnLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginLibrarianFrame librarian = new LoginLibrarianFrame(); 
				librarian.setVisible(true);
			}
		});
		btnLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLibrarian.setBounds(201, 302, 215, 21);
		contentPane.add(btnLibrarian);
	}
}

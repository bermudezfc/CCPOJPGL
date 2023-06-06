package LongExam1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import OOP2.SkillsFrame;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HomeFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeFrame frame = new HomeFrame();
					// centers the frame
					frame.setLocationRelativeTo(null);
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
	public HomeFrame() {
		final ButtonsImplementation buttons = new ButtonsImplementation();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(-3, -3, 1280, 720);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel lblAboutButton = new JLabel("");
		
		// Action listeners for my jlabel buttons 
		lblAboutButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// disposes the current frame
				dispose();
				// calls the about button method in the Buttons implementation class
				buttons.AboutButton();
			}
		});
		
		JLabel lblWorksButton = new JLabel("");
		lblWorksButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				buttons.WorksButton();
			}
		});
		
		JLabel lblSkillsButton = new JLabel("");
		lblSkillsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				buttons.SkillsButton();
			}
		});
		
		JLabel lblContactButton = new JLabel("");
		lblContactButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				buttons.ContactButton();
			}
		});
		lblContactButton.setBounds(937, 66, 257, 62);
		panel.add(lblContactButton);
		lblSkillsButton.setBounds(550, 79, 319, 35);
		panel.add(lblSkillsButton);
		lblWorksButton.setBounds(374, 79, 103, 35);
		panel.add(lblWorksButton);
		lblAboutButton.setBounds(209, 79, 98, 35);
		panel.add(lblAboutButton);
		
		JLabel lblHomePicture = new JLabel("");
		// Sets the icon of the label to the file path of the image
		lblHomePicture.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\Portfolio\\src\\LongExam1\\pictures\\1_1_11zon.png"));
		lblHomePicture.setBounds(-3, -23, 1280, 720);
		panel.add(lblHomePicture);
	}
}

package LongExam1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SkillsFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkillsFrame frame = new SkillsFrame();
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
	public SkillsFrame() {
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
		
		JLabel lblHomeButton = new JLabel("");
		// Action listeners for my jlabel buttons 
		lblHomeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// disposes the current frame
				dispose();
				// calls the about button method in the Buttons implementation class
				buttons.HomeButton();
			}
		});
		lblHomeButton.setBounds(63, 77, 91, 35);
		panel.add(lblHomeButton);
		
		JLabel lblWorksButton = new JLabel("");
		lblWorksButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				buttons.WorksButton();
			}
		});
		lblWorksButton.setBounds(376, 77, 103, 35);
		panel.add(lblWorksButton);
		
		JLabel lblContactButton = new JLabel("");
		lblContactButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				buttons.ContactButton();
			}
		});
		lblContactButton.setBounds(939, 64, 257, 62);
		panel.add(lblContactButton);
		
		JLabel lblAboutButton = new JLabel("");
		lblAboutButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				buttons.AboutButton();
			}
		});
		lblAboutButton.setBounds(215, 77, 91, 35);
		panel.add(lblAboutButton);
		
		JLabel lblNewLabel = new JLabel("");
		// Sets the icon of label to file path of image
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\Portfolio\\src\\LongExam1\\pictures\\3_3_11zon.png"));
		lblNewLabel.setBounds(-3, -23, 1280, 720);
		panel.add(lblNewLabel);
	}

}

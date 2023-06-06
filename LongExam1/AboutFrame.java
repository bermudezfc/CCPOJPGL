package LongExam1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AboutFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutFrame frame = new AboutFrame();
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
	public AboutFrame() {
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
		
		JLabel lblWorksButton = new JLabel("");
		lblWorksButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				buttons.WorksButton();
				
			}
		});
		lblWorksButton.setBounds(375, 79, 103, 35);
		panel.add(lblWorksButton);
		
		JLabel lblSkillsButton = new JLabel("");
		// Action listeners for my Jlabel
		lblSkillsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// disposes the current frame
				dispose();
				// calls the about button method in the Buttons implementation class
				buttons.SkillsButton();
			}
		});
		lblSkillsButton.setBounds(551, 79, 319, 35);
		panel.add(lblSkillsButton);
		
		JLabel lblHomeButton = new JLabel("");
		lblHomeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				buttons.HomeButton();
			}
		});
		lblHomeButton.setBounds(62, 79, 91, 35);
		panel.add(lblHomeButton);
		
		JLabel lblContactButton = new JLabel("");
		lblContactButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				buttons.ContactButton();
			}
		});
		lblContactButton.setBounds(938, 66, 257, 62);
		panel.add(lblContactButton);
		
		JLabel lblNewLabel = new JLabel("");
		// Sets the icon of label to file path of image
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\Portfolio\\src\\LongExam1\\pictures\\aboutz.png"));
		lblNewLabel.setBounds(-3, -23, 1280, 720);
		panel.add(lblNewLabel);
	}
}

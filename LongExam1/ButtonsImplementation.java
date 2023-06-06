package LongExam1;

import javax.swing.JFrame;

public class ButtonsImplementation extends JFrame {

	// methods for my actionlisteners which instansiates the corresponding frame 
	//centers the frame
	// sets the frame visible to true so the frame shows 
	
	public void AboutButton() {
		AboutFrame about = new AboutFrame();
		about.setLocationRelativeTo(null);
		about.setVisible(true);
	}
	
	public void HomeButton() {
		HomeFrame home = new HomeFrame();
		home.setLocationRelativeTo(null);
		home.setVisible(true);
		
	}
	
	public void ContactButton() {
		ContactFrame contact = new ContactFrame();
		contact.setLocationRelativeTo(null);
		contact.setVisible(true);
	}
	
	public void SkillsButton() {
		SkillsFrame skills = new SkillsFrame();
		skills.setLocationRelativeTo(null);
		skills.setVisible(true);
		
	}
	
	public void WorksButton() {
		WorksFrame works = new WorksFrame();
		works.setLocationRelativeTo(null);
		works.setVisible(true);
	}

}

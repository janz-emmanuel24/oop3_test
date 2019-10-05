package layout;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class SurveyFrame extends JFrame {
	
	public SurveyFrame() {
		super("Survey");
		setSize(290, 140);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		SurveyWizard wiz = new SurveyWizard();
		add(wiz);
		setVisible(true);
	}
	
	
	private static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static void main(String[] args) {
		SurveyFrame surframe = new SurveyFrame();
	}

}

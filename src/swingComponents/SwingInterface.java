package swingComponents;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SwingInterface extends JFrame {
	public JButton cancel = new JButton("Cancel");
	JButton logon = new JButton("Logon");
	JButton unsubscribe = new JButton("Unsubscribe");
	JPanel pane = new JPanel();
	
	public SwingInterface() {
		super("Working With Swing");
		//setSize(300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pane.add(cancel);
		pane.add(logon);
		pane.add(unsubscribe);
		add(pane);
	}
	
	private static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	public static void main(String[] args) {
		setLookAndFeel();
		SwingInterface sI = new SwingInterface();
		//sI.add(p);
		sI.setBounds(600, 300, 400, 200);
		sI.setVisible(true);
	}
}

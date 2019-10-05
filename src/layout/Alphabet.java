package layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Alphabet extends JFrame {
	
	public Alphabet() {
		super("Alphabet");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		setSize(360, 120);
		
		FlowLayout lm = new FlowLayout(FlowLayout.RIGHT);
		lm.setVgap(10);
		lm.setHgap(8);
		setLayout(lm);
		
		//creating buttons
		JButton a = new JButton("Alibi");
		JButton b = new JButton("Burglar");
		JButton c = new JButton("Corspe");
		JButton d = new JButton("Deadbeat");
		JButton e = new JButton("Evidence");
		JButton f = new JButton("Fugitive");
		
		add(a);
		add(b);
		add(c);
		add(d);
		add(e);
		add(f);
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
		Alphabet frame = new Alphabet();
	}

}

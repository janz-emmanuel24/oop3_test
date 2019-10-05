package swingEvents;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class TitleBar extends JFrame implements ActionListener {
	
	JButton b1;
	JButton b2;
	
	public TitleBar() {
		super("Title Bar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		b1 = new JButton("Rosencrantz");
		b2 = new JButton("Guildenstern");
		b1.addActionListener(this);
		b2.addActionListener(this);
		GridLayout grid = new GridLayout(2,1);
		setLayout(grid);
		add(b1);
		add(b2);
		pack();
		setVisible(true);
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		TitleBar frame = new TitleBar();
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		Object source = evt.getSource();
		
		if(source == b1) {
			setTitle("Rosencrantz");
		} else if (source == b2) {
			setTitle("Guildenstern");
		}
		repaint();
	}

}

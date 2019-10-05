package layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class Stacker extends JFrame {

	
	public Stacker() {
		super("Stacker");
		setSize(430, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		
		//creating top panel
		JPanel commandPane = new JPanel();
		BoxLayout horizontal = new BoxLayout(commandPane, BoxLayout.Y_AXIS);
		commandPane.setLayout(horizontal);
		
		JButton subscribe = new JButton("Subscribe");
		JButton unsubscribe = new JButton("Unsubscribe");
		JButton refresh = new JButton("Refresh");
		JButton save = new JButton("Save");
		
		commandPane.add(subscribe);
		commandPane.add(unsubscribe);
		commandPane.add(refresh);
		commandPane.add(save);
		
		//creating bottom panel
		JPanel textPane = new JPanel();
		JTextArea text = new JTextArea(4, 70);
		JScrollPane scrollPane = new JScrollPane(text);
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(commandPane);
		add(scrollPane);
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
		Stacker st = new Stacker();
	}
}

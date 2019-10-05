package swingComponents;

import javax.swing.*;


public class Authenticator extends javax.swing.JFrame {
	//declaring instance variables
	JTextField username = new JTextField(15);
	JPasswordField password = new JPasswordField(15);
	JTextArea comments = new JTextArea(5,15);
	JButton ok = new JButton("OK");
	JButton cancel = new JButton("Cancel");
	
	public Authenticator() {
		//the main GUI container
		super("Account Information");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//container to hold swing components
		JPanel panel = new JPanel();
		JLabel usernameLabel = new JLabel("Username: ");
		JLabel passwordLabel = new JLabel("Password: ");
		JLabel commentsLabel = new JLabel("Comments:");
		comments.setLineWrap(true);
		comments.setWrapStyleWord(true);
		panel.add(usernameLabel);
		panel.add(username);
		panel.add(passwordLabel);
		panel.add(password);
		panel.add(commentsLabel);
		JScrollPane scroll = new JScrollPane(comments, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scroll);
		panel.add(ok);
		panel.add(cancel);
		
		//adding panel container to the main GUI container
		add(panel);
		setVisible(true);
		
	}
	
	private static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	

	public static void main(String[] args) {
		Authenticator.setLookAndFeel();
		Authenticator auth = new Authenticator();
	}

}

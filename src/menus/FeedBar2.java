package menus;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class FeedBar2 extends JFrame {
	
	public FeedBar2() {
		super("FeedBar 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		
		//create buttons
		JButton load = new JButton("Load");
		JButton save = new JButton("Save");
		JButton sub = new JButton("Subscribe");
		JButton unsub = new JButton("Unsubscribe");
		
		//add buttons to toolbar
		JToolBar bar = new JToolBar();
		//bar.add(load);
		//bar.add(save);
		//bar.add(sub);
		//bar.add(unsub);
		
		JMenuItem j1 = new JMenuItem("Load");
		JMenuItem j2 = new JMenuItem("Save");
		JMenuItem j3 = new JMenuItem("Subscribe");
		JMenuItem j4 = new JMenuItem("Unsubscribe");
		
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("Feeds");
		JMenu menu2 = new JMenu("Foods");
		menu.add(j1);
		menu.add(j2);
		menu.addSeparator();
		menu.add(j3);
		menu.add(j4);
		menubar.add(menu);
		menubar.add(menu2);
		
		//prepare user interface
		JTextArea edit = new JTextArea(8, 30);
		JScrollPane scroll = new JScrollPane(edit);
		BorderLayout bord = new BorderLayout();
		setLayout(bord);
		add("North", bar);
		add("Center", scroll);
		setJMenuBar(menubar);
		pack();
		setVisible(true);
	}
	
	private static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String args[] ) {
		FeedBar2 frame = new FeedBar2();
	}
}

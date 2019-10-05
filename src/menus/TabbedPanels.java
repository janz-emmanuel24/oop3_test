package menus;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.text.DateFormat;

import javax.swing.JTable;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class TabbedPanels extends JFrame {

	private static final String Insets = null;

	public TabbedPanels() {
		super("Tabbed Panes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		setSize(480,300);
		//adding a vertical tabbed panel in mainSettings tab
		JPanel mainSettings = new JPanel();
		JPanel students = new JPanel();
		BoxLayout bL = new BoxLayout(students, BoxLayout.Y_AXIS);
		GridLayout gg = new GridLayout();
		students.setLayout(bL);
		JPanel course = new JPanel();
		JPanel courseUnits = new JPanel();
		JPanel lecturers = new JPanel();
		
		//Creating Buttons
		JPanel buttons = new JPanel();//panel for buttons
		JButton b1 = new JButton("Add");
		JButton b2 = new JButton("Edit");
		JButton b3 = new JButton("Delete");
		buttons.add(b1);
		buttons.add(b2);
		buttons.add(b3);
		
		students.add(buttons);
		
		//Creating the form
		JPanel form = new JPanel();
		JLabel fname = new JLabel("First Name: ");
		JLabel lname = new JLabel("Last Name: ");
		JLabel gender = new JLabel("Sex: ");
		JLabel dob = new JLabel("Date of Birth: ");
		JButton submit = new JButton("Submit");
		JButton cancel = new JButton("Cancel");
				
		GridLayout grid1 = new GridLayout(5,2);
		form.setLayout(grid1);
		form.add(fname);
		JTextField fN = new JTextField();
		form.add(fN);
		form.add(lname);
		JTextField lN = new JTextField();
		form.add(lN);
		form.add(gender);
		JTextField gender2 = new JTextField();
		form.add(gender2);
		JPanel but = new JPanel();
		but.add(submit);
		but.add(cancel);
		students.add(form);
		students.add(but);
		
		
		
		
		//panel for the table
		JPanel table = new JPanel();
		JTable table1 = new JTable();
		Object[] columns = {"FirstName", "LastName", "Sex"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		table1.setModel(model);
		table1.setRowHeight(20);
		table1.setBackground(Color.darkGray);
		students.add(table1);
		
		Object[] row = new Object[3];
		//Events
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				row[0] = fN.getText();
				row[1] = lN.getText();
				row[2] = gender2.getText();
				
				model.addRow(row);
			}
			
		});
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int i = table1.getSelectedRow();
				
				if(i >= 0) {
					model.removeRow(i);
				} else {
					System.out.println("Deletion Error");
				}
			}
			
		});
		
		table1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table1.getSelectedRow();
				fN.setText(model.getValueAt(i,0).toString());
				lN.setText(model.getValueAt(i,1).toString());
				gender2.setText(model.getValueAt(i,2).toString());
			}
		});
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				int i = table1.getSelectedRow();
				
				if(i >= 0) {
					model.setValueAt(fN.getText(),i, 0);
					model.setValueAt(lN.getText(),i, 1);
					model.setValueAt(gender2.getText(),i, 2);
				} else {
					System.out.println("Update Error");
				}
			}
			
		});
		
		JTabbedPane mainTabs = new JTabbedPane(JTabbedPane.LEFT);
		mainTabs.addTab("Students", students);
		mainTabs.addTab("Course", course);
		mainTabs.addTab("CourseUnits", course);
		mainTabs.addTab("Lecturers", lecturers);
		BorderLayout bl = new BorderLayout();
		mainSettings.setLayout(bl);
		mainSettings.add(mainTabs);
		
		JPanel advancedSettings = new JPanel();
		JPanel privacySettings = new JPanel();
		JPanel emailSettings = new JPanel();
		JPanel securitySettings = new JPanel();
		
		JTabbedPane tabs = new JTabbedPane();
		tabs.addTab("Mainmmmm", mainSettings);
		tabs.addTab("Advanced", advancedSettings);
		tabs.addTab("Privacy", privacySettings);
		tabs.addTab("Email", emailSettings);
		tabs.addTab("Security", securitySettings);
		add(tabs);
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
		TabbedPanels frames = new TabbedPanels();

	}

}

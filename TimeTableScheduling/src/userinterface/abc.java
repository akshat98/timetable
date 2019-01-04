package userinterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class abc {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					abc window = new abc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public abc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFaculties = new JLabel("Faculties");
		lblFaculties.setBounds(293, 11, 46, 14);
		frame.getContentPane().add(lblFaculties);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Prof. RaviGorthi", "Dr. SunilKumar", "Dr. RajbeerKaur", "Mr. Mukesh Jadon"}));
		comboBox.setBounds(256, 36, 124, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblStudents = new JLabel("Students");
		lblStudents.setBounds(293, 117, 46, 14);
		frame.getContentPane().add(lblStudents);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox_1.setBounds(254, 142, 54, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"CCE", "MME", "CSE", "ECE"}));
		comboBox_2.setBounds(318, 142, 62, 22);
		frame.getContentPane().add(comboBox_2);
		
		JButton btnMainTimeTable = new JButton("Main TIme Table");
		btnMainTimeTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMainTimeTable.setBounds(269, 209, 111, 23);
		frame.getContentPane().add(btnMainTimeTable);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\akshat johsi\\Desktop\\grey.jpg"));
		lblNewLabel.setBounds(10, 11, 202, 143);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Show");
		btnNewButton.setBounds(293, 175, 62, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Show");
		btnNewButton_1.setBounds(293, 69, 62, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}

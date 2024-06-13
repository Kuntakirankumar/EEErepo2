package registration_form;

import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class student_reg {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student_reg window = new student_reg();
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
	public student_reg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 501, 399);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 11));
		lblNewLabel.setBounds(151, 11, 255, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(29, 43, 72, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ROLL");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(29, 80, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(29, 122, 72, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setFont(new Font("Tahoma", Font.BOLD, 11));
		r1.setBounds(249, 175, 72, 18);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setFont(new Font("Tahoma", Font.BOLD, 11));
		r2.setBounds(383, 175, 72, 18);
		frame.getContentPane().add(r2);
		
		tb2 = new JTextField();
		tb2.setBounds(249, 78, 157, 17);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(29, 177, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PROG LANGS");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(29, 257, 72, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tb1 = new JTextField();
		tb1.setBounds(249, 40, 157, 17);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT ", "ECE", "EEE", "CSE", "MNG"}));
		cb1.setBounds(249, 119, 66, 20);
		frame.getContentPane().add(cb1);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setFont(new Font("Tahoma", Font.BOLD, 11));
		c1.setBounds(249, 254, 33, 17);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setFont(new Font("Tahoma", Font.BOLD, 11));
		c2.setBounds(315, 254, 55, 17);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("PYTHON");
		c3.setFont(new Font("Tahoma", Font.BOLD, 11));
		c3.setBounds(389, 254, 72, 17);
		frame.getContentPane().add(c3);
		
		ButtonGroup bg=new ButtonGroup();
		
		bg.add(r1);
		bg.add(r2);
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=tb1.getText();
				String rollno=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String gender="";
				String langs="";
				if(r1.isSelected())
				{
				gender="male";
				}
				if(r2.isSelected())
				{
				gender="female";
				}
			if(c1.isSelected())
		       {
			langs=langs+"c";
				}
				if(c2.isSelected())
			{
				langs=langs+"java";
				}
				if(c3.isSelected())
				{
				langs=langs+"python";
				}
JOptionPane.showMessageDialog(btnNewButton, "NAME :"+name+"\nRoll :"+rollno+"\nBRANCH:"+branch+"\nGENDER :"+gender+"\nPROG LANGS :"+langs);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(197, 316, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}

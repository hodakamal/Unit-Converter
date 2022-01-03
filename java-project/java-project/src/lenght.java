import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import frames.secondframe;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class lenght extends JFrame {

	private JPanel contentPane;
	private JTextField convertfrom;
	private JTextField resultfield;
	private JComboBox selectconvertto;
	double result = 0.0;
	double input;
	private JComboBox selectconvertfrom;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lenght frame = new lenght();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public lenght() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(233, 150, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelconvertfrom = new JLabel("Convert:");
		labelconvertfrom.setForeground(Color.WHITE);
		labelconvertfrom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelconvertfrom.setBounds(39, 21, 61, 27);
		contentPane.add(labelconvertfrom);
		
		convertfrom = new JTextField();
		convertfrom.setBounds(112, 27, 111, 19);
		contentPane.add(convertfrom);
		convertfrom.setColumns(10);
		
		JButton resetbutton = new JButton("Reset");
		resetbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				selectconvertfrom.setSelectedIndex(0);
				selectconvertto.setSelectedIndex(0);
				resultfield.setText("");
				convertfrom.setText("");
			}
		});
		resetbutton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		resetbutton.setForeground(new Color(233, 150, 122));
		resetbutton.setBackground(Color.WHITE);
		resetbutton.setBounds(274, 26, 99, 22);
		contentPane.add(resetbutton);
		
		JLabel fromlabel = new JLabel("From:");
		fromlabel.setForeground(Color.WHITE);
		fromlabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fromlabel.setBounds(39, 80, 61, 27);
		contentPane.add(fromlabel);
		
		JLabel lblNewLabel = new JLabel("To:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(240, 80, 61, 27);
		contentPane.add(lblNewLabel);
		
		JLabel resultpanel = new JLabel("Result:");
		resultpanel.setForeground(Color.WHITE);
		resultpanel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		resultpanel.setBounds(39, 144, 61, 27);
		contentPane.add(resultpanel);
		
		resultfield = new JTextField();
		resultfield.setColumns(10);
		resultfield.setBounds(112, 144, 111, 19);
		contentPane.add(resultfield);
		
		JButton convertbutton = new JButton("Convert");
		convertbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//convert input string to double
					input = Double.parseDouble(convertfrom.getText());
					
					//work with combo boxes to convert temperature
					
	
						
					if(selectconvertfrom.getSelectedItem().equals("Cm") && selectconvertto.getSelectedItem().equals("m")) {
						//convert from cm to m
						
						result = input /100;
						resultfield.setText(""+result);
					}

					if(selectconvertfrom.getSelectedItem().equals("Cm") && selectconvertto.getSelectedItem().equals("Km")) {
						//convert from cm to km
						
						result = input /100000;
						resultfield.setText(""+result);
					}
					if(selectconvertfrom.getSelectedItem().equals("m") && selectconvertto.getSelectedItem().equals("Cm")) {
						//convert from m to Cm
						
						result = input*100;
						resultfield.setText(""+result);
					}
					if(selectconvertfrom.getSelectedItem().equals("m") && selectconvertto.getSelectedItem().equals("Km")) {
						//convert from m to Km
						
						result = input/1000;
						resultfield.setText(""+result);
					}
					if(selectconvertfrom.getSelectedItem().equals("Km") && selectconvertto.getSelectedItem().equals("Cm")) {
						//convert from Km to Cm
						
						result = input * 100000;
						resultfield.setText(""+result);
					}
					if(selectconvertfrom.getSelectedItem().equals("Km") && selectconvertto.getSelectedItem().equals("m")) {
						//convert from km to m
						
						result = input *1000;
						resultfield.setText(""+result);
					}
					if(selectconvertfrom.getSelectedItem().equals("Cm") && selectconvertto.getSelectedItem().equals("Cm")) {
						//convert from cm to cm
						
						result = input;
						resultfield.setText(""+result);
					}
					if(selectconvertfrom.getSelectedItem().equals("m") && selectconvertto.getSelectedItem().equals("m")) {
						//convert from m to m
						
						result = input;
						resultfield.setText(""+result);
					}
					if(selectconvertfrom.getSelectedItem().equals("Km") && selectconvertto.getSelectedItem().equals("Km")) {
						//convert from Km to Km
						
						result = input ;
						resultfield.setText(""+result);
					}
					
					
					
					
				}catch(Exception e1) {
					//massage warn if input field is invalid
					//JOptionPane.showMessageDialog(frame, e1.getMessage());
					
				}
			}
		});
		convertbutton.setForeground(new Color(233, 150, 122));
		convertbutton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		convertbutton.setBackground(Color.WHITE);
		convertbutton.setBounds(275, 146, 98, 22);
		contentPane.add(convertbutton);
		
		JButton btnMainPage = new JButton("Main page");
		btnMainPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage mp = new mainpage();
				mp.setVisible(true);
				dispose();
			}
		});
		btnMainPage.setForeground(new Color(233, 150, 122));
		btnMainPage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMainPage.setBackground(Color.WHITE);
		btnMainPage.setBounds(274, 204, 123, 22);
		contentPane.add(btnMainPage);
		
		selectconvertto = new JComboBox();
		selectconvertto.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "Cm", "m", "Km"}));
		selectconvertto.setBounds(286, 87, 99, 19);
		contentPane.add(selectconvertto);
		
		selectconvertfrom = new JComboBox();
		selectconvertfrom.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "Cm", "m", "Km"}));
		selectconvertfrom.setBounds(112, 85, 111, 21);
		contentPane.add(selectconvertfrom);
	}

}

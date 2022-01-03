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

public class currency extends JFrame {

	private JPanel contentPane;
	private JTextField convertfrom;
	private JTextField resultfield;
	private JComboBox selectconvertform;
	private JComboBox selectconvertto;
	double result = 0.0;
	double input;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currency frame = new currency();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//currency main frame
	
	
	
	public currency() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(233, 150, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		//convert label
		
		
		JLabel labelconvertfrom = new JLabel("Convert:");
		labelconvertfrom.setFont(new Font("Tahoma", Font.PLAIN, 17));
		labelconvertfrom.setForeground(Color.WHITE);
		labelconvertfrom.setBounds(28, 20, 78, 22);
		contentPane.add(labelconvertfrom);
		
		
		
		//text field of input
		
		
		convertfrom = new JTextField();
		convertfrom.setBounds(101, 20, 127, 22);
		contentPane.add(convertfrom);
		convertfrom.setColumns(10);
		
		
		//result label
		
		
		JLabel resultpanel = new JLabel("Result:");
		resultpanel.setForeground(Color.WHITE);
		resultpanel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		resultpanel.setBounds(28, 142, 78, 22);
		contentPane.add(resultpanel);
		
		
		//output field
		
		
		
		resultfield = new JTextField();
		resultfield.setColumns(10);
		resultfield.setBounds(101, 142, 127, 22);
		contentPane.add(resultfield);
		
		
		//button to convert
		
		
		JButton convertbutton = new JButton("Convert");
		convertbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//convert input string to double
					input = Double.parseDouble(convertfrom.getText());
					
					//work with combo boxes to convert currency
					
														//convert from dollar to all other
					
					
					if(selectconvertform.getSelectedItem().equals("US dollar") && selectconvertto.getSelectedItem().equals("Euro")) {
						//convert from us dollar to euro
						
						result = input * 0.88;
						resultfield.setText(""+result);
					}
					
					if(selectconvertform.getSelectedItem().equals("US dollar") && selectconvertto.getSelectedItem().equals("yen")) {
						//convert from us dollar to yen
						
						result = input * 114.12;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("US dollar") && selectconvertto.getSelectedItem().equals("Swiss franc")) {
						//convert from us dollar to Swiss franc
						
						result = input * 0.92;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("US dollar") && selectconvertto.getSelectedItem().equals("rouble")) {
						//convert from us dollar to rouble
						
						result = input * 73.61;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("US dollar") && selectconvertto.getSelectedItem().equals("Canadian dollar")) {
						//convert from us dollar to Canadian dollar
						
						result = input * 1.28;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("US dollar") && selectconvertto.getSelectedItem().equals("yuan")) {
						//convert from us dollar to yuan
						
						result = input * 6.38;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("US dollar") && selectconvertto.getSelectedItem().equals("rupee")) {
						//convert from us dollar to rupee
						
						result = input * 75.44;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("US dollar") && selectconvertto.getSelectedItem().equals("US dollar")) {
						//convert from us dollar to US dollar
						
						result = input ;
						resultfield.setText(""+result);
					}
					
					
												//convert from euro to all other
					
					
					if(selectconvertform.getSelectedItem().equals("Euro") && selectconvertto.getSelectedItem().equals("US dollar")) {
						//convert from  euro to dollar
						
						result = input * 1.13;
						resultfield.setText(""+result);
					}
					
					if(selectconvertform.getSelectedItem().equals("Euro") && selectconvertto.getSelectedItem().equals("yen")) {
						//convert from Euro to yen
						
						result = input * 192.40;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Euro") && selectconvertto.getSelectedItem().equals("Swiss franc")) {
						//convert from Euro to Swiss franc
						
						result = input * 1.04;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Euro") && selectconvertto.getSelectedItem().equals("rouble")) {
						//convert from us dollar to rouble
						
						result = input * 83.43;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Euro") && selectconvertto.getSelectedItem().equals("Canadian dollar")) {
						//convert from Euro to Canadian dollar
						
						result = input * 1.46;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Euro") && selectconvertto.getSelectedItem().equals("yuan")) {
						//convert from Euro to yuan
						
						result = input * 7.23;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Euro") && selectconvertto.getSelectedItem().equals("rupee")) {
						//convert from Euro to rupee
						
						result = input * 85.52;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Euro") && selectconvertto.getSelectedItem().equals("Euro")) {
						//convert from Euro to Euro
						
						result = input ;
						resultfield.setText(""+result);
					}
					
					
														//convert from yen to all other
					
					
					if(selectconvertform.getSelectedItem().equals("yen") && selectconvertto.getSelectedItem().equals("US dollar")) {
						//convert from yen to dollar
						
						result = input * 0.0088;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("yen") && selectconvertto.getSelectedItem().equals("Euro")) {
						//convert from yen to euro
						
						result = input * 0.0077;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("yen") && selectconvertto.getSelectedItem().equals("Swiss franc")) {
						//convert from yen to Swiss franc
						
						result = input * 0.0081;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("yen") && selectconvertto.getSelectedItem().equals("rouble")) {
						//convert from yen to rouble
						
						result = input * 0.65;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("yen") && selectconvertto.getSelectedItem().equals("Canadian dollar")) {
						//convert from yen to Canadian dollar
						
						result = input * 0.011;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("yen") && selectconvertto.getSelectedItem().equals("yuan")) {
						//convert from yen to yuan
						
						result = input * 0.056;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("yen") && selectconvertto.getSelectedItem().equals("rupee")) {
						//convert from yen to rupee
						
						result = input * 0.66;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("yen") && selectconvertto.getSelectedItem().equals("yen")) {
						//convert from yen to yen
						
						result = input ;
						resultfield.setText(""+result);
					}
					
					
													//convert from swiss franc to all other
					
					if(selectconvertform.getSelectedItem().equals("Swiss franc") && selectconvertto.getSelectedItem().equals("US dollar")) {
						//convert from Swiss franc to dollar
						
						result = input * 1.09;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Swiss franc") && selectconvertto.getSelectedItem().equals("Euro")) {
						//convert from Swiss franc to Euro
						
						result = input * 0.96;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Swiss franc") && selectconvertto.getSelectedItem().equals("yen")) {
						//convert from Swiss franc to yen
						
						result = input * 124.14;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Swiss franc") && selectconvertto.getSelectedItem().equals("rouble")) {
						//convert from Swiss franc to rouble
						
						result = input * 80.07;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Swiss franc") && selectconvertto.getSelectedItem().equals("Canadian dollar")) {
						//convert from Swiss franc to Canadian dollar
						
						result = input * 1.40;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Swiss franc") && selectconvertto.getSelectedItem().equals("yuan")) {
						//convert from Swiss franc to yuan
						
						result = input * 6.93;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Swiss franc") && selectconvertto.getSelectedItem().equals("rupee")) {
						//convert from Swiss franc to rupee
						
						result = input * 82.05;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Swiss franc") && selectconvertto.getSelectedItem().equals("Swiss franc")) {
						//convert from Swiss franc to Swiss franc
						
						result = input ;
						resultfield.setText(""+result);
					}
					
					
					
												//convert from rouble to all other
					
					if(selectconvertform.getSelectedItem().equals("rouble") && selectconvertto.getSelectedItem().equals("US dollar")) {
						//convert from rouble to dollar

						result = input * 0.014;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("rouble") && selectconvertto.getSelectedItem().equals("Euro")) {
						//convert from rouble to Euro

						result = input * 0.012;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("rouble") && selectconvertto.getSelectedItem().equals("yen")) {
						//convert from rouble to yen

						result = input * 1.55;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("rouble") && selectconvertto.getSelectedItem().equals("Swiss franc")) {
						//convert from rouble to Swiss franc

						result = input * 0.012;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("rouble") && selectconvertto.getSelectedItem().equals("Canadian dollar")) {
						//convert from rouble to Canadian dollar

						result = input * 0.017;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("rouble") && selectconvertto.getSelectedItem().equals("yuan")) {
						//convert from rouble to yuan

						result = input * 0.087;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("rouble") && selectconvertto.getSelectedItem().equals("rupee")) {
						//convert from rouble to rupee

						result = input * 1.03;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("rouble") && selectconvertto.getSelectedItem().equals("rouble")) {
						//convert from rouble to rouble

						result = input ;
						resultfield.setText(""+result);
					}
					
					
					
												//convert from Canadian dollar to all other
					
					if(selectconvertform.getSelectedItem().equals("Canadian dollar") && selectconvertto.getSelectedItem().equals("US dollar")) {
						//convert from Canadian dollar to dollar

						result = input * 0.78;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Canadian dollar") && selectconvertto.getSelectedItem().equals("Euro")) {
						//convert from Canadian dollar to Euro

						result = input * 0.69;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Canadian dollar") && selectconvertto.getSelectedItem().equals("yen")) {
						//convert from Canadian dollar to yen

						result = input * 88.86;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Canadian dollar") && selectconvertto.getSelectedItem().equals("Swiss franc")) {
						//convert from Canadian dollar to Swiss franc

						result = input * 0.72;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Canadian dollar") && selectconvertto.getSelectedItem().equals("rouble")) {
						//convert from Canadian dollar to rouble

						result = input * 57.30;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Canadian dollar") && selectconvertto.getSelectedItem().equals("yuan")) {
						//convert from Canadian dollar to yuan

						result = input * 4.96;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Canadian dollar") && selectconvertto.getSelectedItem().equals("rupee")) {
						//convert from Canadian dollar to rupee

						result = input * 58.77;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("Canadian dollar") && selectconvertto.getSelectedItem().equals("Canadian dollar")) {
						//convert from Canadian dollar to Canadian dollar

						result = input ;
						resultfield.setText(""+result);
					}
					
					
					
													//convert from yuan to all other
					
					if(selectconvertform.getSelectedItem().equals("yuan") && selectconvertto.getSelectedItem().equals("US dollar")) {
						//convert from yuan to dollar

						result = input * 0.16;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("yuan") && selectconvertto.getSelectedItem().equals("Euro")) {
						//convert from yuan to Euro

						result = input * 0.14;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("yuan") && selectconvertto.getSelectedItem().equals("yen")) {
						//convert from yuan to yen

						result = input * 17.90;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("yuan") && selectconvertto.getSelectedItem().equals("Swiss franc")) {
						//convert from yuan to Swiss franc

						result = input * 0.14;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("yuan") && selectconvertto.getSelectedItem().equals("rouble")) {
						//convert from yuan to rouble

						result = input * 11.54;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("yuan") && selectconvertto.getSelectedItem().equals("Canadian dollar")) {
						//convert from yuan to Canadian dollar

						result = input * 0.20;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("yuan") && selectconvertto.getSelectedItem().equals("rupee")) {
						//convert from yuan to rupee

						result = input * 11.83;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("yuan") && selectconvertto.getSelectedItem().equals("yuan")) {
						//convert from yuan to yuan

						result = input ;
						resultfield.setText(""+result);
					}
					
										//convert from rupee to all other
					if(selectconvertform.getSelectedItem().equals("rupee") && selectconvertto.getSelectedItem().equals("yuan")) {
						//convert from rupee to yuan

						result = input * 0.085;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("rupee") && selectconvertto.getSelectedItem().equals("Canadian dollar")) {
						//convert from rupee to Canadian dollar

						result = input * 0.017;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("rupee") && selectconvertto.getSelectedItem().equals("rouble")) {
						//convert from rupee to rouble

						result = input * 0.98;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("rupee") && selectconvertto.getSelectedItem().equals("Swiss franc")) {
						//convert from rupee to Swiss franc

						result = input * 0.012;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("rupee") && selectconvertto.getSelectedItem().equals("yen")) {
						//convert from rupee to yen

						result = input * 1.51;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("rupee") && selectconvertto.getSelectedItem().equals("Euro")) {
						//convert from rupee to Euro

						result = input * 0.012;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("rupee") && selectconvertto.getSelectedItem().equals("US dollar")) {
						//convert from rupee to US dollar

						result = input * 0.013;
						resultfield.setText(""+result);
					}
					if(selectconvertform.getSelectedItem().equals("rupee") && selectconvertto.getSelectedItem().equals("rupee")) {
						//convert from rupee to rupee

						result = input ;
						resultfield.setText(""+result);
					}
					
					
					
				}catch(Exception e1) {
					//massage warn if input field is invalid
					//JOptionPane.showMessageDialog(frame, e1.getMessage());
					
				}
			}
		});
		convertbutton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		convertbutton.setForeground(new Color(233, 150, 122));
		convertbutton.setBackground(Color.WHITE);
		convertbutton.setBounds(278, 143, 96, 22);
		contentPane.add(convertbutton);
		
		
		//reset label
		
		
		JButton resetbutton = new JButton("Reset");
		resetbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectconvertform.setSelectedIndex(0);
				selectconvertto.setSelectedIndex(0);
				resultfield.setText("");
				convertfrom.setText("");
			}
		});
		
		
		//resetr button
		
		
		resetbutton.setForeground(new Color(233, 150, 122));
		resetbutton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		resetbutton.setBackground(Color.WHITE);
		resetbutton.setBounds(278, 24, 96, 22);
		contentPane.add(resetbutton);
		
		
		
		//convert from combo
		
		
		selectconvertform = new JComboBox();
		selectconvertform.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "US dollar", "Euro", "yen", "Swiss franc", "rouble", "Canadian dollar", "yuan", "rupee"}));
		selectconvertform.setBounds(101, 79, 139, 22);
		contentPane.add(selectconvertform);
		
		
		
		//from label
		
		
		JLabel fromlabel = new JLabel("From:");
		fromlabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		fromlabel.setForeground(Color.WHITE);
		fromlabel.setBounds(31, 79, 60, 22);
		contentPane.add(fromlabel);
		
		
		// to label
		
		
		JLabel lblNewLabel = new JLabel("To:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(250, 76, 60, 22);
		contentPane.add(lblNewLabel);
		
		
		
		//convert to combo
		
		
		selectconvertto = new JComboBox();
		selectconvertto.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "US dollar", "Euro", "yen", "Swiss franc", "rouble", "Canadian dollar", "yuan", "rupee"}));
		selectconvertto.setBounds(278, 79, 139, 22);
		contentPane.add(selectconvertto);
		
		
		// return to main page button
		
		
		JButton returntomain = new JButton("Main Page");
		returntomain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//return to main page
				mainpage mp = new mainpage();
				mp.setVisible(true);
				dispose();
			}
		});
		returntomain.setFont(new Font("Tahoma", Font.PLAIN, 16));
		returntomain.setForeground(new Color(233, 150, 122));
		returntomain.setBackground(Color.WHITE);
		returntomain.setBounds(267, 207, 127, 21);
		contentPane.add(returntomain);
	}
}

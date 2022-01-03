import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainpage extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainpage frame = new mainpage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	//frame for main page
	
	public mainpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(233, 150, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton currencybutton = new JButton("Currency Convertor");
		currencybutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currency cr = new currency();
				cr.setVisible(true);
				dispose();
			}
		});
		
		
					//currency button
		
		
		currencybutton.setForeground(new Color(233, 150, 122));
		currencybutton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		currencybutton.setBackground(Color.WHITE);
		currencybutton.setBounds(31, 71, 150, 25);
		contentPane.add(currencybutton);
		
		JButton closebutton = new JButton("Close");
		closebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
				//close button
		
		
		
		closebutton.setBackground(Color.WHITE);
		closebutton.setForeground(new Color(233, 150, 122));
		closebutton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		closebutton.setBounds(302, 201, 85, 25);
		contentPane.add(closebutton);
		
		
		
				//name of project
		
		
		
		JLabel lblNewLabel = new JLabel("Units Convertor");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBackground(new Color(233, 150, 122));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(126, 20, 182, 25);
		contentPane.add(lblNewLabel);
		
		
			//units button
		
		
		JButton unitsbutton = new JButton("lenght Convertor");
		unitsbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lenght len = new lenght();
				len.setVisible(true);
				dispose();
			}
		});
		unitsbutton.setForeground(new Color(233, 150, 122));
		unitsbutton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		unitsbutton.setBackground(Color.WHITE);
		unitsbutton.setBounds(233, 71, 150, 25);
		contentPane.add(unitsbutton);
		
		
		
					//temp button
		
		
		JButton tempbutton = new JButton("Tempreture Convertor");
		tempbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp tp = new temp();
				tp.setVisible(true);
				dispose();
			}
		});
		tempbutton.setForeground(new Color(233, 150, 122));
		tempbutton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tempbutton.setBackground(Color.WHITE);
		tempbutton.setBounds(144, 122, 164, 25);
		contentPane.add(tempbutton);
	}

}

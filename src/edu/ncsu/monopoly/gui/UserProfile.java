package edu.ncsu.monopoly.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserProfile extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					UserProfile frame = new UserProfile();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public UserProfile() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UserProfile.class.getResource("/resources/monopolyLogo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name: ");
		lblName.setBounds(10, 62, 81, 22);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(101, 63, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblPhoto = new JLabel("Photo: ");
		lblPhoto.setBounds(10, 106, 81, 22);
		contentPane.add(lblPhoto);
	}

}

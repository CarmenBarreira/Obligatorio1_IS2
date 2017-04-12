package edu.ncsu.monopoly.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.ncsu.monopoly.GameBoard;
import edu.ncsu.monopoly.GameMaster;
import edu.ncsu.monopoly.test.boardScenarios.GameBoardFull;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class FirstWindow extends JFrame {

	private JPanel contentPane;

	

	public static void main(String[] args) {		
//		
//		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindow frame = new FirstWindow();
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
	public FirstWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FirstWindow.class.getResource("/resources/monopolyLogo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 272);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenidsAMonoply = new JLabel("Welcome to MONOPLY");
		lblBienvenidsAMonoply.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBienvenidsAMonoply.setBackground(new Color(255, 255, 255));
		lblBienvenidsAMonoply.setBounds(74, 11, 183, 68);
		contentPane.add(lblBienvenidsAMonoply);
		
		JButton btnUserProfile = new JButton("User Profile");
		btnUserProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnUserProfile.setBounds(74, 90, 159, 41);
		contentPane.add(btnUserProfile);
		
		JButton btnPlay = new JButton("Play");
		
		btnPlay.setBounds(74, 155, 159, 41);
		contentPane.add(btnPlay);
	}
}

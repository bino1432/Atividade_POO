package LojaVirtual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setTitle("Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 194);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(196, 194, 189));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbBemVindo = new JLabel("Bem Vindo!");
		lbBemVindo.setFont(new Font("Calibri", Font.PLAIN, 17));
		lbBemVindo.setForeground(new Color(0, 0, 0));
		lbBemVindo.setBounds(177, 11, 140, 26);
		contentPane.add(lbBemVindo);
		
		JLabel lbVoceDeseja = new JLabel("Você deseja:");
		lbVoceDeseja.setFont(new Font("Calibri", Font.PLAIN, 17));
		lbVoceDeseja.setBounds(177, 40, 130, 20);
		contentPane.add(lbVoceDeseja);
		
		JButton btnCadastro = new JButton("Cadastrar");
		btnCadastro.setBackground(new Color(215, 211, 208));
		btnCadastro.setFont(new Font("Calibri", Font.PLAIN, 13));
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameCadastro frame = new FrameCadastro();
				frame.setVisible(true);
			}
		});
		btnCadastro.setBounds(167, 79, 112, 23);
		contentPane.add(btnCadastro); 
		
		JButton btnLogin = new JButton("Logar");
		btnLogin.setFont(new Font("Calibri", Font.PLAIN, 13));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameLogin frame = new FrameLogin();
				frame.setVisible(true);
			}
		});
		btnLogin.setBounds(167, 113, 112, 23);
		contentPane.add(btnLogin);
	}
}

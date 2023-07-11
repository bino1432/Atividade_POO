package LojaVirtual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrameLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txUsuario;
	private JTextField txSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogin frame = new FrameLogin();
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
	public FrameLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 223);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(69, 83, 55, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(238, 83, 46, 14);
		contentPane.add(lblSenha);
		
		txUsuario = new JTextField();
		txUsuario.setBounds(124, 80, 86, 20);
		contentPane.add(txUsuario);
		txUsuario.setColumns(10);
		
		txSenha = new JTextField();
		txSenha.setBounds(283, 80, 86, 20);
		contentPane.add(txSenha);
		txSenha.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Bem Vindo de Volta!");
		lblNewLabel.setBounds(166, 29, 145, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.setBounds(177, 138, 89, 23);
		contentPane.add(btnLogar);
	}

}

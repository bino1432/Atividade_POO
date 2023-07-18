package LojaVirtual;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

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
		contentPane.setBackground(new Color(196, 194, 189));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblUsuario.setBounds(160, 60, 79, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblSenha.setBounds(160, 90, 78, 17);
		contentPane.add(lblSenha);
		
		txUsuario = new JTextField();
		txUsuario.setBounds(230, 60, 86, 20);
		contentPane.add(txUsuario);
		txUsuario.setColumns(10);
		
		txSenha = new JTextField();
		txSenha.setBounds(230, 90, 86, 20);
		contentPane.add(txSenha);
		txSenha.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Bem Vindo de Volta!");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblNewLabel.setBounds(170, 20, 145, 17);
		contentPane.add(lblNewLabel);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.setBackground(new Color(215, 211, 208));
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Logado com Sucesso!");
				
		}});
		btnLogar.setBounds(200, 140, 89, 23);
		contentPane.add(btnLogar);
	}

}

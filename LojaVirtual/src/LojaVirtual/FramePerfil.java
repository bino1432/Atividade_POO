package LojaVirtual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;

public class FramePerfil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePerfil frame = new FramePerfil();
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
	public FramePerfil() {
		setTitle("Perfil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 280);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(196, 194, 189));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbUsuarioPerfil = new JLabel("Usuario");
		lbUsuarioPerfil.setFont(new Font("Calibri", Font.PLAIN, 20));
		lbUsuarioPerfil.setBounds(70, 70, 120, 20);
		contentPane.add(lbUsuarioPerfil);
		
		JLabel lbNomePerfil = new JLabel("Nome");
		lbNomePerfil.setFont(new Font("Calibri", Font.PLAIN, 17));
		lbNomePerfil.setBounds(70, 120, 46, 17);
		contentPane.add(lbNomePerfil);
		
		JLabel lbPerfilEmail = new JLabel("Email");
		lbPerfilEmail.setFont(new Font("Calibri", Font.PLAIN, 17));
		lbPerfilEmail.setBounds(70, 150, 46, 17);
		contentPane.add(lbPerfilEmail);
		
		JLabel lbPerfilNumero = new JLabel("Numero de Telefone");
		lbPerfilNumero.setFont(new Font("Calibri", Font.PLAIN, 17));
		lbPerfilNumero.setBounds(70, 180, 166, 17);
		contentPane.add(lbPerfilNumero);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aluno\\Documents\\Github\\Atividade_POG\\LojaVirtual\\src\\LojaVirtual\\Assets\\profile.png"));
		lblNewLabel.setBounds(256, 64, 137, 140);
		contentPane.add(lblNewLabel);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FramePadrao frame = new FramePadrao();
				frame.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(10, 11, 89, 23);
		contentPane.add(btnVoltar);
	}
}

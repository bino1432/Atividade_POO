package LojaVirtual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

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
		setBounds(100, 100, 450, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbUsuarioPerfil = new JLabel("Usuario");
		lbUsuarioPerfil.setFont(new Font("Calibri", Font.PLAIN, 20));
		lbUsuarioPerfil.setBounds(70, 40, 120, 20);
		contentPane.add(lbUsuarioPerfil);
		
		JLabel lbNomePerfil = new JLabel("Nome");
		lbNomePerfil.setFont(new Font("Calibri", Font.PLAIN, 17));
		lbNomePerfil.setBounds(70, 110, 46, 17);
		contentPane.add(lbNomePerfil);
		
		JLabel lbPerfilEmail = new JLabel("Email");
		lbPerfilEmail.setFont(new Font("Calibri", Font.PLAIN, 17));
		lbPerfilEmail.setBounds(70, 140, 46, 17);
		contentPane.add(lbPerfilEmail);
		
		JLabel lbPerfilNumero = new JLabel("Numero de Telefone");
		lbPerfilNumero.setFont(new Font("Calibri", Font.PLAIN, 17));
		lbPerfilNumero.setBounds(70, 170, 166, 17);
		contentPane.add(lbPerfilNumero);
	}

}

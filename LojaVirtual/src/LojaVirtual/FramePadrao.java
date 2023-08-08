package LojaVirtual;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;

public class FramePadrao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePadrao frame = new FramePadrao();
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
	public FramePadrao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(196, 194, 189));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPadraoPerfil = new JButton("Perfil");
		btnPadraoPerfil.setBounds(337, 11, 89, 23);
		contentPane.add(btnPadraoPerfil);
		btnPadraoPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FramePerfil frame = new FramePerfil();
				frame.setVisible(true);
			}
		});
		
		JButton btnPadraoCarrinho = new JButton("Carrinho");
		btnPadraoCarrinho.setBounds(238, 11, 89, 23);
		contentPane.add(btnPadraoCarrinho);
		
		btnPadraoCarrinho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameCarrinho frame = new FrameCarrinho();
				frame.setVisible(true);
			}
	});
		
		JButton btnPadraoLogout = new JButton("Logout");
		btnPadraoLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameVerificacao frame = new FrameVerificacao();
				frame.setVisible(true);
				dispose();
			}
		});
		btnPadraoLogout.setBounds(337, 45, 89, 23);
		contentPane.add(btnPadraoLogout);
		
		JButton btnAddProduto = new JButton("Adicionar Produto");
		btnAddProduto.setBounds(10, 11, 163, 23);
		contentPane.add(btnAddProduto);
		btnAddProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameProduto frame = new FrameProduto();
				frame.setVisible(true);
			}
		});
		
	}
}

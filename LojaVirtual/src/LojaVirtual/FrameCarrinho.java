package LojaVirtual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class FrameCarrinho extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCarrinho frame = new FrameCarrinho();
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
	public FrameCarrinho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(196, 194, 189));
		contentPane.setForeground(new Color(196, 194, 189));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBoxCarrinho = new JComboBox();
		comboBoxCarrinho.setModel(new DefaultComboBoxModel(new String[] {"PIX", "Cart\u00E3o de Cr\u00E9dito", "Cart\u00E3to de D\u00E9bito", "Boleto Banc\u00E1rio"}));
		comboBoxCarrinho.setToolTipText("");
		comboBoxCarrinho.setBounds(185, 187, 107, 22);
		contentPane.add(comboBoxCarrinho);
		
		JLabel lblCarrinho = new JLabel("Forma de Pagamento:");
		lblCarrinho.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblCarrinho.setBounds(15, 190, 228, 22);
		contentPane.add(lblCarrinho);
		
		JLabel lblPagamentoEmQuantas = new JLabel("Pagamento em quantas vezes");
		lblPagamentoEmQuantas.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblPagamentoEmQuantas.setBounds(15, 225, 228, 22);
		contentPane.add(lblPagamentoEmQuantas);
		
		JComboBox comboBoxCarrinho_1 = new JComboBox();
		comboBoxCarrinho_1.setModel(new DefaultComboBoxModel(new String[] {"1x", "2x", "3x", "4x", "5x", "6x", "7x", "8x", "9x", "10x"}));
		comboBoxCarrinho_1.setToolTipText("");
		comboBoxCarrinho_1.setBounds(235, 223, 107, 22);
		contentPane.add(comboBoxCarrinho_1);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FramePadrao frame = new FramePadrao();
				frame.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(335, 10, 89, 23);
		contentPane.add(btnVoltar);
		
		table = new JTable();
		table.setBounds(15, 10, 310, 166);
		contentPane.add(table);
	}
}

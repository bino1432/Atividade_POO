package LojaVirtual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBox;
import java.awt.Font;

public class FrameProduto extends JFrame {
	// Conjunto de Componentes
	private JPanel contentPane;
	private JTextField txNome;
	private JTextField txPreco;
	private JTextField txCor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameProduto frame = new FrameProduto();
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
	public FrameProduto() {
		setTitle("Cadastrar Produto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(196, 194, 189));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNomeProduto = new JLabel("Nome:");
		lbNomeProduto.setFont(new Font("Calibri", Font.PLAIN, 17));
		lbNomeProduto.setBounds(110, 20, 57, 17);
		contentPane.add(lbNomeProduto);
		
		txNome = new JTextField();
		txNome.setBounds(195, 20, 152, 20);
		contentPane.add(txNome);
		txNome.setColumns(10);
		

		
		JLabel lbPreco = new JLabel("Preco:");
		lbPreco.setFont(new Font("Calibri", Font.PLAIN, 17));
		lbPreco.setBounds(110, 50, 57, 17);
		contentPane.add(lbPreco);
		
		txPreco = new JTextField();
		txPreco.setBounds(195, 50, 152, 20);
		contentPane.add(txPreco);
		txPreco.setColumns(10);
		
		txCor = new JTextField();
		txCor.setBounds(195, 80, 152, 20);
		contentPane.add(txCor);
		txCor.setColumns(10);
		
		JLabel lbCor = new JLabel("Cor: ");
		lbCor.setFont(new Font("Calibri", Font.PLAIN, 17));
		lbCor.setBounds(110, 80, 46, 17);
		contentPane.add(lbCor);
		
		JComboBox CBCategoria = new JComboBox();
		CBCategoria.setModel(new DefaultComboBoxModel(new String[] {"Esporte", "Moda", "Domesticos", "Jogos"}));
		CBCategoria.setBounds(195, 110, 152, 22);
		contentPane.add(CBCategoria);
		
		JLabel lbCategoria = new JLabel("Categoria:");
		lbCategoria.setFont(new Font("Calibri", Font.PLAIN, 17));
		lbCategoria.setBounds(110, 110, 89, 17);
		contentPane.add(lbCategoria);
		
		JTextArea txDescricao = new JTextArea();
		txDescricao.setBackground(new Color(215, 211, 208));
		txDescricao.setBounds(195, 140, 152, 43);
		contentPane.add(txDescricao);
		
		JLabel lbDescricao = new JLabel("Descricao:");
		lbDescricao.setFont(new Font("Calibri", Font.PLAIN, 17));
		lbDescricao.setBounds(110, 140, 80, 17);
		contentPane.add(lbDescricao);
		
		// Cria o botâo
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(215, 211, 208));
		// Cria um AcionEventListener
		btnSalvar.addActionListener(new ActionListener() {
				// Método actionPerfomed
			public void actionPerformed(ActionEvent e) {
				// Ações: 
				String nome = txNome.getText();
				// Associação entre classe Produto -> TelaProdutos
				Produto p = new Produto();
				p.setNome(txNome.getText());
				p.setPreco(Double.parseDouble(txPreco.getText()));
				p.setCor(txCor.getText());
				p.setCategoria(CBCategoria.getSelectedItem().toString());
				p.setDescricao(txDescricao.getText());
				 
				dispose();
				JOptionPane.showMessageDialog(null, "Produto " + "cadastro: " + nome);
				FramePadrao frame = new FramePadrao();
				frame.setVisible(true);
				
			}
		});
		btnSalvar.setBounds(174, 212, 89, 23);
		
		contentPane.add(btnSalvar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FramePadrao frame = new FramePadrao();
				frame.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBackground(new Color(215, 211, 208));
		btnVoltar.setBounds(10, 16, 89, 23);
		contentPane.add(btnVoltar);
	}
}

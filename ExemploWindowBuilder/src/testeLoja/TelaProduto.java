package testeLoja;

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

public class TelaProduto extends JFrame {
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
					TelaProduto frame = new TelaProduto();
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
	public TelaProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnProdutos = new JMenu("Produtos");
		menuBar.add(mnProdutos);
		
		JMenuItem mnItemCadastrar = new JMenuItem("Cadastrar");
		mnProdutos.add(mnItemCadastrar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNomeProduto = new JLabel("Nome:");
		lbNomeProduto.setBounds(104, 14, 46, 14);
		contentPane.add(lbNomeProduto);
		
		txNome = new JTextField();
		txNome.setBounds(160, 11, 152, 20);
		contentPane.add(txNome);
		txNome.setColumns(10);
		

		
		JLabel lbPreco = new JLabel("Preço: ");
		lbPreco.setBounds(104, 42, 46, 14);
		contentPane.add(lbPreco);
		
		txPreco = new JTextField();
		txPreco.setBounds(159, 39, 152, 20);
		contentPane.add(txPreco);
		txPreco.setColumns(10);
		
		txCor = new JTextField();
		txCor.setBounds(159, 70, 152, 20);
		contentPane.add(txCor);
		txCor.setColumns(10);
		
		JLabel lbCor = new JLabel("Cor: ");
		lbCor.setBounds(103, 73, 46, 14);
		contentPane.add(lbCor);
		
		JComboBox CBCategoria = new JComboBox();
		CBCategoria.setModel(new DefaultComboBoxModel(new String[] {"Esporte", "Moda", "Domesticos", "Jogos"}));
		CBCategoria.setBounds(159, 101, 152, 22);
		contentPane.add(CBCategoria);
		
		JLabel lbCategoria = new JLabel("Categoria:");
		lbCategoria.setBounds(92, 105, 57, 14);
		contentPane.add(lbCategoria);
		
		JTextArea txDescricao = new JTextArea();
		txDescricao.setBackground(new Color(200, 200, 196));
		txDescricao.setBounds(159, 134, 152, 43);
		contentPane.add(txDescricao);
		
		JLabel lbDescricao = new JLabel("Descrição: ");
		lbDescricao.setBounds(81, 149, 64, 14);
		contentPane.add(lbDescricao);
		
		JCheckBox chckbxTermos = new JCheckBox("Sim");
		chckbxTermos.setBounds(262, 183, 97, 23);
		contentPane.add(chckbxTermos);
		
		JLabel lbTermos = new JLabel("Concorda com nossos Termos:");
		lbTermos.setBounds(41, 187, 186, 14);
		contentPane.add(lbTermos);
		
		// Cria o botâo
		JButton btnSalvar = new JButton("Salvar");
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
				 
				 
				JOptionPane.showMessageDialog(null, "Produto " + "cadastro: " + nome);
			}
		});
		btnSalvar.setBounds(164, 212, 89, 23);
		
		contentPane.add(btnSalvar);
		
	}
}

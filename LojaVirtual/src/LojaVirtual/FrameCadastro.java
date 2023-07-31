package LojaVirtual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FrameCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txNome;
	private JTextField txCPF;
	private JTextField txEmail;
	private JTextField txData;
	private JTextField txLogin;
	private JTextField txSenha;
	private JTextField txNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCadastro frame = new FrameCadastro();
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
	public FrameCadastro() {
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu MnItemCadastroLog = new JMenu("Conta");
		menuBar.add(MnItemCadastroLog);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Login");
		MnItemCadastroLog.add(mntmNewMenuItem);
		MnItemCadastroLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameLogin frame = new FrameLogin();
				frame.setVisible(true);
			}
		});
		
		JMenu mnNewMenu_1 = new JMenu("Produto");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem MnItemCadastroProd = new JMenuItem("Cadastrar Produto");
		mnNewMenu_1.add(MnItemCadastroProd);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(196, 194, 189));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		MnItemCadastroProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameProduto frame = new FrameProduto();
				frame.setVisible(true);
			}
		});

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setFont(new Font("Calibri", Font.PLAIN, 17));
		lbNome.setBounds(10, 55, 60, 14);
		contentPane.add(lbNome);
		
		JLabel lbCPF = new JLabel("CPF:");
		lbCPF.setFont(new Font("Calibri", Font.PLAIN, 17));
		lbCPF.setBounds(10, 195, 46, 17);
		contentPane.add(lbCPF);
		
		JLabel lbEmail = new JLabel("Email:");
		lbEmail.setFont(new Font("Calibri", Font.PLAIN, 17));
		lbEmail.setBounds(10, 90, 46, 17);
		contentPane.add(lbEmail);
		
		JLabel lbLogin = new JLabel("Login:");
		lbLogin.setFont(new Font("Calibri", Font.PLAIN, 17));
		lbLogin.setBounds(10, 125, 46, 14);
		contentPane.add(lbLogin);
		
		JLabel lbSenha = new JLabel("Senha:");
		lbSenha.setFont(new Font("Calibri", Font.PLAIN, 17));
		lbSenha.setBounds(10, 160, 60, 17);
		contentPane.add(lbSenha);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblDataDeNascimento.setBounds(180, 55, 158, 17);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblNumeroTelefone = new JLabel("Numero Telefone:");
		lblNumeroTelefone.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblNumeroTelefone.setBounds(180, 90, 158, 20);
		contentPane.add(lblNumeroTelefone);
		
		txNome = new JTextField();
		txNome.setBounds(70, 55, 100, 20);
		contentPane.add(txNome);
		txNome.setColumns(10);
		
		txCPF = new JTextField();
		txCPF.setText("000.000.000-00");
		txCPF.setColumns(10);
		txCPF.setBounds(70, 195, 100, 20);
		contentPane.add(txCPF);
		
		txEmail = new JTextField();
		txEmail.setColumns(10);
		txEmail.setBounds(70, 90, 100, 20);
		contentPane.add(txEmail);
		
		txData = new JTextField();
		txData.setText("dd/mm/aaaa");
		txData.setColumns(10);
		txData.setBounds(335, 55, 100, 20);
		contentPane.add(txData);
		
		txLogin = new JTextField();
		txLogin.setColumns(10);
		txLogin.setBounds(70, 125, 100, 20);
		contentPane.add(txLogin);
		
		txSenha = new JTextField();
		txSenha.setColumns(10);
		txSenha.setBounds(70, 160, 100, 20);
		contentPane.add(txSenha);
		
		txNumero = new JTextField();
		txNumero.setColumns(10);
		txNumero.setBounds(335, 90, 100, 20);
		contentPane.add(txNumero);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(new Color(215, 211, 208));
		btnCadastrar.setFont(new Font("Calibri", Font.PLAIN, 13));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cliente c = new Cliente();
				
				c.setNome(txNome.getText());
				c.setDataNascimento(txData.getText());
				c.setLogin(txLogin.getText());
				c.setSenha(txSenha.getText());
				c.setEmail(txEmail.getText());
				c.setNumeroTelefone(txNumero.getText());
				c.setNumeroCPF(txCPF.getText());
				
				JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
			}
		});
		btnCadastrar.setBounds(250, 195, 112, 23);
		contentPane.add(btnCadastrar);
		
		JLabel lblBemVindo = new JLabel("Bem Vindo!");
		lblBemVindo.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblBemVindo.setBounds(70, 20, 125, 17);
		contentPane.add(lblBemVindo);
		
		JLabel lblConcordaComNossos = new JLabel("Concorda com \r\nnossos Termos:");
		lblConcordaComNossos.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblConcordaComNossos.setBounds(180, 125, 255, 16);
		contentPane.add(lblConcordaComNossos);
		
		JCheckBox chckbxTermos = new JCheckBox("Sim");
		chckbxTermos.setBackground(new Color(196, 194, 189));
		chckbxTermos.setBounds(180, 145, 60, 23);
		contentPane.add(chckbxTermos);
	}
}

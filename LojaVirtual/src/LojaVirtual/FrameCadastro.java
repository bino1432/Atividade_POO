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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setBounds(32, 70, 46, 14);
		contentPane.add(lbNome);
		
		JLabel lbCPF = new JLabel("CPF:");
		lbCPF.setBounds(212, 70, 46, 14);
		contentPane.add(lbCPF);
		
		JLabel lbEmail = new JLabel("Email:");
		lbEmail.setBounds(32, 112, 46, 14);
		contentPane.add(lbEmail);
		
		JLabel lbLogin = new JLabel("Login:");
		lbLogin.setBounds(32, 154, 46, 14);
		contentPane.add(lbLogin);
		
		JLabel lbSenha = new JLabel("Senha:");
		lbSenha.setBounds(212, 154, 46, 14);
		contentPane.add(lbSenha);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setBounds(188, 112, 135, 14);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblNumeroTelefone = new JLabel("Numero Telefone:");
		lblNumeroTelefone.setBounds(20, 194, 127, 14);
		contentPane.add(lblNumeroTelefone);
		
		txNome = new JTextField();
		txNome.setBounds(78, 67, 100, 20);
		contentPane.add(txNome);
		txNome.setColumns(10);
		
		txCPF = new JTextField();
		txCPF.setColumns(10);
		txCPF.setBounds(258, 67, 100, 20);
		contentPane.add(txCPF);
		
		txEmail = new JTextField();
		txEmail.setColumns(10);
		txEmail.setBounds(78, 109, 100, 20);
		contentPane.add(txEmail);
		
		txData = new JTextField();
		txData.setColumns(10);
		txData.setBounds(313, 109, 100, 20);
		contentPane.add(txData);
		
		txLogin = new JTextField();
		txLogin.setColumns(10);
		txLogin.setBounds(78, 151, 100, 20);
		contentPane.add(txLogin);
		
		txSenha = new JTextField();
		txSenha.setColumns(10);
		txSenha.setBounds(258, 151, 100, 20);
		contentPane.add(txSenha);
		
		txNumero = new JTextField();
		txNumero.setColumns(10);
		txNumero.setBounds(125, 191, 100, 20);
		contentPane.add(txNumero);
		
		JButton btnCadastrar = new JButton("Cadastrar");
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
		btnCadastrar.setBounds(246, 190, 112, 23);
		contentPane.add(btnCadastrar);
		
		JLabel lblBemVindo = new JLabel("Bem Vindo!");
		lblBemVindo.setBounds(173, 18, 125, 14);
		contentPane.add(lblBemVindo);
	}
}

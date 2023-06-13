package LojaVirtual;
import javax.swing.JButton;
/**
 * 
 * @author Bernardo Zapelini
 * 
 * CLASSE MAIN PARA RODAR O CODIGO
 * 
 */
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {
	public static void main (String []args) {
		
		JLabel lbLogin = new JLabel("Login: ");
		JLabel lbSenha = new JLabel("Senha: ");
		JTextField txLogin = new JTextField();
		JPasswordField txSenha = new JPasswordField();
		JButton btView = new JButton();
		
		Object[] comp = {lbLogin, txLogin, lbSenha, txSenha};
		
		
	}
}
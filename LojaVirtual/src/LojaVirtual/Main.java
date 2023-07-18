package LojaVirtual;
/**
 * 
 * @author Bernardo Zapelini
 * 
 * CLASSE MAIN PARA RODAR O CODIGO
 * 
 */

//import javax.swing.JButton;
//import javax.swing.JLabel;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;

public class Main {
	public static void main (String []args) {
		
			Cliente c = new Cliente();
			
			// verifica��o da classe cliente
			c.setNome("Bernardo");
			System.out.println("Nome: " + c.getNome());
			c.setEmail("bernardo@gmail.com");
			System.out.println("Email: " + c.getEmail());
			c.setNumeroCPF("423.532.623-43");
			System.out.println("CPF: " + c.getNomeCPF());
			c.setNumeroTelefone("984175713");
			System.out.println("Telefone: " + c.getNumeroTelefone());
			c.setDataNascimento("05/07/2006");
			System.out.println("Data de Nascimento: " + c.getDataNascimento());
			
			// verifica��o da classe Endere�o
			c.e.setUf("Santa Catarina");
			System.out.println("UF: " + c.e.getUf());
			c.e.setCidade("Jaragua do Sul");
			System.out.println("Cidade: " + c.e.getCidade());
			c.e.setRua("avelino floriano de borba");
			System.out.println("Rua: " + c.e.getRua());
			c.e.setCep("445.324.534-324");
			System.out.println("CEP: " + c.e.getCep());
			c.e.setNumero("9");
			System.out.println("Numero: " + c.e.getNumero());
			c.e.setComplemento("Atras do posto");
			System.out.println("Complemento: " + c.e.getComplemento());
			c.e.setIdentificacao("Bernardao");
			System.out.println("Identifica��o: " + c.e.getIdentificacao());
			
			// verifica��o da classe Pagamento
			c.p.setDesconto(Double.parseDouble("0.15"));
			System.out.println("Desconto: " + c.p.getDesconto());
			c.p.setForma("pix");
			System.out.println("Forma de Pagamento: " + c.p.getForma());
			c.p.setFrete(Double.parseDouble("0.10"));
			System.out.println("Frete: " + c.p.getFrete());
			c.p.setParcelamento(Integer.parseInt("4"));
			System.out.println("Vezes Parceladas: " + c.p.getParcelamento());
			c.p.setTotal(Double.parseDouble("109.99"));
			System.out.println("Total da Compra: " + c.p.getTotal());
			
			// verifica��o da classe Venda
			c.p.v.setEmpresa("Amazon");
			System.out.println("Vendido por: " + c.p.v.getEmpresa());
			
			// verifica��o da classe Produto
			c.p.v.pro.setAvaliacao(Double.parseDouble("5"));
			System.out.println("Avalia��o: " + c.p.v.pro.getAvaliacao());
			
		//JLabel lbLogin = new JLabel("Login: ");
		//JLabel lbSenha = new JLabel("Senha: ");
		//JTextField txLogin = new JTextField();
		//JPasswordField txSenha = new JPasswordField();
		//JButton btView = new JButton();
		
		//Object[] comp = {lbLogin, txLogin, lbSenha, txSenha};
		
		
	}
}
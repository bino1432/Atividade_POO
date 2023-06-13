package LojaVirtual;
/**
 * 
 * @author Bernardo_Zapelini
 *
 * CLASSE CLIENTE da Loja Virtual
 */
public class Cliente {

	private String nome;
	private String cpf;
	private String enderecos;
	private String email;
	private String login;
	private String senha;
	private String telefone;
	private String carteira;
	private String formasdepagamento;
	
	/**
	 * construtor da classe cliente
	 */
	public Cliente() {
		
	}

	/** metodo para receber o nome do cliente 
	 * 
	 * @param nome (String)
	 * */
	public void setNome(String nome) {
		if (nome.length() >= 3 && nome.matches("[A-Za-z]*")) {
			this.nome = nome;
		} else {
			System.out.print("Nome Invalido");
		}
	}

	/** metodo para retornar o nome do cliente 
	 * 
	 * @return (String)
	 * */
	public String getNome() {
		return nome;
	}

	/** metodo para receber o email do cliente 
	 * 
	 * @param email (String)
	 * */
	public void setEmail(String email) {
		if (email.matches("[@]*") && email.matches("[A-Za-z]*")) {
			this.email = email;
		} else {
			System.out.print("email invalido");
		}
	}

	/** metodo para retornar o email do cliente 
	 * 
	 * @return (String)
	 * */
	public String getEmail() {
		return email;
	}

	/** metodo para receber o numero de telefone do clinte 
	 * 
	 * @param telefone (String)
	 * */
	public void setNumeroTelefone(String telefone) {
		if (telefone.matches("[0-9]*") && telefone.length() >= 0 && telefone.length() <= 9) {
			this.telefone = telefone;
		} else {
			System.out.print("numero invalido");
		}
	}

	/** metodo para retornar o numero de telefone do cliente 
	 * 
	 * @return (String)
	 * */
	public String getNumeroTelefone() {
		return telefone;
	}

	/** metodo para receber o CPF do cliente 
	 * 
	 * @param cpf (String)
	 * */
	public void setNumeroCPF(String cpf) {
		if (cpf.toString().matches("[0-9]*") && cpf.length() >= 0 && cpf.length() <= 11) {
			this.cpf = cpf;
		} else {
			System.out.print("cpf invalido");
		}
	}

	/** metodo para retornar o CPF do cliente 
	 * 
	 * @return (String)
	 * */
	public String getNomeCPF() {
		return cpf;
	}

	/** class para pegar o endere�o 
	 * 
	 * @param enderecos (String)
	 * */
	public void setEndereco(String enderecos) {
		if (enderecos.matches("[A-Za-z]*") && enderecos.length() > 5) {
			this.enderecos = enderecos;
		} else {
			System.out.println("Endere�o Invalido!");
		}
	}

	/** classe get endereco 
	 * 
	 * @return (String)
	 * */
	public String getEndereco() {
		return enderecos;
	}
	/** metodo para receber a carteira do cliente
	 * 
	 * @param carteira (String)
	 */
	public void setCarteira(String carteira) {
		if (carteira.matches("[Rr $ 0-9]*")){
			this.carteira = carteira;
		} else {
			System.out.print("Valor Invalido!");
		}
	}
	/** metodo para retornar a carteira do cliente
	 * 
	 * @return (String)
	 */
	public String getCarteira() {
		return carteira;
	}
}
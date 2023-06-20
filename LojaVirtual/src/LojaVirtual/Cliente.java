package LojaVirtual;
/**
 * 
 * @author Bernardo_Zapelini
 *
 * CLASSE CLIENTE da Loja Virtual
 */
public class Cliente {

	Endereco e = new Endereco();
	Pagamento p = new Pagamento();
	
	private String nome;
	private String cpf;
	private Endereco enderecos;
	private String email;
	private String login;
	private String senha;
	private String dataNascimento;
	private String telefone;
	private String carteira;
	private Pagamento pagamento;
	
	/**
	 * construtor da classe cliente
	 */
	public Cliente() {
		
	}
	/** metodo para receber a data de nascimento do cliente
	 * 
	 * @param dataNascimento (String)
	 */
	public void setDataNascimento(String dataNascimento) {
		if(dataNascimento.matches("[0-9 /]*")) {
			this.dataNascimento = dataNascimento;
		}
	}
	/**
	 * 
	 * @return (String)
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}
	/** metodo para receber o nome do cliente 
	 * 
	 * @param nome (String)
	 * */
	public void setNome(String nome) {
		if (nome.length() >= 3 && nome.matches("[A-Za-z]*")) {
			this.nome = nome;
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
		if (email.matches("[A-Za-z @.]*")) {
			this.email = email;
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
		if (telefone.matches("[0-9]*") && telefone.length() >= 0) {
			this.telefone = telefone;
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
		if (cpf.toString().matches("[0-9 -.]*") && cpf.length() >= 0) {
			this.cpf = cpf;
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
	public void setEndereco(Endereco enderecos) {
		this.enderecos = enderecos;
	}

	/** classe get endereco 
	 * 
	 * @return (Endereco)
	 * */
	public Endereco getEndereco() {
		return enderecos;
	}
	/** metodo para receber a carteira do cliente
	 * 
	 * @param carteira (String)
	 */
	public void setCarteira(String carteira) {
		if (carteira.matches("[Rr $ 0-9]*")){
			this.carteira = carteira;
		}
	}
	/** metodo para retornar a carteira do cliente
	 * 
	 * @return (String)
	 */
	public String getCarteira() {
		return carteira;
	}
	/** metodo para receber o metodo de pagamento
	 * 
	 * @param pagamento (Pagamento)
	 */
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	/** metodo que retorna o metodo de pagamento
	 * 
	 * @return (Pagamento)
	 */
	public Pagamento getPagamento() {
		return pagamento;
	}
}
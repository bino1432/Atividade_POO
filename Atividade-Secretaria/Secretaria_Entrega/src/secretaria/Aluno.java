package secretaria;
/**
 * classe Aluno
 * @author Bernado P Zapelini
 */
public class Aluno {

    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private String responsavel;

    /** metodo para receber o nome do aluno 
     * @param nome (String)
     * */
	public void setNome(String nome) {
		if(nome.length() >= 3 && nome.matches("[A-Za-z]*")) {
			this.nome = nome;
		} else {
			System.out.print("Nome Invalido");
		}
	}
	/** metodo para retornar o nome do aluno
	 * @return (String)
     * */
	public String getNome() {
		return nome;
	}
	/** metodo para receber o email 
	 * @param email (String)
     * */
	public void setEmail(String email) {
		if (email.matches("[@]*") && email.matches("[A-Za-z]*")) {
			this.email = email;
		} else {
			System.out.print("email invalido");
		}
	}
	/** metodo para retornar o email 
	 * @return (String)
     * */
	public String getEmail() {
		return email;
	}
	/** metodo para receber o nome do responsavel
	 * @param responsavel (String)
     * */
	public void setNomeResp(String responsavel) {
		if(responsavel.length() >= 3 && responsavel.matches("[A-Za-z]*")) {
			this.responsavel = responsavel;
		} else {
			System.out.print("Nome Invalido");
		}
	}
	/** metodo para retornar o nome do responsavel
	* @return (String)
	* */
	public String getNomeResp() {
		return responsavel;
	}
	/** metodo para receber o numero de telefone 
	 * @param telefone (String)
	 */
	public void setNumeroTelefone(String telefone) {
		if(telefone.matches("[0-9]*") && telefone.length() >= 0 && telefone.length() <= 9) {
			this.telefone = telefone;
		} else {
			System.out.print("numero invalido");
		}
	}
	/** metodo para retornar o numero de telefone 
	 * @return (String)
     * */
	public String getNumeroTelefone() {
		return telefone;
	}
	/** metodo para receber o CPF 
	 * @param cpf (String)
	 */
	public void setNumeroCPF(String cpf) {
		if(cpf.toString().matches("[0-9]*") && cpf.length() >= 0 && cpf.length() <= 11) {
			this.cpf = cpf;
		} else {
			System.out.print("cpf invalido");
		}
	}
	/** metodo para retornar o CPF 
	 * @return (String)
     * */
	public String getNomeCPF() {
		return cpf;
	}
	/** metodo para receber o endereço 
	 * @param endereco (String)
	 */
	public void setEndereco(String endereco) {
		if(endereco.matches("[A-Za-z]*") && endereco.length() > 5){
			this.endereco = endereco;
		} else {
			System.out.println("Endereço Invalido!");
		}
	}
	/** metodo para retornar o endereco 
	 * @return (String)
     * */
	public String getEndereco(){
		return endereco;
	}
	/** construtor aluno 
	 * @param nome (String)
	 * */
	public Aluno(String nome) {
		setNome(nome);
	}

}
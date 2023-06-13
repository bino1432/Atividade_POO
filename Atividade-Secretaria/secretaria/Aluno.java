package secretaria;

import org.omg.PortableInterceptor.ACTIVE;

public class Aluno {
	
	private String nomeAluno;
	private int datadeNascimento;
	private String endereco;
	private String email;
	private String nomeResponsavel;
	private String numeroTelefone;
	private String cpf;
	private Matricula matricula;

	/** classe para pegar o nome */
	public void setNome(String nomeAluno) {
		if(nomeAluno.length() >= 3 && nomeAluno.matches("[A-Za-z]*")) {
			this.nomeAluno = nomeAluno;
		} else {
			System.out.print("Nome Invalido");
		}
	}
	/** clase get nome */
	public String getNome() {
		return nomeAluno;
	}
	/** classe para pegar o email */
	public void setEmail(String email) {
		if (email.matches("[@]*") && email.matches("[A-Za-z]*")) {
			this.email = email;
		} else {
			System.out.print("email invalido");
		}
	}
	/** clase get email */
	public String getEmail() {
		return email;
	}
	/** classe para pegar o nome do responsavel */
	public void setNomeResp(String nomeResponsavel) {
		if(nomeResponsavel.length() >= 3 && nomeResponsavel.matches("[A-Za-z]*")) {
			this.nomeResponsavel = nomeResponsavel;
		} else {
			System.out.print("Nome Invalido");
		}
	}
	/** clase get nome do responsavel */
	public String getNomeResp() {
		return nomeResponsavel;
	}
	/** classe para pegar o numero de telefone */
	public void setNumeroTelefone(String numeroTelefone) {
		if(numeroTelefone.toString().matches("[0-9]*") && numeroTelefone.length() >= 0 && numeroTelefone.length() <= 9) {
			this.numeroTelefone = numeroTelefone;
		} else {
			System.out.print("numero invalido");
		}
	}
	/** clase get numero de telefone */
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	/** classe para pegar o CPF */
	public void setNumeroCPF(String cpf) {
		if(cpf.toString().matches("[0-9]*") && cpf.length() >= 0 && cpf.length() <= 11) {
			this.cpf = cpf;
		} else {
			System.out.print("cpf invalido");
		}
	}
	/** clase get CPF */
	public String getNomeCPF() {
		return cpf;
	}
	/** classe para pegar a data de nascimento */
	public void setdatadeNascimento(int datadeNascimento) {
		if(datadeNascimento >= 1950 && datadeNascimento <= 2023) {
			this.datadeNascimento = datadeNascimento;
		} else {
			System.out.print("data invalido");
		}
	}
	/** clase get data de nascimento */
	public int getdataNascimento() {
		return datadeNascimento;
	}
	/** class para pegar o endereço */
	public void setEndereco(String endereco) {
		if(endereco.matches("[A-Za-z]*") && endereco.length() > 5){
			this.endereco = endereco;
		} else {
			System.out.println("Endereço Invalido!");
		}
	}
	/** classe get endereco */
	public String getEndereco(){
		return endereco;
	}
	/** construtor aluno */
	public Aluno(String nomeAluno) {
		setNome(nomeAluno);
	}
}
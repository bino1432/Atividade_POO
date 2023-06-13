package secretaria;

public class Matricula {
	
	private String codigo;
	private String turma;
	private Curso curso;
	
	/** classe para pegar o nome da turma */
	public void setNomeTurma(String turma) {
		if(turma.matches("[A-Za-z1-9]*")) {
			this.turma = turma;
		} else {
			System.out.print("Nome Invalido");
		}
	}
	/** classe get para o nome da turma */
	public String getNome() {
		return turma;
	}
	/** classe para pegar a matricula */
	public void setCodigoMatricula(String codigo) {
		if(codigo.matches("[1-9]*") && codigo.length() == 6 && codigo.matches("[A-Z]*")) {
			this.codigo = codigo;
		} else {
			System.out.print("codigo Invalido");
		}
	}
	/** classe get do numero da matricula */
	public String getCodigoMatricula() {
		return codigo;
	}
}
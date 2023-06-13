package secretaria;

import org.omg.CosNaming.NamingContextPackage.NotEmpty;

public class Avaliacao {

	private double notas;
	private String nomeAvaliacao;
	
	/** classe para pegar a nota */
	public void setnota (double notas) {
		if (notas >= 0 && notas <= 10) {
			this.notas = notas;
		} else {
			System.out.print("nota invalida");
		}
	}
	/** classe get nota */
	public double getNota() {
		return notas;
	}
	/** classe para pegar o nome da avalição */
	public void setNomeAvalicao(String nomeAvaliacao){
		if (nomeAvaliacao.length() > 3 && nomeAvaliacao.matches("[A-Za-z]*")){
			this.nomeAvaliacao = nomeAvaliacao;
		} else {
			System.out.println("Nome invalido!");
		}
	}
	/** classe get nome avaliacao */
	public String getNomeAvalicao(){
		return nomeAvaliacao;
	}
}

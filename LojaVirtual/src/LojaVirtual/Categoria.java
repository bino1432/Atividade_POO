package LojaVirtual;
/**
 * 
 * @author Bernardo Zapelini
 *
 * Classe da categoria de produtos da Loja Virtual
 * 
 */
public class Categoria {

	private String nome;
	private String tipo;
	
	/**
	 * Metodo que Retorna o nome da Categoria 
	 * 
	 * @return (String)
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Metodo que recebe o nome da categoria
	 * 
	 * @param nome (String)
	 */
	public void setNome(String nome) {
		if(nome.length() > 3 && nome.matches("[A-Za-z0-9]*")) {
			this.nome = nome;
		}
	}

	/**
	 * Metodo que Retorna o Tipo da Categoria 
	 * 
	 * @return (String)
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * Metodo que recebe o Tipo da categoria
	 * 
	 * @param tipo (String)
	 */
	public void setTipo(String tipo) {
		if(tipo.matches("[A-Za-z]*")) {
			this.tipo = tipo;
		}
	}
}
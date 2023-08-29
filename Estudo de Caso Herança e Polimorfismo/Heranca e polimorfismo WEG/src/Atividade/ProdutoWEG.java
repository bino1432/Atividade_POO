package Atividade;
/**
 * classe Pai Produtos WEG que se refere ao basico de todos os produtos da WEG
 * @author Bernardo P Zapelini
 *
 */
public class ProdutoWEG {

	// Atrbiutos da classe Produtos 
	int codigo;
	String tipo;
	float potencia;
	float tensao;
	float peso;
	
	// Getters e Setters da classe ProdutosWEG
	
	/**
	 * metodo para retornar o codigo do produto
	 * @return Retorna o Codigo do Produto da WEG
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * metodo para receber o codigo do produto
	 * @param codigo (int)
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * metodo para retornar o tipo do produto
	 * @return Retorna o tip do Produto da WEG
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * metodo para receber o tipo do produto
	 * @param tipo (String)
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * metodo para retornar a potencia do produto
	 * @return Retorna a Potencia do Produto da WEG
	 */
	public float getPotencia() {
		return potencia;
	}
	/**
	 * metodo para receber a potencia do produto 
	 * @param potencia (float)
	 */
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	/**
	 * metodo para retornar a tensao do produto
	 * @return Retorna a tensao do Produto da WEG
	 */
	public float getTensao() {
		return tensao;
	}
	/**
	 * metodo para receber a tensao do produto
	 * @param tensao (float)
	 */
	public void setTensao(float tensao) {
		this.tensao = tensao;
	}
	/**
	 * metodo para retornar o peso do produto
	 * @return retorna o peso do Produto da WEG
	 */
	public float getPeso() {
		return peso;
	}
	/**
	 * metodo para receber o peso do produto
	 * @param peso (float)
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	// Construtores
	/**
	 * Construtor que recebe os parametros codigo e tipo
	 * @param codigo (int)
	 * @param tipo (String)
	 */
	public ProdutoWEG(int codigo, String tipo) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
	}
	/**
	 * Construtor vazio
	 */
	public ProdutoWEG() {
		super();
	}
}

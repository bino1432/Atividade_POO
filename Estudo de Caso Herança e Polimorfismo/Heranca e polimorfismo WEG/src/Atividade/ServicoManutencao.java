package Atividade;
/**
 * classe ServicoManutancao
 * @author Bernardo P Zapelini
 *
 */
public class ServicoManutencao {

	// Atributos da classe ServicoManutencao
	String descricao;
	float custo;
	
	// Getters e Setters da classe ServicoManutencao
	/**
	 * metodo que retorna a descricao do erro do produto
	 * @return (String)
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * metodo que recebe a descricao do erro do produto
	 * @param descricao (String)
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * metodo que retorna o custo do produto
	 * @return (float)
	 */
	public float getCusto() {
		return custo;
	}
	/**
	 * metodo que recebe o custo do produto
	 * @param custo (float)
	 */
	public void setCusto(float custo) {
		this.custo = custo;
	}
	
	// Costrutores da classe ServicoManutencao
	/**
	 * costrutor vazio da classe ServicoManutencao
	 */
	public ServicoManutencao() {
		super();
	}
}

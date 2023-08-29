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
	
	/**
	 *
	 * @return String
	 */
	public String Limpeza() {
		return "Limpesa de Sujeira 10 Reias";
	}
	
	/**
	 * 
	 * @return String
	 */
	public String Parafusos() {
		return "Apertar Parafusos 50 Reais";
	}
	
	/**
	 * 
	 * @return String
	 */
	public String Oleo() {
		return "Adicionar Óleo 70 Reais";
	}
	
	// Costrutores da classe ServicoManutencao
	/**
	 * costrutor vazio da classe ServicoManutencao
	 */
	public ServicoManutencao() {
		super();
	}
}

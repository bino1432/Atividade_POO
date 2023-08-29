package Atividade;
/**
 * Classe que se revere a Geradores da WEG
 * filha da classe ProdutoWEG
 * @author Bernardo P Zapelini
 *
 */
public class Gerador extends ProdutoWEG {

	// Atributos da Classe Geradrlr
	String tipoDeCombustivel;
	boolean autonomia;
	boolean ligado = false;
	
	// Getters e Setters da Classe Gerador
	
	/**
	 * metodo que retorna o tipo de combustivel
	 * @return Retorna qual o tipo de combustivel que o gerador usa
	 */
	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}
	/**
	 * metodo que recebe o tipo de combustivel
	 * @param tipoDeCombustivel (String)
	 */
	public void setTipoDeCombustivel(String tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}
	/** 
	 * metodo que retorna a autonomia do produto
	 * @return Retorna se o gerador tem autonomia ou n�o
	 */
	public boolean isAutonomia() {
		return autonomia;
	}
	/**
	 * metodo que recebe a autonomia do produto
	 * @param autonomia (boolean)
	 */
	public void setAutonomia(boolean autonomia) {
		this.autonomia = autonomia;
	}
	
	/**metodo que retorna uma mensagem
	 * 
	 * @param ligado (boolean)
	 * @return retorna uma mensagem falando se o aparelho est� ligando ou desligando
	 */
	public String Ligado(boolean ligado) {
		if (ligado == false) {
			return "O Gerador et� ligando";
		}
		return "O Gerador est� Desligando";
	}
	
	/**metodo que rotorna uma mensagem
	 * 
	 * @return retorna uma mensagem que o aparelho est� sendo consertado
	 */
	public String FazerManutencao() {
		return "Fazendo a manuten��o do seguinte produto: Gerador";
	}
	
	// Construtores da Classe Gerador
	// Construtor vazio
	/**
	 * construtor vazio da classe Gerador
	 */
	public Gerador() {
		super();
		// TODO Auto-generated constructor stub
	}
	// construtor que recebe os parametros  codigo e tipo
	/**
	 * construtor da classe Gerador que recebe parametros
	 * @param codigo (int)
	 * @param tipo (String)
	 */
	public Gerador(int codigo, String tipo) {
		super(codigo, tipo);
		// TODO Auto-generated constructor stub
	}
}
package Atividade;
/**
 * classe que se refere ao Inversor de Frequencia da WEG
 * filha da classe ProdutoWEG
 * @author Bernardo P Zapelini
 *
 */
public class InversorFrequencia extends ProdutoWEG{
	// Atributos da Setters inversor de Frequencia
	int numeroDeFases;
	int capacidadeDaFrequencia;
	boolean ligado = false;
	
	// Getters e Setters da classe inversor de Frequencia
	/**
	 * metodo para retornar o numero de fases do produto
	 * @return retorna a quantidade de numero de fases que o inversor tem
	 */
	public int getNumeroDeFases() {
		return numeroDeFases;
	}
	/**
	 * metodo para receber o numero de fases
	 * @param numeroDeFases (int)
	 */
	public void setNumeroDeFases(int numeroDeFases) {
		this.numeroDeFases = numeroDeFases;
	}
	/**
	 * metodo para retornar a capacidade da frequencia
	 * @return retorna a capacidade da frequencia do inversor
	 */
	public int getCapacidadeDaFrequencia() {
		return capacidadeDaFrequencia;
	}
	/**
	 * metodo para receber a capaciade da frequencia
	 * @param capacidadeDaFrequencia (int)
	 */
	public void setCapacidadeDaFrequencia(int capacidadeDaFrequencia) {
		this.capacidadeDaFrequencia = capacidadeDaFrequencia;
	}
	
	/**metodo que retorna uma mensagem
	 * 
	 * @param ligado (boolean)
	 * @return retorna uma mensagem falando se o aparelho está ligando ou desligando
	 */
	public String Ligado(boolean ligado) {
		if (ligado == false) {
			return "O Inversor de Frequencia etá ligando";
		}
		return "O Inversor de Frequencia está Desligando";
	}
	
	/**metodo que rotorna uma mensagem
	 * 
	 * @return retorna uma mensagem que o aparelho está sendo consertado
	 */
	public String FazerManutencao() {
		return "Fazendo a manutenção do seguinte produto: Inversor de Frequencia";
	}
	
	// Construtores na classe Invertsor de Frequencia
	
	/**
	 * construtor vazio da classe Inversor de Frequencia
	 */
	public InversorFrequencia() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Construtor da classe inversor de Frequencia.
	 * @param codigo (int)
	 * @param tipo (String)
	 */
	public InversorFrequencia(int codigo, String tipo) {
		super(codigo, tipo);
	}

}
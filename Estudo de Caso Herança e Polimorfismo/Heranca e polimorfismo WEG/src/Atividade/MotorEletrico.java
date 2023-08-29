package Atividade;
/**
 * classe que se refere ao motor eletrico da WEG
 * filha da classe ProditoWEG
 *  
 * @author Bernardo P Zapelini
 *
 */
public class MotorEletrico extends ProdutoWEG {

	// Atributos da classe MotorEletrico
	String tipoDeEnrolamento;
	float eficiencia;
	
	// Getters e Setters da classe MotorEletrico
	
	/**
	 * metodo para retornar o tipo de enrolamento
	 * @return retorna qual o tipo de enrolamento do motor
	 */
	public String getTipoDeEnrolamento() {
		return tipoDeEnrolamento;
	}
	
	/**
	 * metodo para inserir o tipo de enrolamento
	 * @param tipoDeEnrolamento (String)
	 */
	public void setTipoDeEnrolamento(String tipoDeEnrolamento) {
		this.tipoDeEnrolamento = tipoDeEnrolamento;
	}
	
	/**
	 * metodo para retornar a eficiencia
	 * @return retorna a aeficiencia do motor
	 */
	public float getEficiencia() {
		return eficiencia;
	}
	/**
	 * metodo para inserir a eficiencia
	 * @param eficiencia (float)
	 */
	public void setEficiencia(float eficiencia) {
		this.eficiencia = eficiencia;
	}
	
	/**metodo que retorna uma mensagem
	 * 
	 * @return retorna uma mensagem que o aparelho está ligando
	 */
	public String Ligar() {
		return "Aparelho Ligando";		
	}
	
	/**metodo que retorna uma mensagem
	 * 
	 * @return retorna uma mensagem que o aparelho está Desligando
	 */
	public String Desligar() {
		return "Aparelho Desligando";
	}
	
	/**metodo que rotorna uma mensagem
	 * 
	 * @return retorna uma mensagem que o aparelho está sendo consertado
	 */
	public String FazerManutencao() {
		return "Fazendo a manutenção do seguinte produto: Motor Eletrico";
	}
	
	// Construtores da classe MotoEletrico

	/**
	 * construtor vazio da classe motor eletrico
	 */
	public MotorEletrico() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * construtor que recebe os parametros da classe motorEletrico
	 * @param codigo (int)
	 * @param tipo (String)
	 */
	public MotorEletrico(int codigo, String tipo) {
		super(codigo, tipo);
	}

}

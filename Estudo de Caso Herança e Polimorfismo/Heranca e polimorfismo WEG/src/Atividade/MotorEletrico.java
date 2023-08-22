package Atividade;
/**
 * classe do Motor Eletrico
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
	 * @return String
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
	 * @return float
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

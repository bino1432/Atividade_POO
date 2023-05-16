package secretaria;

public class Unidades_curriculares {

	private Avaliacao avaliacao;
	private int frequencia; 
	private Professor professo;
	private String nomeUnidadeCurricular;

	/** classe para pegar o nome da Unidade Curricular */
	public void setNomeUnidadeCurricular(String nomeUnidadeCurricular){
		if(nomeUnidadeCurricular.length() >= 5 && nomeUnidadeCurricular.matches("[A-Za-z]*")){
			this.nomeUnidadeCurricular = nomeUnidadeCurricular;
		}
	}
	/** classe get para o nome da Unidade Curricular */
	public String getNomeUnidadeCurricular(){
		return nomeUnidadeCurricular;
	}
}
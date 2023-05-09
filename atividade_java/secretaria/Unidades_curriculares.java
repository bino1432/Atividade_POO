package secretaria;

public class Unidades_curriculares {

	private Avaliacao avaliacao;
	private int frequencia;
	private boolean faltou = false; 
	private Professor professo;

	public void setverificacaoFrequencia(int falta){
		if (faltou == true) {
			falta++;
		}
		frequencia = falta;
	}
	public void getFrequencia() {
		return frequencia;
	}
}

package secretaria;

public class Curso {

	private String nomeCurso;
	private int cargaHoraria;
	private Unidades_curriculares unidades_curriculares; 
	
	/** classe para pegar o nome do curso */
	public void setNomeCurso(String nomeCurso) {
		if(nomeCurso.length() >= 3 && nomeCurso.matches("[A-Za-z]*")) {
			this.nomeCurso = nomeCurso;
		} else {
			System.out.print("Nome Invalido");
		}
	}
	/** classe get no nome do curso */
	public String getNome() {
		return nomeCurso;
	}
	/** classe para pegara carga horaria */
	public void setCargaHoraria(int cargaHoraria) {
		if(cargaHoraria > 0) {
			this.cargaHoraria = cargaHoraria;
		} else {
			System.out.print("Nome Invalido");
		}
	}
	/** classe set carga horaria */
	public int getcargaHoraria() {
		return cargaHoraria;
	}
}
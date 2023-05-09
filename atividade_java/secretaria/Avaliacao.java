package secretaria;

public class Avaliacao {

	private double notas;
	
	public void setnota (double notaTirada) {
		if (notas >= 0 && notas <= 10) {
			notas = notaTirada;
		} else {
			System.out.print("nota invalida");
		}
	}
	public double getNota() {
		return notas;
	}
}

package heranca;

public class peixe {
	
	private String nome;
	private String raca;
	private String porte;
	
	public String bolhas() {
		return "Blub Blub";
	}
	public String reproduzir() {
		//Sobreescrita de métodos
			return "Reproduzindo peixe...";
	}
	public String peixe() {
		return "                                                  \r\n"
				+ "                        ############              \r\n"
				+ "--####              ######################        \r\n"
				+ "  ######        ##############################    \r\n"
				+ "  ##########  ##################################  \r\n"
				+ "    ######################################  ######\r\n"
				+ "    ##############################################\r\n"
				+ "    ##############################################\r\n"
				+ "    ##############################################\r\n"
				+ "  ##########  ##################################  \r\n"
				+ "  ######        ############################..    \r\n"
				+ "  ##                ######################        \r\n"
				+ "                        ..##########              \r\n"
				+ "                                                  \r\n";
	}
	
	public String locomocao() {
		return "Nadando";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public peixe(String nome, String porte) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.porte = porte;
	}
	public peixe() {
		
	}

}

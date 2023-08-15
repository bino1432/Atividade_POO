package heranca;

public class Sapo {

	private String nome;
	private String porte;
	private boolean venenoso;
	
	public String barulho() {
		return "croac croac";
	}
	public String sapo() {
		return "Rãbet Rãbet";
	}
	public String froakie() {
		return    "     _    _\r\n"
				+ "    (o)--(o)\r\n"
				+ "   /.______.\\\r\n"
				+ "   \\________/\r\n"
				+ "  ./        \\.\r\n"
				+ " ( .        , )\r\n"
				+ "  \\ \\_\\\\//_/ /\r\n"
				+ "   ~~  ~~  ~~\r\n"
				+ "\r\n";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public boolean getVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public Sapo() {
		super();
		// TODO Auto-generated constructor stub
	}
}

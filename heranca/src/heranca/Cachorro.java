package heranca;

public class Cachorro extends Animal{
	//Atributos
	private String nome;
	private String raca;
	private String porte;
	private boolean adestrado;
	private boolean castrado;
	
	//Métodos
	public String latir() {
		return "Au Au";
	}
	public String reproduzir() {
		//Sobreescrita de métodos
		if(!this.castrado) {
			return "Reproduzindo cachorro...";
		}
		return "Este cachorro é castrado!";
	}
	public String morder() {
		return "Nhac nhac";
	}
	public String cachorro(){
		return 	"         ,--._______,-. \r\n"
				+ "       ,','  ,    .  ,_`-. \r\n"
				+ "      / /  ,' , _` ``. |  )       `-.. \r\n"
				+ "     (,';'\"\"`/ '\"`-._ ` \\/ ______    \\\\ \r\n"
				+ "       : ,o.-`- ,o.  )\\` -'      `---.)) \r\n"
				+ "       : , d8b ^-.   '|   `.      `    `. \r\n"
				+ "       |/ __:_     `. |  ,  `       `    \\ \r\n"
				+ "       | ( ,-.`-.    ;'  ;   `       :    ; \r\n"
				+ "       | |  ,   `.      /     ;      :    \\ \r\n"
				+ "       ;-'`:::._,`.__),'             :     ; \r\n"
				+ "      / ,  `-   `--                  ;     | \r\n"
				+ "     /  \\                   `       ,      | \r\n"
				+ "    (    `     :              :    ,\\      | \r\n"
				+ "     \\   `.    :     :        :  ,'  \\    : \r\n"
				+ "      \\    `|-- `     \\ ,'    ,-'     :-.-'; \r\n"
				+ "      :     |`--.______;     |        :    : \r\n"
				+ "       :    /           |    |         |   \\ \r\n"
				+ "       |    ;           ;    ;        /     ; \r\n"
				+ "     _/--' |   -hrr-   :`-- /         \\_:_:_| \r\n"
				+ "   ,',','  |           |___ \\ \r\n"
				+ "   `^._,--'           / , , .) \r\n"
				+ "                      `-._,-' ";
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
	public boolean isAdestrado() {
		return adestrado;
	}
	public void setAdestrado(boolean adestrado) {
		this.adestrado = adestrado;
	}
	public boolean isCastrado() {
		return castrado;
	}
	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	
	public Cachorro(String nomeCientifico, float peso, String tamanho) {
		super(nomeCientifico, peso, tamanho);
		// TODO Auto-generated constructor stub
	}
}
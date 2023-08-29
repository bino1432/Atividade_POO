package Atividade;
/**
 * classe WEG
 * @author Bernardo P Zapelini
 *
 */
public class WEG {
	
	// Atributos da classe WEG
	String[] listaProdutos = {"Gerador", "Inversor de Frequencia", "Motor Eletríco"}; 
	String[] listaManutencao = {"Limpeza", "Apertar Parafusos", "Passar Óleo"};
	
	// Getters e Setters da classe WEG
	/**
	 * metodo que retorna a lista dos produtos cadastrados
	 * @return (String)
	 */
	public String[] getListaProdutos() {
		return listaProdutos;
	}
	/**
	 * metodo que recebe a lista de produtos cadastrados
	 * @param listaProdutos (String)
	 */
	public void setListaProdutos(String[] listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	/**
	 * metodo que retorna a lista das manutencoes feitas
	 * @return (String)
	 */
	public String[] getListaManutencao() {
		return listaManutencao;
	}
	/**
	 * metodo que recebe a lista de manutencoes feitas
	 * @param listaManutencao (String)
	 */
	public void setListaManutencao(String[] listaManutencao) {
		this.listaManutencao = listaManutencao;
	}
	
	/** Metodo da Classe WEG
	 * 
	 * @return Retorna um texto explicando a lista de produtos da WEG e uma breve descrição do produto
	 */
	public String ListarProdutos() {
		return "Geradores: Um gerador é um dispositivo ou sistema que converte uma forma de energia, como energia mecânica, térmica ou química, em energia elétrica \n"
			  +"Inversores de Frequencia: Ele funciona alterando a frequência da energia elétrica fornecida ao motor \n"
			  +"Motor Eletrico: Um motor elétrico é um dispositivo que converte energia elétrica em energia mecânica, produzindo movimento. \n ";
 	}
	
	/** Metodo da Classe WEG
	 * 
	 * @return Retorna um texto explicando a lista de Serviços de Manutencão fornecidos pela WEG e uma breve descrição do Serviço
	 */
	public String ListarServicosManutencao() {
		return "Limpeza: Adequado para você que apenas quer limpar seu dispositivo ou produto \n"
			  +"Apertar Parafusos: Adequado para você que está com o Produto com seus parafusos soltos \n"
			  +"Passar Óleo: Adequado para você que quer passar Óleo no seu produto \n";
 	}
	
	// Construtor da classe WEG
	/**
	 * costrutor vazio da classe WEG
	 */
	public WEG() {
		super();
	}
}

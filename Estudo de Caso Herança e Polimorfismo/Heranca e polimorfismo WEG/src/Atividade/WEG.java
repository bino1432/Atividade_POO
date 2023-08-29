package Atividade;
/**
 * classe WEG
 * @author Bernardo P Zapelini
 *
 */
public class WEG {
	
	// Atributos da classe WEG
	String[] listaProdutos = {"Gerador", "Inversor de Frequencia", "Motor Eletr�co"}; 
	String[] listaManutencao = {"Limpeza", "Apertar Parafusos", "Passar �leo"};
	
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
	 * @return Retorna um texto explicando a lista de produtos da WEG e uma breve descri��o do produto
	 */
	public String ListarProdutos() {
		return "Geradores: Um gerador � um dispositivo ou sistema que converte uma forma de energia, como energia mec�nica, t�rmica ou qu�mica, em energia el�trica \n"
			  +"Inversores de Frequencia: Ele funciona alterando a frequ�ncia da energia el�trica fornecida ao motor \n"
			  +"Motor Eletrico: Um motor el�trico � um dispositivo que converte energia el�trica em energia mec�nica, produzindo movimento. \n ";
 	}
	
	/** Metodo da Classe WEG
	 * 
	 * @return Retorna um texto explicando a lista de Servi�os de Manutenc�o fornecidos pela WEG e uma breve descri��o do Servi�o
	 */
	public String ListarServicosManutencao() {
		return "Limpeza: Adequado para voc� que apenas quer limpar seu dispositivo ou produto \n"
			  +"Apertar Parafusos: Adequado para voc� que est� com o Produto com seus parafusos soltos \n"
			  +"Passar �leo: Adequado para voc� que quer passar �leo no seu produto \n";
 	}
	
	// Construtor da classe WEG
	/**
	 * costrutor vazio da classe WEG
	 */
	public WEG() {
		super();
	}
}

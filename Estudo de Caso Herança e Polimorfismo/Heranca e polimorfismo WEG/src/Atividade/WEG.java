package Atividade;
/**
 * classe WEG
 * @author Bernardo P Zapelini
 *
 */
public class WEG {
	
	// Atributos da classe WEG
	String[] listaProdutos = new String[100];
	String[] listaManutencao = new String[100];
	
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
	
	// Construtor da classe WEG
	/**
	 * costrutor vazio da classe WEG
	 */
	public WEG() {
		super();
	}
}

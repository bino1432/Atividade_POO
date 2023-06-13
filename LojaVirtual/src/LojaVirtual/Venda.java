package LojaVirtual;
/**
 * 
 * @author Bernardo Zapelini
 *
 * Classe de venda da Loja Virtual
 *
 */
public class Venda {
	
	private Cliente cliente;
	private String empresa;
	private Produto produto;
	
	/**
	 * metodo que retorna o Cliente
	 * 
	 * @return (Cliente)
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * metodo que recebe o cliente
	 * 
	 * @param cliente (Cliente)
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * metodo que retorna a empresa
	 * 
	 * @return (String)
	 */
	public String getEmpresa() {
		return empresa;
	}
	/**
	 * metodo que recebe a empresa
	 * 
	 * @param empresa (String)
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	/**
	 * metodo que retorna o Produto
	 * 
	 * @return (Produto)
	 */
	public Produto getProduto() {
		return produto;
	}
	/**
	 * metodo que recebe o Produto
	 * 
	 * @param produto (Produto)
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}

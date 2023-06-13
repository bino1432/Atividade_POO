package LojaVirtual;
/**
 * 
 * @author Bernardo Zapelini
 * 
 * Classe carrinho da Loja Virtual
 * 
 */
public class Carrinho_de_Compras {

	private Cliente cliente;
	private int quantidade;
	private int valor;
	
	/**
	 * Metodo que retorna o cliente da classe carrinho de compras 
	 * 
	 * @return (Cliente)
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * Metodo que recebe o cliente da classe carrinho de compras
	 * 
	 * @param cliente (Cliente)
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * Metodo que retorna a quantidade de  itens no carrinho
	 * 
	 * @return (int)
	 */
	public int getQuantidade() {
		return quantidade;
	}
	/**
	 * Metodo que recebe a quantidade de itens
	 * 
	 * @param quantidade (int)
	 */
	public void setQuantidade(int quantidade) {
		if(quantidade >= 1) {
			this.quantidade = quantidade;
		} else {
			System.out.print("Quantidade Invalida!");
		}
	}
	/**
	 * Metodo que retorna o valor da compra
	 * 
	 * @return (int)
	 */
	public int getValor() {
		return valor;
	}
	/**
	 * Metodo que recebe o valor da compra
	 * 
	 * @param valor (int)
	 */
	public void setValor(int valor) {
		if(valor >= 0) {
			this.valor = valor;
		} else {
			System.out.print("Valor Invalido");
		}
	}
	
}
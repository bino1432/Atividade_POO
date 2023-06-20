package LojaVirtual;
/**
 * 
 * @author Bernardo Zapelini
 * 
 * Classe do pagamento da Loja Virtual
 */
public class Pagamento {
	
	Venda v = new Venda();
	
	private String forma;
	private int parcelamento;
	private Double desconto;
	private double total;
	private double frete;
	private Venda venda;
	
	/**
	 * metodo que retorna a forma de pagamento
	 * 
	 * @return (String)
	 */
	public String getForma() {
		return forma;
	}
	/**
	 * metodo que recebe a forma de pagamento
	 * 
	 * @param forma (String)
	 */
	public void setForma(String forma) {
		if(forma.length() >= 3 && forma.matches("[A-Za-z]*")) {
			this.forma = forma;
		}
	}
	/**
	 * metodo que retorna a quantidade de parcelas 
	 *
	 * @return (int)
	 */
	public int getParcelamento() {
		return parcelamento;
	}
	/**
	 * metodo que recebe a quantidade de parcelas
	 * 
	 * @param parcelamento (int)
	 */
	public void setParcelamento(int parcelamento) {
		if(parcelamento >= 1){
		 	this.parcelamento = parcelamento;
		}
	}
	/**
	 * metodo que retorna o desconto do produto
	 * 
	 * @return	(Double)
	 */
	public Double getDesconto() {
		return desconto;
	}
	/**
	 * metodo que recebe o desconto do produto
	 * 	
	 * @param desconto (Double)
	 */
	public void setDesconto(Double desconto) {
		if(desconto >= 0.0){
			this.desconto = desconto;
		}
	}
	/**
	 * metodo que retorna o valor total da compra
	 * 
	 * @return (double)
	 */
	public double getTotal() {
		return total;
	}
	/**
	 * metodo que recebe o total da compra
	 * 
	 * @param total (double)
	 */
	public void setTotal(double total) {
		if(total > 0){
			this.total = total;
		}
	}
	/**
	 * metodo que retorna o valor do frete
	 * 
	 * @return (double)
	 */
	public double getFrete() {
		return frete;
	}
	/**
	 * metodo que recebeo o valor do frete
	 * 
	 * @param frete (double)
	 */
	public void setFrete(double frete) {
		if(frete >= 0) {
			this.frete = frete;
		}	
	}
	/**
	 * metodo que retorna a venda 
	 * 
	 * @return (Venda)
	 */
	public Venda getVenda() {
		return venda;
	}
	/** 
	 * metodo que recebe a venda
	 * 
	 * @param venda (Venda)
	 */
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
}
package LojaVirtual;
/**
 * 
 * @author Bernardo Zapelini
 * 
 * Classe produto da Loja Virtual
 *
 */
public class Produto {
	
	private String nome;
	private double preco;
	private String categoria;
	private double avaliacao;
	private String modelo;
	private String marca;
	private String cor;
	private int estoque;
	private String descricao;
	private String foto;
	private int limite;
	
	/**
	 * Metodo que retorna o nome do produto
	 * 
	 * @return (String)
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Metodo que recebe o nome do produto
	 * 
	 * @param nome (String)
	 */
	public void setNome(String nome) {
		if(nome.length() >= 3) {
			this.nome = nome;
		}
	}
	/**
	 * Metodo que retorna o preço do produto
	 * 
	 * @return (double)
	 */
	public double getPreco() {
		return preco;
	}
	/**
	 * Metodo que recebe o preço do produto
	 * 
	 * @param preco (double)
	 */
	public void setPreco(double preco) {
		if(preco >= 0) {
			this.preco = preco;
		}
	}
	/**
	 * Metodo que retorna a categoria do produto
	 * 
	 * @return (String)
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * Metodo que recebe a categoria do produto
	 * 
	 * @param categoria (String)
	 */
	public void setCategoria(String categoria) {
		if(categoria.matches("[A-Za-z]*"))	
			this.categoria = categoria;
	}
	/**
	 * Metodo que retorna a avaliaçao do produto
	 * 
	 * @return (double)
	 */
	public double getAvaliacao() {
		return avaliacao;
	}
	/**
	 * Metodo que recebe a avaliaçao do produto
	 * 
	 * @param avaliacao (double)
	 */
	public void setAvaliacao(double avaliacao) {
		if(avaliacao <= 5) {
			this.avaliacao = avaliacao;
		}
	}
	/**
	 * Metodo que retorna o modelo do produto
	 * 
	 * @return (String)
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * Metodo que recebe o modelo do produto
	 * 
	 * @param modelo (String)
	 */
	public void setModelo(String modelo) {
		if(modelo.length() >= 1) {
			this.modelo = modelo;
		}
	}
	/**
	 * Metodo que retorna a marca do produto
	 * 
	 * @return (String)
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * Metodo que recebe a marca do produto
	 * 
	 * @param marca (String)
	 */
	public void setMarca(String marca) {
		if(marca.length() >= 1) {
			this.marca = marca;
		}
	}
	/**
	 * Metodo que retorna a cor do produto
	 * 
	 * @return (String)
	 */
	public String getCor() {
		return cor;
	}
	/**
	 * Metodo que recebe a cor do produto
	 * 
	 * @param cor (String)
	 */
	public void setCor(String cor) {
		if(cor.length() >= 1) {
			this.cor = cor;
		}
	}
	/**
	 * Metodo que retorna o estoque disponivel do produto
	 * 
	 * @return (int)
	 */
	public int getEstoque() {
		return estoque;
	}
	/**
	 * Metodo que recebe o estoque disponivel do produto
	 * 
	 * @param estoque (int)
	 */
	public void setEstoque(int estoque) {
		if(estoque >= 1) {
			this.estoque = estoque;
		}
	}
	/**
	 * Metodo que retorna a descriçao do produto
	 * 
	 * @return (String)
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * Metodo que recebe a descriçao do produto
	 * 
	 * @param descricao (String)
	 */
	public void setDescricao(String descricao) {
		if(descricao.length() >= 1) {
			this.descricao = descricao;
		}	}
	/**
	 * Metodo que retorna o link da foto do produto
	 * 
	 * @return (String)
	 */
	public String getFoto() {
		return foto;
	}
	/**
	 * Metodo que recebe o link da foto do produto
	 * 
	 * @param foto (String)
	 */
	public void setFoto(String foto) {
		if(foto.length() >= 2) {
			this.foto = foto;
		}
	}
	/**
	 * Metodo que retorna o limite de compra do produto
	 * 
	 * @return (int)
	 */
	public int getLimite() {
		return limite;
	}
	/**
	 * Metodo que recebe o limite de compra do produto
	 * 
	 * @param limite (String)
	 */
	public void setLimite(int limite) {
		if(limite <= 10) {
			this.limite = limite;
		}	}
}
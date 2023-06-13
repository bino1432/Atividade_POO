package LojaVirtual;
/**
 * 
 * @author Bernardo Zapelini
 *
 * Classe de Endereco do Cliente da Lojo Virtual
 * 
 */
public class Endereco {

	private String identificacao;
	private String rua;
	private String cep;
	private String cidade;
	private String uf;
	private String numero;
	private String complemento;
	
	/**
	 * Metodo que retorna a identificacao do endereco
	 * 
	 * @return (String)
	 */
	public String getIdentificacao() {
		return identificacao;
	}
	/**
	 * Metodo que recebe a identificacao do endereco
	 * 
	 * @param identificacao (String)
	 */
	public void setIdentificacao(String identificacao) {
		if(identificacao.length() >= 3) {
			this.identificacao = identificacao;
		}
	}
	/**
	 * Metodo que retorna a rua do endereco
	 * 
	 * @return (String)
	 */
	public String getRua() {
		return rua;
	}
	/**
	 * Metodo que recebe a rua do endereco
	 * 
	 * @param rua (String)
	 */
	public void setRua(String rua) {
		if(rua.length() > 3 && rua.matches("[A-Za-z9-0]*")) {
			this.rua = rua;
		}
	}
	/**
	 * Metodo que retorna o CEP do endereco
	 * 
	 * @return (String)
	 */
	public String getCep() {
		return cep;
	}
	/**
	 * Metodo que recebe o CEP do endereco
	 * 
	 * @param cep (String)
	 */
	public void setCep(String cep) {
		if(cep.length() > 3 && cep.matches("[0-9 - ]*")) {
			this.cep = cep;
		}
	}
	/**
	 * Metodo que retorna a cadade do endereco
	 * 
	 * @return (String)
	 */
	public String getCidade() {
		return cidade;
	}
	/**
	 * Metodo que recebe a cidade do endereco
	 * 
	 * @param cidade (String)
	 */
	public void setCidade(String cidade) {
		if(cidade.length() > 3 && cidade.matches("[A-Za-z]*")) {
			this.cidade = cidade;
		}
	}
	/**
	 * Metodo que retorna a UF do endereco
	 * 
	 * @return (String)
	 */
	public String getUf() {
		return uf;
	}
	/**
	 * Metodo que recebe a UF do endereco
	 * 
	 * @param uf (String)
	 */
	public void setUf(String uf) {
		if(uf.length() > 3 && uf.matches("[A-Za-z]*")) {
			this.uf = uf;
		}
	}
	/**
	 * Metodo que retorna o numero do endereco
	 * 
	 * @return (String)
	 */
	public String getNumero() {
		return numero;
	}
	/**
	 * Metodo que recebe o numero do endereco
	 * 
	 * @param numero (String)
	 */
	public void setNumero(String numero) {
		if(numero.length() > 7 && numero.matches("[0-9]*")) {
			this.numero = numero;
		}
	}
	/**
	 * Metodo que retorna o complemento do endereco
	 * 
	 * @return (String)
	 */
	public String getComplemento() {
		return complemento;
	}
	/**
	 * Metodo que recebe o complemento do endereco
	 * 
	 * @param complemento (String)
	 */
	public void setComplemento(String complemento) {
		if(complemento.length() > 3) {
			this.complemento = complemento;
		}
	}
}
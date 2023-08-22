package heranca;

import java.util.Calendar;

public class Animal {
	
	private String nomeComum;
	private String nomeCientifico;
	private String classe; //Mam�fero, anf�bio, ...
	private String tamanho; //
	private float peso;
	private String habitat;
	private String genero;
	private Calendar dataNascimento;
	private String cor;
	
	public String alimenter(String energia) {
		return "Se alimentando de " + energia;
	}
	public String reproduzir() {
		return "Reproduzindo...";
	}
	public String locomover(String sentido, float velocidade) { 
		return "Locomendo-se na dire��o" + sentido + " e velocidade " + velocidade;
	}
	public String repousar(float tempo, String unidade) {
		return "Repousando por " + tempo + unidade; //5h 
	}
	
	public String getNomeComum() {
		return nomeComum;
	}
	public void setNomeComum(String nomeComum) {
		this.nomeComum = nomeComum;
	}
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public Animal(String nomeCientifico, float peso, String tamanho) {
		setNomeCientifico(nomeCientifico);
		setPeso(peso);
		setTamanho(tamanho);
	}
	public Animal() {
		// TODO Auto-generated constructor stub
	}
}
package secretaria;
/**
 * classe Curso
 * @author Bernado P Zapelini
 */
public class Curso {

    private String nome;

    /** metodo para receber nome do curso 
     * @param nome (String)
     * */
    public void setNome(String nome){
        if(nome.matches("[A-Za-z0-9]*") && nome.length() > 0){
            this.nome = nome;
        } else {
            System.out.println("Nome invalido!");
        }
    }
    /** metodo que retorna o nome do curso 
     * @return (String)
     * */
    public String getNome(){
        return nome;
    }
    /** construtor curso 
     * @param nome (String)
     * */
    public Curso(String nome){
        setNome(nome);
    }
}
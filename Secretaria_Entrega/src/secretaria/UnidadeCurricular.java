package secretaria;
/**
 * classe UnidadeCurricular
 * @author Bernado P Zapelini
 */
public class UnidadeCurricular {
    
    private String nome;
    private Curso curso;

    /** metodo para pegar o nome da unidade curricular 
     * @param nome (String)
     * */
    public void setNome(String nome){
        if(nome.matches("[A-Za-z]*")){
            this.nome = nome;
        } else {
            System.out.println("Nome invalido!");
        }
    }
    /** metodo que retorna o nome da unidade curricular 
     * @return (String)
     * */
    public String getNome(){
        return nome;
    }
    /** metodo que recebe a classe do curso 
     * @param curso (Curso)
     * @return (boolean)
     * */
    public boolean setCurso(Curso curso){
        if (curso.getClass().getSimpleName() == "Curso"){
            this.curso = curso;
            return true;
        }else{
            return false;
        }
    }
    /** metodo que retorna o curso 
     * @return (Curso)
     * */
    public Curso getCurso(){
        return this.curso;
    }
    /** construtor unidade curricular 
     * @param nome (String)
     * @param curso (Curso)
     * */
    public UnidadeCurricular(String nome, Curso curso){
        setNome(nome);
        setCurso(curso);
    }
}
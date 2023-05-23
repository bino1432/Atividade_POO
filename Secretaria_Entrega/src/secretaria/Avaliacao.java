package secretaria;
/**
 * classe Avalicao
 * @author Bernado P Zapelini
 */
public class Avaliacao {
    
    private String nome;
    private UnidadeCurricular unidadeCurricular;

    /** metodo para receber o nome da avaliaçao 
     * @param nome (String)
     * */
    public void setnome(String nome){
        if(nome.matches("[A-Za-z]*")){
            this.nome = nome;
        } else {
            System.out.println("Nome invalido!");
        }
    }
    /** metodo para retornar o nome da avaliaçoa 
     * @return (String)
     * */
    public String getNome(){
        return nome;
    }
    /** metodo para receber a unidade curricular 
     * @param unidadeCurricular (UnidadeCurricular)
     * @return (boolean)
     * */
    public boolean setUnidadesCurriculares(UnidadeCurricular unidadeCurricular){
        if (unidadeCurricular.getClass().getSimpleName() == "UnidadeCurricular"){
            this.unidadeCurricular = unidadeCurricular;
            return true;
        }else{
            System.out.println("unidades Curriculares inválidas!");
            return false;
        }
    }
    /** metodo para retornar a Unidade curricular 
     * @return (UnidadeCurricular)
     * */
    public UnidadeCurricular getUnidadeCurricular(){
        return this.unidadeCurricular;
    }    
    /** construtor avaliacao 
     * @param nome (String)
     * @param unidadeCurricular (UnidadeCurricular)
     * */
    public Avaliacao(String nome, UnidadeCurricular unidadeCurricular){
        setnome(nome);
        setUnidadesCurriculares(unidadeCurricular);
    }
}
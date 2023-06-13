package secretaria;
/**
 * classe Matricula
 * @author Bernado P Zapelini
 */
public class Matricula {
    
    private String codigo;
    private Aluno aluno;
    private UnidadeCurricular unidadeCurricular;

    /** construtor matricula 
     * @param aluno (Aluno)
     * @param unidadeCurricular (UnidadeCurricular)
     * */
    public Matricula(Aluno aluno, UnidadeCurricular unidadeCurricular){
        setAluno(aluno);
        setUnidadeCurricular(unidadeCurricular);
    }


    /** funcao para receber o codigo de matricula
     * @param codigo (String)
     * */
    public void setCodigo(String codigo){
        if(codigo.matches("[A-Z0-9]*") && codigo.length() > 0 && codigo.length() <= 6){
            this.codigo = codigo;
        }
    }
    /** metodo que retorna o codigo da matricula
     * @return (String)
     * */
    public String getCodigo(){
        return codigo;
    }
    /** metodo para verificar o aluno 
     *  @param aluno (Aluno)
     *  @return (boolean)
     * */
    public boolean setAluno(Aluno aluno){
        if (aluno.getClass().getSimpleName() == "Aluno"){
            this.aluno = aluno;
            return true;
        }else{
            System.out.println("Aluno inválido!");
            return false;
        }
    }
    /** metodo que retorna o aluno 
     *	@return (Aluno) 
     * */
    public Aluno getAluno(){
        return this.aluno;
    }
    /** metodo para verificar unidade curricular 
     * @param unidadeCurricular (UnidadeCurricular)
     * @return (boolean)
     * */
    public boolean setUnidadeCurricular(UnidadeCurricular unidadeCurricular){
        if (unidadeCurricular.getClass().getSimpleName() == "UnidadeCurricular"){
            this.unidadeCurricular = unidadeCurricular;
            return true;
        }else{
            System.out.println("unidades Curriculares inválidas!");
            return false;
        }
    }
    /** metodo que retorna o unidade curricular 
     * @return (UnudadeCurricular)
     * */
    public UnidadeCurricular getUnidadesCurriculares(){
        return this.unidadeCurricular;
    }    
}
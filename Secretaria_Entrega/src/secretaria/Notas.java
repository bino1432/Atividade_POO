package secretaria;
/**
 * classe Notas
 * @author Bernado P Zapelini
 */
public class Notas {
    
    private Aluno aluno;
    private Avaliacao avaliacao;
    private Double nota;

    /** metodo que recebe a nota do aluno
     * @param nota (Double)
     * */
    public void setNota(Double nota){
        if(nota >= 0.0 && nota <= 10.0){
            this.nota = nota;
        } else {
            System.out.println("Nota invalida!");
        }
    }
    /** metodo que retorna a nota do aluno
     * @return (Double)
     * */
    public Double getNota(){
        return nota;
    }
    /** metodo para receber o aluno 
     * @param aluno (Aluno)
     * @return (boolean)
     * */
    public boolean setAluno(Aluno aluno){
        if (aluno.getClass().getSimpleName() == "Aluno"){
            this.aluno = aluno;
            return true;
        }else{
            return false;
        }
    }
    /** metodo que retorna o aluno 
     * @return (Aluno)
     * */
    public Aluno getAluno(){
        return this.aluno;
    }
    /** metodo que recebe avaliacao 
     *	@param avaliacao (Avaliacao)
     *	@return (boolean)
     * */
    public boolean setAvaliacao(Avaliacao avaliacao){
        if (avaliacao.getClass().getSimpleName() == "Avaliacao"){
            this.avaliacao = avaliacao;
            return true;
        }else{
            return false;
        }
    }
    /** metodo que retorna a avaliacao 
     * @return (Avaliacao)
     * */
    public Avaliacao getavaliacao(){
        return this.avaliacao;
    }
    /** construtor notas 
     * @param aluno (Aluno)
     * @param avaliacao (Avaliacao)
     * @param nota (Double)
     * */
    public Notas(Aluno aluno, Avaliacao avaliacao, Double nota) {
        setAluno(aluno);
        setAvaliacao(avaliacao);
        setNota(nota);
    }
}
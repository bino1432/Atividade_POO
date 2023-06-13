package secretaria;
/**
 * classe Main
 * @author Bernado P Zapelini
 */
public class Main {
    public static void main (String[]args){
        Aluno aluno = new Aluno("Bernardo");
        aluno.setNumeroCPF("532.253.612-64");
        aluno.setEmail("bernardo@gmail.com.br");
        aluno.setEndereco("Epitacio pessoa");
        aluno.setNomeResp("Daniel");
        aluno.setNumeroTelefone("47932456590");

        Curso curso = new Curso("Programação");
        UnidadeCurricular unidadeCurricular = new UnidadeCurricular("Informatica", curso);
        Matricula matricula = new Matricula(aluno, unidadeCurricular);
        Avaliacao avaliacao = new Avaliacao(aluno.getNome(), unidadeCurricular);
        Double nota = 9.0;
        Notas notas = new Notas(aluno, avaliacao, nota);
        // matricula.setCodigo("S00000");


    }
}

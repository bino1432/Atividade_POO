public class Main {
    public static void main (String[]args){
        Aluno aluno = new Aluno("Matheus");
        aluno.setNumeroCPF("123.432.344-16");
        aluno.setEmail("Aluno.email@legal.com");
        aluno.setEndereco("Rua maneira");
        aluno.setNomeResp("Roberto");
        aluno.setNumeroTelefone("554512331231");

        Curso curso = new Curso("POG");
        UnidadeCurricular unidadesCurriculares = new UnidadeCurricular("Matemática", Curso);
        Matricula matricula = new Matricula(aluno, unidadesCurriculares);
        Avaliacao avaliacao = new Avaliacao(aluno.getNome(), unidadesCurriculares);
        Double nota_nota = 9.0;
        Notas nota = new Notas(aluno, avaliacao, nota_nota);
        // matricula.setCodigo("S00000");


    }
}
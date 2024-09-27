public class Main {
    public static void main(String[] args) {
        // Criando professores
        Professor prof1 = new Professor("Prof. Ana");
        Professor prof2 = new Professor("Prof. João");

        // Criando disciplinas
        Disciplina disciplina1 = new Disciplina("Matemática", 60, prof1);
        Disciplina disciplina2 = new Disciplina("Programação", 80, prof2);
        Disciplina disciplina3 = new Disciplina("História", 40, prof1);

        // Criando curso
        Curso curso = new Curso("Ciência da Computação");
        curso.adicionarDisciplina(disciplina1);
        curso.adicionarDisciplina(disciplina2);
        curso.adicionarDisciplina(disciplina3);

        // Listando disciplinas do curso
        curso.listarDisciplinasDoCurso();

        // Criando aluno e matriculando em disciplinas
        Aluno aluno = new Aluno("Carlos");
        aluno.matricularEmDisciplina(disciplina1);
        aluno.matricularEmDisciplina(disciplina2);

        // Exibir disciplinas pendentes do aluno
        aluno.listarDisciplinasPendentes();

        // Aluno completa uma disciplina
        aluno.completarDisciplina("Matemática");

        // Exibir disciplinas cursadas e horas cursadas
        aluno.listarDisciplinasCursadas();
        System.out.println("Horas cursadas: " + aluno.getHorasCursadas() + "h");

        // Exibir disciplinas pendentes restantes
        aluno.listarDisciplinasPendentes();
    }
}

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Disciplina> disciplinas;

    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void listarDisciplinasDoCurso() {
        System.out.println("Disciplinas do curso " + nome + ":");
        for (Disciplina d : disciplinas) {
            System.out.println(d.getNome() + " - Carga Horária: " + d.getCargaHoraria() + "h - Professor: " + d.getProfessorResponsavel().getNome());
        }
    }
}

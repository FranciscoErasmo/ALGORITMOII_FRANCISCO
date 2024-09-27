import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Disciplina> disciplinasCursadas;
    private List<Disciplina> disciplinasPendentes;

    public Aluno(String nome) {
        this.nome = nome;
        this.disciplinasCursadas = new ArrayList<>();
        this.disciplinasPendentes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void matricularEmDisciplina(Disciplina disciplina) {
        disciplinasPendentes.add(disciplina);
    }

    public void completarDisciplina(String nomeDisciplina) {
        for (Disciplina d : disciplinasPendentes) {
            if (d.getNome().equals(nomeDisciplina)) {
                disciplinasCursadas.add(d);
                disciplinasPendentes.remove(d);
                System.out.println("Disciplina " + nomeDisciplina + " foi completada.");
                return;
            }
        }
        System.out.println("Disciplina " + nomeDisciplina + " não encontrada na lista de disciplinas pendentes.");
    }

    public int getHorasCursadas() {
        int totalHoras = 0;
        for (Disciplina d : disciplinasCursadas) {
            totalHoras += d.getCargaHoraria();
        }
        return totalHoras;
    }

    public List<Disciplina> getDisciplinasPendentes() {
        return disciplinasPendentes;
    }

    public List<Disciplina> getDisciplinasCursadas() {
        return disciplinasCursadas;
    }

    public void listarDisciplinasPendentes() {
        if (disciplinasPendentes.isEmpty()) {
            System.out.println("Todas as disciplinas foram completadas.");
        } else {
            System.out.println("Disciplinas pendentes:");
            for (Disciplina d : disciplinasPendentes) {
                System.out.println(d.getNome() + " - Carga Horária: " + d.getCargaHoraria() + "h");
            }
        }
    }

    public void listarDisciplinasCursadas() {
        if (disciplinasCursadas.isEmpty()) {
            System.out.println("Nenhuma disciplina foi completada ainda.");
        } else {
            System.out.println("Disciplinas cursadas:");
            for (Disciplina d : disciplinasCursadas) {
                System.out.println(d.getNome() + " - Carga Horária: " + d.getCargaHoraria() + "h");
            }
        }
    }
}

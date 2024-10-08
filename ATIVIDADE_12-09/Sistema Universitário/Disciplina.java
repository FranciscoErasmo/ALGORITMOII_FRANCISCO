public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private Professor professorResponsavel;

    public Disciplina(String nome, int cargaHoraria, Professor professorResponsavel) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professorResponsavel = professorResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }
}

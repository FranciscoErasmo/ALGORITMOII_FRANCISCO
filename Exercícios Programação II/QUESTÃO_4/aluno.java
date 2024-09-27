public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    // Construtor
    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Método para calcular a média
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Método para verificar se o aluno foi aprovado
    public boolean foiAprovado() {
        return calcularMedia() >= 7;
    }

    // Método para imprimir os detalhes do aluno
    public void imprimirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + calcularMedia());
        System.out.println("Aprovado: " + (foiAprovado() ? "Sim" : "Não"));
    }
}

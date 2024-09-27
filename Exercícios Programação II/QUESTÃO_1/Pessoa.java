public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getter para acessar os atributos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Método para imprimir os detalhes da pessoa
    public void imprimirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }
}


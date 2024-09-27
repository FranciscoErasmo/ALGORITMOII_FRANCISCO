import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionar alguns livros
        Livro livro1 = new Livro("1984", "George Orwell", 1949);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro3 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Emprestar um livro
        biblioteca.emprestarLivro("1984", "Maria", LocalDate.of(2024, 10, 1));
        biblioteca.emprestarLivro("O Senhor dos Anéis", "João", LocalDate.of(2024, 11, 15));

        // Tentar emprestar um livro já emprestado
        biblioteca.emprestarLivro("1984", "Carlos", LocalDate.of(2024, 10, 15));

        // Verificar se um livro está disponível
        boolean disponivel = biblioteca.verificarDisponibilidade("Dom Casmurro");
        System.out.println("Dom Casmurro está disponível? " + (disponivel ? "Sim" : "Não"));

        // Listar livros emprestados
        biblioteca.listarLivrosEmprestados();
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criando livros
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Livro livro3 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Exibindo todos os livros da biblioteca
        biblioteca.exibirLivros();

        // Removendo um livro da biblioteca
        biblioteca.removerLivro("1984");

        // Exibindo todos os livros após a remoção
        biblioteca.exibirLivros();
    }
}

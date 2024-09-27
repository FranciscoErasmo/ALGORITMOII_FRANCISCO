import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    // Construtor
    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    // Método para adicionar um livro
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro \"" + livro.getTitulo() + "\" adicionado à biblioteca.");
    }

    // Método para remover um livro
    public void removerLivro(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(i);
                System.out.println("Livro \"" + titulo + "\" removido da biblioteca.");
                return;
            }
        }
        System.out.println("Livro \"" + titulo + "\" não encontrado na biblioteca.");
    }

    // Método para exibir todos os livros da biblioteca
    public void exibirLivros() {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            System.out.println("Livros na biblioteca:");
            for (Livro livro : livros) {
                livro.exibirDetalhes();
                System.out.println();
            }
        }
    }
}

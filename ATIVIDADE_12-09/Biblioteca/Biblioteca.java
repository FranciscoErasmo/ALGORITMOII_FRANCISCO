import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(String titulo, String nomeEmprestadoPara, LocalDate dataDevolucao) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo) && !livro.isEmprestado()) {
                livro.emprestar(nomeEmprestadoPara, dataDevolucao);
                System.out.println("Livro '" + titulo + "' emprestado para " + nomeEmprestadoPara + " até " + dataDevolucao);
                return;
            }
        }
        System.out.println("Livro '" + titulo + "' não está disponível para empréstimo.");
    }

    public void listarLivrosEmprestados() {
        boolean temEmprestados = false;
        System.out.println("Livros emprestados:");
        for (Livro livro : livros) {
            if (livro.isEmprestado()) {
                System.out.println(livro.getTitulo() + " - Emprestado para: " + livro.getNomeEmprestadoPara() + " - Devolução: " + livro.getDataDevolucao());
                temEmprestados = true;
            }
        }
        if (!temEmprestados) {
            System.out.println("Nenhum livro emprestado no momento.");
        }
    }

    public boolean verificarDisponibilidade(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return !livro.isEmprestado();
            }
        }
        return false; // Livro não encontrado
    }
}

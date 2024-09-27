import java.time.LocalDate;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean emprestado;
    private String nomeEmprestadoPara;
    private LocalDate dataDevolucao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
        this.nomeEmprestadoPara = null;
        this.dataDevolucao = null;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public String getNomeEmprestadoPara() {
        return nomeEmprestadoPara;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void emprestar(String nomeEmprestadoPara, LocalDate dataDevolucao) {
        this.emprestado = true;
        this.nomeEmprestadoPara = nomeEmprestadoPara;
        this.dataDevolucao = dataDevolucao;
    }

    public void devolver() {
        this.emprestado = false;
        this.nomeEmprestadoPara = null;
        this.dataDevolucao = null;
    }
}

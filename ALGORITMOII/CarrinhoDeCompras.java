import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        for (Produto p : produtos) {
            if (p.getNome().equals(produto.getNome())) {
                p.setQuantidade(p.getQuantidade() + produto.getQuantidade());
                return;
            }
        }
        produtos.add(produto);
    }

    public void removerProduto(String nomeProduto) {
        produtos.removeIf(p -> p.getNome().equals(nomeProduto));
    }

    public void atualizarQuantidade(String nomeProduto, int quantidade) {
        for (Produto p : produtos) {
            if (p.getNome().equals(nomeProduto)) {
                p.setQuantidade(quantidade);
                break;
            }
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void mostrarCarrinho() {
        if (produtos.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Carrinho de Compras: ");
            for (Produto p : produtos) {
                System.out.println(p.getNome() + " - Quantidade: " + p.getQuantidade() + " - Preço Unitário: R$" + p.getPreco() + " - Subtotal: R$" + p.calcularTotal());
            }
            System.out.println("Valor Total: R$" + calcularValorTotal());
        }
    }
}

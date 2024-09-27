public class Cliente {
    private String nome;
    private CarrinhoDeCompras carrinho;

    public Cliente(String nome) {
        this.nome = nome;
        this.carrinho = new CarrinhoDeCompras();
    }

    public void adicionarProdutoAoCarrinho(Produto produto) {
        carrinho.adicionarProduto(produto);
    }

    public void removerProdutoDoCarrinho(String nomeProduto) {
        carrinho.removerProduto(nomeProduto);
    }

    public void atualizarQuantidadeNoCarrinho(String nomeProduto, int quantidade) {
        carrinho.atualizarQuantidade(nomeProduto, quantidade);
    }

    public void verCarrinho() {
        carrinho.mostrarCarrinho();
    }
}

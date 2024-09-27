public class Main {
    public static void main(String[] args) {
        Cliente mateus = new Cliente("Francisco");

        // Adicionando produtos ao carrinho
        Produto produto1 = new Produto("Sapato", 50.00, 2);
        Produto produto2 = new Produto("Meia", 100.00, 1);

        mateus.adicionarProdutoAoCarrinho(produto1);
        mateus.adicionarProdutoAoCarrinho(produto2);
        
        // Ver o carrinho
        mateus.verCarrinho();

        // Atualizar quantidade de um produto
        mateus.atualizarQuantidadeNoCarrinho("Sapato", 3);
        mateus.verCarrinho();

        // Remover produto
        mateus.removerProdutoDoCarrinho("Meia");
        mateus.verCarrinho();
    }
}

import produtos.Produto;
public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens){
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal(){
        double valorTotal = 0;
        for(int i = 0; i < itens.length; i++){
            valorTotal += itens[i].getProduto().obterPrecoLiquido() * itens[i].getQuantidade();
        }
        return valorTotal - (valorTotal * (percentualDesconto / 100));
    }

    public void apresentarResumoPedido(){
        double valorTotalProdutos = 0;
        System.out.println("------- RESUMO PEDIDO -------");
        for(int i = 0; i < itens.length; i++){
            Produto produto = itens[i].getProduto();
            int quantidade = itens[i].getQuantidade();
            double precoUnitario = produto.obterPrecoLiquido();
            double totalItem = precoUnitario * quantidade;
            valorTotalProdutos += totalItem;
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f%n", 
                produto.getClass().getSimpleName(),
                produto.getTitulo(),
                precoUnitario,
                quantidade,
                totalItem);
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f%n", (valorTotalProdutos * (percentualDesconto / 100)));
        System.out.printf("TOTAL PRODUTOS: %.2f%n",  valorTotalProdutos);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f%n", calcularTotal());
        System.out.println("----------------------------"); 
    }
}

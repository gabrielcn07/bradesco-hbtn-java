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
}

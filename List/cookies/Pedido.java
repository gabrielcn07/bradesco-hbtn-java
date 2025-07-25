import java.util.*;
public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    public Pedido(){
        cookies = new ArrayList<PedidoCookie>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie){
        cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas(){
        int soma = 0;
        for(PedidoCookie cookie: cookies){
            soma += cookie.getQuantidadeCaixas();
        }
        return soma;
    }

    
    public int removerSabor(String sabor) {
        int removidos = 0;
        ArrayList<PedidoCookie> paraRemover = new ArrayList<>();
        for (PedidoCookie cookie : cookies) {
            if (cookie.getSabor().equals(sabor)) {
                removidos += cookie.getQuantidadeCaixas();
                paraRemover.add(cookie);
            }
        }
        cookies.removeAll(paraRemover);
        return removidos;
    }
}

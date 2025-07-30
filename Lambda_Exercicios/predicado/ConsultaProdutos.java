import java.util.function.*;
import java.util.*;
public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> criterioFiltro){
        List<Produto> produtosFiltrados = new ArrayList<>();
        for(Produto produto : produtos){
            if(criterioFiltro.test(produto)){
                produtosFiltrados.add(produto);
            }
        }
        return produtosFiltrados;
    }
}

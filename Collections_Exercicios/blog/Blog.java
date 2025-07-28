import java.util.*;
public class Blog {
    private List<Post> posts = new ArrayList<Post>();

    public void adicionarPostagem(Post post){
        posts.add(post);
    }

    public Set<String> obterTodosAutores(){
        Set<String> conjuntoOrdenado = new TreeSet<>();
        for(Post post : posts){
           conjuntoOrdenado.add(post.getAutor());
        }
        return conjuntoOrdenado;
    }

    public Map<String, Integer> obterContagemPorCategoria(){
        Map<String, Integer> contagem = new TreeMap<>();
        for (Post post : posts) {
            String categoria = post.getCategoria();
            contagem.put(categoria, contagem.getOrDefault(categoria, 0) + 1);
        }
        return contagem;
    }
}

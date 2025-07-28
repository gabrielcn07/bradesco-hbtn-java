import java.util.*;

public class Blog {
    private List<Post> listPost = new ArrayList<>();

    public void adicionarPostagem(Post post) {
        if (listPost.contains(post)) {
            throw new IllegalArgumentException("Postagem jah existente");
        }
        listPost.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();
        for (Post post : listPost) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagem = new TreeMap<>();
        for (Post post : listPost) {
            Categorias categoria = post.getCategoria();
            contagem.put(categoria, contagem.getOrDefault(categoria, 0) + 1);
        }
        return contagem;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> posts = new TreeSet<>();
        for (Post post : listPost) {
            if (post.getAutor().equals(autor)) {
                posts.add(post);
            }
        }
        return posts;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> posts = new TreeSet<>();
        for (Post post : listPost) {
            if (post.getCategoria() == categoria) {
                posts.add(post);
            }
        }
        return posts;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> mapa = new TreeMap<>();
        for (Post post : listPost) {
            mapa.computeIfAbsent(post.getCategoria(), k -> new TreeSet<>()).add(post);
        }
        return mapa;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> mapa = new TreeMap<>();
        for (Post post : listPost) {
            mapa.computeIfAbsent(post.getAutor(), k -> new TreeSet<>()).add(post);
        }
        return mapa;
    }
}

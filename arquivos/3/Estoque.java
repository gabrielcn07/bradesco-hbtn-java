import java.io.*;
import java.util.*;
public class Estoque {
    private List<Produto> produtos = new ArrayList<>();
    private final String arquivo = "estoque.csv";

    public Estoque() {
        carregar();
    }

    public void carregar() {
        produtos.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                produtos.add(Produto.fromCSV(linha));
            }
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado. Um novo será criado.");
        }
    }

    public void salvar() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            for (Produto p : produtos) {
                bw.write(p.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo.");
        }
    }

    public boolean adicionar(Produto produto) {
        for (Produto p : produtos) {
            if (p.getId() == produto.getId()) {
                return false;
            }
        }
        produtos.add(produto);
        salvar();
        return true;
    }

    public boolean excluir(int id) {
        boolean removido = produtos.removeIf(p -> p.getId() == id);
        if (removido) salvar();
        return removido;
    }

    public boolean atualizarQuantidade(int id, int novaQuantidade) {
        for (Produto p : produtos) {
            if (p.getId() == id) {
                p.setQuantidade(novaQuantidade);
                salvar();
                return true;
            }
        }
        return false;
    }

    public void exibir() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            produtos.forEach(System.out::println);
        }
    }
}

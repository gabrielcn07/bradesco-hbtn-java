import java.util.*;

public class Pessoa implements Comparable<Pessoa> {
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;
    private List<String> hobbies;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario, List<String> hobbies) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
        this.hobbies = hobbies;
    }

    public String getCargo() {
        return cargo;
    }

    public int getIdade() {
        return this.idade;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
       return this.salario;
    }

    public List<String> getHobbies() {
        return this.hobbies;
    }

    @Override
    public String toString() {
        return "[" + codigo + "] " + nome + " " + cargo + " " + idade + " R$ " + String.format("%.6f", salario).replace('.', ',');
    }

    @Override
    public int compareTo(Pessoa outra) {
        return Integer.compare(this.codigo, outra.codigo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return codigo == pessoa.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}

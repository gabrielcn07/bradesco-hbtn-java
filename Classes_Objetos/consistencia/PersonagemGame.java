public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome){
        setSaudeAtual(saudeAtual);
        this.nome = nome;
    }

    public int getSaudeAtual(){
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual){
        this.saudeAtual = saudeAtual;
        status = (saudeAtual > 0 ? "vivo" : "morto");
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if(nome != "" && nome != null){
            this.nome = nome;
        }
    }

    public String getStatus(){
        return status;
    }

    public void tomarDano(int quantidadeDeDano){
        int novaSaude = saudeAtual - quantidadeDeDano;
        if(novaSaude < 0){
            novaSaude = 0;
        }
        setSaudeAtual(novaSaude);
    }

    public void receberCura(int quantidadeDeCura){
        int novaSaude = saudeAtual + quantidadeDeCura;
        if(novaSaude > 100){
            novaSaude = 100;
        }
        setSaudeAtual(novaSaude);
    }
}

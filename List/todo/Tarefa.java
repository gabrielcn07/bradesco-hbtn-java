public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) throws Exception {
        modificarDescricao(descricao);
        this.identificador = identificador;
    }

    public String getDescricao(){
        return descricao;
    }

    public boolean getEstahFeita(){
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita){
        this.estahFeita = estahFeita;
    }

    public int  getIdentificador(){
        return identificador;
    }

    public void modificarDescricao(String novaDescricao) throws Exception {
        if(novaDescricao == null || novaDescricao.isEmpty()){
            throw new Exception("Descricao de tarefa invalida");
        }
        descricao = novaDescricao;
    }

}

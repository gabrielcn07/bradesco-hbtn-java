import java.util.ArrayList;
public class ListaTodo {
    private ArrayList<Tarefa> tarefa;

    public ListaTodo(){
        tarefa = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefaAdicional) throws Exception{
        for(Tarefa tarefaAtual : tarefa){
            if(tarefaAtual.getIdentificador() == tarefaAdicional.getIdentificador()){
                throw new Exception("Tarefa com identificador " + tarefaAdicional.getIdentificador() + " ja existente na lista");
            }
        }
        tarefa.add(tarefaAdicional);
    }

    public boolean marcarTarefaFeita(int identificadorTarefa){
       for(Tarefa tarefaAtual : tarefa){
            if(tarefaAtual.getIdentificador() == identificadorTarefa){
                tarefaAtual.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificadorTarefa){
       for(Tarefa tarefaAtual : tarefa){
            if(tarefaAtual.getIdentificador() == identificadorTarefa){
                tarefaAtual.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas(){
       for(Tarefa tarefaAtual : tarefa){
            tarefaAtual.setEstahFeita(false);
        }
    }

    public void fazerTodas(){
       for(Tarefa tarefaAtual : tarefa){
            tarefaAtual.setEstahFeita(true);
        }
    }

    public void listarTarefas(){
        StringBuilder resultado = new StringBuilder(); 
        for(Tarefa tarefaAtual : tarefa){   
            String status = tarefaAtual.getEstahFeita() ? "[X]" : "[ ]";
            System.out.printf("%s  Id: %d - Descricao: %s\n", status, tarefaAtual.getIdentificador(), tarefaAtual.getDescricao());
        }
    }
}

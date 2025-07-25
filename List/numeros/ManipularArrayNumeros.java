import java.util.*;
public class ManipularArrayNumeros{

    public static int buscarPosicaoNumero(List<Integer> list, int numero){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == numero){
                return i;
            }
        }
        return -1;
    }

    public static void adicionarNumero(List<Integer> list, int numero) throws Exception {
        if(buscarPosicaoNumero(list, numero) != -1){
            throw new Exception("Numero jah contido na lista");
        }else{
            list.add(numero);
        }
    }

    public static void removerNumero(List<Integer> list, int numero) throws Exception {
        int posicao = buscarPosicaoNumero(list, numero);
        if(posicao == -1){
            throw new Exception("Numero nao encontrado na lista");
        }else{
            list.remove(posicao);
        }
    }

    public static void substituirNumero(List<Integer> list, int numeroSubstituir, int numeroSubstituto){
        int posicao = buscarPosicaoNumero(list, numeroSubstituir);
        if(posicao == -1){
            list.add(numeroSubstituto);
        }else{
            list.set(posicao, numeroSubstituto);
        }
    }
}

import java.util.ArrayList;
public class ProcessadorVideo {
    ArrayList<CanalNotificacao> canais = new ArrayList<>();

    public void registrarCanal(CanalNotificacao canalNotificacao){
        canais.add(canalNotificacao);
    }
    
    public void processar(Video video){
        for(CanalNotificacao canal : canais){
            String texto = video.getArquivo() + " - " + video.getFormato();
            canal.notificar(new Mensagem(texto, TipoMensagem.LOG));
        }
    }
}

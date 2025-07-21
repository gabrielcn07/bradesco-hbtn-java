package provedores;
public class JadLog implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor){
        if(peso > 2000){
           return new Frete((valor*0.07), TipoProvedorFrete.JADLOG);
        }
        return new Frete((valor*0.045), TipoProvedorFrete.JADLOG);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete(){
        return TipoProvedorFrete.JADLOG;
    }
}

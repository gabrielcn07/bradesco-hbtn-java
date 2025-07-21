package provedores;
public class Loggi implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor){
        if(peso > 5000){
           return new Frete((valor*0.12), TipoProvedorFrete.LOGGI);
        }
        return new Frete((valor*0.04), TipoProvedorFrete.LOGGI);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete(){
        return TipoProvedorFrete.LOGGI;
    }
}

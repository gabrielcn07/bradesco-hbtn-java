package provedores;
public class Sedex implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor){
        if(peso > 1000){
           return new Frete((valor*0.1), TipoProvedorFrete.SEDEX);
        }
        return new Frete((valor*0.05), TipoProvedorFrete.SEDEX);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete(){
        return TipoProvedorFrete.SEDEX;
    }
}

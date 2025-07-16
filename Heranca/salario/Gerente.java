public class Gerente extends Empregado {

    public Gerente(double salarioFixo){
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento){
        if(departamento.alcancouMeta()){
            double bonus = (getSalarioFixo() * 0.2) + ((departamento.getValorAtingidoMeta() - departamento.getValorMeta())/100);
            return bonus;
        }
        return 0.0;
    }
}

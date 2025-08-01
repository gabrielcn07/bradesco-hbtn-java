import exceptions.OperacaoInvalidaException;
public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual){
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }
    
    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException{
        if(valor <= 0){
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException{
        if(valor <= 0){
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
        if(saldo < valor){
           throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual"); 
        }
        saldo -= valor;
    }

    public double calcularTarifaMensal(){
        if(10 < (saldo * 0.1)){
            return 10;
        }else{
            return saldo * 0.1;
        }
    }

    public double calcularJurosMensal(){
        if(saldo >= 0){
            return saldo * ((taxaJurosAnual/12)/100);
        }
        else{
            return 0;
        }
    }

    public void aplicarAtualizacaoMensal(){
        saldo = saldo - calcularTarifaMensal() + calcularJurosMensal();
    }
}

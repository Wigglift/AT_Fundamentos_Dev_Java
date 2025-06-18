package Ex9.models;

public class ContaBancaria {
    public String titular;
    private double saldo = 0;

    public ContaBancaria(String titular){
        this.titular = titular;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente");
        } else this.saldo -= valor;
    }

    public Double exibirSaldo(){
        return this.saldo;
    }
}

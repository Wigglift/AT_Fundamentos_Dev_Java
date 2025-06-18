package Ex3.models;

public class Imposto {

    private static double valorImposto;

    private static double salarioAnual;

    public static void calcular(double salario){

        salarioAnual = salario*12;

        double porcentagem = calcularPorcentagem();

        valorImposto = salarioAnual*porcentagem;
    }

    private static double calcularPorcentagem(){

        if(salarioAnual <=  22847.76){
            return 0;
        } else if (salarioAnual >  22847.76 && salarioAnual <=  33919.80) {
            return 0.075;
        } else if (salarioAnual > 33919.80 && salarioAnual <= 45012.60) {
            return 0.15;
        } else return 0.275;

    }

    public static double getValorImposto(){
        return valorImposto;
    }

    public static double getSalarioLiquido(){
        return salarioAnual-valorImposto;
    }
}

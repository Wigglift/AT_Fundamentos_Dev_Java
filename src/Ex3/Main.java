package Ex3;

import Ex3.models.Imposto;

import java.util.Scanner;

public class Main {

    static Scanner leitura = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Digite seu nome:");
        String nome = leitura.nextLine();

        System.out.print("Digite seu salário mensal(❗Use a vírgula para separar as casas decimais, ex 1540,45❗):");

        double salario = 0;
        boolean erro = false;
        do {
            try {
                erro = false;
                salario = leitura.nextDouble();

                if(salario <0) throw new Exception("Salário negativo");

            }catch (Exception e){
                erro = true;
                System.out.println("\nSalário inválido, digite novamente(❗Use a vírgula para separar as casas decimais, ex 1540,45❗):");
                leitura.nextLine();
            }
        }while (erro);

        Imposto.calcular(salario);

        if(Imposto.getValorImposto() == 0){
            System.out.println("O senhor é isento de imposto");
        } else System.out.printf("O valor do seu imposto anual é de R$%1$.2f com um salário líquido anual de R$ %2$.2f", Imposto.getValorImposto(), Imposto.getSalarioLiquido());
    }
}

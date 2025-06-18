package Ex4;

import Ex4.models.Emprestimo;

import java.util.Scanner;

public class Main {

    static Scanner leitura = new Scanner(System.in);

    static double valor;
    static int quantidadeParcelas;

    public static void main(String[] args){
        System.out.println("Digite seu nome");
        String cliente = leitura.nextLine();

        boolean erro = false;

        do {
            erro = false;
            System.out.print("Digite o valor total do empréstimo(❗Use a vírgula para separar as casas decimais, ex 1540,45❗) R$:");
            try{

                valor = leitura.nextDouble();

                do {
                    erro = false;
                    System.out.print("Digite a quantidade de parcelas (❗mínimo de 6 parcelas e máximo de 48 parcelas❗):");
                    try{

                        quantidadeParcelas = leitura.nextInt();
                    }catch (Exception e){
                        erro = true;
                        System.out.print("\nQuantidade inválida\n");
                        leitura.nextLine();
                    }
                } while (erro);
            } catch (Exception e){
                erro = true;
                System.out.print("\nValor inválido\n");
                leitura.nextLine();
                continue;
            }

        } while (erro);

        Emprestimo emprestimo = new Emprestimo(valor,quantidadeParcelas);

        System.out.printf("Um empréstimo de %1$.2f reais custaria %2$.2f com parcelas de %3$.2f por %4$d meses",
                valor, emprestimo.getTotalPago(), emprestimo.getValorParcelas(), emprestimo.getQuantParcelas());
    }
}

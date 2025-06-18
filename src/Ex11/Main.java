package Ex11;

import Ex11.exceptions.NumRepetidoException;
import Ex11.models.Loteria;
import Ex11.models.Repetido;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        Loteria sorteio = new Loteria();
        int[] userNums = new int[6];
        boolean erro = false;
        int numero = 0;

        System.out.println("Insira 6 números ❗inteiros entre 1 e 60❗ para o sorteio:\n");

        for(int i = 0; i < 6; i++){
            do {
                try {
                    erro = false;
                    System.out.print("Digite o " + (i + 1) + "° número:");
                    numero = in.nextInt();

                    if (numero < 1 || numero > 60) throw new Exception();
                    if(Repetido.verificar(userNums, numero)) throw new NumRepetidoException();


                }catch (NumRepetidoException e) {
                    erro = true;
                    System.out.println("\nNumero já inserido, digite novamente um número diferente");
                    in.nextLine();

                }catch (Exception e1){
                    erro = true;
                    System.out.println("\nNumero inválido digite ❗apenas números inteiros entre 1 e 60❗");
                    in.nextLine();
                }
            }while(erro);

            userNums[i] = numero;

        }

        int acertos = sorteio.calcResultado(userNums);

        if (acertos == 0){
            System.out.println("Não houve acertos");
        } else if ( acertos ==1){
            System.out.println("Você acertou 1 número");
        }else if ( acertos ==6){
            System.out.println("Parabéns, você acertou todos os números");
        } else {
            System.out.println("Você acertou " + acertos + " números");
        }

    }
}

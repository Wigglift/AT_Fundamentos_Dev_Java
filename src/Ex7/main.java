package Ex7;

import Ex7.models.Aluno;

import java.util.Scanner;

public class main {

    static Scanner leitura = new Scanner(System.in);

    public static void main (String[] args){
        System.out.println("Escreva o nome do aluno");
        String nome = leitura.nextLine();

        int matricula = 0;
        boolean erro = false;

        do {
            erro = false;
            try {
                System.out.println("Digite a matrícula(❗Apenas números inteiros❗)");
                matricula = leitura.nextInt();

            }catch (Exception e){
                erro = true;
                System.out.println("\nMatricula inválida");
                leitura.nextLine();
            }
        }while (erro);

        double[] notas = new double[3];

        for(int i = 0; i < 3; i++){
            do {
                erro = false;
                try {
                    System.out.println("Digite a " + (i+1) + "° nota(❗mínimo de 0, máximo de 10❗)");
                    notas[i] = leitura.nextDouble();

                    if(notas[i] <0 || notas[i]>10) throw new Exception("Nota fora dos limites");

                } catch (Exception e){
                    erro = true;
                    System.out.println("\nNota inválida");
                    leitura.nextLine();
                }
            } while (erro);
        }

        Aluno aluno = new Aluno(nome,matricula,notas[0],notas[1],notas[2]);

        System.out.printf("O aluno %1$s está %2$s com a média de %3$.2f", nome, aluno.verificarAprovacao(), aluno.calcularMedia());
    }
}

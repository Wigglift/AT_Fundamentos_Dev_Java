package Ex9;

import Ex9.models.ContaBancaria;

public class main {
    public static void main (String[] args){
        ContaBancaria joaoConta = new ContaBancaria("João");

        System.out.printf("\nConta de "  + joaoConta.titular + " ao ser criada: R$%.2f", joaoConta.exibirSaldo());

        joaoConta.depositar(300);

        System.out.printf("\nDepois de depositar R$300: R$%.2f", joaoConta.exibirSaldo());

        joaoConta.sacar(150);

        System.out.printf("\nDepois de sacar R$150: R$%.2f", joaoConta.exibirSaldo());

        System.out.println("\nTentando sacar um saldo maior que o existente na conta");

        joaoConta.sacar(300);
    }
}

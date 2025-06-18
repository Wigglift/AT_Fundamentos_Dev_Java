package Ex2;

import Ex2.models.Verificar;

import java.util.Scanner;

public class Main {

    static Scanner leitura = new Scanner(System.in);

    public static void main(String[] args){

        String nome = pedirNome();

        boolean erro = false;

        do {
            erro = false;

            String senha = pedirSenha();

            Verificar VerificarSenha = new Verificar(senha);

            if (!VerificarSenha.tamanho()){
                System.out.println("A senha precisa conter pelo menos 8 caracteres❗");
                erro = true;
            } else System.out.println("A senha tem pelo menos 8 caracteres✅");

            if (!VerificarSenha.maiuscula()){
                System.out.println("A senha precisa conter pelo menos uma letra maiúscula❗");
                erro = true;
            } else System.out.println("A senha tem uma letra maiúscula✅");

            if(!VerificarSenha.numero()){
                System.out.println("A senha precisa conter pelo menos um Número❗");
                erro = true;
            } else System.out.println("A senha tem um número✅");

            if(!VerificarSenha.charEspecial()){
                System.out.println("A senha precisa contar pelo menos um caractere especial❗");
                erro = true;
            } else System.out.println("A senha tem um caracter especial✅");

        }while (erro);
    }

    public static String pedirSenha(){
        System.out.println("\nDigite sua senha:");

        return leitura.nextLine();
    }

    public static String pedirNome(){
        System.out.println("\nDigite Seu nome:");

        return leitura.nextLine();
    }
}



package Ex12;

import Ex12.models.Chat;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void  main (String[] args){

        System.out.println("Digite o nome do primeiro usuário do chat");
        String usuario1 = in.nextLine();

        System.out.println("Digite o nome do segundo usuário do chat");
        String usuario2 = in.nextLine();

        Chat conversa = new Chat(usuario1, usuario2);

        conversa.iniciarChat();

        conversa.mostrarHistorico();

        conversa.encerrarChat();

    }
}

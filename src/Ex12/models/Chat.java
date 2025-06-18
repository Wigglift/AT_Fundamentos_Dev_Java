package Ex12.models;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Scanner;

public class Chat {

    static Scanner in = new Scanner(System.in);
    String usuario1;
    String usuario2;

    String[] msgUsuario1 = new String[5];
    String[] msgUsuario2 = new String[5];


    public Chat (String usuario1, String usuario2){
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
    }

    public void iniciarChat(){

        String msgAtual;
        System.out.println();

        for(int i = 0; i < 5; i++){

            System.out.print(usuario1 + " Digite sua mensagem:");
            msgAtual= in.nextLine();

            msgUsuario1[i] = msgAtual;

            System.out.print(usuario2 + " Digite sua mensagem:");
            msgAtual= in.nextLine();

            msgUsuario2[i] = msgAtual;

        }

    }

    public void mostrarHistorico(){
        System.out.println("\n=====Histórico de mensagens=====\n");

        for(int i = 0; i < msgUsuario1.length; i++){
            System.out.println(usuario1 +": " +msgUsuario1[i]);
            System.out.println(usuario2 +": " + msgUsuario2[i]);
        }
    }

    public void encerrarChat(){
        System.out.println("\nObrigado por utilizarem o sistema");
        in.close();
    }

}

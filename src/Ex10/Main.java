package Ex10;

import Ex10.models.ManipuladorArq;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main (String[] args) throws IOException {

        ManipuladorArq compras = new ManipuladorArq("C:\\Users\\rodri\\Infnet\\Isaac_Rodrigues_TP_Java\\src\\Ex10\\compras.txt");

        String produto;
        int quantidade = 0;
        double preco= 0;
        boolean erro = false;

        for(int i = 1; i <= 3; i++){
            System.out.println("Digite o nome do produto");
            produto = in.nextLine();

            do {
                erro = false;

                System.out.println("Digite a quantidade disponível");
                try {
                    quantidade = in.nextInt();
                    if (quantidade < 0) throw  new Exception();

                } catch (Exception e){
                    erro = true;
                    System.out.println("Quantidade inválida, Tente novamente");
                    in.nextLine();
                }
            }while(erro);

            do {
                erro = false;

                System.out.println("Digite o preço(❗Use a vírgula para separar as casas decimais, ex 1540,45❗)");
                try {
                    preco = in.nextDouble();
                    if (preco < 0) throw  new Exception();

                } catch (Exception e){
                    erro = true;
                    System.out.println("Preço inválido, Tente novamente(❗Use a vírgula para separar as casas decimais, ex 1540,45❗)");
                    in.nextLine();
                }
            }while(erro);

            compras.escreverArquivo(produto +","+ String.valueOf(quantidade) +","+ String.valueOf(preco) + "\n");
            in.nextLine();
        }
        System.out.println(compras.lerArquivo());
    }
}

package Ex6;

import Ex6.models.Veiculo;

public class Main {
    public static void main(String[] args){
        Veiculo volkswagen = new Veiculo("BRA2E19", "Polo", 2025, 0.0);
        Veiculo toyota = new Veiculo("JPA5F32", "Corolla", 2025, 8437.0);

        System.out.println("\nVolkswagen:");
        volkswagen.exibirDetalhes();

        System.out.println("\nToyota:");
        toyota.exibirDetalhes();

        volkswagen.registrarViagem(674);
        toyota.registrarViagem(2321);

        System.out.println("\nVolkswagen:");
        volkswagen.exibirDetalhes();

        System.out.println("\nToyota:");
        toyota.exibirDetalhes();
    }
}

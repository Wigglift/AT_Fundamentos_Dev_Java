package Ex6.models;

public class Veiculo {
    String placa;
    String modelo;
    int anoDeFabricacao;
    double quilometragem;

    public Veiculo(String placa, String modelo, int anoDeFabricacao, double quilometragem){
        this.placa = placa;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.quilometragem = quilometragem;
    }

    public void registrarViagem(double km){
        this.quilometragem += km;
    }

    public void exibirDetalhes(){
        System.out.println("\nplaca:" + this.placa +
                "\nmodelo:" + this.modelo +
                "\nAno de fabricação:" + this.anoDeFabricacao +
                "\nQuilometragem:"+ this.quilometragem);
    }
}

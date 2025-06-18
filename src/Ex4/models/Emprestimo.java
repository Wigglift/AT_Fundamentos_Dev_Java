package Ex4.models;

public class Emprestimo {

    double valor;
    int quantParcelas;
    final double JUROS = 1.03;

    public Emprestimo(double valor, int parcelas){
        this.valor = valor;
        this.quantParcelas = pegarParcela(parcelas);
    }

    private int pegarParcela(int parcelas){
        if(parcelas < 6 ){
            System.out.println("\nQuantidade menor que o mínimo");
            System.out.println("A quantidade de parcelas será ajustada automáticamente para o mínimo de 6\n");
            return 6;
        } else if (parcelas > 48) {
            System.out.println("\nQuantidade maior que o máximo");
            System.out.println("A quantidade de parcelas será ajustada automáticamente para o máximo de 48\n");
            return 48;
        } else {
            return parcelas;
        }
    }

    public double getValorParcelas(){
        return (valor/ quantParcelas) * JUROS;
    }

    public double getTotalPago(){
        return valor*JUROS;
    }

    public int getQuantParcelas(){
        return quantParcelas;
    }
}

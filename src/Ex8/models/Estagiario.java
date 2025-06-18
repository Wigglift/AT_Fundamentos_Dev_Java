package Ex8.models;

public class Estagiario extends Funcionario {
    public Estagiario(String nome){
        super(nome);
        salario *= 1.1;
    }
}

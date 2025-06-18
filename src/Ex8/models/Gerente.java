package Ex8.models;

public class Gerente extends Funcionario {

    public Gerente(String nome){
        super(nome);
        salario *= 1.2;
    }
}

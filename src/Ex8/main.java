package Ex8;

import Ex8.models.Estagiario;
import Ex8.models.Funcionario;
import Ex8.models.Gerente;

public class main {
    public static void main (String[] args){
        Funcionario funcionario = new Funcionario("Roberto");
        Estagiario estagiario = new Estagiario("João");
        Gerente gerente = new Gerente("Mario");

        System.out.printf(funcionario.nome + " è um funcionario e seu salário é de R$%.2f\n", funcionario.salario);

        System.out.printf(estagiario.nome + " è um estagiário e seu salário é de R$%.2f\n", estagiario.salario);

        System.out.printf(gerente.nome + " è um gerente e seu salário é de R$%.2f\n", gerente.salario);
    }
}

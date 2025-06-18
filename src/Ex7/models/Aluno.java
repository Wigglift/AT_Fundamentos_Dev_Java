package Ex7.models;

public class Aluno {
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;
    private double nota3;

     public Aluno(String nome, int matricula, double nota1, double nota2, double nota3){
         this.nome = nome;
         this.matricula = matricula;
         this.nota1 = nota1;
         this.nota2 = nota2;
         this.nota3 = nota3;
     }

     public double calcularMedia(){
         return (nota1 + nota2 + nota3)/3;
     }

     public String verificarAprovacao(){
         if (calcularMedia() >= 7) return "Aprovado";
         return "reprovado";
     }
}

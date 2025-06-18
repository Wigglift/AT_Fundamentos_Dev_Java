package Ex10.models;

import java.io.*;

public class ManipuladorArq  {

    String path;

    public ManipuladorArq(String path){
        this.path = path;
    };

    public String lerArquivo() throws IOException {
        BufferedReader leitor = new BufferedReader(new FileReader(this.path));
        String conteudo = "";
        String linha  = leitor.readLine();

        while (linha != null){
            conteudo = conteudo.concat(linha + "\n");
            linha  = leitor.readLine();
        }

        leitor.close();

        return conteudo;
    }

    public void escreverArquivo(String mensagem) throws IOException{
        BufferedWriter escritor = new BufferedWriter(new FileWriter(this.path, true));

        escritor.append(mensagem);
        escritor.flush();

    }

}

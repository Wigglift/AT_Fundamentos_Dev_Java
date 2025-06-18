package Ex2.models;

public class Verificar {

    private  char[] arr_char;

    public Verificar(String senha){
        arr_char = senha.toCharArray();
    }

    public  boolean tamanho(){
        return arr_char.length >= 8;
    }

    public  boolean maiuscula(){

        for(char letra : arr_char) {
            if (Character.isUpperCase(letra)) return true;
        }
        return false;
    }

    public  boolean numero(){

        for(char letra : arr_char) {
            if (Character.isDigit(letra)) return true;

        }
        return false;
    }

    public  boolean charEspecial(){

        for(char letra : arr_char) {
            if (!Character.isLetterOrDigit(letra)) return true;
        }
        return false;
    }
}


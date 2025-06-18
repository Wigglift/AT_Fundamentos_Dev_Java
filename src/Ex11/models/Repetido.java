package Ex11.models;

public class Repetido {

    public static boolean verificar(int[] arr,int numeroProcurado) {

        for (int numero : arr) {
            if (numeroProcurado == numero) return true;
        }
        return false;
    }
}

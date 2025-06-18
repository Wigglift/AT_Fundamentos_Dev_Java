package Ex11.models;

import java.util.Arrays;

public class Loteria {

    private int[] numSorteados = new int[6];

    public Loteria(){
        numSorteados = gerarNumeros();
    }

    private int[] gerarNumeros(){

        int[] arr = new int[6];
        int numero;

        for(int i = 0; i < 6; i++) {
            do {
                numero = (int)(Math.random()*60);
            }while (Repetido.verificar(arr, numero));

            arr[i] = numero;
        }
        return Arrays.stream(arr).sorted().toArray();
        }

        public int calcResultado(int[] userNums){
            userNums = Arrays.stream(userNums).sorted().toArray();

            int acertos = 0;

            for (int numero : numSorteados){
                for (int numero2 : userNums){
                    if(numero == numero2){
                        acertos++;
                    }
                }
            }
            return acertos;

        }
    }


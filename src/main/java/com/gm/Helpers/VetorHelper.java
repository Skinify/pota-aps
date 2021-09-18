package com.gm.Helpers;

import java.util.Random;

import com.gm.Enums.TamanhoVetorEnum;

public class VetorHelper {
    private static Random rnd = new Random();

    public static int[] GerarVetor(TamanhoVetorEnum tamanho) throws Exception{
        try{
            int[] vetorGerado = new int[DefinirTamanho(tamanho)];
            for(int i = 0; i < vetorGerado.length; i++){
                vetorGerado[i] = rnd.nextInt(100000);
            }
            return vetorGerado;
        }catch(Exception ex){
            throw ex;
        }
    }

    private static int DefinirTamanho(TamanhoVetorEnum tamanhoVetorEnum) throws Exception{
        switch(tamanhoVetorEnum){
            case D5 : return 5;
            case D10 : return 10;
            case D50 : return 50;
            case D100 : return 100;
            case D1000 : return 1000;
            case D10000 : return 10000;
            default: throw new UnsupportedOperationException();
        }
    }

    public static int Max(int vetor[]){
        int max = vetor[0];
        for (int value : vetor) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int Min(int vetor[]){
        int min = vetor[0];
        for (int value : vetor) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}

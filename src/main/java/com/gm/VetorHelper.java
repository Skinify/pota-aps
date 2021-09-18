package com.gm;

import java.util.Random;

import com.gm.Enums.TamanhoVetorEnum;

public class VetorHelper {
    private Random rnd;

    public VetorHelper(){
        rnd = new Random();
    }

    public int[] GerarVetor(TamanhoVetorEnum tamanho) throws Exception{
        try{
            int[] vetorGerado = new int[DefinirTamanho(tamanho)];
            for(int i = 0; i < vetorGerado.length; i++){
                vetorGerado[i] = rnd.nextInt();
            }
            return vetorGerado;
        }catch(Exception ex){
            throw ex;
        }
    }

    private int DefinirTamanho(TamanhoVetorEnum tamanhoVetorEnum) throws Exception{
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
}

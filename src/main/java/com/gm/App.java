package com.gm;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.gm.Enums.TamanhoVetorEnum;
import com.gm.Helpers.VetorHelper;

public class App 
{
    private static VetorHelper _vetorHelper;
    private static Algoritmos _algoritmos;

    public static void main( String[] args )
    {
        try{
            _vetorHelper = new VetorHelper();
            _algoritmos = new Algoritmos();

            int[] vetor = _vetorHelper.GerarVetor(TamanhoVetorEnum.PegarTamanhoAleatorio());
            int[] aux = new int[vetor.length];
            _algoritmos.MergeSort(vetor, aux, 0, vetor.length - 1);

            vetor = _vetorHelper.GerarVetor(TamanhoVetorEnum.PegarTamanhoAleatorio());

            _algoritmos.QuickSort(vetor, 0, vetor.length - 1);

            System.out.println(Arrays.toString(vetor));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

package com.gm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import com.gm.Algoritmos.Algoritmos;
import com.gm.Enums.TamanhoVetorEnum;
import com.gm.Helpers.VetorHelper;

public class App
{
    private static Algoritmos _algoritmos =  new Algoritmos();
    private static Map<TamanhoVetorEnum, List<int[]>> massaDeVetores = new HashMap<TamanhoVetorEnum, List<int[]>>();
    private static final int TAMANHO_VETORES = 50;

    public static void main( String[] args )
    {
        try{
            for(int i = 0; i < TamanhoVetorEnum.values().length; i++){
                List<int[]> tempList = new ArrayList<>();
                for(int c = 0; c < TAMANHO_VETORES; c++){
                    tempList.add(VetorHelper.GerarVetor(TamanhoVetorEnum.values()[i]));
                }
                massaDeVetores.put(TamanhoVetorEnum.values()[i], tempList);
            }

            int[] testeVisual = massaDeVetores.get(TamanhoVetorEnum.D10).get(0);

            _algoritmos.radixSort.Sort(testeVisual);

            System.out.println(Arrays.toString(testeVisual));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

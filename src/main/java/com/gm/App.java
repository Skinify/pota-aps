package com.gm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.gm.Algoritmos.Algoritmos;
import com.gm.Algoritmos.Base.BaseSort;
import com.gm.Enums.TamanhoVetorEnum;
import com.gm.Helpers.VetorHelper;

public class App
{
    private static Algoritmos _algoritmos =  new Algoritmos();
    private static Map<TamanhoVetorEnum, List<int[]>> massaDeVetores = new HashMap<TamanhoVetorEnum, List<int[]>>();
    private static Map<String, Map<TamanhoVetorEnum, Integer>> _mapaDeAnalise = new HashMap<String, Map<TamanhoVetorEnum, Integer>>();
    private static final int TAMANHO_VETORES = 50;

    public static void main( String[] args )
    {
        try{
            for(int i = 0; i < TamanhoVetorEnum.values().length; i++){
                List<int[]> tempList = new ArrayList<>();
                System.out.println("Gerando vetores de tamanho " + TamanhoVetorEnum.values()[i]);
                for(int c = 0; c < TAMANHO_VETORES; c++){
                    System.out.println("Gerando vetor " + c);
                    int[] tempArray = VetorHelper.GerarVetor(TamanhoVetorEnum.values()[i]);
                    Iterator<BaseSort> it = _algoritmos.listaDeAlgoritmos.iterator();
                    while(it.hasNext()){
                        BaseSort algoritmoSort = it.next();
                        String nomeAlgoritmo = algoritmoSort.getClass().getSimpleName();
                        System.out.println("Executando algoritmo de sort " + nomeAlgoritmo);
                        if(!_mapaDeAnalise.containsKey(nomeAlgoritmo))
                            _mapaDeAnalise.put(nomeAlgoritmo, new HashMap<TamanhoVetorEnum, Integer>());
                        
                        algoritmoSort.Sort(Arrays.copyOf(tempArray, tempArray.length));
                        Map<TamanhoVetorEnum,Integer> mapaAnaliseTemp = _mapaDeAnalise.get(nomeAlgoritmo);
                        mapaAnaliseTemp.put(TamanhoVetorEnum.values()[i], algoritmoSort.GetCompCont());
                        _mapaDeAnalise.put(nomeAlgoritmo, mapaAnaliseTemp);
                    }
                    tempList.add(VetorHelper.GerarVetor(TamanhoVetorEnum.values()[i]));
                }
                massaDeVetores.put(TamanhoVetorEnum.values()[i], tempList);
            }

            System.out.println("Sobreviveu");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

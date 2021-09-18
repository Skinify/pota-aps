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
import com.gm.Helpers.LogHelper;
import com.gm.Helpers.VetorHelper;

public class App
{
    private static Algoritmos _algoritmos =  new Algoritmos();
    private static Map<String, Map<TamanhoVetorEnum, Integer>> _mapaDeAnalise = new HashMap<String, Map<TamanhoVetorEnum, Integer>>();
    private static final int TAMANHO_VETORES = 50;

    public static void main( String[] args )
    {
        try{
            for(int i = 0; i < TamanhoVetorEnum.values().length; i++){
                List<int[]> tempList = new ArrayList<>();
                LogHelper.Log("Gerando vetores de tamanho " + TamanhoVetorEnum.values()[i]);
                for(int c = 0; c < TAMANHO_VETORES; c++){
                    LogHelper.Log("Gerando vetor " + c);
                    int[] tempArray = VetorHelper.GerarVetor(TamanhoVetorEnum.values()[i]);
                    Iterator<BaseSort> it = _algoritmos.listaDeAlgoritmos.iterator();
                    while(it.hasNext()){
                        BaseSort algoritmoSort = it.next();
                        String nomeAlgoritmo = algoritmoSort.getClass().getSimpleName();
                        LogHelper.Log("Executando algoritmo de sort " + nomeAlgoritmo);
                        if(!_mapaDeAnalise.containsKey(nomeAlgoritmo))
                            _mapaDeAnalise.put(nomeAlgoritmo, new HashMap<TamanhoVetorEnum, Integer>());
                        
                        algoritmoSort.Sort(Arrays.copyOf(tempArray, tempArray.length));
                        Map<TamanhoVetorEnum,Integer> mapaAnaliseTemp = _mapaDeAnalise.get(nomeAlgoritmo);
                        mapaAnaliseTemp.put(TamanhoVetorEnum.values()[i], algoritmoSort.GetCompCont());
                        _mapaDeAnalise.put(nomeAlgoritmo, mapaAnaliseTemp);
                    }
                    tempList.add(VetorHelper.GerarVetor(TamanhoVetorEnum.values()[i]));
                }
            }

            LogHelper.Log("\n");
            for(Map.Entry<String,  Map<TamanhoVetorEnum, Integer>> entry : _mapaDeAnalise.entrySet()){
                String algoritmo = entry.getKey();
                Map<TamanhoVetorEnum, Integer> map = entry.getValue();
                LogHelper.Log("Média de comparações " + algoritmo + " em vetores de 5:      " + map.get(TamanhoVetorEnum.D5) / (TAMANHO_VETORES * 5.0));
                LogHelper.Log("Média de comparações " + algoritmo + " em vetores de 10:     " + map.get(TamanhoVetorEnum.D10) / (TAMANHO_VETORES * 10.0));
                LogHelper.Log("Média de comparações " + algoritmo + " em vetores de 100:    " + map.get(TamanhoVetorEnum.D100) / (TAMANHO_VETORES * 100.0));
                LogHelper.Log("Média de comparações " + algoritmo + " em vetores de 1000:   " + map.get(TamanhoVetorEnum.D1000) / (TAMANHO_VETORES * 1000.0));
                LogHelper.Log("Média de comparações " + algoritmo + " em vetores de 10000:  " + map.get(TamanhoVetorEnum.D10000) / (TAMANHO_VETORES * 10000.0));
                LogHelper.Log("\n");
            }

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

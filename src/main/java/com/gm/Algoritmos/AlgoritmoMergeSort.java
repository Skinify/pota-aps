package com.gm.Algoritmos;

import com.gm.Algoritmos.Base.BaseSort;

public class AlgoritmoMergeSort extends BaseSort {
    private void MergeSort(int vetor[], int[] aux, int ini, int fim){
        if(Menor(ini, fim)){
            int meio = (ini + fim) / 2;
            MergeSort(vetor, aux, ini, meio);
            MergeSort(vetor, aux, meio + 1, fim);
            Intercalar(vetor, aux, ini, meio, fim);
        } 
    }

    private void Intercalar(int[] vetor, int[] aux, int ini, int meio, int fim) {
        for(int k = ini; MenorIgual(k, fim) ; k++){
            aux[k] = vetor[k];
        }

        int i = ini;
        int j = meio + 1;

        for(int k = ini; MenorIgual(k, fim) ; k++){
            if(Maior(i, meio)) vetor[k] = aux[j++];
            else if(Maior(j, fim)) vetor[k] = aux[i++];
            else if(Menor(aux[i], aux[j])) vetor[k] = aux[i++];
            else vetor[k] = aux[j++];
        }
    }

    @Override
    public void Sort(int[] vetor) {
        int[] aux = new int[vetor.length];
        MergeSort(vetor, aux, 0, vetor.length - 1);
    }
}

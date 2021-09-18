package com.gm.Algoritmos;

public class AlgoritmoMergeSort {
    public void MergeSort(int[] vetor){
        int[] aux = new int[vetor.length];
        LogicaMergeSort(vetor, aux, 0, vetor.length - 1);
    }

    private void LogicaMergeSort(int vetor[], int[] aux, int ini, int fim){
        if(ini < fim){
            int meio = (ini + fim) / 2;
            LogicaMergeSort(vetor, aux, ini, meio);
            LogicaMergeSort(vetor, aux, meio + 1, fim);
            Intercalar(vetor, aux, ini, meio, fim);
        } 
    }

    private void Intercalar(int[] vetor, int[] aux, int ini, int meio, int fim) {
        for(int k = ini; k <= fim; k++){
            aux[k] = vetor[k];
        }

        int i = ini;
        int j = meio + 1;

        for(int k = ini; k <= fim; k++){
            if(i > meio) vetor[k] = aux[j++];
            else if( j > fim) vetor[k] = aux[i++];
            else if(aux[i] < aux[j]) vetor[k] = aux[i++];
            else vetor[k] = aux[j++];
        }
    }
}

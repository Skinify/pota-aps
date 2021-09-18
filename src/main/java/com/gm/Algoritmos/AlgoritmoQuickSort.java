package com.gm.Algoritmos;

public class AlgoritmoQuickSort {

    public void QuickSort(int[] vetor){
        LogicaQuickSort(vetor, 0, vetor.length - 1);
    }

    private void LogicaQuickSort(int [] vetor, int inicio, int fim){
        if(inicio < fim){
            int p = Partition(vetor, inicio, fim);
            LogicaQuickSort(vetor, inicio, p-1);
            LogicaQuickSort(vetor, p+1, fim);
        }
    }

    private int Partition(int[] vetor, int inicio, int fim) {
        int pivot = vetor[fim];
        int i = inicio;
        for(int j = inicio; j < fim; j++){
            if(vetor[j] < pivot){
                int aux = vetor[j];
                vetor[j] = vetor[i];
                vetor[i] = aux;
                i++;
            }
        }

        int aux = vetor[i];
        vetor[i] = vetor[fim];
        vetor[fim] = aux;
        return i;
    }
}

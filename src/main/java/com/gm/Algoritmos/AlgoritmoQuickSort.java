package com.gm.Algoritmos;

import com.gm.Algoritmos.Interface.ISort;

public class AlgoritmoQuickSort implements ISort {
    private void QuickSort(int [] vetor, int inicio, int fim){
        if(inicio < fim){
            int p = Partition(vetor, inicio, fim);
            QuickSort(vetor, inicio, p-1);
            QuickSort(vetor, p+1, fim);
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

    @Override
    public void Sort(int[] vetor) {
        QuickSort(vetor, 0, vetor.length - 1);        
    }
}

package com.gm.Algoritmos;

import com.gm.Algoritmos.Base.BaseSort;

public class AlgoritmoSelectionSort extends BaseSort {
    private void SelectionSort(int[] vetor, int n, int index){
        if (Igual(index, n))
            return;
  
        int k = MinIndex(vetor, index, n-1);
    
        if (Diferente(k, index)){
            int temp = vetor[k];
            vetor[k] = vetor[index];
            vetor[index] = temp;
        }

        SelectionSort(vetor, n, index + 1);
    }

    private int MinIndex(int[] vetor, int i, int c){
        if (Igual(i, c))
            return i;

        int k = MinIndex(vetor, i + 1, c);

        return (Menor(vetor[i], vetor[k]))? i : k;
    }

    @Override
    public void Sort(int[] vetor) {
        SelectionSort(vetor, vetor.length, 0);
    }
}

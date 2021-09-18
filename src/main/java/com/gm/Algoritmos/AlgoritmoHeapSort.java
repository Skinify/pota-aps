package com.gm.Algoritmos;

import com.gm.Algoritmos.Base.BaseSort;

public class AlgoritmoHeapSort extends BaseSort {
    private void HeapSort(int[] vetor){
        int n = vetor.length;
 
        for (int i = n / 2 - 1; MaiorIgual(i, 0); i--)
        Heapify(vetor, n, i);
 
        for (int i = n - 1; Maior(i, 0); i--) {
            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;
 
            Heapify(vetor, i, 0);
        }
    }

    private void Heapify(int vetor[], int n, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2; 
 
        if (Menor(l, n) && Maior( vetor[l], vetor[largest]))
            largest = l; 
    
        if (Menor(r, n) && Maior(vetor[r], vetor[largest]))
            largest = r;
 
        if (Diferente(largest, i)) {
            int swap = vetor[i];
            vetor[i] = vetor[largest];
            vetor[largest] = swap;
 
            Heapify(vetor, n, largest);
        }
    }

    @Override
    public void Sort(int[] vetor) {
        HeapSort(vetor);
    }
}

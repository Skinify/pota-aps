package com.gm.Algoritmos;

import com.gm.Algoritmos.Interface.ISort;

public class AlgoritmoHeapSort implements ISort {
    private void HeapSort(int[] vetor){
        int n = vetor.length;
 
        for (int i = n / 2 - 1; i >= 0; i--)
        Heapify(vetor, n, i);
 
        for (int i = n - 1; i > 0; i--) {
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
 
        if (l < n && vetor[l] > vetor[largest])
            largest = l; 
    
        if (r < n && vetor[r] > vetor[largest])
            largest = r;
 
        if (largest != i) {
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

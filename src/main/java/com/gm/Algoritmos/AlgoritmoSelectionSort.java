package com.gm.Algoritmos;

import com.gm.Algoritmos.Interface.ISort;

public class AlgoritmoSelectionSort implements ISort {
    private void SelectionSort(int[] vetor, int n, int index){
        if (index == n)
            return;
  
        int k = MinIndex(vetor, index, n-1);
    
        if (k != index){
            int temp = vetor[k];
            vetor[k] = vetor[index];
            vetor[index] = temp;
        }

        SelectionSort(vetor, n, index + 1);
    }

    private int MinIndex(int[] vetor, int i, int c){
        if (i == c)
            return i;

        int k = MinIndex(vetor, i + 1, c);

        return (vetor[i] < vetor[k])? i : k;
    }

    @Override
    public void Sort(int[] vetor) {
        SelectionSort(vetor, vetor.length, 0);
    }
}

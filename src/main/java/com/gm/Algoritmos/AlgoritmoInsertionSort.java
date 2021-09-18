package com.gm.Algoritmos;

import com.gm.Algoritmos.Interface.ISort;

public class AlgoritmoInsertionSort implements ISort {
    private void InsertionSort(int[] vetor, int n){
        if (n <= 1)
            return;

        InsertionSort( vetor, n-1 );

        int ultimo = vetor[n-1];
        int j = n-2;

        while (j >= 0 && vetor[j] > ultimo)
        {
            vetor[j+1] = vetor[j];
            j--;
        }

        vetor[j+1] = ultimo;
    }

    @Override
    public void Sort(int[] vetor) {
        InsertionSort(vetor, vetor.length);
    }
}

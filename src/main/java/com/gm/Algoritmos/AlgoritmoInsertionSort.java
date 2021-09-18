package com.gm.Algoritmos;

import com.gm.Algoritmos.Base.BaseSort;

public class AlgoritmoInsertionSort extends BaseSort{
    private void InsertionSort(int[] vetor, int n){
        if (MenorIgual(n, 1))
            return;

        InsertionSort( vetor, n-1 );

        int ultimo = vetor[n-1];
        int j = n-2;

        while (MaiorIgual(j, 0) && Maior(vetor[j], ultimo))
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

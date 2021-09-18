package com.gm.Algoritmos;

import com.gm.Algoritmos.Base.BaseSort;

public class AlgoritmoBubbleSort extends BaseSort {
    private void BubbleSort(int[] vetor, int n){
        if (n == 1)
            return;

        for (int i=0; i<n-1; i++)
            if (vetor[i] > vetor[i+1])
            {
                int temp = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = temp;
            }
        BubbleSort(vetor, n-1);
    }

    @Override
    public void Sort(int[] vetor) {
        BubbleSort(vetor, vetor.length);
    }
}

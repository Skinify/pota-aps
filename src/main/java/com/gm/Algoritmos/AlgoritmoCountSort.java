package com.gm.Algoritmos;

import com.gm.Algoritmos.Base.BaseSort;

public class AlgoritmoCountSort extends BaseSort {
    private void CountSort(int[] vetor, int size){
        int[] output = new int[size + 1];

        int max = vetor[0];
        for (int i = 1;Menor(i, size); i++) {
          if (Maior(vetor[i], max))
            max = vetor[i];
        }
        
        int[] count = new int[max + 1];
    
        for (int i = 0; Menor(i, max); ++i) {
          count[i] = 0;
        }
    
        for (int i = 0; Menor(i, size); i++) {
          count[vetor[i]]++;
        }
    
        for (int i = 1; MenorIgual(i, max); i++) {
          count[i] += count[i - 1];
        }
    
        for (int i = size - 1; MaiorIgual(i, 0); i--) {
          output[count[vetor[i]] - 1] = vetor[i];
          count[vetor[i]]--;
        }
    
        for (int i = 0; Menor(i, size); i++) {
          vetor[i] = output[i];
        }
    }

    @Override
    public void Sort(int[] vetor) {
        CountSort(vetor, vetor.length);
    }
}
